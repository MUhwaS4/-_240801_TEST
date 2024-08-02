package main;

public class Quiz3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum = sum + i;
			if (sum >= 300) {
				System.out.println("i: " + i + ", sum: " + sum);
//				return;
				break;
			}
		}
		
		System.out.println();

	}

}
