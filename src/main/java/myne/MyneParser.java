// Generated from Myne.g4 by ANTLR 4.2.2
package myne;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyneParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, PUNCTUATION=2, NEWLINE=3, COMMA=4, IGNORE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "WORD", "PUNCTUATION", "NEWLINE", "COMMA", "IGNORE"
	};
	public static final int
		RULE_song = 0, RULE_stanza = 1, RULE_verse = 2, RULE_sentence = 3;
	public static final String[] ruleNames = {
		"song", "stanza", "verse", "sentence"
	};

	@Override
	public String getGrammarFileName() { return "Myne.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SongContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MyneParser.NEWLINE); }
		public StanzaContext stanza(int i) {
			return getRuleContext(StanzaContext.class,i);
		}
		public List<StanzaContext> stanza() {
			return getRuleContexts(StanzaContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(MyneParser.NEWLINE, i);
		}
		public SongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_song; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).enterSong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).exitSong(this);
		}
	}

	public final SongContext song() throws RecognitionException {
		SongContext _localctx = new SongContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_song);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(8); match(NEWLINE);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); stanza();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StanzaContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MyneParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyneParser.NEWLINE, i);
		}
		public VerseContext verse(int i) {
			return getRuleContext(VerseContext.class,i);
		}
		public List<VerseContext> verse() {
			return getRuleContexts(VerseContext.class);
		}
		public StanzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stanza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).enterStanza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).exitStanza(this);
		}
	}

	public final StanzaContext stanza() throws RecognitionException {
		StanzaContext _localctx = new StanzaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stanza);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(19); verse();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(22); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(24); match(NEWLINE);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerseContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MyneParser.NEWLINE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public VerseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).enterVerse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).exitVerse(this);
		}
	}

	public final VerseContext verse() throws RecognitionException {
		VerseContext _localctx = new VerseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_verse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(30); sentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(35); match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MyneParser.WORD); }
		public List<TerminalNode> COMMA() { return getTokens(MyneParser.COMMA); }
		public TerminalNode PUNCTUATION() { return getToken(MyneParser.PUNCTUATION, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MyneParser.COMMA, i);
		}
		public TerminalNode WORD(int i) {
			return getToken(MyneParser.WORD, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyneListener ) ((MyneListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38); match(WORD);
					setState(40);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(39); match(COMMA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(47);
			_la = _input.LA(1);
			if (_la==PUNCTUATION) {
				{
				setState(46); match(PUNCTUATION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\6\2\22\n\2\r\2"+
		"\16\2\23\3\3\6\3\27\n\3\r\3\16\3\30\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3"+
		"\4\6\4\"\n\4\r\4\16\4#\3\4\5\4\'\n\4\3\5\3\5\5\5+\n\5\6\5-\n\5\r\5\16"+
		"\5.\3\5\5\5\62\n\5\3\5\2\2\6\2\4\6\b\2\28\2\r\3\2\2\2\4\26\3\2\2\2\6!"+
		"\3\2\2\2\b,\3\2\2\2\n\f\7\5\2\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2"+
		"\r\16\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22"+
		"\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\27\5\6\4\2\26"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\35\3\2\2\2\32"+
		"\34\7\5\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\5\3\2\2\2\37\35\3\2\2\2 \"\5\b\5\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$&\3\2\2\2%\'\7\5\2\2&%\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(*\7\3\2\2"+
		")+\7\6\2\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,(\3\2\2\2-.\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\61\3\2\2\2\60\62\7\4\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\t"+
		"\3\2\2\2\13\r\23\30\35#&*.\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}