package com.algo;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr= {
			3, 4, 7, 1, 2, 0, 9, 8, 5, 6	
		};
		
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}

	private static void sort(int[] arr, int lower, int upper) {
		if(lower< upper) {
			int p= partition(arr, lower, upper);
			sort(arr, lower, p);
			sort(arr, p+1, upper);
		}
	}

	private static int partition(int[] arr, int lower, int upper) {
		int m= (lower+upper)/2;
		int pivot= arr[m];
		swap(arr, m, upper);
		
		int i= lower-1;
		
		for(int j= lower; j< upper; j++) {
			if(arr[j]< pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, upper);
		return i+1;
	}

	private static void swap(int[] arr, int m, int upper) {
		int tmp= arr[m];
		arr[m]= arr[upper];
		arr[upper]= tmp;
	}

	

}
