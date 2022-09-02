package tutorial_000.languageNewFeatures;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class _003_InternetAdressResolutionSPI {

	public static void main(String[] args) {
		/*
		 * To find out the IP address(es) for a hostname in Java, we can use InetAddress.getByName() or InetAddress.getAllByName() :
		 */
		InetAddress[] addresses;
		try {
			addresses = InetAddress.getAllByName("www.google.fr");
			System.out.println("addresses value would normally be \"[www.google.fr/142.250.201.163]\". But it's value now is " 
					+ Arrays.toString(addresses)
					+ " because of META-INF\\services\\java.net.spi.InetAddressResolverProvider file. Explanations commented below.");
		} catch (UnknownHostException e) {}
		
		System.out.println("---------------------------------------");
		
		/* 
		 * For reverse lookups (resolving an IP address to a hostname), the JDK provides the methods InetAddress.getCanonicalHostName() 
		 * and InetAddress.getHostName().
		 * 
		 * By default, InetAddress uses the operating system's resolver : it usually consults the hosts file and the configured DNS servers.
		 * This may present few disadvantages :
		 * - For testing : it is not possible to map a hostname to the URL of a mocked server.
		 * - New hostname lookup protocols (such as DNS over QUIC, TLS, or HTTPS) cannot be easily implemented in Java.
		 * - The current implementation leads to a blocking operating system call. That alone is unattractive since this call can sometimes take 
		 *   long and cannot be interrupted.
		 *   
		 * For addressing this issues, Java 18 introduce Internet-Address Resolution SPI.
		 * 
		 * The following example shows how to implement and register a simple resolver that responds to every request with the IP 
		 * address 127.0.0.3, using the new SPI.
		 * 
		 * We first need to write the resolver by implementing the java.net.spi.InetAddressResolver.InetAddressResolver interface :
		 * - Watch class "InetAddressResolverImpl".
		 * 
		 * Then we need a resolver provider :
		 * - Watch class "InetAddressResolverProviderImpl".
		 * 
		 * This provider creates a new instance of the previously implemented resolver in the get() method.
		 * 
		 * Finally, we have to register the resolver. To do this, we create a file in the META-INF/services directory named 
		 * java.net.spi.InetAddressResolverProvider and the following content :
		 * "package_name.InetAddressResolverProviderClass". So "tutorial_000.languageNewFeatures.InetAddressResolverProviderImpl" for this project.
		 *
		 * This file allow to specify the adress resolver provider, even for the first example with "www.google.com".
		 */
		
		try {
			InetAddress[] addresses2 = InetAddress.getAllByName("www.happycoders.eu");
			System.out.println("addresses2 = " + Arrays.toString(addresses2));
		} catch (UnknownHostException e) {}
	}
}
