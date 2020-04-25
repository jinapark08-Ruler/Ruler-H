package classpart4;

public class FuntionTest {

	public static void main(String[] args) {
		// 함수 구현하고 호출하는 클래스

		// 변수 선언
		int num1 = 10;
		int num2 = 20;

		// 아래 작성한 add함수 호출
		int sum = add(num1, num2);
		// 리턴된 더하기 결과 출력
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");

		// 아래 작성한 minus함수 호출
		int sub = minus(num1, num2);
		// 리턴된 빼기 결과 출력
		System.out.println(num1 + " - " + num2 + " = " + sub + "입니다");

		// 아래 작성한 multi함수 호출
		int gob = multi(num1, num2);
		// 리턴된 곱하기 결과 출력
		System.out.println(num1 + " * " + num2 + " = " + gob + "입니다");

		// 아래 작성한 div함수 호출
		int mok = div(num1, num2);
		// 리턴된 몫 결과 출력
		System.out.println(num1 + " / " + num2 + " = " + mok + "입니다");
	}

	// add메서드 생성
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	// minus메서드 생성
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	// multi메서드 생성
	public static int multi(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	// div메서드 생성
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}