// Generated from com/sas/two/GramarTwo.g4 by ANTLR 4.1
package com.sas.two;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramarTwoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, DIGIT=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'add'", "' '", "'div'", "'ADD'", "'DIV'", "'sub'", "'MUL'", 
		"';'", "'mul'", "'SUB'", "DIGIT", "WS"
	};
	public static final int
		RULE_startRule = 0, RULE_operation = 1, RULE_operand = 2, RULE_space = 3, 
		RULE_semicolon = 4, RULE_add = 5, RULE_sub = 6, RULE_mul = 7, RULE_div = 8;
	public static final String[] ruleNames = {
		"startRule", "operation", "operand", "space", "semicolon", "add", "sub", 
		"mul", "div"
	};

	@Override
	public String getGrammarFileName() { return "GramarTwo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramarTwoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); operation();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19); space();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 );
			setState(24); operand();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25); space();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 );
			setState(30); operand();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(31); space();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); semicolon();
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

	public static class OperationContext extends ParserRuleContext {
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case 1:
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); add();
				}
				break;
			case 6:
			case 10:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); sub();
				}
				break;
			case 3:
			case 5:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); div();
				}
				break;
			case 7:
			case 9:
				enterOuterAlt(_localctx, 4);
				{
				setState(42); mul();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(GramarTwoParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GramarTwoParser.DIGIT); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45); match(DIGIT);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class SpaceContext extends ParserRuleContext {
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(2);
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(8);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==6 || _la==10) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==9) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramarTwoListener ) ((GramarTwoListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramarTwoVisitor ) return ((GramarTwoVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\16A\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\6\4\61\n\4\r\4\16\4"+
		"\62\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\13\2\4\6\b\n"+
		"\f\16\20\22\2\6\4\2\3\3\6\6\4\2\b\b\f\f\4\2\t\t\13\13\4\2\5\5\7\7>\2\24"+
		"\3\2\2\2\4-\3\2\2\2\6\60\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2"+
		"\16:\3\2\2\2\20<\3\2\2\2\22>\3\2\2\2\24\26\5\4\3\2\25\27\5\b\5\2\26\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\5\6\4\2\33\35\5\b\5\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37 \3\2\2\2 $\5\6\4\2!#\5\b\5\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2"+
		"\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\5\n\6\2(\3\3\2\2\2).\5\f\7\2*.\5"+
		"\16\b\2+.\5\22\n\2,.\5\20\t\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2"+
		".\5\3\2\2\2/\61\7\r\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\7\3\2\2\2\64\65\7\4\2\2\65\t\3\2\2\2\66\67\7\n\2\2\67\13\3"+
		"\2\2\289\t\2\2\29\r\3\2\2\2:;\t\3\2\2;\17\3\2\2\2<=\t\4\2\2=\21\3\2\2"+
		"\2>?\t\5\2\2?\23\3\2\2\2\7\30\36$-\62";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}