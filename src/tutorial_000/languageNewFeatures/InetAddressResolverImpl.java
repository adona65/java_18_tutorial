package tutorial_000.languageNewFeatures;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.util.stream.Stream;

public class InetAddressResolverImpl implements InetAddressResolver {
	@Override
	public Stream<InetAddress> lookupByName(String host, LookupPolicy lookupPolicy)
			throws UnknownHostException {
		return Stream.of(InetAddress.getByAddress(new byte[] {127, 0, 0, 3}));
	}
	
	@Override
	public String lookupByAddress(byte[] addr) {
		throw new UnsupportedOperationException();
	}
}
