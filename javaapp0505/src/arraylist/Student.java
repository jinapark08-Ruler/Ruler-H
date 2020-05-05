package arraylist;

import java.util.ArrayList;

public class Student {
	//성적 출력 프로그램을 구현하기 위한 Student클래스
	//Student 클래스의 멤버 변수
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	//학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메소드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	//배열 요소 값 출력하는 메소드
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성정은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}

}
