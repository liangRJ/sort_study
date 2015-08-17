package com.liang.pattern.single_two;

public class SingleTwo {
	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,1,2,3,3,2,4,5,6,6,5,4,7,8,9,7,9,8,16,28,28,18};
		getSingleTwo(array);
	}
	private static void getSingleTwo(Integer[] array){
		int temp = array[0];
		for(int i=1;i<array.length;i++){
			temp ^= array[i];
		}
		int j = 0;
		for(int i = 0;i<Integer.BYTES;i++){
			if(((temp>>i)&1) == 1){
				j = i;
				break;
			}
		}
		int one = 0;
		int two = 0;
		for(int i=0;i<array.length;i++){
			if(((array[i]>>j)&1) == 1){
				one ^= array[i];
			}else{
				two ^= array[i];
			}
		}
		System.out.println(one+"--->"+two);
	}
}
