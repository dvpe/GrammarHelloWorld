// Generated from com/sas/two/GramarTwo.g4 by ANTLR 4.1
package com.sas.two;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramarTwoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramarTwoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull GramarTwoParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull GramarTwoParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull GramarTwoParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull GramarTwoParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(@NotNull GramarTwoParser.StartRuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull GramarTwoParser.OperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull GramarTwoParser.OperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(@NotNull GramarTwoParser.SpaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link GramarTwoParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(@NotNull GramarTwoParser.SemicolonContext ctx);
}