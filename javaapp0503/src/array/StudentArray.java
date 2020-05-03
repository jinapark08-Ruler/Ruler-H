package array;

public class StudentArray {

	public static void main(String[] args) {
		//Student클래스를 이용해서 배열로 학생들 객체를 생성하고 정보를 대입 및 출력하는 클래스
		Student [] student = new Student[3];
		student[0] = new Student("1001", "James");
		student[1] = new Student("1002", "Tomas");
		student[2] = new Student("1003", "Edward");
		
		for(int i = 0; i < student.length; i++) {
			student[i].showStudentInfo();
		}

	}

}
