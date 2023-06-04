import java.net.InetAddress;

public class NetworkAddress {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.google.com");
            System.out.println("Hostname: " + addr.getHostName());
            System.out.println("IP: " + addr.getHostAddress());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}