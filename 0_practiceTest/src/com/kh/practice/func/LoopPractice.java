package com.kh.practice.func;

import java.util.Scanner;



public class LoopPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
			for(int  i= 1; i <= num;i++) {
				System.out.print(i+" ");
			}
		} else{
			System.out.println("1이상의 숫자를 입력해 주세요");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		while(num <=0) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num >=1) {
				for(int i = 1; i <= num;i++) {
					System.out.print(i+" ");
					}
			}else {
			System.out.println("1이상의 숫자를 입력해 주세요");
			}
		
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >=1) {
			for(int i = num; i>=1 ;i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해 주세요.");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num >=1) {
				for(int i = num; i>=1;i--) {
					System.out.print(i+" ");
				}break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요");
				}
			}
		}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i<=num) {
			sum = sum + i;
			if(i != num) {
				System.out.print(i+"+");
			}else {
				System.out.println(i+"="+sum);
			}
			i++;
		}
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1>num2) {
				for(int i = num2; i<=num1;i++) {
					System.out.print(i+" ");
					}
			}else {
				for(int i = num1; i<=num2;i++) {
					System.out.print(i+" ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요");
		}
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
		
			if(num1 >= 1 && num2 >= 1) {
				if(num1>num2) {
					for(int i = num2; i<=num1;i++) {
						System.out.print(i+" ");
						}
				}else {
					for(int i = num1; i<=num2;i++) {
						System.out.print(i+" ");
					}
				}
				break;
			}else {
				System.out.println("1이상의 숫자를 입력하세요");
		}
	}
			
	}
	public void method8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("===="+num+"단====");
		
		for(int i = 1; i<=9;i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
	}
	
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<=9 && num>=1) {
			for(int j = num; j <=9 ; j++) {
				System.out.println("===="+j+"단====");
				for(int i = 1 ; i <=9 ; i++) {
					System.out.println(j+"*"+i+"="+(j*i));
				}
			}
		} else {
			System.out.println("9이하의 숫자를 입력하세요");
		}
	}
	
	public void method10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
					System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<=9 && num>=1) {
			for(int j = num; j <=9 ; j++) {
				System.out.println("===="+j+"단====");
				for(int i = 1 ; i <=9 ; i++) {
					System.out.println(j+"*"+i+"="+(j*i));
				}
			}
			break;
		} else {
			System.out.println("9이하의 숫자를 입력하세요");
		}
	}

		
	}
	public void method10_1() {
		Scanner sc = new Scanner(System.in);
		
		int num = 10;
		while(num > 9) {			
			System.out.print("숫자 : ");
			num = sc.nextInt();
			
			if(num <= 9) {
				for(int i = num; i < 10; i++) {			
					System.out.printf("===== %d단 =====\n", i);
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					System.out.println();
				}	
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
		
}	

		
		
		
	



