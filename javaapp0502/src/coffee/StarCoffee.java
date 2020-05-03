package coffee;

public class StarCoffee {
	//별다방에서 가지고 있는 돈 변수 생성
	int money;
	
	//별다방에서 아메리카노 혹은 라떼를 판매했을 때의 메소드
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "별 다방 아메리카노를 구입했습니다.";
		}else if(money == Menu.STARLATTE) {
			return "별 다방 라떼를 구입했습니다.";
		}else {
			return null;
		}
	}

}
