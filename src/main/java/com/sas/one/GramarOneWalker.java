package com.sas.one;


/**
 * Created by davidvegaperez on 27/5/17.
 */
public class GramarOneWalker extends GramarOneBaseListener {
    public void enterR(GramarOneParser.RContext ctx) {
        System.out.println("Entering R : " + ctx.ID().getText());
    }

    public void exitR(GramarOneParser.RContext ctx) {
        System.out.println("Exiting R");
    }
}