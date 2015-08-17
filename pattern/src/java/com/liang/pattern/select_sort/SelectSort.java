package com.liang.pattern.select_sort;
/**
 * 选择排序：<br>
 * 1.从[i,n-1]中选取最小者与i交换<br>
 * 2.i++,重复1步骤，直到i=n-1
 * */
public class SelectSort {
	public void selectSort(Integer[] array){
		int length = array.length;
		for(int i=0;i<length;i++){
			int temp = array[i];
			int index = i;
			for(int j=i+1;j<length;j++){
				if(temp>array[j]){
					temp = array[j];
					index = j;
				}
			}
			if(array[i] != temp){
				array[index] = array[i];
				array[i] = temp;
			}
		}
	}
}
