package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println("Run u1 : " + u1);
		u1.inform();
		u1.inputValue("user01");
		u1.inputValue2("홍길동");
		u1.inputValue(28);
		u1.inputValue(19.99);
	// 나중에 다른것만을 수정하기 위해 다른 메소드도 필요하다
		u1.inputValue("user02", "이순신", 30, 98.45);
		u1.inform();
		
		// 매개변수는 타입 즉 자료형만을 확인한다.
		User u2 = new User("user03", "김철수", 35, 52.2);
		u2.inform();
		u2.inputValue(36);
		u2.inform();
		
		
	}
}
