package coffee;

public class BeanCoffee {
	//콩다방 클래스 생성
	//콩다방의 돈 변수 생성
	int money;
	
	//콩다방에서 아메리카노 혹은 라떼를 구입했을때의 메소드 생성
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "콩 다방 아메리카노를 구입했습니다.";
		}else if(money == Menu.BEANLATTE){
			return "콩 다방 라떼를 구입했습니다.";
		}else {
			return null;
		}
	}

}
