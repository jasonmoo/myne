package myne;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    public String name;
    public String value;
    public ArrayList<Node> children;

    public Node() {
        name = "";
        value = "";
        children = new ArrayList<Node>();
    }

    // recursive function to rebuild tree with Node objects
    public static Node BuildTree(ParseTree tree, Parser parser) {

        Node n = new Node();

        int child_count = tree.getChildCount();

        n.name = getNodeText(tree, parser);

        if (child_count == 0) {
            n.value = tree.getText();
        } else {
            for (int i = 0; i < child_count; i++) {

                ParseTree node = tree.getChild(i);

                // skip newlines when building the tree
                if (node instanceof TerminalNode) {
                    Token symbol = ((TerminalNode) node).getSymbol();
                    if (symbol != null && symbol.getType() == MyneLexer.NEWLINE) {
                        continue;
                    }
                }

                n.children.add(BuildTree(node, parser));
            }
        }

        return n;

    }

    private static String getNodeText(@NotNull Tree t, @Nullable Parser recog) {

        List<String> ruleNamesList = Arrays.asList(recog.getRuleNames());
        List<String> tokenNamesList = Arrays.asList(recog.getTokenNames());

        return getNodeText(t, ruleNamesList, tokenNamesList);

    }

    private static String getNodeText(@NotNull Tree t, @Nullable List<String> ruleNames, @Nullable List<String> tokenNames) {

        if (t instanceof RuleNode) {
            int ruleIndex = ((RuleNode) t).getRuleContext().getRuleIndex();
            return ruleNames.get(ruleIndex);
        }

        if (t instanceof ErrorNode) {
            return t.toString();
        }

        if (t instanceof TerminalNode) {
            Token symbol = ((TerminalNode) t).getSymbol();
            if (symbol != null) {
                return tokenNames.get(symbol.getType());
            }
        }

        // no recog for rule names
        Object payload = t.getPayload();

        if (payload instanceof Token) {
            return ((Token) payload).getText();
        }

        return t.getPayload().toString();

    }

}