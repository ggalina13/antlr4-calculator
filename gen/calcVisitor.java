// Generated from /home/galina13/IdeaProjects/MT/calc/src/calc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(calcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(calcParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#assigning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigning(calcParser.AssigningContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(calcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(calcParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(calcParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(calcParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(calcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(calcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#mainVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainVar(calcParser.MainVarContext ctx);
}