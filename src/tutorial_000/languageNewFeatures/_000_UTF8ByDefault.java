package tutorial_000.languageNewFeatures;

public class _000_UTF8ByDefault {

	public static void main(String[] args) {
		/*
		 * Prior to Java 18, the standard Java character set varies depending on the operating system and language settings. This was a problem,
		 * because the Java standard character set determines how Strings are converted to bytes and vice versa in numerous methods of the JDK 
		 * class library like the constructors of FileReader, FileWriter or static methods like URLEncoder.encode() and URLDecoder.decode().
		 * 
		 * This can lead to unpredictable behavior if an application is developed in an environment with an given character set, and run
		 * in another environment with different character set. For example, we may have the content of a file rendered like "ƒ‡ã°ï¼?"
		 * instead of proper characters.
		 * 
		 * The problem of character encoding is even more deeply. Indeed, it happens that newer class library methods (like Files.writeString(),
		 * Files.newBufferedReader()...) do not respect the default character set but always use UTF-8 if no character set is specified. It may
		 * lead to unpredictable results.
		 * 
		 * Until today, for addressing this issue, we may either :
		 * - Specify the character set when calling all methods that convert strings to bytes and vice versa.
		 * - Set the default character set via system property "file.encoding".
		 * 
		 * With the release of Java 18, this issues will mostly not happens. In Java 18, the default encoding will always be UTF-8 regardless 
		 * of the operating system, locale, and language settings.
		 */
	}
}
