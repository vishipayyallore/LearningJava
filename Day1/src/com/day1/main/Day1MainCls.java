package com.day1.main;

import com.day1.classes.*;

/**
 * 
 * @author Viswanatha 
 *
 */

public class Day1MainCls {

	public static void main(String[] args) {
		
		System.out.println("\n\nHello World!");
		System.out.println("Another Line added.");
		
		//Using Instance Method
		HelloJava theObject = new HelloJava();
		theObject.sayHello();
		
		//Using Static Method
		HelloWorld.sayHello("Shiva Sai");

		VariableDemo.setNumber(10);
		VariableDemo.displayNumber();
		
		VariableDemo.setNumber(1001);
		VariableDemo.displayNumber();
		VariableDemo.displayAllVariables();
		
		/*
		LoopDemo.showLoopDemo();
		
		IfStatementDemo.showIfStatementDemo();
		
		
		
		
		*/
		
	}

}
