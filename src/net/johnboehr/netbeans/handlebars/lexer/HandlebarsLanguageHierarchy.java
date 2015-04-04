/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.johnboehr.netbeans.handlebars.lexer;

import java.util.*;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Rin
 */
public class HandlebarsLanguageHierarchy extends LanguageHierarchy<HandlebarsTokenId> {
    
    final private static List<HandlebarsTokenId> tokens = new ArrayList<HandlebarsTokenId>();
    final private static Map<Integer, HandlebarsTokenId> idToToken = new HashMap<Integer, HandlebarsTokenId>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes) {
            tokens.add(new HandlebarsTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (HandlebarsTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }
    
    static synchronized HandlebarsTokenId getToken(int id) {
        return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<HandlebarsTokenId> createTokenIds() {
        return tokens;
    }

    @Override
    protected synchronized Lexer<HandlebarsTokenId> createLexer(LexerRestartInfo<HandlebarsTokenId> info) {
        return new HandlebarsLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-handlebars";
    }

}
