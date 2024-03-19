package PersonalizedGrammar;

import GeneratedGrammar.GramaticaParser;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public class CustomParser extends GramaticaParser {
    public CustomParser(TokenStream input) {
        super(input);
    }

    @Override
    protected void sync(Parser recognizer) {

    }
}
