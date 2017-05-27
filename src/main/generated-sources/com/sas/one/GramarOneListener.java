// Generated from com/sas/one/GramarOne.g4 by ANTLR 4.1
package com.sas.one;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramarOneParser}.
 */
public interface GramarOneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramarOneParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull GramarOneParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramarOneParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull GramarOneParser.RContext ctx);
}