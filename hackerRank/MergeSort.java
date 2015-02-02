/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-1-28
 * 
 * MergeSort.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/*
 * A simple merge sort implementation for a hackerrank problem.
 * 
 * Based on : http://www.codenlearn.com/2011/10/simple-merge-sort.html
 */

/* Setting Package */
package hackerRank;

public class MergeSort {
	
	/**
	 * Checks to see if the base case is met, and does some calculations.
	 * 
	 * @param a : The array to be sorted.
	 */
	public void start(int[] a){
		
		/* Base Case */
		if(a.length > 1){
			sortIt(a, 0, (a.length - 1));
		} /* if */
		
	} /* start() */
	
	/**
	 * Recursively "splits" the array and sends it to be sorted.
	 * 
	 * @param a    : The array to be sorted.
	 * @param low  : First element.
	 * @param high : Last element.
	 */
	private void sortIt(int[] a, int low, int high){
		
		if(low < high){
			int mid = ((low + high) / 2);
			
			sortIt(a, low, mid);
			sortIt(a, (mid + 1), high);
			
			merge(a, low, (mid + 1), high);
		} /* if */
		
	} /* sortIt() */
	
	/**
	 * Sorts the "split" arrays.
	 * 
	 * @param a       : The array to be sorted.
	 * @param leftAS  : The start of the "left" array.
	 * @param rightAS : The start of the "right" array.
	 * @param rightAE : The end of the "right" array.
	 */
	private void merge(int[] a, int leftAS, int rightAS, int rightAE){
		
		int leftAE = rightAS - 1;
		int length = rightAE - leftAS + 1;
		int[] sorted = new int[length];
		int sortedAS = 0;
		
		/* Finds the smallest element */
		while(leftAS <= leftAE && rightAS <= rightAE){
			if(a[leftAS] <= a[rightAS]){
				sorted[sortedAS++] = a[leftAS++];
			}else{
				sorted[sortedAS++] = a[rightAS++];
			} /* if else */
		} /* while */
		
		/* Copies the rest of the elements for the next recursion cycle */
		while(leftAS <= leftAE){
			sorted[sortedAS++] = a[leftAS++];
		} /* while */
		
		/* Copies the rest of the elements for the next recursion cycle */
		while(rightAS <= rightAE){
			sorted[sortedAS++] = a[rightAS++];
		} /* while */
		
		/* Copies the result into the main array */
		for(int i = (length - 1); i>= 0; i--, rightAE--){
			a[rightAE] = sorted[i];
		} /* for */
		
	} /* merge() */

} /* MergeSort */
