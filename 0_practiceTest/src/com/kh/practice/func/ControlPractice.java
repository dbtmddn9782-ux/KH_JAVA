package com.kh.practice.func;

import java.util.Scanner;

public class ControlPractice {
	public void method1() {
		
	while(true) {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다");
			break;
		case 2 :
			System.out.println("수정 메뉴입니다");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다");
			break;
		case 7 :	
			System.out.println("프로그램이 종료됩니다");
			return;
		default :
			System.out.println("다시 입력바랍니다");
			break;
		}
		}
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num %2 ==0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("국어 :" + kor);
		System.out.println("수학 :" + mat);
		System.out.println("영어 :" + eng);
		
		
		int sum = kor + mat + eng;
		float avg = (sum)/3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		if(kor >=40 && mat >=40 && eng>=40 && avg>=60) {
				System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의정수입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1,12,2 :
			System.out.println("겨울입니다.");
			break;
		case 3,4,5 :
			System.out.println("봄입니다.");
			break;
		case 6,7,8 :
			System.out.println("여름입니다.");
			break;
		case 9,10,11 :
			System.out.println("가을입니다.");
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.",month);
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		
		if(id.equals("myId")) {
			if(pwd.equals("myPassword12")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 오류");
			}
		} else {
			System.out.println("아이디 오류");
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 등급 : ");
		String grade = sc.nextLine();
		
		if(grade.equals("관리자")) {
			System.out.println("회원관리, 게시글관리, 게시글작성, 게시글조회, 댓글작성");
		} else if (grade.equals("회원")) {
			System.out.println("게시글작성, 게시글조회, 댓글작성");
		} else if (grade.equals("비회원")) {
			System.out.println("게시글조회");
		} else {
			System.out.println("잘못 입력 하셨습니다");
		}
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력해주세요 : ");
		double hi = sc.nextDouble();
		System.out.print("몸무게를 입력해주세요 : ");
		double we = sc.nextDouble();
		
		double BMI = we/(hi*hi);
		System.out.println("BMI 지수 : "+ BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		} else if(BMI <23) {
			System.out.println("정상체중");
		} else if(BMI <25) {
			System.out.println("과체중");
		} else if(BMI <30) {
			System.out.println("비만");
		} else {
			System.out.println("비만");
		}
		
		
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 입력(+, -, *, /, % ) : ");
		char a = sc.nextLine().charAt(0);
		
		if(num1 >0 && num2>0) {
			
			switch(a) {
			case '+':
				System.out.printf("%d + %d = %d", num1, num2, (num1+num2));
				break;
			case '-':
				System.out.printf("%d - %d = %d", num1, num2, (num1-num2));
				break;
			case '*':
				System.out.printf("%d * %d = %d", num1, num2, (num1*num2));
				break;
			case '/':
				System.out.printf("%d / %d = %d", num1, num2, (num1/num2));
				break;
			case '%':
				System.out.printf("%d %% %d = %d", num1, num2, (num1%num2));
				break;
			default :
				System.out.println("잘못 입력 프로그램 종료");
		}
		
		} else {
			System.out.println("양수를 입력하세요");
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int end = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 회수 : ");
		int at = sc.nextInt();
		
		System.out.println("================= 결과 =================");
		if (!(at < 20 * 0.7)) { // 30% 이상 결석 시 Fail이므로

			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + end * 0.3);
			System.out.println("과제 점수       (30) : " + hw * 0.3);
			System.out.println("출석 점수       (20) : " + (at / 20.0 * 100 * 0.2));

			double sum = mid * 0.2 + end * 0.3 + hw * 0.3 + (at / 20.0 * 100 * 0.2);
			// attendance / 20.0 * 100 은 총 출석한 날짜를 가지고 100점 만점으로 환산하는 계산

			System.out.println("총점 : " + sum);

			if (sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 회수 부족 (" + at + "/20)]");
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6.권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : method1(); break;
		case 2 : method2(); break;
		case 3 : method3(); break;
		case 4 : method4(); break;
		case 5 : method5(); break;
		case 6 : method6(); break;
		case 7 : method7(); break;
		case 8 : method8(); break;
		case 9 : method9(); break;
		default:
			System.out.println("잘못 입력했습니다");
		}
		
		
		
	}
	
	
	
	
	

		
	}
	
	
	
	
	


