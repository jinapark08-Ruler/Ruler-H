package thisex;

public class BirthDay {
	//멤버 변수 생성
	int day;
	int month;
	int year;
	
	//태어난 연도를 지정하는 메소드
	public void setYear(int year) {
		this.year = year;
	}
	
	//this를 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
	

}
