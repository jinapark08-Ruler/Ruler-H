package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		// hiding.Student 클래스의 private 변수를 외부 패키지에서 사용하는 것을 확인하기 위한 클래스
		Student studentLee = new Student();
		//private 변수로 선언한 studentName이기 때문에 오류 발생
		//studentLee.studentName = "이상원";
		
		//set을 이용한 멤버 변수에 이름 값 대입
		studentLee.setStudentName("이상원");
		
		//get을 이용해서 확인
		System.out.println(studentLee.getStudentName());

	}

}
