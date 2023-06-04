import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPv4v6 {
    public static void main(String[] args) throws UnknownHostException {
        String hostname = "www.google.com";
        InetAddress[] addresses = InetAddress.getAllByName(hostname);
        for (InetAddress address : addresses) {
            if (address.getHostAddress().contains(":")) {
                System.out.println("IPv6 Address: " + address.getHostAddress());
            } else {
                System.out.println("IPv4 Address: " + address.getHostAddress());
            }
        }
    }
}
