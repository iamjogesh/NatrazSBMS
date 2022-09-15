//WishMessageGenerator.java
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}

	/*  this is the setter method
	 * public Date getDate() { return date; }
	 */
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}
	
	//business logic inside business method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//get current hour of the day
		int hour=date.getHours();//24 hours format but it is deprecated so in future use calendar & localdate time class
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour>=12 && hour<=16)
			return "Good Afternoon "+user;
		else if(hour>18 && hour<=20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
	
	
	
}
