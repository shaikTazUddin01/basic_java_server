import java.io.*;
import java.net.*;

public class factorial_server {

    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(999);

        System.out.println("server is waiting");

        Socket client = ss.accept();

        System.out.println("connection established");

        DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
        DataInputStream inputStream = new DataInputStream(client.getInputStream());


        int number = inputStream.readInt();
        // Calculate the factorial of the number
        int factorial = calculateFactorial(number);
        System.out.println("Calculated factorial: " + factorial);

        // Send the result back to the client
        outputStream.writeInt(factorial);
        outputStream.flush();

        client.close();

    }
    private static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}