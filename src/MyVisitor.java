import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class MyVisitor extends calcBaseVisitor {
    HashMap<String, Integer> varValues = new HashMap<String, Integer> ();

    @Override
    public Integer visitAssigning(calcParser.AssigningContext ctx) {
        String var = ctx.getChild(0).getText();
        Integer result = (Integer) visit(ctx.getChild(2));
        varValues.put(var, result);
        System.out.println(var + " = " + result);
        return result;
    }

    /*@Override
    public Integer visitExpr(calcParser.ExprContext ctx) {
        Integer childCnt = ctx.getChildCount();
        if (childCnt != 3)
            return (Integer) visitChildren(ctx);
        //System.out.println(ctx.getChild(0).getChild(0).getText());
        if (ctx.getChild(0).getChild(0).getText().equals("("))
            return (Integer) visit(ctx.getChild(1));
        Integer leftRes = (Integer) visit(ctx.getChild(0));
        String op = ctx.getChild(1).getText();
        Integer rightRes = (Integer) visit(ctx.getChild(2));
        switch (op) {
            case "+":
                return leftRes + rightRes;
            case "-":
                return leftRes - rightRes;
            case "*":
                return leftRes * rightRes;
            case "/":
                return leftRes / rightRes;
        }
        return (Integer) visitChildren(ctx);
    }*/

    @Override public Integer visitPowexpr(calcParser.PowexprContext ctx) {
        Integer childCnt = ctx.getChildCount();
        Integer nextChildNum = 0;
        String lastOp = "";
        Integer lastRes = null;
        while (nextChildNum < childCnt){
            Integer curRes = (Integer) visit(ctx.getChild(nextChildNum));
            if (lastOp != ""){
                double result = Math.round(Math.pow(lastRes, curRes));
                int result1 = (int) result;
                lastRes = result1;
            } else {
                lastRes = curRes;
            }
            if (nextChildNum + 1 < childCnt){
                lastOp = ctx.getChild(nextChildNum + 1).getText();
            }
            nextChildNum += 2;
        }
        return lastRes;
    }

    @Override public Integer visitMulexpr(calcParser.MulexprContext ctx) {
        Integer childCnt = ctx.getChildCount();
        Integer nextChildNum = 0;
        String lastOp = "";
        Integer lastRes = null;
        while (nextChildNum < childCnt){
            Integer curRes = (Integer) visit(ctx.getChild(nextChildNum));
            if (lastOp != ""){
                if (lastOp.equals("*")){
                    lastRes *= curRes;
                } else {
                    lastRes /= curRes;
                }
            } else {
                lastRes = curRes;
            }
            if (nextChildNum + 1 < childCnt){
                lastOp = ctx.getChild(nextChildNum + 1).getText();
            }
            nextChildNum += 2;
        }
        return lastRes;
    }

    @Override public Integer visitExpr(calcParser.ExprContext ctx) {
        Integer childCnt = ctx.getChildCount();
        Integer nextChildNum = 0;
        String lastOp = "";
        Integer lastRes = null;
        while (nextChildNum < childCnt){
            Integer curRes = (Integer) visit(ctx.getChild(nextChildNum));
            if (lastOp != ""){
                if (lastOp.equals("+")){
                    lastRes += curRes;
                }
                else {
                    lastRes -= curRes;
                }
            } else {
                lastRes = curRes;
            }
            if (nextChildNum + 1 < childCnt){
                lastOp = ctx.getChild(nextChildNum + 1).getText();
            }
            nextChildNum += 2;
        }
        return lastRes;
    }
    @Override public Integer visitToken(calcParser.TokenContext ctx) {
        if (ctx.getChildCount() == 3)
            return (Integer) visit(ctx.getChild(1));
        return (Integer) visitChildren(ctx);
    }
    @Override public Integer visitVariable(calcParser.VariableContext ctx) {
        return varValues.get(ctx.getChild(0).getText());
    }

    @Override public Integer visitNumber(calcParser.NumberContext ctx) {
        return parseInt(ctx.getChild(0).getText());
    }
}

