package com.kh.example.chap01_throw.run;

import java.io.IOException;

import com.kh.example.chap02_tryCatch.controller.TryCatchController;

public class Run {
	public static void main(String[] args) throws IOException {
//		ThrowsController tc = new ThrowsController();
//		
//		tc.method1();
//		
//		System.out.println("정상적으로 종료됨...");
		
		TryCatchController tcc = new TryCatchController();
		tcc.method1();
	}

}
//1 호출됨  