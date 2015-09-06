package com.day2.main;

import com.day2.classes.*;

/**
 * 
 * @author Viswanatha
 *
 */

public class Day2MainCls {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Variables
		LightDemo lightDemo = new LightDemo();
		
		//Integer Data types
		lightDemo.calculateDistance(10);
		lightDemo.displayDistance();
		
		lightDemo
			.calculateDistance(20)
			.displayDistance();
		
		lightDemo			
			.calculateDistance(30)
			.displayDistance();
		
		//Float & Decimal Data types
		AreaDemo areaDemo = new AreaDemo();
		areaDemo
			.calculateArea(10.45f)
			.displayArea();
		
	}

}
