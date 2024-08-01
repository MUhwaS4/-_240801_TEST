package main;

public class Quiz2 {
	
	public static void whatMonth(int month) {
		
		if (3 <= month && month <= 5) {
			System.out.println(month + "월입니다. 현재 계절은 봄입니다.");
		} else if (6 <= month && month <= 8) {
			System.out.println(month + "월입니다. 현재 계절은 여름입니다.");
		} else if (9 <= month && month <= 11) {
			System.out.println(month + "월입니다. 현재 계절은 가을입니다.");
		} else if (12 == month || month == 1 || month == 2) {
			System.out.println(month + "월입니다. 현재 계절은 겨울입니다.");
		} else {
			System.out.println(month + "월은 잘못된 값입니다.");
		}
		
	}

	public static void main(String[] args) {
		
		whatMonth(1);
		whatMonth(2);
		whatMonth(3);
		whatMonth(4);
		whatMonth(5);
		whatMonth(6);
		whatMonth(7);
		whatMonth(8);
		whatMonth(9);
		whatMonth(10);
		whatMonth(11);
		whatMonth(12);
		whatMonth(13);

	}

}