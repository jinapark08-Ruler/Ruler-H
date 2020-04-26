package selfCodingTest;

public class Person {
	//사람 인적사항 멤버 변수(나이, 이름, 결혼여부, 자녀 수) 생
	int age;
	String name;
	boolean marry;
	int children;
	
	//멤버 변수를 입력 받고 출력하기 위한 get, set 생성
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	
	//생성 시에 멤버 변수를 바로 입력할 생성자 메소드 생성
	public Person(int age, String name, boolean marry, int children) {
		super();
		this.age = age;
		this.name = name;
		this.marry = marry;
		this.children = children;
	}
	

}
