package pascal;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;


class pascal {
    
    public static void main(String[] args) throws Exception {

        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;

        if (inputFile != null) {
            System.out.println("// source file is "+ inputFile + " - Pascal to JavaScript");
          //  if (inputFile.compareTo("sample2.pascal") ==0){
            //   System.out.println("//Invalid Pascal Program, BEGIN - PROCEDURE is Invalid, check Program");}
            is = new FileInputStream(inputFile);

            ANTLRInputStream input = new ANTLRInputStream(is);

            pascalLexer lexer = new pascalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            pascalParser parser = new pascalParser(tokens);

            ParseTree tree = parser.program();
            pascalListenerImpl ml = new pascalListenerImpl();

            ParseTreeWalker walker = new ParseTreeWalker(); 
            walker.walk(ml, tree);

            //Prints the parse tree as a string in the file being parsed - uncomment to check 
            //System.out.println(tree.toStringTree(parser));

            //output tree as jframe
            JFrame frame = new JFrame( inputFile + " Tree");
            JPanel panel = new JPanel();
            TreeViewer viewr = new TreeViewer(Arrays.asList(
            parser.getRuleNames()),tree);
            viewr.setScale(1.0);
            panel.add(viewr);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(5000,1500);
            frame.setVisible(true);

            //code for subtrees - not functional 
           /* JFrame subframe = new JFrame( inputFile + " Tree");
            JPanel subpanel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(ParseTree.getRuleNames()),tree);
            viewr.setScale(1.0);//scale a little
            panel.add(viewer);
            frame.add(subpanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(4000,2000);
            frame.setVisible(true);*/

        } else {
            System.out.println("Usage: java pascal.pascal <source>");
        }

    } // main

} // class pascal
