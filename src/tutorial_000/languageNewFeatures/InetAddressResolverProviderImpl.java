package tutorial_000.languageNewFeatures;

import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;

public class InetAddressResolverProviderImpl extends InetAddressResolverProvider {
	@Override
	public InetAddressResolver get(Configuration configuration) {
		return new InetAddressResolverImpl();
	}

	@Override
	public String name() {
		return "This is our custom provider.";
	}
}
