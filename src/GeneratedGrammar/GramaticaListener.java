// Generated from C:/Users/carlo/Documents/GitHub/ProyectoCompiladores/src/Grammar/Gramatica.g4 by ANTLR 4.13.1
package GeneratedGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(GramaticaParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(GramaticaParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#structure_code}.
	 * @param ctx the parse tree
	 */
	void enterStructure_code(GramaticaParser.Structure_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#structure_code}.
	 * @param ctx the parse tree
	 */
	void exitStructure_code(GramaticaParser.Structure_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#function_code}.
	 * @param ctx the parse tree
	 */
	void enterFunction_code(GramaticaParser.Function_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#function_code}.
	 * @param ctx the parse tree
	 */
	void exitFunction_code(GramaticaParser.Function_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(GramaticaParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(GramaticaParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(GramaticaParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(GramaticaParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(GramaticaParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(GramaticaParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramaticaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramaticaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(GramaticaParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(GramaticaParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(GramaticaParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(GramaticaParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void enterBool_factor(GramaticaParser.Bool_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void exitBool_factor(GramaticaParser.Bool_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_operation}.
	 * @param ctx the parse tree
	 */
	void enterBool_operation(GramaticaParser.Bool_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_operation}.
	 * @param ctx the parse tree
	 */
	void exitBool_operation(GramaticaParser.Bool_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#funcs_and_procs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs_and_procs(GramaticaParser.Funcs_and_procsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#funcs_and_procs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs_and_procs(GramaticaParser.Funcs_and_procsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(GramaticaParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(GramaticaParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GramaticaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GramaticaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramaticaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramaticaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params_type}.
	 * @param ctx the parse tree
	 */
	void enterParams_type(GramaticaParser.Params_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params_type}.
	 * @param ctx the parse tree
	 */
	void exitParams_type(GramaticaParser.Params_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#int_element}.
	 * @param ctx the parse tree
	 */
	void enterInt_element(GramaticaParser.Int_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#int_element}.
	 * @param ctx the parse tree
	 */
	void exitInt_element(GramaticaParser.Int_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GramaticaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GramaticaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GramaticaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GramaticaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(GramaticaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(GramaticaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(GramaticaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(GramaticaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(GramaticaParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(GramaticaParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(GramaticaParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(GramaticaParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GramaticaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GramaticaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#procedure_def}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_def(GramaticaParser.Procedure_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#procedure_def}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_def(GramaticaParser.Procedure_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(GramaticaParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(GramaticaParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GramaticaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GramaticaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(GramaticaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(GramaticaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GramaticaParser.ParamsContext ctx);
}