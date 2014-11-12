/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2014-11-11
 * 
 * Driver4.java
 * Copyright (c) 2014 Kevin Bohinski. All rights reserved.
 */

/* https://www.hackerrank.com/challenges/chocolate-feast
 * 
 * Little Bob loves chocolates, and goes to a store with $N in his pocket. 
 * The price of each chocolate is $C. 
 * The store offers a discount: 
 *     for every M wrappers he gives to the store, he gets one chocolate for free.
 *     
 * How many chocolates does Bob get to eat?
 */

/* Setting Package */
package hackerRank;

/* Setting Imports */
import java.util.Random;

public class Driver4 {

	/* Setting Global Vars */
	static int[] output;

	/**
	 * main method, executes the chocolate purchasing calculation program
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		/* Setting Sample Values */
		Random randomNum = new Random();
		int n = randomNum.nextInt(10) + 1;
		int [] cost = new int[n];
		for(int i = 0; i < n; i++){
			cost[i] = randomNum.nextInt(10) + 1;
		} /* for */
		
		int [] pocketChange = new int[n];
		for(int i = 0; i < n; i++){
			pocketChange[i] = randomNum.nextInt(10) + 1;
		} /* for */
		
		int [] wrappers = new int[n];
		for(int i = 0; i < n; i++){
			wrappers[i] = randomNum.nextInt(10) + 1;
		} /* for */
		/* Done Setting Sample Values */
		
		/* Printing Sample Values */
		System.out.println("Starting Values (pocketChange):");
		for(int i = 0; i < (pocketChange.length-1); i++){
			System.out.print(pocketChange[i] + " ");
		} /* for */
		
		System.out.println("\nStarting Values (cost):");
		for(int i = 0; i < (cost.length-1); i++){
			System.out.print(cost[i] + " ");
		} /* for */
		
		System.out.println("\nStarting Values (wrappers):");
		for(int i = 0; i < (wrappers.length-1); i++){
			System.out.print(wrappers[i] + " ");
		} /* for */
		/* Done Printing Sample Values */
		
		/*Executing chocolate purchasing calculation program */
		System.out.println("\n\nCalculating");
		int [] tmpPrint  = chocoBuy(pocketChange, cost, wrappers);
		System.out.println("Done\n");
		
		/* Printing Results */
		System.out.println("Results:");
		for(int i = 0; i < (tmpPrint.length-1); i++){
			System.out.print(tmpPrint[i] + " ");
		} /* for */
		
	} /* main() */
	
	/**
	 * chocoBuy method, calculates chocolate purchasing as described in spec
	 * 
	 * @param int[] pocketChange : amount of change in Bob's pocket
	 * @param int[] cost         : cost of one chocolate
	 * @param int[] wrappers     : amount of wrappers required to earn a free chocolate
	 */		
	public static int[] chocoBuy(int[] pocketChange, int[] cost, int[] wrappers){
		
		int n = pocketChange.length;
		int[] results = new int[n];
		int r = 0;
		
		/* Assume Bob has no wrappers to start */
		int wraps = 0;
		
		for(int i = 0; i < n; i++){
			wraps = 0;
			if(pocketChange[i] >= cost[i]){
				r = (pocketChange[i] / cost[i]);
				wraps = r;
				if(wraps >= wrappers[i]){
					r = r + (wraps / wrappers[i]);
				} /* if */
			}else if(pocketChange[i] < cost[i]){
				r = 0;
			} /* if */
			results[i] = r;
		} /* for */
		
		return results;
		
	} /* chocoBuy() */ 
	
} /* Driver4 */