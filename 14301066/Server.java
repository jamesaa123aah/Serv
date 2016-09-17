package com.server;


import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			ServerSocket serverSocket = new ServerSocket(8888); 
			Socket socket = null; 
			
			int count = 0; 
			System.out.println("***服务器即将启动，等待客户端的链接***");
			
			
			while (true) {
				
				
				socket=serverSocket.accept();
				
				ServerThread serverThread = new ServerThread(socket);
			
				serverThread.start();
											
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("111");
		}
	}

}
