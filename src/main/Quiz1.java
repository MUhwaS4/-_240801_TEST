package main;

public class Quiz1 {

	public static void main(String[] args) {
		
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int total = (mathScore + engScore + korScore);
		double average = total/3.0;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);

	}

}
