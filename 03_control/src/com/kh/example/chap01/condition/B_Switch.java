package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	public void method1() {
		//정수 두 개와 연산기호문자(+,-,*,/) 1개를 입력받아서
        //연산 기호 문자에 해당하는 계산 수행
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int second = sc.nextInt();
		System.out.print("연산자(+,-,*,/) : ");
		String opstr = sc.next();
		char op = opstr.charAt(0);
		
		int result =0;
		/*switch(op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			if(second == 0) {
				System.out.println("0으로 나눌 수 없습니다. 결과 값은 임의로 출력됩니다");
			} else {
				result = first / second;
			}
			
		}
		System.out.printf("%d %c %d = %d", first, op, second, result);*/
		
		if(op == '+') {
			result = first + second;
		} else if (op == '-') {
			result = first - second;
		} else if (op == '*') {
			result = first * second;
		} else if (op == '/') {
			switch(second) {
			case 0 :
				System.out.println("0으로 나눌 수 없습니다. 결과 값은 임의로 출력됩니다");
				break;
			default:
				result = first / second;
		
			}
			
		}
	System.out.printf("%d %c %d = %d", first, op, second, result);
		
	}
	public void method2() {
        //사용자에게 과일을 입력받아 해당 과일의 가격 출력
        //사과 1000원, 바나나 5000원, 복숭아 3000원, 키위 2000원
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 5000;
			break;
		case "복숭아":
			price = 3000;
			break;
		case "키위":
			price = 2000;	
			break;
		default:
			price = -1;
		}
		if(price<0) {
			System.out.println("해당과일은 없습니다.");
		} else {
			System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);
		}
		
	}
	public void method3() {
		//1~12 사이의 숫자를 입력 받아 해당 하는 숫자를 달로보고
        //그 달의 마지막 날짜 출력
        //ex. 1~12 사이의 숫자를 하나 입력하세요: 1
        //1월의 마지막 날은 31일입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12사이 숫자를 입력 하세요 : ");
		int month = sc.nextInt();
		int day = 0;
/*		switch(month) {
		case 1 : day = 31; break;
		case 2 : day = 28; break;
		case 3 : day = 31; break;
		case 4 : day = 30; break;
		case 5 : day = 31; break;
		case 6 : day = 30; break;
		case 7 : day = 31; break;
		case 8 : day = 31; break;
		case 9 : day = 30; break;
		case 10 : day = 31; break;
		case 11 : day = 30; break;
		case 12 : day = 31;
		
		}*/
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
		}
		if (day==0) {
			System.out.println("1~12사이 입력해 주세요.");
		}else {
			System.out.printf("%d월의 마지막 날은 %d일입니다", month, day);
		}
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 간단 계산기");
		System.out.println("2. 과일 가게");
		System.out.println("3. 달의 마지막 날");
		System.out.print("메뉴 번호 : ");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1: method1();
			break;
		case 2: method2();
			break;
		case 3: method3();
			break;
		default:
			System.out.println("잘못된 번호입니다.");
		}
	}

}
