package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		
		System.out.println("str1의 hasCode : "+ str1.hashCode());
		System.out.println("str2의 hasCode : "+ str2.hashCode());
		System.out.println("str3의 hasCode : "+ str3.hashCode());
		
		System.out.println("str1 의 실주소값 : "+ System.identityHashCode(str1));
		System.out.println("str2 의 실주소값 : "+ System.identityHashCode(str2));
		System.out.println("str3 의 실주소값 : "+ System.identityHashCode(str3));
		
		str2 += "funny";
		System.out.println("str1 :" +str1);
		System.out.println("str2 :" +str2);
		System.out.println("str3 :" +str3);

		System.out.println("str1의 hasCode : "+ str1.hashCode());
		System.out.println("str2의 hasCode : "+ str2.hashCode());
		System.out.println("str3의 hasCode : "+ str3.hashCode());
		
		System.out.println("str1 의 실주소값 : "+ System.identityHashCode(str1));
		System.out.println("str2 의 실주소값 : "+ System.identityHashCode(str2));
		System.out.println("str3 의 실주소값 : "+ System.identityHashCode(str3));
	}
	
	public void method2() {
		StringBuilder builder1 = new StringBuilder();
		System.out.println("초기 builder1의 수용량 : " + builder1.capacity());
		System.out.println("builder1에 들어있는 실제 값의 길이 : " + builder1.length());
		
		System.out.println();
		
		StringBuilder builder2 = new StringBuilder(100);
		System.out.println("초기 builder2의 수용량 : " + builder2.capacity());
		System.out.println("builder2에 들어있는 실제 값의 길이 : " + builder2.length());
		
		System.out.println();
		
		StringBuilder builder3 = new StringBuilder("abc");
		System.out.println("초기 builder3의 수용량 : " + builder3.capacity());
		System.out.println("builder3에 들어있는 실제 값의 길이 : " + builder3.length());
		
		
		System.out.println();
		System.out.println("builder3 의 실주소값 : "+ System.identityHashCode(builder3));
		
//		builder3.append("abc");
//		System.out.println("abc 추가 후의 builder3 : "+ builder3);
//		System.out.println("abc 추가 후의 builder3 용량 : "+ builder3.capacity());
//		System.out.println("abc 추가 후의 builder3 길이 : "+ builder3.length());
//		
//		builder3.append("def");
//		System.out.println("def 추가 후의 builder3 : "+ builder3);
//		System.out.println("def 추가 후의 builder3 용량 : "+ builder3.capacity());
//		System.out.println("def 추가 후의 builder3 길이 : "+ builder3.length());
		
		builder3.append("abc").append("def"); //메소드 체이닝
		System.out.println("def 추가 후의 builder3 : "+ builder3);
		System.out.println("def 추가 후의 builder3 용량 : "+ builder3.capacity());
		System.out.println("def 추가 후의 builder3 길이 : "+ builder3.length());
		System.out.println("builder 의 실주소값 : "+ System.identityHashCode(builder3));
		
		System.out.println();
		
		//insert 삽입하는 메소드  insert(offset, string) offest번째에 string 넣기
		builder3.insert(2, "zzz");
		System.out.println(builder3);
		
		//delete delete(start, end) strat이상에서 end미만으로 삭제기능
		builder3.delete(2, 5);
		System.out.println(builder3);
		
		//reverse 순서를 바꾸어 주는 역할
		builder3.reverse();
		System.out.println(builder3);
	}
	public void method3() {
		String str = "Hello World";
		
		// charAt 반환 char 특징 char를 특정인덱스로 반환
		char ch = str.charAt(2);
		System.out.println(ch);
		
		// concat 반환 String 문자열을 뒤에 이어 붙임
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		str += "!!!";
		System.out.println(str);
		
		// equals 반환 boolean 문자열 내용 비교
		System.out.println(concatStr.equals(str));
		
		// substirng String 부분 열 반환
		System.out.println(str.substring(6));
		System.out.println(str.substring(0,4));
		
		// replace String
		System.out.println(str.replace('l', 'e'));
		
		// toUpperCase/toLowerCase String
		String up = str.toUpperCase();
		String lower = str.toLowerCase();
		System.out.println(up + "/" + lower);
		
		System.out.println(up.equals(lower));
		// equalsIgnoreCase boolean
		System.out.println(up.equalsIgnoreCase(lower));
		
		// trim Stirng 문자열 앞뒤 공백 제거
		String str2 = "    Java";
		String str3 = "Java    ";
		String str4 = "   Java   ";
		System.out.println(str2.trim());
		System.out.println(str3.trim());
		System.out.println(str4.trim());
		
		// split String[] 문자열을 구분자 기준으로 나눔
		String splitStr = "Java, Orcale, JDBC, Front, Server, Framework";
		String[] arr = splitStr.split(", ");
		System.out.println(arr.length);
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		
	}
	
		//StringTokenizer
		StringTokenizer st = new StringTokenizer(splitStr, ", ");
		System.out.println("분리된 문자열 개수 : " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("분리된 문자열 개수 : " + st.countTokens());
		
		String splitStr2 = "Apple,Banana=Cream*Dessert#Egg Fruit";
		String[] arr2 = splitStr2.split(",-*#");
		System.out.println("arr2.length : "+ arr2.length);
		for(int i = 0;i < arr2.length;i++) {
			System.out.println(arr[i]);
		}
		
		StringTokenizer st2 = new StringTokenizer(splitStr2, ",-*#");
		System.out.println("분리된 문자열 개수 :" + st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
		
		
		
		
		
		
		

	}
}
