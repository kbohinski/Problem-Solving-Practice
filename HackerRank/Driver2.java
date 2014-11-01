/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2014-10-30
 * 
 * Driver2.java
 * Copyright (c) 2014 Kevin Bohinski. All rights reserved.
 */

/* https://www.hackerrank.com/challenges/halloween-party
 * 
 * Alex is attending a Halloween party with his girlfriend Silvia.
 * At the party, Silvia spots a giant chocolate bar.
 * If the chocolate can be served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly K times,
 * what is the maximum number of chocolate pieces Alex can cut and give Silvia?
 *
 * Input Format
 * The first line contains an integer T, the number of test cases. T lines follow.
 * Each line contains an integer K
 *
 * Output Format
 * T lines. Each line contains an integer that denotes the maximum number of pieces that can be obtained for each test case.
 * 
 * Constraints
 * 1<=T<=10
 * 2<=K<=107
 * 
 * Note 
 * Chocolate must be served in size of 1 x 1 size pieces. 
 * Alex can't relocate any of the pieces, nor can he place any piece on top of another.
 */

/* Setting Package */
package hackerRank;

/* Setting Imports */
/* No Imports Needed */

public class Driver2 {

	/* Setting Global Vars */
	static int[] output;

	/**
	 * main method, executes the chocolate division calculation program
	 * 
	 * @param args
	 */
	public static void main(String[] args){		
		/* Setting Values */
		int n = 4;
		int[] input = new int[n];
		input[0] = 5;
		input[1] = 6;
		input[2] = 7;
		input[3] = 107;
		
		/*Executing chocolate calculation program */
		chocoCut(n, input);
		
		/*Writing Results*/
		for(int i = 0; i < n; i++){
			System.out.println(output[i]);
		}
	}
	
	/**
	 * chocoCut method, calculates 1x1 squares of chocolate as described in spec
	 * 
	 * @param int T number of values incoming
	 * @param int[] K value of cuts
	 */
	public static void chocoCut(int T, int[] K){
		int num = T;
		int[] input = new int[num];
		output = new int[num];
		input = K;
		int divsEach;
		double divsRow;
		double divsCol;
		double squares;
		
		try{
			for(int i = 0; i < num; i++){
				if((input[i]%2) != 0){
					divsRow = (input[i]/2) +1;
					divsCol = (input[i]/2);
					squares = divsRow * divsCol;
				}else{
					divsEach = (input[i]/2);
					squares = divsEach * divsEach;
				}/* if else */
				output[i] = (int) squares;
			}/* for */
		}catch(ArithmeticException e){
			System.out.println("Error");
		}/* try catch */		
	}
}