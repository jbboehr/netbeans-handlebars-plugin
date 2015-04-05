
package net.johnboehr.netbeans.handlebars.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.ANTLRErrorListener;

import net.johnboehr.netbeans.handlebars.grammar.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.netbeans.modules.csl.api.Error;

public class HandlebarsParser extends Parser {

    private Snapshot snapshot;
    private ParseTree tree;
    private HbsError error;

    @Override
    public void parse (Snapshot snapshot, Task task, SourceModificationEvent event) {
        this.snapshot = snapshot;
        
        Reader reader = new StringReader(snapshot.getText().toString ());
        
        try {
            ANTLRInputStream stream = new ANTLRInputStream(reader);
            final ANTLRErrorListener errorReporter = new HbsErrorReporter();
            Lexer lexer = new HbsLexer(stream);
            lexer.addErrorListener(errorReporter);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HbsParser parser = new HbsParser(tokens);
            parser.addErrorListener(errorReporter);
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            tree = parser.template();
        } catch( HbsException e ) {
            error = e.getError();
        } catch( IOException e ) {
            e.printStackTrace();
        }
    }

    @Override
    public Result getResult (Task task) {
        return new HandlebarsParserResult(snapshot, tree, error);
    }

    @Override
    public void cancel () {
    }

    @Override
    public void addChangeListener (ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener (ChangeListener changeListener) {
    }
    
    public static class HandlebarsParserResult extends org.netbeans.modules.csl.spi.ParserResult {

        private ParseTree tree;
        private boolean valid = true;
        private HbsError error;

        HandlebarsParserResult (Snapshot snapshot, ParseTree tree, HbsError error) {
            super(snapshot);
            this.tree = tree;
            this.error = error;
            if( error != null ) {
                this.valid = false;
            }
        }

        @Override
        protected void invalidate () {
            valid = false;
        }

        public HbsError getError() {
            return this.error;
        }

        /*
        @Override
        public List<? extends Error> getDiagnostics() {
            return null;
        }*/

        @Override
        public List<? extends Error> getDiagnostics() {
            LinkedList list = new LinkedList();
            return list;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
