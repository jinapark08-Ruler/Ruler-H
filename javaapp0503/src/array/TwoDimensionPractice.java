package array;

public class TwoDimensionPractice {

	public static void main(String[] args) {
		// 알파벳 소문자를 2글자씩 13줄(13행 2열)로 출력하는 프로그램
		char [][] ar = new char[13][2];
		int sum = 0;
		
		// 배열에 각 소문자에 해당하는 아스키코드값을 대입하는 반복문
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (char)(sum + 97);
				sum++;
			}
		}
		
		// 배열을 출력하는 반복문
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
