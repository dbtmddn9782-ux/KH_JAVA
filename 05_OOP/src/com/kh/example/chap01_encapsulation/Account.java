package com.kh.example.chap01_encapsulation;

//위치로 구분하는 변수 : 전역변수 vs 지역변수
//전역변수 = 멤버변수 = 멤버필드 = 필드
//전역변수? 클래스 안에 작성된 변수(=메소드 밖)
//지역변수? 메소드 안에 작성된 변수
public class Account {
	private String name = "정현종";
	private String phone = "010-3198-3976";
	private String pwd = "qwer";
	private int bankCode = 1234;
	private int balance = 0;
	
	
	// 입금
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.printf("%s님의 계좌에 %d원이 입금됨\n", name, money);
		} else {
			System.out.println("금액입력 오류입니다.");
		}
	}
	
	// 출금
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.printf("%s님의 계좌에 %d원이 출금됨\n", name, money);
		} else {
			System.out.println("금액입력 오류입니다.");
		}
	}
	
	// 잔액 조뢰
	public void displayBalance() {
		 System.out.println("정현종님의 계좌에 "+balance+"원이 남음");
		
		
	}
	
}
