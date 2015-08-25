package com.day1.classes;

/**
 * 
 * @author Viswanatha
 *
 */

public class VariableDemo {

	private static int _number;
	private static char _character = 'a';
		
	/**
	 * 
	 * @param _number
	 */
	public static void setNumber(int number){
		_number = number;
	}
	
	/**
	 * 
	 */
	public static void displayNumber(){
		System.out.printf("\nNumber: %d", _number);
	}
	
	/**
	 * 
	 */
	public static void displayAllVariables(){
		System.out.printf("\nThis is Character: %c", _character);
		System.out.printf("\nNumber: %d", _number);
	}
	
}
