package com.day1.main;

import com.day1.classes.*;

/**
 * 
 * @author Viswanatha 
 *
 */

public class Day1MainCls {

	public static void main(String[] args) {
		
		LoopDemo.showLoopDemo();
		
		IfStatementDemo.showIfStatementDemo();
		
		VariableDemo.setNumber(10);
		VariableDemo.displayNumber();
		
		VariableDemo.setNumber(1001);
		VariableDemo.displayNumber();
		
		System.out.println("\n\nHello World!");
		System.out.println("Another Line added.");
		
		//Using Static Method
		HelloWorld.sayHello("Shiva Sai");
		
		//Using Instance Method
		HelloJava helloJava = new HelloJava();
		helloJava.sayHello();
		
	}

}
