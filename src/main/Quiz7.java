package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (int i=0; i<list.size(); i++) {
			
			Animal animal = list.get(i);
			
			animal.sleep();
			animal.move();
			
			if (animal instanceof Human) {
				Human h = (Human) animal;
				h.readBook();
			} else if (animal instanceof Tiger) {
				Tiger t = (Tiger) animal;
				t.hunting();
			}
			
			System.out.println();
			
		}

	}

}

abstract class Animal {
	
	// 기본 클래스가 아니라 추상 클래스
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public abstract void move();
	// 마찬가지 추상 메소드
	
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}