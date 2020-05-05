package inheritance;

public class VIPCustomer extends Customer {
	//VIP 고객 등급을 구현하기 위한 클래스
	//VIP 멤버 변수
	private int agentID;	//VIP고객 상담원 아이디
	double saleRatio;	//VIP할인율
	
	//VIP의 디폴트 생성
	public VIPCustomer() {
		customerGrade = "VIP";	//상위 클래스의 private 변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	

}
