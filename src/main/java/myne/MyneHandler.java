package myne;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.form.FormData;
import io.undertow.server.handlers.form.FormDataParser;
import io.undertow.server.handlers.form.FormParserFactory;
import io.undertow.util.Headers;
import io.undertow.util.Methods;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.Objects;
import java.util.logging.Handler;

/**
 * Handles the JSON test.
 */
final class MyneHandler implements HttpHandler {

    // global json mapper object
    // thread-safe
    private final ObjectMapper objectMapper;

    public MyneHandler(ObjectMapper objectMapper) {

        this.objectMapper = Objects.requireNonNull(objectMapper);

    }

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {

        if (exchange.getRequestMethod() != Methods.POST) {
            exchange.setResponseCode(405);
            exchange.getResponseSender().send("Unsupported METHOD");
            return;
        }

        String song = "";

        try {

            FormDataParser formParser = FormParserFactory.builder().build().createParser(exchange);
            FormData formData = formParser.parseBlocking();
            Deque<FormData.FormValue> song_param = formData.get("song");
            FormData.FormValue param = song_param.getFirst();
            if (param != null && !param.isFile()) {
                song = param.getValue();
            }

        } catch (Exception e) {
            exchange.setResponseCode(400);
            exchange.getResponseSender().send("Missing required POST variable 'song'");
            return;
        }

        try {

            MyneLexer lexer = new MyneLexer(new ANTLRInputStream(song));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyneParser parser = new MyneParser(tokens);

            parser.setErrorHandler(new BailErrorStrategy());

            ParseTree tree = parser.song();

            Node new_tree = Node.BuildTree(tree, parser);

            exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json; encoding=UTF-8");

            exchange.getResponseSender().send(
                    ByteBuffer.wrap(
                            objectMapper.writeValueAsBytes(new_tree)
                    )
            );

        } catch (Exception e) {

            e.printStackTrace();

            exchange.setResponseCode(400);
            exchange.getResponseSender().send("Unable to parse dat shit");
            return;

        }


    }
}
