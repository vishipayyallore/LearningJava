package com.day1.classes;

/**
 * 
 * @author Viswanatha
 *
 */

public class IfStatementDemo {

	private static int number1 = 100, number2 = 20;
	
	public static void showIfStatementDemo(){
		if( number1 > number2){
			System.out.printf("\n%d > %d", number1, number2);
		} else {
			System.out.printf("\n%d <= %d", number1, number2);
		}
	}
	
}
