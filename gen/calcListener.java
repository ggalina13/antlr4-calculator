// Generated from /home/galina13/IdeaProjects/MT/calc/src/calc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(calcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(calcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(calcParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(calcParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#assigning}.
	 * @param ctx the parse tree
	 */
	void enterAssigning(calcParser.AssigningContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#assigning}.
	 * @param ctx the parse tree
	 */
	void exitAssigning(calcParser.AssigningContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(calcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(calcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(calcParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(calcParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(calcParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(calcParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(calcParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(calcParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(calcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(calcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(calcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(calcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#mainVar}.
	 * @param ctx the parse tree
	 */
	void enterMainVar(calcParser.MainVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#mainVar}.
	 * @param ctx the parse tree
	 */
	void exitMainVar(calcParser.MainVarContext ctx);
}