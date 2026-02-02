package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		u1.inform();
		u1.inputValue("user01");
		u1.inputValue2("홍길동");
		u1.inputValue3(28);
		u1.inputValue4(19.99);
		u1.inform();
		u1.inputValue5("user02", "이순신", 30, 98.45);
		u1.inform();
	}
}
