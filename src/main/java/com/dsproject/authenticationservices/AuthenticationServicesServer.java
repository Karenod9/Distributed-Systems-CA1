package com.dsproject.authenticationservices;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.util.Properties;


import com.dsproject.authenticationservices.AuthenticationServicesGrpc.AuthenticationServicesImplBase;

public class AuthenticationServicesServer extends AuthenticationServicesImplBase {
	
	private static final Logger logger = Logger.getLogger(AuthenticationServicesServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {

		AuthenticationServicesServer authenticationServicesServer = new AuthenticationServicesServer();
		
		Properties prop = authenticationServicesServer.getProperties();
		authenticationServicesServer.registerService(prop);
		
		//int port = 50051;
		int port = Integer.valueOf(prop.getProperty("service_port"));
		
		try {
		
		Server server = ServerBuilder.forPort(port)
				.addService(authenticationServicesServer)
				.build()
				.start();
		logger.info("Server started, listening on " + port);
		server.awaitTermination();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private Properties getProperties() {
		Properties prop = null;
		try(InputStream input = new FileInputStream("src/main/resources/account.properties")){
			prop = new Properties();
			
			prop.load(input);
			
			System.out.println("Authentication Services properties : ");
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
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		String username = request.getUsername();
		String password = request.getPassword();
				
		if(username.equals(password)) {
			responseObserver.onNext(LoginResponse.newBuilder()
					.setResponseCode(0)
					.setResponseMessage("Login Successful! " + "\nWelcome back " + username).build());
		}else {
			responseObserver.onNext(LoginResponse.newBuilder()
					.setResponseCode(100)
					.setResponseMessage("Login Failed. Ensure your password & username match").build());
			
		}
		responseObserver.onCompleted();
	}
	
	@Override
	public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
		int requestMessage = request.getRequestMessage();
		if(requestMessage == 1) {
			
		responseObserver.onNext(LogoutResponse.newBuilder()
				.setResponseMessage("You have been logged out successfully!").build());
		}else {
			responseObserver.onNext(LogoutResponse.newBuilder()
					.setResponseMessage("Logout Failed! Please try again!").build());
		}
		responseObserver.onCompleted();
	}
	
				


}

