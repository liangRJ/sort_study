package com.liang.pattern.bubble_sort;
/**
 * 冒泡排序：<br>
 * 1.比较相邻的数据，如果第一个大于第二个，交换。<br>
 * 2.对每一对进行1的比较，从第一对到最后一对，这时最大数为最后一位。<br>
 * 3.针对除最后一对外的所有元素进行上述步骤。<br>
 * 4.对越来越少的重复上述步骤，直到没有任何一对需要比较。<br>
 * 
 * O(n^2)
 * @author liang
 * @version 1.0
 * */
public class BubbleSort {
	/**
	 * 定义版
	 * */
	public void bubbleSort1(Integer[] array){
		int length = array.length;
		for(int i=0;i<length;i++){
			for(int j=1;j<length-i;j++){
				if(array[j-1]>array[j]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * 设置标志位，如果没发生交换说明已经有序，终止排序
	 * */
	public void bubbleSort2(Integer[] array){
		int length = array.length;
		boolean flag = true;
		while(flag){
			flag = false;
			for(int i=1;i<length;i++){
				if(array[i-1]>array[i]){
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					flag = true;
				}
			}
			length--;
		}
	}
	
	public void bubbleSort3(Integer[] array){
		int flag = array.length;
		while(flag>0){
			int length = flag;
			flag = 0;
			for(int i=1;i<length;i++){
				if(array[i-1]>array[i]){
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					flag = i;
				}
			}
		}
	}
}
