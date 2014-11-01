/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2014-10-29
 * 
 * Driver1.java
 * Copyright (c) 2014 Kevin Bohinski. All rights reserved.
 */

/** Setting Package **/
package discreteTest;

/** Setting Imports **/
/** No Imports **/

public class Driver1 {

	/** Setting Global Vars **/
	static int c = 0;

	/**
	 * main method, executes the sum finder program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sumFinder(18));
	}
	
	/**
	 * Give a recursive algorithm for finding the sum of the first n positive integers
	 * 
	 * @param n		Number given to find the sum of (ex: if 3 is inputed, the result will be 3+2+1)
	 */
	public static int sumFinder(int n){
		int a = n;
		int b = n-1;
		c = a + b + c;
		if(a==1){
			return c;
		}else if(a>1){
			return (sumFinder(b-1));
		}else if(a==0){
			return (c+1);
		}else{
			return 0;
		}
	}
}