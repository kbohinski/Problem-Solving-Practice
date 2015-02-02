/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-1-28
 * 
 * Driver5.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/* https://www.hackerrank.com/challenges/lonely-integer
 * 
 * There are N integers in an array A.
 * All but one integer occur in pairs.
 * Your task is to find out the number that occurs only once.
 */

/* Setting Package */
package hackerRank;

/* Setting Imports */
import java.util.Random;

public class Driver5 {
	
	/* Setting Global Vars */

	/**
	 * main method, executes the dupe calculation program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Setting Sample Values */
		Random randomNum = new Random();
		int n = randomNum.nextInt(10) + 2;
		int [] numbers = new int[n];
		
		for(int i = 0; i < n; i++){
			numbers[i] = randomNum.nextInt(100) + 1;
		} /* for */
		
		/* Printing Sample Values */
		System.out.println("Printing Random Values: ");
		for(int i = 0; i < (numbers.length); i++){
			System.out.print(numbers[i] + " ");
		} /* for */
		
		/* Sorting numbers via merge sort */
		MergeSort merge = new MergeSort();
		merge.start(numbers);
		
		/* Printing sorted numbers */
		System.out.println("\n\nPrinting Sorted Values: ");
		for(int i = 0; i < (numbers.length); i++){
			System.out.print(numbers[i] + " ");
		} /* for */
		
		/* Finding numbers that dont dupe */
		int [] dupes = new int[n];
		int numDupes = 0;
		System.out.println("\n\nFinding Dupes!");
		for(int i = 0; i < (numbers.length - 1); i++){
			if(numbers[i] == numbers[i+1]){
				System.out.println("I found a dupe! " + numbers[i] + " " + numbers[i+1]);
				dupes[numDupes] = numbers[i];
				numDupes++;
			} /* if */
		} /* for */
		
		/* Printing Dupes */
		if(numDupes != 0){
			System.out.println("\nDupes: ");
			for(int i = 0; i < numDupes; i++){
				System.out.print(dupes[i] + " ");
			} /* for */
		}else{
			System.out.println("No Dupes!");
		} /* if else */
		
	} /* main() */

} /* Driver5 */
