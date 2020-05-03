package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배역 초기화 출력
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 배열의 모든 요소를 더할 변수 생성
		int sum = 0;
		
		//배열의 첫 번째 요소부터 열 번째 요소까지 10개 요소 값 출력 및 배열의 모든 요소를 더하는 반복
		for(int i = 0; i < num.length; i = i + 1) {
			sum = sum + num[i];
			System.out.println(num[i]);
		}
		System.out.println("배열 전체의 합은 " + sum);

	}

}
