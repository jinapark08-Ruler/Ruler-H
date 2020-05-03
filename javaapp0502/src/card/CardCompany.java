package card;

public class CardCompany {
	//자바 교재 197page Q6
	//카드 발급 시 카드의 번호 멤버 변수 생
	private static int cardNum = 0;
	
	//인스턴스 생성시 카드번호가 하나씩 증가하게 하는 메소드
	public CardCompany() {
		cardNum++;
	}

	public static int getCardNum() {
		return cardNum;
	}

	public static void setCardNum(int cardNum) {
		CardCompany.cardNum = cardNum;
	}
	

}
