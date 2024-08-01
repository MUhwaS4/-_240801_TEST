package main;

public class Quiz6 {

	public static void main(String[] args) {
		
		BallPen ballPen = new BallPen(2, "100%", "파랑색");
		FountainPen fountainPen = new FountainPen(3, "80%", "몽블랑");
		
		ballPen.showInfo();
		fountainPen.showInfo();

	}

}

class Pen {
	
	int weight;
	String amount;
	
	public Pen(int weight, String amount) {
		super();
		this.weight = weight;
		this.amount = amount;
	}
	
}

class BallPen extends Pen {
	
	String color;

	public BallPen(int weight, String amount, String color) {
		super(weight, amount);
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기: " + weight + "\n남은 양: " + amount + "\n볼펜의 색: " + color + "\n");
	}
	
}

class FountainPen extends Pen {
	
	String brand;

	public FountainPen(int weight, String amount, String brand) {
		super(weight, amount);
		this.brand = brand;
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기: " + weight + "\n남은 양: " + amount + "\n브랜드: " + brand + "\n");
	}
	
}