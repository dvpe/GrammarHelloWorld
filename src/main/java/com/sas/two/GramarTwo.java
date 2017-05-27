package com.sas.two;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


/**
 * Created by davidvegaperez on 27/5/17.
 */
public class GramarTwo {
    public static void main(String [] args) throws Exception
    {

        ANTLRInputStream antlrInputStream = new ANTLRInputStream("add 1 5;");

        GramarTwoLexer lexer = new GramarTwoLexer(antlrInputStream);

        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GramarTwoParser parser = new GramarTwoParser( tokens );
        ParseTree tree = parser.startRule();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new GramarTwoWalker(), tree );
    }
}
