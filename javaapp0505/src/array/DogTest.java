package array;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		Dog [] dog = new Dog[5];
		
		dog[0] = new Dog("댕댕이", "불독");
		dog[1] = new Dog("뽀삐", "골든리트리버");
		dog[2] = new Dog("순심", "치와와");
		dog[3] = new Dog("철이", "시바견");
		dog[4] = new Dog("삐쭈", "웰시코기");
		
		for(int i = 0; i < dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println("===향상된 for문===");
		for(Dog temp : dog) {
			System.out.println(temp.showDogInfo());
		}
		

	}

}
