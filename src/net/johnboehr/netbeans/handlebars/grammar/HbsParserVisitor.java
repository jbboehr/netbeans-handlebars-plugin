// Generated from C:\Users\Rin\Documents\GitHub\NetbeansHandlebars\src\net\johnboehr\netbeans\handlebars\grammar\HbsParser.g4 by ANTLR 4.3
package net.johnboehr.netbeans.handlebars.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HbsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HbsParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HbsParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(@NotNull HbsParser.TemplateContext ctx);

	/**
	 * Visit a parse tree produced by the {@code refPram}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefPram(@NotNull HbsParser.RefPramContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#tvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvar(@NotNull HbsParser.TvarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringHash(@NotNull HbsParser.StringHashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code boolParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParam(@NotNull HbsParser.BoolParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull HbsParser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code subexpression}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpression(@NotNull HbsParser.SubexpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(@NotNull HbsParser.ElseBlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code intParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntParam(@NotNull HbsParser.IntParamContext ctx);

	/**
	 * Visit a parse tree produced by the {@code charHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharHash(@NotNull HbsParser.CharHashContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(@NotNull HbsParser.NewlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#unless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless(@NotNull HbsParser.UnlessContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#delimiters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiters(@NotNull HbsParser.DelimitersContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull HbsParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#ampvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmpvar(@NotNull HbsParser.AmpvarContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull HbsParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull HbsParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by the {@code charParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharParam(@NotNull HbsParser.CharParamContext ctx);

	/**
	 * Visit a parse tree produced by the {@code boolHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolHash(@NotNull HbsParser.BoolHashContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(@NotNull HbsParser.EscapeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code refHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefHash(@NotNull HbsParser.RefHashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringParam}
	 * labeled alternative in {@link HbsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringParam(@NotNull HbsParser.StringParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull HbsParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#sexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpr(@NotNull HbsParser.SexprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code intHash}
	 * labeled alternative in {@link HbsParser#hashValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntHash(@NotNull HbsParser.IntHashContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#spaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaces(@NotNull HbsParser.SpacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull HbsParser.CommentContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial(@NotNull HbsParser.PartialContext ctx);

	/**
	 * Visit a parse tree produced by {@link HbsParser#hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash(@NotNull HbsParser.HashContext ctx);
}