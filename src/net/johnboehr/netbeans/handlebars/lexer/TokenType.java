
package net.johnboehr.netbeans.handlebars.lexer;

import net.johnboehr.netbeans.handlebars.grammar.HbsLexer;

/**
 *
 * @author Rin
 */
public enum TokenType {
    ESC_VAR(HbsLexer.ESC_VAR, "ESC_VAR"),
    TEXT(HbsLexer.TEXT, "TEXT"),
    COMMENT(HbsLexer.COMMENT, "COMMENT"),
    START_AMP(HbsLexer.START_AMP, "START_AMP"),
    START_T(HbsLexer.START_T, "START_T"),
    UNLESS(HbsLexer.UNLESS, "UNLESS"),
    START_BLOCK(HbsLexer.START_BLOCK, "START_BLOCK"),
    START_DELIM(HbsLexer.START_DELIM, "START_DELIM"),
    START_PARTIAL(HbsLexer.START_PARTIAL, "START_PARTIAL"),
    END_BLOCK(HbsLexer.END_BLOCK, "END_BLOCK"),
    START(HbsLexer.START, "START"),
    SPACE(HbsLexer.SPACE, "SPACE"),
    NL(HbsLexer.NL, "NL"),
    END_DELIM(HbsLexer.END_DELIM, "END_DELIM"),
    WS_DELIM(HbsLexer.WS_DELIM, "WS_DELIM"),
    DELIM(HbsLexer.DELIM, "DELIM"),
    PATH(HbsLexer.PATH, "PATH"),
    WS_PATH(HbsLexer.WS_PATH, "WS_PATH"),
    END_T(HbsLexer.END_T, "END_T"),
    END(HbsLexer.END, "END"),
    DOUBLE_STRING(HbsLexer.DOUBLE_STRING, "DOUBLE_STRING"),
    SINGLE_STRING(HbsLexer.SINGLE_STRING, "SINGLE_STRING"),
    EQ(HbsLexer.EQ, "EQ"),
    INT(HbsLexer.INT, "INT"),
    BOOLEAN(HbsLexer.BOOLEAN, "BOOLEAN"),
    ELSE(HbsLexer.ELSE, "ELSE"),
    QID(HbsLexer.QID, "QID"),
    LP(HbsLexer.LP, "LP"),
    RP(HbsLexer.RP, "RP"),
    WS(HbsLexer.WS, "WS"),
    ERR_CHAR(HbsLexer.ERR_CHAR, "ERR_CHAR"),
    EOF(0, "EOF");
    
    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static TokenType valueOf(int id) {
        TokenType[] values = values();
        for (TokenType value : values) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }
}
