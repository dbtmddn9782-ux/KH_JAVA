package com.kh.practice.func;

import java.util.Scanner;

public class ArrayPractice {
	
	public void method1() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void method2() {
		
		int arr[] = new int[10];
		
		for(int i =0 ; i<arr.length ; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1 ;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void method4() {
		
		String fruit[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
		}
	
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] chArr = new char[str.length()];
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			
			if(ch == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void method6() {
		
		String day[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >=0 && num <=6) {
			System.out.println(day[num]+"요일");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] intArr = new int[num];
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.printf("배열 %d번째 인덱스 넣을 값 : ",i);
			int num2 = sc.nextInt();
			intArr[i] = num2;
		}
		
		for(int i = 0; i< intArr.length; i++) {
			System.out.print(intArr[i]+" ");
		}
		int sum = 0;
		for(int i = 0; i<intArr.length; i++) {
			sum += intArr[i];
		}
		System.out.println("\n총합 : "+sum);
	}
	
	public void method8() {
		
		String[] arr = {"후라이드", "양념", "파닭", "매콤", "치즈", "간장"};
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		if(str.equals(arr)) {
			System.out.printf("%s 치킨 배달 가능",str);
		}else {
			System.out.printf("%s 치킨 배달 불가능",str);
		}
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
	

}
