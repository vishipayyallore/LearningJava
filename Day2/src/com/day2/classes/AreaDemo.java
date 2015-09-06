package com.day2.classes;

/**
 * 
 * @author Viswanatha
 *
 */

public class AreaDemo {

	//Variables
	private final float PI = 3.1416f;
	private float radius;
	private double circleArea;
	
	/**
	 * 
	 * @param radius
	 * @return
	 */
	public AreaDemo calculateArea(float radius){
		this.radius = radius;
		circleArea = PI * radius * radius;
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public AreaDemo displayArea(){
		System.out.printf("\nArea of Circle with Radius %f is %f", radius, circleArea);
		return this;
	}
	
}
