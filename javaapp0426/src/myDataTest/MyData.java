package myDataTest;

public class MyData {

	public static void main(String[] args) {
		MyDataTest date1 = new MyDataTest(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDataTest date2 = new MyDataTest(2, 10, 2006);
		System.out.println(date2.isValid());
		

	}

}
