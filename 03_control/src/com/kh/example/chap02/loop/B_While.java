package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
		// 1부터 5까지 출력
		// while 버전
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	
	
	//do~while 버전
	int j = 1;
	do {
		System.out.println(j);
		j++;
	} while(j<=5);
}
	public void method2() {
		//1에서 10 사이의 홀수만 출력
		//while 버전 : 복합대입 연산자
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i += 2;
		}
		//do~while : if 문
		
		int j = 1;
		do {
			if (j%2 !=0) {
				System.out.println(j);
			}
			j++;
		}while(j<=10);
		
		
	}
	public void method3() {
		// 정수 두개를 입력 받아 그 사이 숫자 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자가 두 번째 숫자보다 작아야 합니다.");
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		int min = 0;
		int max = 0;
		if(start>end) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		while(min<=max) {
			System.out.println(min);
			min ++;
		}
		
		
	}
	public void method4() {
		// 문자열을 입력받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int length = str.length();
		for(int i = 0; i<length ; i++) {
			System.out.println(i+":"+str.charAt(i));
		}
	}
	public void method5() {
		// 구구단 : while
		int j = 1;
		
		while(j<=9){
			int i = 1;
			while(i<=9) {
				System.out.printf("%d * %d = %d\n", j, i, j*i);
				i++;
			}
			j++;
		}
		
	}
	public void method6() {
		// 시간 do~while
		int hour = 0;
		do {
			int min = 0;
			do {
				System.out.printf("%d시 %d분\n", hour, min);
				min++;
			}while(min <60);
			hour++;
		} while(hour <24);
	
	
	}
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 9) {
			System.out.println("1. 1~5출력");
			System.out.println("2. 홀수만 출력");
			System.out.println("3. 사이숫자 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				method1();
				break;
			case 2 :
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다.");
		}

	}
}
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 1~5출력");
			System.out.println("2. 홀수만 출력");
			System.out.println("3. 사이숫자 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				method1();
				break;
			case 2 :
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 선택입니다.");
		}

	}
}
	public void method9() {
		//문자열을 입력받아 글자 개수를 출력하는 프로그램
	     //단 , end가 들어오기 전까지는 무한반복
		Scanner sc = new Scanner(System.in);
		
		
		//while 조건
		String str = null;
		while(!str.equals("end")) {
			System.out.print("문자를 입력하세요 : ");
			str = sc.nextLine();
			int length = str.length();
			System.out.println(str+"의 글자 수 : "+ length);	
		}
		// while 무한
//		while(true) {
//			System.out.print("문자 입력 : ");
//			String str = sc.nextLine();
//			if(str.equals("end")) {
//				break;
//			}
//			System.out.println(str+"의 글자 수 : "+str.length());
//			
//		}
		// do while
//		String str= null;
//		do {
//			System.out.print("문자 입력 : ");
//			str = sc.nextLine();
//			System.out.println(str+"의 글자 수 : "+str.length());
//		} while(!str.equals("end")); 
// 		do while은 사용자가 입력한값을 먼저 가져와서 에러가 안난다
	}
	
	
}
	
	
	
	
	

