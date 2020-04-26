package myDataTest;

public class MyDataTest {
	// 5과 연습문제
	// 외부 접근을 제한하기 위해 private으로 멤버 변수 생성
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	// 인스턴스 생성시 사용할 생성자 생성
	public MyDataTest(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// private 멤버 변수들에 접근하기 위한 get, set 생성
	public int getDay() {
		return day;
	}

	// 일수가 유효한 날짜가 아닌 경우를 확인하기 위한 Day의 set메소드
	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day < 0 && day > 31) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		
		case 2 :
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if(day < 0 || day > 29) {
					isValid = false;
				}else {
					this.day = day;
				}
			}else {
				if(day < 0 || day > 28) {
					isValid = false;
				}else {
					this.day = day;
				}
			}
			break;
		
		case 4 : case 6 : case 9 : case 11 :
			if(day < 0 || day > 30) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		}
	}	

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year < 1) {
			isValid = false;
		}else {
		this.year = year;
		}
	}


	// 날짜가 유효한지 확인하기 위한 메서드 생성
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		}else {
			return "유효하지 않은 날짜입니다.";
		}
	}

}
