package com.liang.pattern.shell_sort;

public class ShellSort {
	public void shellSort(Integer[] array){
		int i,j,gap;
		for(gap=array.length/2;gap>0;gap=gap/2){
			for(i=0;i<gap;i++){
				for(j=i+gap;j<array.length;j+=gap){
					int temp = array[j];
					int k = j;
					while(k>=gap&&array[k-gap]>temp){
						array[k] = array[k-gap];
						k -= gap;
					}
					array[k] = temp;
				}
			}
		}
	}
	public void shellSort2(Integer[] array){
		int i,gap;
		for(gap=array.length/2;gap>0;gap/=2){
			for(i=gap;i<array.length;i++){
				int temp = array[i];
				int j = i;
				while(j>=gap&&array[j-gap]>temp){
					array[j] = array[j-gap];
					j -= gap;
				}
				array[j] = temp;
			}
		}
	}
}
