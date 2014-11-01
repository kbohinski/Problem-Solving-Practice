/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2014-11-1
 * 
 * Driver3.java
 * Copyright (c) 2014 Kevin Bohinski. All rights reserved.
 */

/* https://www.hackerrank.com/challenges/cut-the-sticks
 * 
 * You are given N sticks, where each stick is of positive integral length. 
 * A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
 * 
 * Suppose we have 6 sticks of length
 * 5 4 4 2 2 8
 * then in one cut operation we make a cut of length 2 from each of the 6 sticks.
 * For next cut operation 4 sticks are left (of non-zero length), whose length are
 * 3 2 2 6
 * Above step is repeated till no sticks are left.
 * Given length of N sticks, print the number of sticks that are cut in subsequent cut operations.
 */

/* Setting Package */
package hackerRank;

/* Setting Imports */
import java.util.Random;

public class Driver3 {

	/* Setting Global Vars */
	static int[] output;

	/**
	 * main method, executes the stick length calculation program
	 * 
	 * @param args
	 */
	public static void main(String[] args){		
		/* Setting Sample Values */
		Random randomNum = new Random();
		int n = randomNum.nextInt(10) + 1;
		int [] input = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = randomNum.nextInt(10) + 1;
		} /* for */
		
		System.out.println("Starting Values:");
		for(int i = 0; i < (n-1); i++){
			System.out.println(input[i]);
		} /* for */
		
		/*Executing stick length calculation program */
		stickCut(n, input);
	} /* main() */
	
	/**
	 * stickCut method, calculates length of sticks recursively as described in spec
	 * 
	 * @param int n   : Number of sticks to calculate length of
	 * @param int[] A : length of sticks
	 */
	public static int[] stickCut(int n, int[] A){
		System.out.println("Running stickCut()");
		int num = n;
		int numToReturn = num;
		int[] input = A;
		int smallest = input[0];
		int zeroCount = 0;
		
		/* Calculating array length removing 0's for array declaration */
		for(int i = 0; i < (num-1); i++){
			if(input[i] == 0){
				zeroCount++;
			}/* if */
		}/* for */
		numToReturn = (numToReturn - zeroCount);
		int[] toReturn = new int[numToReturn];
		
		if(num == 0){
			toReturn[0] = 0;
			for(int i = 0; i < (numToReturn-1); i++){
				System.out.println(toReturn[i]);
			}/* for */
			return toReturn;
		}else if (num == 1){
			toReturn[0] = 0;
			for(int i = 0; i < (numToReturn-1); i++){
				System.out.println(toReturn[i]);
			}/* for */
			return toReturn;
		}else{
			/* Finding smallest stick */
			for(int i = 0; i < (num-1); i++){
				if(smallest > input[i]){
					smallest = input[i];
				}/* if */
			}/* for */
			
			/* Subtracting */
			int toReturnVal = 0;
			for(int i = 0; i < (num-1); i++){
				if(input[i] != 0){
					toReturn[toReturnVal] = (input[i] - smallest);
					if(toReturn[toReturnVal] <= 0){
						toReturn[toReturnVal] = 0;
					}/* if */	
					toReturnVal++;
				}else if(input[i] == 0){
					/* Do Nothing */
				}/* if */
			}/* for */
			
			for(int i = 0; i < (numToReturn-1); i++){
				System.out.println(toReturn[i]);
			}/* for */
			return stickCut(numToReturn, toReturn);
			
		}/* if */
	}/* stickCut() */		
}/* Driver3 */