package selfCodingTest;

public class PersonMain {

	public static void main(String[] args) {
		//person클래스를 이용한 인스턴스 생성 및 프로퍼티 대입
		Person ps1 = new Person(40, "James", true, 3);
		
		//입력한 변수 출력
		if(ps1.isMarry()) {
			System.out.println(ps1.getName() + "씨의 나이는 " + ps1.getAge() + "살이고 결혼했으며 자식이 " + ps1.getChildren() + "명 있습니다.");
		}else {
			System.out.println(ps1.getName() + "씨의 나이는 " + ps1.getAge() + "살이고 결혼하지 않았습니다.");
		}
		
		

	}

}
