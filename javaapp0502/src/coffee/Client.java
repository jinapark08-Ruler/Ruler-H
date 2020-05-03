package coffee;

public class Client {
	//객체 간 협력 구현 중 손님 클래스(교재 197page Q5)
	//손님 이름과 손님의 돈 변수 생
	public String clientName;
	public int money;
	
	//손님 생성자 구현
	public Client(String clientName, int money) {
		super();
		this.clientName = clientName;
		this.money = money;
	}
	
	//손님이 별다방에서 아메리카노를 살 때의 메소드
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money = money;
			System.out.println(clientName + "께서 " + money + "원을 내고 " + message);
		}
	}
	
	//손님이 콩다방에서 라떼를 살 때의 메소드
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money = money;
			System.out.println(clientName + "께서 " + money + "원을 내고 " + message);
		}
	}
	

}
