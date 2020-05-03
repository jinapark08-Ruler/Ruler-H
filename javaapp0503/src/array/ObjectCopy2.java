package array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		// 객체 배열 얕은 복사하기
		// 복사할 배열
		Book[] bookArray1 = new Book[3];
		// 붙여넣을 배
		Book[] bookArray2 = new Book[3];

		// bookArray1에 정보 대입
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		// 복사 코드
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		// 붙여넣기한 배열 출력
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

		// bookArray1 배열의 첫 번째 요소 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");

		// bookArray1 배열 출력
		System.out.println("===bookArray1===");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}

		// bookArray1 배열 요소 수정이 bookArray2에도 반영되었지 확인하기 위한 bookArray2 출력
		System.out.println("===bookArray2===");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

	}
}
