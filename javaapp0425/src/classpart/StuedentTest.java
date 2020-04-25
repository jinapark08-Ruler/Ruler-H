package classpart;

//Student 클래스 테스트 용 main클래스 생
public class StuedentTest {

	public static void main(String[] args) {
		//Student 클래스의 인스턴스 생성
		Student studentAhn = new Student();
		//멤버변수에 값 대입
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
