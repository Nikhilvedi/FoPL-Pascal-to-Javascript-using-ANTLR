package pascal;

import java.util.ArrayDeque;
import org.stringtemplate.v4.*;
import java.io.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import java.util.List;
import java.util.ArrayList;


class pascalListenerImpl extends pascalBaseListener {
    
	STGroup stg = new STGroupFile("./pascal.stg"); 
	String programName;
	String parameterList;
	String parameterList2;

@Override 
public void enterProgramHeading(pascalParser.ProgramHeadingContext ctx) 
{

	programName= ctx.getChild(1).getText();
    ST st = stg.getInstanceOf("enterProgram");
    st.add("v", programName);
    System.out.println(st.render());

}

@Override 
public void exitProgram(pascalParser.ProgramContext ctx)
{
    ST st = stg.getInstanceOf("exitProgram");
    st.add("v", programName);
    System.out.println(st.render());
}

@Override 
public void enterSimpleStatement(pascalParser.SimpleStatementContext ctx) 
{

		 List<ParseTree> values = ctx.children;
		 ArrayList<String> valueNames = new ArrayList<String>();
		 for(int i=2; i<ctx.getChild(0).getChildCount(); i+=3)
		 	valueNames.add(values.get(0).getChild(i).getText());

		 for (int j=0; j<ctx.getChild(0).getChildCount(); j++)
		 {
		 	 if (ctx.getChild(0).getChild(j).getText().compareTo("Write") ==0)
		 	{
    			ST st = stg.getInstanceOf("Write");
    			st.add("v", valueNames);
				System.out.println(st.render().trim());
			}
				else if (ctx.getChild(0).getChild(j).getText().compareTo("Writeln") ==0)
		 		{
    				ST st = stg.getInstanceOf("Write");
    				st.add("v", valueNames);
					System.out.println(st.render().trim());
				}
				else if (ctx.getChild(0).getChild(j).getText().compareTo("writeln") ==0)
		 		{
    				ST st = stg.getInstanceOf("Write");
    				st.add("v", valueNames);
					System.out.println(st.render().trim());
				}	
				else if (ctx.getChild(0).getChild(j).getText().compareTo("write") ==0)
		 		{
    				ST st = stg.getInstanceOf("Write");
    				st.add("v", valueNames);
					System.out.println(st.render().trim());
				}
		}		
}
	
@Override 
public void exitSimpleStatement(pascalParser.SimpleStatementContext ctx) 	
{

	List<ParseTree> values = ctx.children;
	ArrayList<String> valueNames = new ArrayList<String>();

		for(int i=0; i<ctx.getChild(0).getChildCount(); i+=5)
		valueNames.add(values.get(i).getText());

		 for (int j=0; j<ctx.getChild(0).getChildCount(); j++)
		 {
		 	 if (ctx.getChild(0).getText().compareTo("Readln") ==0)
		  	{
    			ST st = stg.getInstanceOf("ReadIn");
    			st.add("v", valueNames);
				System.out.println(st.render().trim());
			} 
			else if (ctx.getChild(0).getText().compareTo("Readkey") ==0)
			{
				ST st = stg.getInstanceOf("ReadIn");
    			st.add("v", valueNames);
				System.out.println(st.render().trim());
			}
			else if (ctx.getChild(0).getChild(j).getText().compareTo("Num1") ==0)
			{
				ST st = stg.getInstanceOf("ReadIn");
    			st.add("v", valueNames);
				System.out.println(st.render().trim());
			}
			else if (ctx.getChild(0).getChild(j).getText().compareTo("Num2") ==0)
			{
				ST st = stg.getInstanceOf("ReadIn");
    			st.add("v", valueNames);
				System.out.println(st.render().trim());
			}
			else if (ctx.getChild(0).getChild(j).getText().compareTo("readln") ==0)
			{
				ST st = stg.getInstanceOf("ReadIn");
    			st.add("v", valueNames);
				System.out.println(st.render().trim());
			}
		}
}

@Override 
public void enterAssignmentStatement(pascalParser.AssignmentStatementContext ctx) 
{ 
	
	 	ST st = stg.getInstanceOf("assignment");
        st.add("ident", ctx.getChild(0).getText());
        st.add("value", ctx.getChild(2).getText()); 

        System.out.print(st.render().trim() +"\n");
}

@Override 
public void enterIfStatement(pascalParser.IfStatementContext ctx) 
{ 

  		String comp = ctx.getChild(1).getChild(1).getText();
        if (comp.compareTo("=") == 0) comp = "==";

        ST st = stg.getInstanceOf("ifClause");
        st.add("operand1", ctx.getChild(1).getChild(0).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(1).getChild(2).getText());

        System.out.print(st.render().trim()+ "\n");
}

@Override 
public void enterForStatement(pascalParser.ForStatementContext ctx) 
{ 	
	String comp = ctx.getChild(3).getChild(1).getText();
	 if (comp.compareTo("TO") == 0) comp = "<=";

	 String comp1 = ctx.getChild(2).getText();
	 if (comp1.compareTo(":=") == 0) comp1 = "=";

	   ST st = stg.getInstanceOf("ForLoop");
        st.add("operand1", ctx.getChild(1).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(3).getChild(0).getText()); 
        st.add("operand3", ctx.getChild(3).getChild(2).getText()); 
        
        System.out.print(st.render().trim()+ "\n");
}
	
@Override 
public void exitForStatement(pascalParser.ForStatementContext ctx) 
{ 
	System.out.println("}");
}

@Override 
public void exitWhileStatement(pascalParser.WhileStatementContext ctx) 
{ 
	System.out.println("}"); 
}

@Override 
public void exitIfStatement(pascalParser.IfStatementContext ctx) 
{ 
	System.out.println("}"); 
}

@Override 
public void exitProcedureDeclaration(pascalParser.ProcedureDeclarationContext ctx) 
{
	System.out.println("}"); 
}


@Override 
public void enterProcedureStatement(pascalParser.ProcedureStatementContext ctx) 
{ 
		String procName = ctx.getChild(0).getText();

		List<ParseTree> values = ctx.children;
		ArrayList<String> params = new ArrayList<String>();
		ArrayList<String> test = new ArrayList<String>();
		ST st = stg.getInstanceOf("procCall");

		for (int j=2; j<ctx.getChildCount(); j+=4)
		{
			for(int i=0; i<ctx.getChild(j).getChildCount(); i+=2)
				params.add(values.get(2).getChild(i).getText());

				if (ctx.getChild(0).getText().compareTo("write")==0)
				{
    			 	return;
				}
				else if (ctx.getChild(0).getText().compareTo("writeln")==0)
				{
    		 		return;
				}
				else if (ctx.getChild(0).getText().compareTo("Write")==0)
				{
    		 		return;
				}
				else if (ctx.getChild(0).getText().compareTo("Writeln")==0)
				{
    		 		return;
				}
				else if (ctx.getChild(0).getText().compareTo("readln")==0)
				{
    			 	return;
				}
				else if (ctx.getChild(0).getText().compareTo("Readln")==0)
				{
    			 	return;
				}
				else  
				{
					st.add("v", procName);
     				st.add("values", params);
					System.out.println(st.render());

				}
		}
		// attempt at look ahead method 
		/*for (int h=0; h<ctx.getChildCount(); h+=1)
			test.add(values.get(0).getText());
		for (String test : input) {
			if (test.matches("(?!.*write).*PROCEDURE.*")) {
				System.out.println(test + ": matches");
			} else {
				System.out.println(test + ": does not match");
			}
			}*/
}
@Override 
public void enterConstantDefinitionPart(pascalParser.ConstantDefinitionPartContext ctx) 
{ 
	List<ParseTree> values = ctx.children;
	ArrayList<String> valueNames = new ArrayList<String>();

	for(int i=1; i<ctx.getChildCount(); i+=3)
		valueNames.add(values.get(i).getText());

	ST st = stg.getInstanceOf("VAR");
	st.add("values", valueNames);
	System.out.println(st.render());	
}
	
@Override 
public void enterProcedureOrFunctionDeclaration(pascalParser.ProcedureOrFunctionDeclarationContext ctx) 
{
// for procedures  
      ST st = stg.getInstanceOf("enterProcedure");
        st.add("v", ctx.getChild(0).getChild(1).getText());
       
	for (int k =1; k < ctx.getChild(0).getChild(2).getChildCount(); k+=2)
	{
		for (int i =1; i< ctx.getChild(0).getChild(2).getChild(k).getChildCount(); i+=1)
		{
				for (int j =0; j < ctx.getChild(0).getChild(2).getChild(k).getChild(i).getChildCount(); j+=3)
				{
					st.add("values", ctx.getChild(0).getChild(2).getChild(k).getChild(i).getChild(j).getText());
				}	 
		}
	}
 		System.out.print(st.render().trim()+ "\n");
}


@Override 
public void enterVariableDeclaration(pascalParser.VariableDeclarationContext ctx) 
{
 //for variables 

	List<ParseTree> values = ctx.children;
	ArrayList<String> valueNames = new ArrayList<String>();

	for(int i=0; i<ctx.getChildCount(); i+=3)
		valueNames.add(values.get(i).getText());

	ST st = stg.getInstanceOf("VAR");
	st.add("values", valueNames);
	System.out.println(st.render());	

}

@Override 
public void enterBlock(pascalParser.BlockContext ctx) 
{ 

	ArrayList<String> procName = new ArrayList<String>();
	ArrayList<String> varName = new ArrayList<String>();

	ST st = stg.getInstanceOf("enterProcedure");
	for (int h =2; h < ctx.getChild(0).getChild(1).getChildCount(); h+=10)
	{
	for (int j =3; j < ctx.getChild(0).getChild(1).getChild(0).getChildCount(); j+=10)
	{			
	for (int i =1; i < ctx.getChild(0).getChild(1).getChild(0).getChildCount(); i+=10)
	{
		   procName.add(ctx.getChild(0).getChild(1).getChild(0).getChild(i).getText());
			if (procName.get(0).compareTo(",")==0)
			{
				return;
			}		
			else 
			{
			st.add("v", procName);
			st.add("values", ctx.getChild(0).getChild(1).getChild(0).getChild(j));
	   		st.add("values",ctx.getChild(0).getChild(1).getChild(h).getText()); 
			System.out.println(st.render());
			}
	}
	}			
	}	

}


@Override 
public void enterGotoStatement(pascalParser.GotoStatementContext ctx) 
{ 
	//using goto is bad practice, use continue in javascript
	
	if (ctx.getChild(0).getText().compareTo("GOTO")==0)
	{
		System.out.println("continue;");
	}
}


} // class pascalListenerImpl

