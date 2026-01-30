package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	public void method() {
	    //키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in); 
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
        //String result;
        //if(a%2==0) {
        //   result = "짝수입니다";
        //}
        //else {
        //   result = "홀수입니다";
        //}
        //System.out.println(result);
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	
	public void method2() {
		//키보드로 입력한 숫자가 양수인지 음수인지 0인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다");
		}
		else if (num > 0) {
			System.out.println("양수입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
//      String result;
//      if(num>0) {
//         result = "양수";
//      }
//      else if(num==0) {
//         result = "0";
//      }
//      else if(num<0){
//         result = "음수");
//      }
//      System.out.println(num + "숫자는" + result +"입니다");
//		result는 공간만 만든것이고 else if(num<0) 이 조건이 false일 수도 있기에 result에 빨간줄이 뜬다.
//		구조적으로 어디에 있을지 모른다.
		
	}
	
	public void method3() {
		//키보드로 성별(M/F)을 입력 받아 남자면 "XY"입니다, 여자면 "XX"입니다. 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요 : ");
		String str = sc.nextLine();
		char gender = str.charAt(0);
		
		String dna;
		/*if(gender == 'M' || gender == 'm' ) {
			dna="XY입니다.";
		}
		else if(gender == 'F' || gender == 'f') {
			dna="XX입니다.";
		}
		else {
			dna="없는 성별입니다.";
		}
		System.out.println(dna);*/
		switch(gender) {
		case 'M', 'm':
			dna="XY입니다.";
			break;
		case 'F', 'f':
			dna="XX입니다.";
			break;
		default:
			dna = "잘못된 입력입니다";
		}
		System.out.println(dna);
	}
	public void method4() {
		//사용자에게 나이를 입력받아 성인인지 청소년인지 어린이인지 출력
	    //성인 : 19세 초과 / 청소년 : 13세 초과 19세이하 / 어린이 : 13세 이하
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String sta;
		if(age > 19) {
			sta = "성인";
		}
	  //else if(age>13) 이렇게 적어도 무관. 이미 위에서 19세 이상은 걸러졌기 때문에
		else if(age>13 && age<=19) {
			sta = "청소년";
		}
		else {
			sta = "어린이";
		}
		System.out.println(sta +"입니다.");
	}
	
	public void method5(){
		//사용자에게 이름을 받아 본인인지 확인
	    //자신의 이름과 같으면 "본인입니다", 자신의 이름과 다르면 "본인이 아닙니다"
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		//문자열의 비교는 == 으로 불가능
//      if(name=="정현종") { //문자열끼리의 비교는 ==으로 불가하다.
//      System.out.println("본인입니다");
//  			 }
//   		else {
//      System.out.println("본인이 아닙니다");
//	}
		if(name.equals("유승우")) {
			System.out.println("본인입니다.");
			}else {
				System.out.println("본인이 아닙니다.");
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
