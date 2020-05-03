package array;

public class BookArray {

	public static void main(String[] args) {
		// Book클래스를 가지고 배열 인스턴스 생성
		Book [] library = new Book[5];
		
		for(int i = 0; i < library.length; i = i + 1) {
			System.out.println(library[i]);
		}

	}

}
