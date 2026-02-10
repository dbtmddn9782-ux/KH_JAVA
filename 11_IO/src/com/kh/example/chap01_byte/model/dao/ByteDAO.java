package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	   public void fileOpen() {
	      //파일로부터 byte단위로 데이터를 읽어올 수 있는 스트림
	      FileInputStream fis = null;
		   try {
	         fis = new FileInputStream("a_byte.txt");
	         
	         //1. byte배열에 저장한 후 출력
	         
	         //1-1. byte배열 직접 생성
	         
//	         File f = new File("a_byte.txt");
//	         long size = f.length();
//	         byte[] bArr = new byte[(int)size];
//	         
//	         //byte[] bArr = new byte[(int)new File("a_byte.txt").length()];
//	         fis.read(bArr);
//	         
//	         for(int i = 0; i<bArr.length; i++) {
//	            System.out.print(bArr[i] + " ");
//	         }
	      
//	         1-2.byte배열 반환받기
	         
//	         byte[] bArr = fis.readAllBytes();
//	         for(int i = 0; i<bArr.length; i++) {
//	            System.out.print((char)bArr[i] + " ");
//	         }
	         
	         //2. byte배열을 사용하지 않고 바로 하나씩 읽어 출력
//	         while(fis.read() != -1) {
//	        	 	System.out.print((char)fis.read()+ " ");
//	         }
	         // abcdefgcde에서 a가 while문으로 들어가고 -1이 아니니 true여서 사용되서 버려지고
	         // 다음 read인 byte인 b를 불러왔다
	         
	         
	         
//	         int value;
//	         while((value=fis.read()) != -1) {
//	        	 	System.out.print((char)value+ " ");
//	         }
	         while(true){
	        	 	int value = fis.read();
	        	 	if(value == -1) {
	        	 		break;
	        	 	}
	        	 	System.out.print((char)value+" ");
	         }
	         
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	    	  	try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	      }
	   }
	   
	   public void fileOpen2() {
		   try (FileInputStream fis = new FileInputStream("a_byte.txt");){
			int value;
			while((value=fis.read()) != -1) {
				System.out.println(value);
			}
		   } catch (FileNotFoundException e) {
			e.printStackTrace();
		   } catch (IOException e) {
			e.printStackTrace();
		}
	   }
	   
	   public void fileSave2() {
		   
		   try (FileOutputStream fos = new FileOutputStream("a_byte.txt");){
			fos.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		}
	   }
	   
	   public void fileSave() {
	      FileOutputStream fos = null;
	      //파일에 byte단위로 데이터를 작성하는 스트림
	      try {
	         //FileOutputStream fos = new FileOutputStream("a_byte.txt",true); //이어붙이기
	         fos = new FileOutputStream("a_byte.txt"); //덮어쓰기
	         
	         fos.write(97);
	         
	         byte[] bArr = {98,99,100,101,102,103};
	         fos.write(bArr);
	         
	         fos.write(bArr,1,3);
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally{
	         try {
	            fos.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	   
	}
