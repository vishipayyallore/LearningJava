package com.day2.classes;

/**
 * 
 * @author Viswanatha
 *
 */

public class LightDemo {

	//Variables.
	private final int lightSpeed = 186000;
	private final long secondsInADay = (24 * 60 * 60);
	private long days;
	private long distance;
	
	/**
	 * 
	 * @param days
	 */
	public LightDemo calculateDistance(long days){
		this.days = days;
		distance = lightSpeed * secondsInADay * days;
		return this;
	}
	
	public LightDemo displayDistance(){
		System.out.printf("\nIn %d days", days);
		System.out.printf(" Light will travel about %d miles", distance);
		return this;
	}
}
