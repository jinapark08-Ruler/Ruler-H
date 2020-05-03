package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열의 유효한 요소 값 출력하는 클래스
		double [] data = new double[5];
		// 대입되어 있는 배열 개수를 저장할 변수 선언
		int size = 0;
		
		data[0] = 10.0;	size++;
		data[1] = 20.0;	size++;
		data[2] = 30.0; size++;
		
		//유효한 범위까지인 size로 설정하여 유효한 배열 요소만을 출력
		for(int i = 0; i < size; i = i + 1) {
			System.out.println(data[i]);
		}
		

	}

}
