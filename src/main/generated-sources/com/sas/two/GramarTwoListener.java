// Generated from com/sas/two/GramarTwo.g4 by ANTLR 4.1
package com.sas.two;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramarTwoParser}.
 */
public interface GramarTwoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull GramarTwoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull GramarTwoParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull GramarTwoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull GramarTwoParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull GramarTwoParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull GramarTwoParser.SubContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull GramarTwoParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull GramarTwoParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(@NotNull GramarTwoParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(@NotNull GramarTwoParser.StartRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull GramarTwoParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull GramarTwoParser.OperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull GramarTwoParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull GramarTwoParser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(@NotNull GramarTwoParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(@NotNull GramarTwoParser.SpaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramarTwoParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(@NotNull GramarTwoParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarTwoParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(@NotNull GramarTwoParser.SemicolonContext ctx);
}