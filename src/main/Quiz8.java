package main;

public class Quiz8 {

	public static void main(String[] args) {
		
		Calc calc = new Calculator();
		
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));
		
		System.out.println();
		
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));

	}

}

interface Calc {
	
	int Error = -9999;
	
	int add(int x, int y);
	
	int substract(int x, int y);
	
	int times(int x, int y);
	
	int divide(int x, int y);
	
}

class Calculator implements Calc {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int substract(int x, int y) {
		return x - y;
	}

	@Override
	public int times(int x, int y) {
		if (y<=0) {
			return Error;
		}
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		if (x<y) {
			return Error;
		}
		return x / y;
	}
	
}