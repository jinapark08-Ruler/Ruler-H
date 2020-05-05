package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("댕댕", "불독"));
		dog.add(new Dog("뽀삐", "골든리트리버"));
		dog.add(new Dog("순심", "치와와"));
		dog.add(new Dog("철이", "시바견"));
		dog.add(new Dog("삐쭈", "웰시코기"));
		
		System.out.println("===향상된 for문===");
		for(Dog temp : dog) {
			System.out.println(temp.showDogInfo());
		}

	}

}
