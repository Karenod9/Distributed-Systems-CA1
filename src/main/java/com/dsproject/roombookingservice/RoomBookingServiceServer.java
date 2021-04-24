package com.dsproject.roombookingservice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.dsproject.authenticationservices.AuthenticationServicesServer;
import com.dsproject.roombookingservice.RoomBookingServiceGrpc.RoomBookingServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.shaded.io.netty.util.internal.ThreadLocalRandom;
import io.grpc.stub.StreamObserver;

public class RoomBookingServiceServer extends RoomBookingServiceImplBase {
	
	private static final Logger logger = Logger.getLogger(RoomBookingServiceServer.class.getName());
	
	public static void main(String[] args) {
		
		RoomBookingServiceServer roomBookingServiceServer = new RoomBookingServiceServer();
		
		Properties prop = roomBookingServiceServer.getProperties();
		roomBookingServiceServer.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));
		try {
			Server server = ServerBuilder.forPort(port)
					.addService(roomBookingServiceServer)
					.build()
					.start();
			
		logger.info("Server has started. Listening on " + port);
		server.awaitTermination();
		}catch(IOException e) {
			System.out.println("Issue with server port. Check port and try again");
		}catch(InterruptedException e) {
			System.out.println("Server has encountered an error, please try again");
			
			
		}

	}
	
	private Properties getProperties() {
		Properties prop = null;
		try(InputStream input = new FileInputStream("src/main/resources/roombookingservice.properties")){
			prop = new Properties();
			
			prop.load(input);
			
			System.out.println("Room Booking Services properties : ");
			System.out.println("\t service_type: " + prop.getProperty("service_type"));
            System.out.println("\t service_name: " +prop.getProperty("service_name"));
            System.out.println("\t service_description: " +prop.getProperty("service_description"));
	        System.out.println("\t service_port: " +prop.getProperty("service_port"));
	        
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return prop;
			
			
		}
	
	private void registerService(Properties prop) {
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			String service_type = prop.getProperty("service_type");
			String service_name = prop.getProperty("service_name");
			int service_port = Integer.valueOf(prop.getProperty("service_port"));
			
			String service_description_properties = prop.getProperty("service_description");
			
			ServiceInfo serviceInfo = ServiceInfo.create(service_type,  service_name,  service_port,  service_description_properties);
			jmdns.registerService(serviceInfo);
			
			System.out.printf("registering service with type %s and name %s \n", service_type, service_name);
			System.out.println("Service has been registered! ");
			
			Thread.sleep(1000);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(InterruptedException e) {
			e.printStackTrace();
			
			
		}
	}
	
	@Override
	public void checkAvailableRooms(CheckAvailableRoomsRequest request, StreamObserver<CheckAvailableRoomsResponse> responseObserver) {
		System.out.println("Checking available rooms...");
		String date = request.getDate();
		String site = request.getLocation();
		
		String availableTimes;
		Random ran = new Random();
		int randomAvailableRooms = ran.nextInt((50 - 1) +1) + 1;
		try {
		for(int i=0; i<randomAvailableRooms; i++) {
			
				System.out.println("RandomVailRoom" + randomAvailableRooms);
				availableTimes = generateRandomTime();
				String roomName = generateRandomRoomName();
				
				CheckAvailableRoomsResponse response = CheckAvailableRoomsResponse.newBuilder()
						.setDate(date)
						.setRoomName(roomName)
						.setAvailableTimes(availableTimes)
						.build();

				responseObserver.onNext(response);
				Thread.sleep(1000L);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}catch (InterruptedException a) {
				a.printStackTrace();
			}finally {
				responseObserver.onCompleted();
		}
	}
	
		
	public static String generateRandomDate() {
		LocalDate startDate = LocalDate.now();
		long start = startDate.toEpochDay();
		System.out.println(start);
		
		LocalDate endDate = LocalDate.of(2022, 04, 30);
		long end = endDate.toEpochDay();
		System.out.println(end);
		
		long randomDate = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
		LocalDate ranDate = LocalDate.ofEpochDay(randomDate);
		
		ranDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		//String newRanDate = ranDate.toString();
		System.out.println(ranDate);
		//System.out.println(newRanDate);
		//ranDate.toString();

		String formatRandomDate = ranDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		
		return formatRandomDate;
	}
	
	public static String generateRandomRoomName() {
		 String[] roomNames = {"Green Room", "Red Room" , "Apple Room" ,"Purple Room" ,"Yellow Room", "Orange Room" ,"Blue Room" ,"Plum Room"};
		 String randomRoomName;
		 randomRoomName = roomNames[(int) (Math.random()*roomNames.length)];
		 return randomRoomName;
		
	}
	
	public static String generateRandomTime() throws ParseException {
		Random random = new Random();
		int time = 24*60*60*10;
		Time startTime = new Time((long)random.nextInt(time));
		
		String startTimes = startTime.toString();
		SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		Date startDateTime = df.parse(startTimes);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDateTime);
		cal.add(Calendar.MINUTE, 30); 
		String endTime = df.format(cal.getTime());
		
		String startingTime = df.format(startDateTime);
		
		StringBuffer sb = new StringBuffer();
		sb.append(startingTime);
		sb.append(" - ");
		sb.append(endTime);
		String randomTime = sb.toString();
		
		return randomTime;
	}
}












