package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable1;
import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		KindsOfVariable1 kov1 = new KindsOfVariable1();
		kov1.method1(100);
		
		KindsOfVariable2 kov2 = new KindsOfVariable2();
		int a1 = kov2.staticNum;
		int a2 = KindsOfVariable2.staticNum;
		
		kov2.test();
		kov2.test();
		kov2.test();
		kov2.test();
		
		KindsOfVariable2 kov22 = new KindsOfVariable2();
		kov22.test();
		kov22.test();
		
		kov2.test();
		
		
		
		
		
		
	}

}
