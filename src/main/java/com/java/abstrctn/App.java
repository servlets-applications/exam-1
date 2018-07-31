package com.java.abstrctn;

import com.java.abstrctn.AbstractPlay;
import com.java.abstrctn.CricketPlayImpl;
import com.java.abstrctn.FootballImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractPlay play = new CricketPlayImpl();
		play.manage();
		System.out.println("#####################");
		play = new FootballImpl();
		play.manage();
	}

}
