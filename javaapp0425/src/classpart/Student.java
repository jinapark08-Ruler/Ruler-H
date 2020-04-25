package classpart;

public class Student {

	// 학생 이름과 주소 출력하는 메서드
	// 멤버 변수 생성
	int studentID;
	String studentName;
	int grade;
	String address;

	// 학생 이름과 주소를 출력하는 메서드 생성
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	// 학생 이름을 반환하는 get, 학생 이름을 멤버 변수에 대입하는 set 생
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// 클래스 내부에서 main 함수 추가
	public void main(String[] args) {
		// Student 클래스의 인스턴스 생성
		Student studentAhn = new Student();
		// 인스턴스 프로퍼티 studentName에 문자열 대
		studentAhn.studentName = "안연수";

		// 학생 이름 출력
		System.out.println(studentAhn.studentName);
		// 학생 이름 반환해주는 get사용하여 학생이름 출력
		System.out.println(studentAhn.getStudentName());

	}
	
	//ps. 이거 책 참고하면서 코딩한건데 왜 안되는지 도저히 모르겠네요 ㅠ

}
