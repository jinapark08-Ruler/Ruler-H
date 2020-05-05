package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 길이가 5인 정수형 배열을 선언하고, 1~10 중 짝수만을 배열에 저장한 후 그 합을 출력
		int [] ar = new int[5];
		int j = 0;
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (i + 1) * 2;
		}
		int sum = 0;
		for(int temp : ar) {
			sum = sum + temp;
			System.out.println(temp);
		}
		System.out.println(sum);
	}

}
