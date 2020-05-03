package array;

public class TwoDimension {

	public static void main(String[] args) {
		// 이차원 배열 초기화하기
		int [][] ar = {{1, 2, 3}, {4, 5, 6}};
		
		// 이차원 배열 출력
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.println(ar[i][j]);
			}
			System.out.println("");
		}

	}

}
