package com.liang.pattern.google_sort.test;


import java.util.Random;
import org.junit.Test;
import com.liang.pattern.google_sort.GoogleSort;

public class GoogleSortTest {

	@Test
	public void test() {
		Integer[] numbers = new Integer[]{0,1,2,3,4,5,6,7,8,9};
//		Random random = new Random();
//		for(int i=0;i<numbers.length;i++){
//			numbers[i] = random.nextInt(10);
//		}
		for(Integer number:numbers){
			System.out.print(number+" ");
		}
		System.out.println("\n---------------------------------------------------------");
		long start = System.currentTimeMillis();
		GoogleSort googleSort = new GoogleSort();
		System.out.println(googleSort.googleSort2(numbers));
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
		long end = System.currentTimeMillis();
		System.out.println("\n--->"+(end-start));
	}

}
