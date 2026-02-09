package com.kh.example.chap02_tryCatch.controller;

import java.io.EOFException;
import java.io.IOException;

public class TryCatchController {
	public void method1() throws IOException {
		// method1()에서 위임 받은 예외 직접처리
		// 단, catch절 3개 작성 : IOException, RuntimeException, EOFException, Exception, NullPointerException
		method2();
		try {
			method3();
		} catch(EOFException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();	
		} catch(NullPointerException e) {
			e.printStackTrace();
		} catch(RuntimeException e){
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("method2 종료");
		
	}
	public void method3() throws Exception{
		
	}
	
	public void method2() throws IOException{
		throw new IOException("여기도 메세지 전달 가능");
	}

}
