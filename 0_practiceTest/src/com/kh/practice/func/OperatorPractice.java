package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수이다");
		} else {
			System.out.println("양수가 아니다");
		}
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0이다");
		} else if (num >0) {
			System.out.println("양수이다");
		} else 
			System.out.println("음수이다");
	}
	
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num %2 ==0) {
			System.out.println("짝수이다");
		} else {
			System.out.println("홀수이다");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int count = sc.nextInt();
		System.out.print("사탕 수 : ");
		int num = sc.nextInt();
		
		if(count>num) {
			System.out.println("사람 수가 사탕수 보다 많습니다");
		}else {
			System.out.println("1인당 사탕 개수 :"+ num/count);
			System.out.println("남은 사탕 개수 :"+ num%count);
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int ha = sc.nextInt();
		System.out.print("반 : ");
		int clas = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		sc.next();
		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine();
		System.out.print("성적(소수둘째까지) : ");
		float grade = sc.nextFloat();
		
		if(gender =="M" || gender == "m") {
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다", ha, clas, num, name, grade);
		}else {
			System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다", ha, clas, num, name, grade);
		}
		
		
		
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age<=19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}
	
	public void method7() {
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		int sum = kor+eng+mat;
		
		System.out.printf("합계 : %d\n",sum);
		int avg = (kor+eng+mat)/3;
		System.out.println("평균 : "+avg);
		
		if(kor>=40 && eng>=40 && mat>=40 || avg>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-)포함 : ");
		String num = sc.next();
		char ch = num.charAt(7);
		
		if(ch == '1' || ch == '3') {
			System.out.println("남자");
		} else if(ch == '2' || ch == '4') {
			System.out.println("여자");
		} else {
			System.out.println("주민번호를 잘못 입력했습니다.");
		}
	}
	
	public void method9() {	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(num1 < num2) {
			System.out.print("입력 : ");
			int num3 = sc.nextInt();
				if(num3 <= num1 || num3 > num2) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
		} else {
			System.out.println("다시 입력하세요");
			
		}
	}
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
