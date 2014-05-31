// Generated from Myne.g4 by ANTLR 4.2.2
package myne;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyneLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, PUNCTUATION=2, NEWLINE=3, COMMA=4, IGNORE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WORD", "PUNCTUATION", "NEWLINE", "COMMA", "IGNORE"
	};
	public static final String[] ruleNames = {
		"COMMA_", "WORD", "PUNCTUATION", "NEWLINE", "COMMA", "IGNORE"
	};


	public MyneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Myne.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\79\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\6\3\23\n\3\r\3\16\3"+
		"\24\3\4\6\4\30\n\4\r\4\16\4\31\3\5\5\5\35\n\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\6\7%\n\7\r\7\16\7&\3\7\3\7\3\7\6\7,\n\7\r\7\16\7-\3\7\3\7\6\7\62\n\7"+
		"\r\7\16\7\63\5\7\66\n\7\3\7\3\7\2\2\b\3\2\5\3\7\4\t\5\13\6\r\7\3\2\7\6"+
		"\2))//C\\c|\5\2##\60\60AA\3\2++\3\2__\5\2\13\13\"\"$$?\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\22\3\2\2"+
		"\2\7\27\3\2\2\2\t\34\3\2\2\2\13 \3\2\2\2\r\65\3\2\2\2\17\20\7.\2\2\20"+
		"\4\3\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24"+
		"\25\3\2\2\2\25\6\3\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\b\3\2\2\2\33\35\7\17\2\2\34\33\3\2\2\2\34"+
		"\35\3\2\2\2\35\36\3\2\2\2\36\37\7\f\2\2\37\n\3\2\2\2 !\5\3\2\2!\f\3\2"+
		"\2\2\"$\7*\2\2#%\n\4\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3"+
		"\2\2\2(\66\7+\2\2)+\7]\2\2*,\n\5\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3"+
		"\2\2\2./\3\2\2\2/\66\7_\2\2\60\62\t\6\2\2\61\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\"\3\2\2\2\65)\3\2\2\2\65"+
		"\61\3\2\2\2\66\67\3\2\2\2\678\b\7\2\28\16\3\2\2\2\n\2\24\31\34&-\63\65"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}