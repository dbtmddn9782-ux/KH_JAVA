package co.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		// 얕은 복사
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("-----------------------------");
		originArr[0] = 99;
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
	}
	public void method2() {
		
		//for문을 이용한 깊은 복사
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[originArr.length];
		
		
		
		for(int i = 0; i<originArr.length; i++) {
			copyArr[i]=originArr[i];
		}
		
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
		originArr[0] = 99;
		
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
	}
	public void method3() {
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("-----------------------------");
		
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src          원본배열
		//srcPos       원본배열에서 복사를 시작할 위치
		//dest         복사배열
		//destPos복사   배열에서 붙여넣기를 시작할 위치
		//length       복사길이
		
		
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
	}
	public void method4() {
		// copyOf()를 이용한 깊은 복사
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
			
		System.out.println("originArr : " + originArr);
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
