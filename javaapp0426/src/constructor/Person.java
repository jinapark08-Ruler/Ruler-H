package constructor;

public class Person {
	//생성자를 만들기 위한 멤버변수 생성
	String name;
	float height;
	float weight;
	
	//오류 발생하지 않기 위해서 디폴트 생성자 생성
	public Person() {}
	
	//인스턴스 생성 시 이름을 매개변수로 받아 동시에 이름만 초기화하기 위한 생성자 생성
	public Person(String pname) {
		name = pname;
	}
	
	//인스턴스 생성 시 이름, 몸무게, 키를 매개변수로 받아 동시에 초기화하기 위한 생성자 생성
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}

}
