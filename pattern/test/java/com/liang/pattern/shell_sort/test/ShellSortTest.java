package com.liang.pattern.shell_sort.test;

import java.util.Random;

import org.junit.Test;

import com.liang.pattern.shell_sort.ShellSort;
/**
 * 希尔排序：<br>
 * 1.指定增量，按照增量分组，进行直接插入排序
 * 2.减小增量直到进行一次全量插入排序
 * @author liang
 * @version 1.0
 * */
public class ShellSortTest {

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
//		System.out.println("\n----------------------------------");
		ShellSort shellSort = new ShellSort();
		shellSort.shellSort(numbers);
//		for(Integer number:numbers){
//			System.out.print(number+" ");
//		}
		long end = System.currentTimeMillis();
		System.out.println("\n--->"+(end-start));
	}

}
