package main;

import java.util.LinkedList;
import java.util.Stack;

import main.codeitems.CodeItem;
import main.codeitems.CodeItemBuilder;

import org.antlr.v4.runtime.ParserRuleContext;

public class HRPrinter extends Printer{

	String filename = null;
	LinkedList<String> functionDefs = new LinkedList<String>();
	
	@Override
	public void startOfUnit(String nodeTypeName, ParserRuleContext ctx,
			String codeStr)
	{
		filename = codeStr;
		reset();
	}

	private void reset()
	{
		functionDefs.clear();
	}
	
	@Override
	public void endOfUnit(String nodeTypeName, ParserRuleContext ctx,
			String codeStr)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printItem(CodeItem line, Stack<CodeItemBuilder> itemStack)
	{
		// TODO Auto-generated method stub		
	}

}
