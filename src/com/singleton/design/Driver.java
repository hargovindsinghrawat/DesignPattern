package com.singleton.design;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {
		//Singleton
//		// member1
//		TVSet tvset1ForMember1 = TVSet.getTVSetInstance();
//		
//		// member2
//		TVSet tvset1ForMember2 = TVSet.getTVSetInstance();
//		
//		System.out.println(tvset1ForMember1);
//		System.out.println(tvset1ForMember2);
		
		// using Multithreading
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
		executor.execute(() -> TVSet.getTVSetInstance());
	}
}