package com.sas.two;

import org.antlr.v4.runtime.misc.NotNull;

public class GramarTwoWalker extends GramarTwoBaseListener {
    public void enterStartRule(GramarTwoParser.StartRuleContext ctx) {
        System.out.println("Entering start rule: " + ctx.operation().getText());
        java.util.Iterator<GramarTwoParser.OperandContext> it = ctx.operand().iterator();
        while (it.hasNext()){
            System.out.println(it.next().DIGIT(0).getSymbol().getText());
        }

    }

    public void exitStartRule(GramarTwoParser.StartRuleContext ctx) {
        System.out.println("Exiting start rule");
    }

    @Override
    public void enterAdd(@NotNull GramarTwoParser.AddContext ctx) {
        System.out.println("Entering add operation: ");
    }

    @Override
    public void exitAdd(@NotNull GramarTwoParser.AddContext ctx) {
        System.out.println("Exiting add operation: ");
    }


}