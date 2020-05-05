package array;

public class CharArray {

	public static void main(String[] args) {
		// 알파벳 문자와 아스키 코드 값 출력하기
		char [] alphabets = new char[26];
		char ch = 'a';
		
		//반복문으로 각 배열 요소에 대문자의 아스키 코드 값을 저
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		//저장된 각 대문자를 출력
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}

	}

}
