package array;

public class Book {
	private String bookName;
	private String author;
	
	// 디폴트 값 생성자 메소드
	public Book() {
		
	}

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//책 정보 출력해주는 메소드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}


}
