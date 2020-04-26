package hiding;

public class Student {
	//private으로 선언한 변수 연습을 위한 클래스
	//멤버 변수 생성
	int studentID;
	//studentName은 private으로 생성
	private String studentName;
	int grade;
	String address;
	
	//private으로 선언한 변수에 접근하기 위한 get, set 생성
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
