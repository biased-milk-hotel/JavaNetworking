import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CanonicalHostname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the web address: ");
        String webAddress = scanner.nextLine();

        try {
            InetAddress address = InetAddress.getByName(webAddress);
            String canonicalHostname = address.getCanonicalHostName();
            System.out.println("Canonical Hostname: " + canonicalHostname);
        } catch (UnknownHostException e) {
            System.out.println("Unable to find the canonical hostname for the given web address.");
            e.printStackTrace();
        }

        scanner.close();
    }
}