package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		// 손님이 카페에서 구입하는 메인 생성
		// 손님 클래스를 이용하여 인스턴스 생성
		Client kim = new Client("김씨", 4000);
		Client lee = new Client("이씨", 4500);
		// 각 카페 클래스를 이용해서 각 인스턴스 생성
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		//각 손님이 각 카페에서 커피를 구입하는 것을 메소드로 구현
		kim.buyStarCoffee(starCoffee, 4000);
		lee.buyBeanCoffee(beanCoffee, 4500);

	}

}
