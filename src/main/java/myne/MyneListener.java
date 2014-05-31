// Generated from Myne.g4 by ANTLR 4.2.2
package myne;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyneParser}.
 */
public interface MyneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyneParser#song}.
	 * @param ctx the parse tree
	 */
	void enterSong(@NotNull MyneParser.SongContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyneParser#song}.
	 * @param ctx the parse tree
	 */
	void exitSong(@NotNull MyneParser.SongContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyneParser#verse}.
	 * @param ctx the parse tree
	 */
	void enterVerse(@NotNull MyneParser.VerseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyneParser#verse}.
	 * @param ctx the parse tree
	 */
	void exitVerse(@NotNull MyneParser.VerseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyneParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull MyneParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyneParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull MyneParser.SentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyneParser#stanza}.
	 * @param ctx the parse tree
	 */
	void enterStanza(@NotNull MyneParser.StanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyneParser#stanza}.
	 * @param ctx the parse tree
	 */
	void exitStanza(@NotNull MyneParser.StanzaContext ctx);
}