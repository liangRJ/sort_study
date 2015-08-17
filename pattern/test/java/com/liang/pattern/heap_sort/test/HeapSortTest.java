package com.liang.pattern.heap_sort.test;

import java.util.Random;

import org.junit.Test;

import com.liang.pattern.heap_sort.HeapSort;

public class HeapSortTest {

	@Test
	public void test() {
		long start = System.currentTimeMillis();
		Integer[] numbers = new Integer[40000000];
		Random random = new Random();
		for(int i=0;i<numbers.length;i++){
			numbers[i] = random.nextInt(100);
		}
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
//		System.out.println("\n---------------------------------------------------------");
		HeapSort heapSort = new HeapSort();
		heapSort.heapSort(numbers);
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
		long end = System.currentTimeMillis();
		System.out.println("\n--->"+(end-start));
	}

}
