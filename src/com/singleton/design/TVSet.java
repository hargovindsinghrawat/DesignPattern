package com.singleton.design;

public class TVSet {
	private static volatile TVSet tvSetInstance = null;
	
	private TVSet() {
		System.out.println("TV Set instantiated");
	}
	
	public static TVSet getTVSetInstance() {
		if(tvSetInstance == null) { // Optimization
			synchronized (TVSet.class) {
				if(tvSetInstance == null) // double checking
					tvSetInstance = new TVSet();
			}
		}
		return tvSetInstance;
	}
}