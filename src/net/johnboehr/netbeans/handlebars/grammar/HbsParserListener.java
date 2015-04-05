// Generated from C:\Users\Rin\Documents\GitHub\NetbeansHandlebars\src\net\johnboehr\netbeans\handlebars\grammar\HbsParser.g4 by ANTLR 4.3
package net.johnboehr.netbeans.handlebars.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HbsParser}.
 */
public interface HbsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HbsParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(@NotNull HbsParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(@NotNull HbsParser.TemplateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code refPram}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterRefPram(@NotNull HbsParser.RefPramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refPram}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitRefPram(@NotNull HbsParser.RefPramContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#tvar}.
	 * @param ctx the parse tree
	 */
	void enterTvar(@NotNull HbsParser.TvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#tvar}.
	 * @param ctx the parse tree
	 */
	void exitTvar(@NotNull HbsParser.TvarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void enterStringHash(@NotNull HbsParser.StringHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void exitStringHash(@NotNull HbsParser.StringHashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code boolParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterBoolParam(@NotNull HbsParser.BoolParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitBoolParam(@NotNull HbsParser.BoolParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull HbsParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull HbsParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subexpression}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(@NotNull HbsParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subexpression}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(@NotNull HbsParser.SubexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(@NotNull HbsParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(@NotNull HbsParser.ElseBlockContext ctx);

	/**
	 * Enter a parse tree produced by the {@code intParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterIntParam(@NotNull HbsParser.IntParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitIntParam(@NotNull HbsParser.IntParamContext ctx);

	/**
	 * Enter a parse tree produced by the {@code charHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void enterCharHash(@NotNull HbsParser.CharHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void exitCharHash(@NotNull HbsParser.CharHashContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(@NotNull HbsParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(@NotNull HbsParser.NewlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#unless}.
	 * @param ctx the parse tree
	 */
	void enterUnless(@NotNull HbsParser.UnlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#unless}.
	 * @param ctx the parse tree
	 */
	void exitUnless(@NotNull HbsParser.UnlessContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#delimiters}.
	 * @param ctx the parse tree
	 */
	void enterDelimiters(@NotNull HbsParser.DelimitersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#delimiters}.
	 * @param ctx the parse tree
	 */
	void exitDelimiters(@NotNull HbsParser.DelimitersContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull HbsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull HbsParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#ampvar}.
	 * @param ctx the parse tree
	 */
	void enterAmpvar(@NotNull HbsParser.AmpvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#ampvar}.
	 * @param ctx the parse tree
	 */
	void exitAmpvar(@NotNull HbsParser.AmpvarContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull HbsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull HbsParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull HbsParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull HbsParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by the {@code charParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterCharParam(@NotNull HbsParser.CharParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitCharParam(@NotNull HbsParser.CharParamContext ctx);

	/**
	 * Enter a parse tree produced by the {@code boolHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolHash(@NotNull HbsParser.BoolHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolHash(@NotNull HbsParser.BoolHashContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#escape}.
	 * @param ctx the parse tree
	 */
	void enterEscape(@NotNull HbsParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#escape}.
	 * @param ctx the parse tree
	 */
	void exitEscape(@NotNull HbsParser.EscapeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code refHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void enterRefHash(@NotNull HbsParser.RefHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void exitRefHash(@NotNull HbsParser.RefHashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterStringParam(@NotNull HbsParser.StringParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitStringParam(@NotNull HbsParser.StringParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull HbsParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull HbsParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void enterSexpr(@NotNull HbsParser.SexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void exitSexpr(@NotNull HbsParser.SexprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code intHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void enterIntHash(@NotNull HbsParser.IntHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 */
	void exitIntHash(@NotNull HbsParser.IntHashContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#spaces}.
	 * @param ctx the parse tree
	 */
	void enterSpaces(@NotNull HbsParser.SpacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#spaces}.
	 * @param ctx the parse tree
	 */
	void exitSpaces(@NotNull HbsParser.SpacesContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull HbsParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull HbsParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#partial}.
	 * @param ctx the parse tree
	 */
	void enterPartial(@NotNull HbsParser.PartialContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#partial}.
	 * @param ctx the parse tree
	 */
	void exitPartial(@NotNull HbsParser.PartialContext ctx);

	/**
	 * Enter a parse tree produced by {@link HbsParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(@NotNull HbsParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link HbsParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(@NotNull HbsParser.HashContext ctx);
}