// Generated from C:/Users/carlo/Documents/GitHub/ProyectoCompiladores/src/Grammar/Gramatica.g4 by ANTLR 4.13.1
package GeneratedGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(GramaticaParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#structure_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_code(GramaticaParser.Structure_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#function_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_code(GramaticaParser.Function_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(GramaticaParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(GramaticaParser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(GramaticaParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GramaticaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GramaticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(GramaticaParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_term(GramaticaParser.Bool_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_factor(GramaticaParser.Bool_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_operation(GramaticaParser.Bool_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GramaticaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(GramaticaParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#funcs_and_procs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs_and_procs(GramaticaParser.Funcs_and_procsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(GramaticaParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GramaticaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GramaticaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#params_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams_type(GramaticaParser.Params_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#int_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_element(GramaticaParser.Int_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GramaticaParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GramaticaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GramaticaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GramaticaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(GramaticaParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(GramaticaParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GramaticaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#procedure_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_def(GramaticaParser.Procedure_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(GramaticaParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(GramaticaParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(GramaticaParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GramaticaParser.ParamsContext ctx);
}