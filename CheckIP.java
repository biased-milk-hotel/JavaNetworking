import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckIP {
    public static void main(String[] args) throws UnknownHostException {
        String ipAddress = "192.0.2.1";
        InetAddress address = InetAddress.getByName(ipAddress);
        if (address instanceof java.net.Inet4Address) {
            System.out.println(ipAddress + " is an IPv4 address.");
        } else if (address instanceof java.net.Inet6Address) {
            System.out.println(ipAddress + " is an IPv6 address.");
        } else {
            System.out.println(ipAddress + " is not a valid IP address.");
        }
    }
}
