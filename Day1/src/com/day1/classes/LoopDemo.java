package com.day1.classes;

/**
 * 
 * @author Viswanatha
 *
 */

public class LoopDemo {

	public static void showLoopDemo(){
		System.out.println("\n\n");
		for(int iCtr=0; iCtr<255; iCtr++){
			System.out.print(iCtr + " = " + ((char)iCtr) + " \t ");
			if(iCtr%10 == 0){
				System.out.println();
			}
		}
	}
}
