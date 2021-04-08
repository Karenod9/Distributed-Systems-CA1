package client;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.dsproject.authenticationservices.AuthenticationServicesGrpc;
import com.dsproject.authenticationservices.LoginRequest;
import com.dsproject.authenticationservices.LoginResponse;
import com.dsproject.authenticationservices.LogoutRequest;
import com.dsproject.authenticationservices.LogoutResponse;
import com.dsproject.authenticationservices.AuthenticationServicesGrpc.AuthenticationServicesBlockingStub;
import com.dsproject.authenticationservices.AuthenticationServicesGrpc.AuthenticationServicesStub;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;


public class MainGUIController {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passLabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;
	private static JFrame frame;
	
	private static ServiceInfo authenticationServicesInfo; 

	private static AuthenticationServicesBlockingStub blockingStub;
	private static AuthenticationServicesStub asyncStub;
	


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUIController window = new MainGUIController();
					
					window.frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		
		
	public MainGUIController() {		
		String authentication_service_type = "_AuthenticationServices._tcp.local.";
		discoverAuthenticationServices(authentication_service_type);
				

		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 9090)
				.usePlaintext()
				.build();
		
		blockingStub = AuthenticationServicesGrpc.newBlockingStub(channel);
		asyncStub = AuthenticationServicesGrpc.newStub(channel);
		
		initialize();
	}
		
	private void initialize() {
		JPanel panel = new JPanel();
				
		frame = new JFrame();
		frame.setTitle("Please Login to Access Services");
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username: ");
		//x y w h
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passLabel = new JLabel("Password: ");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		passText = new JPasswordField(20);
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String username = userText.getText();
				@SuppressWarnings("deprecation")
				String password = passText.getText();
				
				LoginRequest req = LoginRequest.newBuilder()
						.setUsername(username)
						.setPassword(password)
						.build();
				LoginResponse response = blockingStub.login(req);
				System.out.println(response.getResponseMessage());
				//System.out.println(response.getResponseCode());
				success.setText(response.getResponseMessage());
			}
		});
	
		panel.add(button);
		
		button = new JButton("Logout");
		button.setBounds(210, 80, 80, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ee) {
				int logout = 1;
				LogoutRequest req = LogoutRequest.newBuilder()
						.setRequestMessage(logout)
						.build();

				LogoutResponse response = blockingStub.logout(req);
				System.out.println(response.getResponseMessage());
				success.setText(response.getResponseMessage());
			}
		});
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
//		frame.setVisible(true);
	
}
	
	private static void discoverAuthenticationServices(String service_type) {
		
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Authentication Services resolved : " +event.getInfo());
					
					authenticationServicesInfo = event.getInfo();
					
					String[] host = authenticationServicesInfo.getHostAddresses();
					//int port = authenticationServicesInfo.getPort();
					
					int port = authenticationServicesInfo.getPort();
					System.out.println("hello");
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + authenticationServicesInfo.getNiceTextString());
					System.out.println("\t host: " + authenticationServicesInfo.getHostAddresses()[0]);					
					
				}

				@Override
				public void serviceAdded(ServiceEvent event) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void serviceRemoved(ServiceEvent event) {
					// TODO Auto-generated method stub
					
				}
			});
			jmdns.close();
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}




	


