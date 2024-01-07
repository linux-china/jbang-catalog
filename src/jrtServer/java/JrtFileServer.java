///usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 21

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.file.Paths;

/**
 * Java runtime file System
 */
public class JrtFileServer {
    public static void main(String[] args) {
        final URI uri = URI.create("jrt:/");
        int port = 8091;
        final HttpServer fileServer = SimpleFileServer.createFileServer(new InetSocketAddress(port),
                Paths.get(uri),
                SimpleFileServer.OutputLevel.VERBOSE);
        System.out.printf("File server started on http://localhost:%d", port);
        fileServer.start();
    }
}
