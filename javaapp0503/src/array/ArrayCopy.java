package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// System.arraycopy()로 배열 복사하기
		int [] array1 = {10, 20, 30, 40, 50};
		int [] array2 = {1, 2, 3, 4, 5};
		
		//System.arraycopy(복사할 배열, 복사할 첫 위치, 붙여넣을 배열, 붙여넣을 첫 위치, 복사할 요소의 개수)
		System.arraycopy(array1, 0, array2, 1, 4);
		//복사한 배열 출력
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
