// Generated from com/sas/one/GramarOne.g4 by ANTLR 4.1
package com.sas.one;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link GramarOneVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class GramarOneBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements GramarOneVisitor<T> {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitR(@NotNull GramarOneParser.RContext ctx) { return visitChildren(ctx); }
}