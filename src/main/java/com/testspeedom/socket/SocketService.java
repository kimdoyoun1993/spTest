package com.testspeedom.socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
public class SocketService {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is running...");
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    Random random = new Random();
                    while (true) {
                        int randomNumber = 1 + random.nextInt(99);
                        System.out.println("Sending: " + randomNumber);
                        out.println(randomNumber);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
