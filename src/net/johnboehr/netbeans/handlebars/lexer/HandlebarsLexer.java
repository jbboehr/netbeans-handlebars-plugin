
package net.johnboehr.netbeans.handlebars.lexer;

import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
import net.johnboehr.netbeans.handlebars.grammar.HbsLexer;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Rin
 */
public class HandlebarsLexer implements Lexer<HandlebarsTokenId> {
    
    final private LexerRestartInfo<HandlebarsTokenId> info;
    final private HbsLexer hbsLexer;
    final private AntlrCharStream stream;

    HandlebarsLexer(LexerRestartInfo<HandlebarsTokenId> info) {
        this.info = info;
        this.stream = new AntlrCharStream(info.input(), "HandlebarsLexer");
        this.hbsLexer = new HbsLexer(this.stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<HandlebarsTokenId> nextToken() {
        Token token = hbsLexer.nextToken();
        if( token.getType() != HbsLexer.EOF ) {
            HandlebarsTokenId tokenId = HandlebarsLanguageHierarchy.getToken(token.getType());
            return info.tokenFactory().createToken(tokenId);
        }
        return null;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
        
    }
}
