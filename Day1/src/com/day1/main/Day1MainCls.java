package com.day1.main;

import com.day1.classes.*;

/**
 * 
 * @author Viswanatha 
 *
 */

public class Day1MainCls {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Another Line added.");
		
		//Using Static Method
		HelloWorld.sayHello("Shiva Sai");
		
		//Using Instance Method
		HelloJava helloJava = new HelloJava();
		helloJava.sayHello();
	}

}
