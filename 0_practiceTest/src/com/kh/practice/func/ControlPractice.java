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
		} else 
	}
	
	
	
	
	
	
	

}
