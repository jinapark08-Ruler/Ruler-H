package array;

public class Student {
	//학생의 멤버 변수 및 생성자 get, set을 생성하고 정보를 출력하는 메소드 생
	private String studentID;
	private String name;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + "," + name);
	}

}
