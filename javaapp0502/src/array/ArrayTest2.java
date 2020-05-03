package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열의 길이를 확인하는 코드를 사용하여 출력하기
		// double의 자료형을 갖는 배열 생
		double [] data = new double[5];
		
		// 1, 2, 3번째 요소에 값 대입
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		// 반복문을 이용하여 전체 배열 길이만큼 반복하여 배열 출력
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		

	}

}
