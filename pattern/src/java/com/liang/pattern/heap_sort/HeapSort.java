package com.liang.pattern.heap_sort;
/**
 * 堆排序：<br>
 * 1.构建[0,n-1]最大堆,此时0位置是最大值<br>
 * 2.交换0位置和n-1位置,构建[0,n-2]位置最大堆<br>
 * 3.重复2过程，直到序列剩余一个<br>
 * @author liang
 * @version 1.0
 * */
public class HeapSort {
	public void heapSort(Integer[] array){
		buildMaxHeapify(array);
		heap_sort(array);
	}
	
	private void heap_sort(Integer[] array){
		for(int i=array.length-1;i>0;i--){
			swap(array,0,i);
			maxHeapify(array,0,i);
		}
	}
	
	private void buildMaxHeapify(Integer[] array){
		int parent = getParentIndex(array.length-1);
		for(int i=parent;i>=0;i--){
			maxHeapify(array,i,array.length);
		}
	}
	private void maxHeapify(Integer[] array,int index,int last){
		int leftChild = getLeftChildIndex(index);
		int rightChild = getRightChildIndex(index);
		int temp = index;
		
		if(leftChild < last && array[temp] < array[leftChild]){
			temp = leftChild;
		}
		if(rightChild < last && array[temp] < array[rightChild]){
			temp = rightChild;
		}
		if(temp != index){
			swap(array,index,temp);
			maxHeapify(array,temp,last);
		}
		
	}
	
	private int getParentIndex(int _index){
		return (_index-1)>>1;
	}
	
	private int getLeftChildIndex(int _index){
		return (_index<<1)+1;
	}
	
	private int getRightChildIndex(int _index){
		return (_index<<1)+2;
	}
	private void swap(Integer[] array,int first,int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
}
