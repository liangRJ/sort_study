package com.liang.pattern.insertion_sort;
/**
 * 插入排序：<br>
 * 1.假设前面数字已经有序，后面紧跟的数字小于前面第一个数字，则找到自己的位置进行插入<br>
 * 2.重复1过程直到最后一个数字找到并插入自己的位置.<br>
 * O(n^2)
 * @author liang
 * @version 1.0
 * */
public class InsertionSort {
	public void insertionSort(Integer[] array){
		for(int i=1;i<array.length;i++){
			if(array[i]<array[i-1]){
				int temp = array[i];
				int j = i;
				while(j>0&&array[j-1]>temp){
					array[j] = array[j-1];
					j--;
				}
				array[j] = temp;
			}
		}
	}
}
