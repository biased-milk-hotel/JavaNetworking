import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP of the local machine: "+IP. getHostAddress());
    }
}
