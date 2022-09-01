package tutorial_000.languageNewFeatures;

public class _002_CodeSnippetsEnhanced {

	public static void main(String[] args) {
		/*
		 * The release of Java 18 now give developers the possibility to starting up a rudimentary HTTP server (this may for example allow
		 * to quickly test some web functionality). The easiest way to start the provided webserver is the jwebserver command. 
		 * It starts the server on localhost:8000 and provides a file browser for the current directory :
		 * 
		 	$ jwebserver
			Binding to loopback by default. For all interfaces use "-b 0.0.0.0" or "-b ::".
			Serving /home/sven and subdirectories on 127.0.0.1 port 8000
			URL http://127.0.0.1:8000/
		 * 
		 * We can use :
		 * -b parameter to specify the IP address on which the server should listen
		 * -p parameter to change the port
		 * -d parameter to modify the directory the server should serve
		 * -o parameter allow to configure the log output. 
		 * -h give a list of options with explanations
		 * 
		 * A command using previous parameter would be for example :
		 * 
		 	$ jwebserver -b 127.0.0.100 -p 4444 -d /tmp -o verbose
			Serving /tmp and subdirectories on 127.0.0.100 port 4444
			URL http://127.0.0.100:4444/
		 *
		 * Please note that this webserver has the following limitations :
		 * - The only supported protocol is HTTP/1.1.
		 * - HTTPS is not provided.
		 * - Only the HTTP GET and HEAD methods are allowed.
		 * 
		 * Also, be aware that "jwebserver" is not a standalone tool, but just a wrapper that calls "java -m jdk.httpserver". This command 
		 * calls the main() method of the sun.net.httpserver.simpleserver.Main class of the jdk.httpserver module, which, in turn, calls 
		 * SimpleFileServerImpl.start(...). This starter evaluates the command line parameters and finally creates the server via 
		 * SimpleFileServer.createFileServer(...).
		 * 
		 * So, we also start this webserver through java code :
		 * 
			HttpServer server = SimpleFileServer.createFileServer(new InetSocketAddress(8080), Path.of("\tmp"), OutputLevel.INFO);
			server.start();
		 *
		 */
	}
}
