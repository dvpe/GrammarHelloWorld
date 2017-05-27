package com.sas.one;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by davidvegaperez on 27/5/17.
 */
public class GramarOne {
    public static void main(String [] args) throws Exception
    {

        ANTLRInputStream antlrInputStream = new ANTLRInputStream("hello world");

        GramarOneLexer lexer = new GramarOneLexer(antlrInputStream);

        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GramarOneParser parser = new GramarOneParser( tokens );
        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new GramarOneWalker(), tree );
    }
}
