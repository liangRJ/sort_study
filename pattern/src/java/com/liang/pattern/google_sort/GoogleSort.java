package com.liang.pattern.google_sort;

public class GoogleSort {
	public int googleSort1(Integer[] array){
		for(int i=0;i<array.length;i++){
			while(array[i] != i){
				if(array[i] == array[array[i]]){
					return array[i];
				}
				swap(array,i,array[i]);
			}
		}
		return -1;
	}
	
	public int googleSort2(Integer[] array){
		int max = array.length;
		for(int i=0;i<max;i++){
			int index = array[i]>=max?(array[i]-max):array[i];
			if(array[index] >= max){
				return i;
			}
			array[index] += max;
		}
		return -1;
	}
	private void swap(Integer[] array,int first,int second){
		int _temp = array[first];
		array[first] = array[second];
		array[second] = _temp;
	}
}
