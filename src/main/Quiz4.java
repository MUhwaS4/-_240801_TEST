package main;

public class Quiz4 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		arr1 = new int[] { 2, 4, 6, 8, 10 };
		
		System.out.println("첫 번째 배열의 합계: " + hap(arr1));
		
		int[] arr2 = new int[2];
		arr2 = new int[] { 2, 4 };
		
		System.out.println("두 번째 배열의 합계: " + hap(arr2));

	}
	
	public static int hap(int[] arr) {
		
		int sumArr = 0;
		
		for (int i=0;i<arr.length;i++) {
			if (arr.length<3) {
				return -999;
			} 
			sumArr = sumArr + arr[i];
		}
		
		return sumArr;
		
	}

}
