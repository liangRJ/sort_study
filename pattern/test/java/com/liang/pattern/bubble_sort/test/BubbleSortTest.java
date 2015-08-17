package com.liang.pattern.bubble_sort.test;


import java.util.Random;

import org.junit.Test;

import com.liang.pattern.bubble_sort.BubbleSort;

public class BubbleSortTest {

	@Test
	public void test() {
		Integer[] numbers = new Integer[100000];
		Random random = new Random();
		for(int i=0;i<numbers.length;i++){
			numbers[i] = random.nextInt(100);
		}
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
//		System.out.println("\n---------------------------------------------------------");
		long start = System.currentTimeMillis();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort3(numbers);
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
		long end = System.currentTimeMillis();
		System.out.println("\n--->"+(end-start));
	}

}
