package myne;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.UndertowOptions;
import io.undertow.io.UndertowInputStream;
import io.undertow.server.HttpHandler;
import io.undertow.util.Headers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * An implementation of the TechEmpower benchmark tests using the Undertow web
 * server.  The only test that truly exercises Undertow in isolation is the
 * plaintext test.  For the rest, it uses best-of-breed components that are
 * expected to perform well.  The idea is that using these components enables
 * these tests to serve as performance baselines for hypothetical, Undertow-based
 * frameworks.  For instance, it is unlikely that such frameworks would complete
 * the JSON test faster than this will, because this implementation uses
 * Undertow and Jackson in the most direct way possible to fulfill the test
 * requirements.
 */
public final class MyneServer {

  public static void main(final String[] args) throws Exception {

    Properties properties = new Properties();

    InputStream in = MyneServer.class.getResourceAsStream("server.properties");
    properties.load(in);

    // thread-safe as long as not reconfigured after server starts
    final ObjectMapper objectMapper = new ObjectMapper();

      HttpHandler routes = Handlers.path()
              .addPrefixPath("/projects/myne/parse", new MyneHandler(objectMapper));

      routes = Handlers.header(routes, "Access-Control-Allow-Origin", "*");
      routes = Handlers.header(routes, Headers.SERVER_STRING, "Myne Server");

    Undertow.builder()
        .addHttpListener(
          Integer.parseInt(properties.getProperty("web.port")),
          properties.getProperty("web.host")
        )
        .setBufferSize(1024 * 16)
        .setIoThreads(Runtime.getRuntime().availableProcessors() * 2) //this seems slightly faster in some configurations
        .setServerOption(UndertowOptions.ALWAYS_SET_KEEP_ALIVE, false) //don't send a keep-alive header for HTTP/1.1 requests, as it is not required
        .setHandler(routes)
        .setWorkerThreads(200)
        .build()
        .start();
  }

}
