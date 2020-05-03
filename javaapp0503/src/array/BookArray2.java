package array;

public class BookArray2 {

	public static void main(String[] args) {
		// 각 배열 요소를 생성 후 초기화
		// 배열 생
		Book [] library = new Book[5];
			
		//인스턴스 생성 후 배열에 저장
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");

		//책의 정보를 알려주는 메소드를 사용하여 배열 출력
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		//인스턴스를 저장하고 있는 주소를 출력
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
