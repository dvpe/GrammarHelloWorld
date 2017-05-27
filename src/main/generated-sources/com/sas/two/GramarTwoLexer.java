// Generated from com/sas/two/GramarTwo.g4 by ANTLR 4.1
package com.sas.two;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramarTwoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, DIGIT=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'add'", "' '", "'div'", "'ADD'", "'DIV'", "'sub'", "'MUL'", "';'", "'mul'", 
		"'SUB'", "DIGIT", "WS"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "DIGIT", "WS"
	};


	public GramarTwoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramarTwo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16H\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\6\rC\n\r\r\r\16\rD\3\r\3\r\2"+
		"\16\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\2\3\2\4\3\2\62;\4\2\13\f\17\17H\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2"+
		"\2\5\37\3\2\2\2\7!\3\2\2\2\t%\3\2\2\2\13)\3\2\2\2\r-\3\2\2\2\17\61\3\2"+
		"\2\2\21\65\3\2\2\2\23\67\3\2\2\2\25;\3\2\2\2\27?\3\2\2\2\31B\3\2\2\2\33"+
		"\34\7c\2\2\34\35\7f\2\2\35\36\7f\2\2\36\4\3\2\2\2\37 \7\"\2\2 \6\3\2\2"+
		"\2!\"\7f\2\2\"#\7k\2\2#$\7x\2\2$\b\3\2\2\2%&\7C\2\2&\'\7F\2\2\'(\7F\2"+
		"\2(\n\3\2\2\2)*\7F\2\2*+\7K\2\2+,\7X\2\2,\f\3\2\2\2-.\7u\2\2./\7w\2\2"+
		"/\60\7d\2\2\60\16\3\2\2\2\61\62\7O\2\2\62\63\7W\2\2\63\64\7N\2\2\64\20"+
		"\3\2\2\2\65\66\7=\2\2\66\22\3\2\2\2\678\7o\2\289\7w\2\29:\7n\2\2:\24\3"+
		"\2\2\2;<\7U\2\2<=\7W\2\2=>\7D\2\2>\26\3\2\2\2?@\t\2\2\2@\30\3\2\2\2AC"+
		"\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\r\2\2G"+
		"\32\3\2\2\2\4\2D";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}