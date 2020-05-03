package array;

public class TwoDimension2 {

	public static void main(String[] args) {
		// 이차원 배열의 길이 출력하기
		int [][] ar = new int[2][3];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.println(ar[i][j]);
			}
			System.out.println("");
		}
		System.out.println(ar.length);
		System.out.println(ar[0].length);

	}

}
