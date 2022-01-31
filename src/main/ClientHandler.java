package MiniProject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class ClientHandler extends Thread{
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MiniProject.PackageData pcd = null;
            while ((pcd = (MiniProject.PackageData) inputStream.readObject()) != null) {
                MiniProject.PackageData packag = new PackageData(pcd.getTextField());
                outputStream.writeObject(packag);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

