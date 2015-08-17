package com.liang.pattern.merge_sort;

/**
 * 归并算法：<br>
 * 1.将序列分成两组，如果前一组的的坐标小于后者,继续分组<br>
 * 2.将分组合并,先合并两组中较小的，多余的添加到数组<br>
 * @author liang
 * @version 1.0
 * */
public class MergeSort {
	public void mergeSort(Integer[] array){
		int length = array.length;
		Integer[] _temp = new Integer[length];
		divide(array,0,length-1,_temp);
	}
	
	public void divide(Integer[] source,int first,int last,Integer[] dentist){
		if(first < last){
			int mid = (first+last)/2;
			divide(source,first,mid,dentist);
			divide(source,mid+1,last,dentist);
			merge(source,first,mid,last,dentist);
		}
	}
	
	public void merge(Integer[] source,int first,int mid,int last,Integer[] dentist){
		int i = first;
		int j = mid+1;
		int k = 0;
		while(i<=mid && j<=last){
			if(source[i] < source[j]){
				dentist[k++] = source[i++];
			}else{
				dentist[k++] = source[j++];
			}
		}
		while(i<=mid){
			dentist[k++] = source[i++];
		}
		while(j<=last){
			dentist[k++] = source[j++];
		}
		for(int l=0;l<k;l++){
			source[first+l] = dentist[l];
		}
	}
}
