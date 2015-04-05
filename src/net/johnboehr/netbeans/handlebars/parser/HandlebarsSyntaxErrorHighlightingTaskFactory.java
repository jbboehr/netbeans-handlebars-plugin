
package net.johnboehr.netbeans.handlebars.parser;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.TaskFactory;

/**
 * @author Rin
 */
public class HandlebarsSyntaxErrorHighlightingTaskFactory extends TaskFactory {

    @Override
    public Collection create (Snapshot snapshot) {
        return Collections.singleton (new HandlebarsSyntaxErrorHighlightingTask());
    }

}