import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main( String[] args) throws Exception
    {
        calcLexer lexer = new calcLexer(CharStreams.fromFileName("/home/galina13/IdeaProjects/MT/calc/src/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calcParser parser = new calcParser(tokens);
        ParseTree tree = parser.start();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}