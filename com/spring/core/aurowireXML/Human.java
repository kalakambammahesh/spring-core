package com.spring.core.aurowireXML;

public class Human {
	Heart heart;
	
	public Human() {}
	
	public Human(Heart heart) {
		this.heart = heart;
	}
	
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void isHumanAlive() {
		if(heart != null) {
			System.out.println("Human is alive...!");
		}else {
			System.out.println("Human is dead...!");
		}
	}
}
