package MiniProject;

import SetiPotoki.II.ClientHandler;

import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Thread.sleep;
public class Server {
    public static void main(String[]args){
        try {
            ServerSocket server = new ServerSocket(5151);
            System.out.println("Waiting for Client!");
            while(true){
                Socket socket = server.accept();
                System.out.println("Client connected!");
                ClientHandler ch = new ClientHandler(socket);
                sleep(550);
                ch.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    public static void main(String[]args){
//        try {
//            ServerSocket server = new ServerSocket(5252);
//            System.out.println("Waiting for Client!");
//            while(true){
//                Socket socket = server.accept();
//                System.out.println("Client connected!");
//                SetiPotoki.II.ClientHandler ch = new ClientHandler(socket);
//                sleep(550);
//                ch.start();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
