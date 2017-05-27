// Generated from com/sas/one/GramarOne.g4 by ANTLR 4.1
package com.sas.one;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramarOneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramarOneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramarOneParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(@NotNull GramarOneParser.RContext ctx);
}