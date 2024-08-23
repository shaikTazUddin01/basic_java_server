import java.io.*;

import java.net.Socket;
/**
 * client
 */
public class client {

    public static void main(String[] args) throws Exception {
        String serverip ="Localhost";
        int serverport = 9999;

        Socket client =new Socket(serverip,serverport);
        DataInputStream is= new DataInputStream(client.getInputStream());
        DataOutputStream os =new DataOutputStream(client.getOutputStream());
        // Number mes=7;
        os.writeUTF("Client say : Hello Server");
        os.flush();

        String rec_mes=is.readUTF();
        System.out.println(rec_mes);
        client.close();
    }
}