/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.johnboehr.netbeans.handlebars;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import net.johnboehr.netbeans.handlebars.lexer.HandlebarsTokenId;

/**
 *
 * @author Rin
 */
@LanguageRegistration(mimeType = "text/x-handlebars")
public class HandlebarsLanguage extends DefaultLanguageConfig {
    
    @Override
    public Language getLexerLanguage() {
        return HandlebarsTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "Handlebars";
    }
}
