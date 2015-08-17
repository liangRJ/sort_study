package com.liang.pattern.quick_sort;
/**
 * 快速排序：<br>
 * 1.选取第一个数作为标兵(此处空)，从高位寻找小于标兵的数回填(此处空),
 * 再次从低位寻找大于标兵数字回填，直到重逢，将标兵回填至此。<br>
 * 2.此时将数组分为大于和小于标兵的两组，重复1过程直到组元素为一个。
 * @author liang
 * @version 1.0
 * */
public class QuickSort {
	public void quickSort(Integer[] array){
		int first = 0;
		int last = array.length;
		this.quick_sort(array, first, last);
	}
	private void quick_sort(Integer[] array,int first,int last){
		int i = first;
		int j = last;
		if(first < last){
			int _temp = array[i];
			while(i < j){
				while(j>i && array[--j]>_temp);
				if(i < j){
					array[i] = array[j];
				}
				while(j>i && array[++i]<_temp);
				if(i < j){
					array[j] = array[i];
				}
			}
			array[i] = _temp;
			quick_sort(array,first,i);
			quick_sort(array,i+1,last);
		}
	}
}
