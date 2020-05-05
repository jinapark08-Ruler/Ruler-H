package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// Student클래스를 이용한 ArrayList 활용
		ArrayList<Student> student = new ArrayList<>();
		student.add(new Student("1001", "James"));
		student.add(new Student("1002", "Tomas"));
		student.add(new Student("1003", "Edward"));
		
		for(Student temp : student) {
			temp.showStudentInfo();
		}

	}

}
