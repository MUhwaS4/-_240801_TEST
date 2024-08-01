package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1002, "또치");
		Student student3 = new Student(1003, "도우너");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		for (int i=0; i<list.size();i++) {
			Student student = list.get(i);
			System.out.println(student.showInfo());
		}

	}

}

class Student {
	
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String showInfo() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}
	
}