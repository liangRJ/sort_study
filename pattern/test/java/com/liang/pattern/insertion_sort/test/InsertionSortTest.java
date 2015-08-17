package com.liang.pattern.insertion_sort.test;

import java.util.Random;

import org.junit.Test;

import com.liang.pattern.insertion_sort.InsertionSort;

public class InsertionSortTest {

	@Test
	public void test() {
		long start = System.currentTimeMillis();
		Integer[] numbers = new Integer[100000];
		Random random = new Random();
		for(int i=0;i<numbers.length;i++){
			numbers[i] = random.nextInt(100);
		}
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
//		System.out.println("\n---------------------------------------------------------");
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(numbers);
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
		long end = System.currentTimeMillis();
		System.out.println("\n--->"+(end-start));
	}

}
