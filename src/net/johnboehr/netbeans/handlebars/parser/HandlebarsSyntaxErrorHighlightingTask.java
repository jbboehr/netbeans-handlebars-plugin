
package net.johnboehr.netbeans.handlebars.parser;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;

/**
 *
 * @author Rin
 */
public class HandlebarsSyntaxErrorHighlightingTask extends ParserResultTask {
    
    @Override
    public void run (Result result, SchedulerEvent event) {
        HandlebarsParser.HandlebarsParserResult hbsResult = (HandlebarsParser.HandlebarsParserResult) result;
        HbsError error = hbsResult.getError();
        
        if( error == null ) {
            return;
        }
        
        Document document = result.getSnapshot().getSource().getDocument(false);
        List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
        try {
            int start = NbDocument.findLineOffset ((StyledDocument) document, error.line - 1) + error.column - 1;
            //int end = NbDocument.findLineOffset ((StyledDocument) document, error.line - 1) + error.column;
            //int end = NbDocument.findLineOffset ((StyledDocument) document, token.endLine - 1) + token.endColumn;
            ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                Severity.ERROR,
                error.message,
                document,
                document.createPosition(start),
                document.createPosition(start)
            );
            errors.add(errorDescription);
            HintsController.setErrors(document, "sqlr", errors);
        } catch (BadLocationException ex1) {
            Exceptions.printStackTrace (ex1);
        }
    }

    @Override
    public int getPriority () {
        return 100;
    }

    @Override
    public Class getSchedulerClass () {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel () {
    }

}