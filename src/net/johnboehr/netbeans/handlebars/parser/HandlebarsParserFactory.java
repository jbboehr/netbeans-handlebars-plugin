
package net.johnboehr.netbeans.handlebars.parser;

import java.util.Collection;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserFactory;

/**
 * @author Rin
 */
public class HandlebarsParserFactory extends ParserFactory {

    @Override
    public Parser createParser (Collection<Snapshot> snapshots) {
        return new HandlebarsParser();
    }

}