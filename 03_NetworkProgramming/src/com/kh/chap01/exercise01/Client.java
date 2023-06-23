package com.kh.chap01.exercise01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public void client() {
		
		int port = 3000;
		String serverIP;
		
		try {
			
			serverIP = "192.168.20.34";
			
			Socket socket = new Socket(serverIP, port);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
