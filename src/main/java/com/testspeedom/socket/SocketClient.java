package com.testspeedom.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class SocketClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 9090)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String receivedNumber;
            while ((receivedNumber = input.readLine()) != null) {
                System.out.println("Received: " + receivedNumber);
            }
        }
    }
}
