package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kh.example.list.model.compare.ListComparator;
import com.kh.example.set.model.vo.Fruit;

public class SetController {
	public void doSet() {
		//Set<String> set = new HashSet<String>(); 다형성 적용
		HashSet<String> set = new HashSet<String>();
		set.add("사과");
		set.add("귤");
		set.add("파인애플");
		set.add("바나나");
		set.add("자두");
		System.out.println("set : "+set);//순서 유지하지 않고 출력됨
		
		
		set.add("귤");
		System.out.println("set : "+set);//위에 귤이 있어서 중복을 허가하지 않음
		
		HashSet<Fruit> fruitSet = new HashSet<Fruit>();
		fruitSet.add(new Fruit("사과", 1000));
		fruitSet.add(new Fruit("감", 2000));
		fruitSet.add(new Fruit("배", 3000));
		System.out.println(fruitSet);
		
		fruitSet.add(new Fruit("감", 2000));//Fruit class에 equls와 hashcode 오버라이딩 해서 중복 추가 안됨
		System.out.println(fruitSet);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();//순서유지 가능한 Set
		set2.add("딸기");
		set2.add("복숭아");
		set2.add("체리");
		set2.add("오렌지");
		System.out.println("set2 : "+set2);
		
		set2.add("망고");
		set2.add("수박");
		set2.add("메론");
		set2.add("딸기");
		System.out.println("set2 : "+set2);// LinkedHashSet은 순서 유지해주고 중복저장은 하지 않음
		
		//TreeSet은 자동 정렬해준다.
		TreeSet<String> set3 = new TreeSet<String>(set2);
		System.out.println("set3 : "+set3);
		
		TreeSet<String> set4 = new TreeSet<String>(new ListComparator());//정렬규정(내림차순)만 넣고 데이터는 안넣음
		set4.addAll(set2);//set2의 내용을 set4에 한번에 넣겠다.
		System.out.println("set4 : "+set4);
		
		TreeSet<Fruit> fruitSet2 = new TreeSet<Fruit>(fruitSet);
		System.out.println(fruitSet2);// TreeSet은 정렬이되는데 Furit에 정렬 기준을 안잠아줘서 오류가 뜬다
		
		
		System.out.println("=======================================");
		System.out.println("Set안에 element에 접근하기");
		//향상된 for문(= for each문)
//		int[] arr1 = new int[3];
//		for(int a : arr1) {
//			System.out.println(a);      arr1에서 처음꺼를 꺼내 임시 변수인 a에 저장을 하고 그거를 print함
//		}
		
		// Set안에 element에 접근
		// 1. 향상된 for문 이용하기
		
		System.out.println("1. 향상된 for문 이용하기");
		for (String f : set4) {
			System.out.println(f);
		}
		
		// 2. Set을 List로 만들기
		
		System.out.println("2. Set을 List로 만들기");
		ArrayList<String> list = new ArrayList<String>(set4);
		for(int i =0 ; i < set4.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("3. iteraotr 이용하기");
		Iterator<String> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		
		//iterator의 특징은 단밯향이다. 

		//ListIterator은 양방향이다. List계열에만 존재하고 Set계열에는 존재하지 않는다.
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println("lit next : "+ lit.next());
		}
		
		while(lit.hasPrevious()) {
			System.out.println("lit previous : "+ lit.previous());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("fruitSet의 element 접근하기");
		System.out.println("1. 향상된 for문 이용하기");
		
		for(Fruit a : fruitSet) {
			System.out.println(a);
			
		}
		System.out.println();
		System.out.println("2. List화 하기");
		
		ArrayList<Fruit> fruitSetList = new ArrayList<Fruit>(fruitSet);
		for(int i = 0 ; i<fruitSetList.size(); i++) {
			System.out.println(fruitSetList.get(i));
		}
		System.out.println();
		System.out.println("3. iterator 이용하기");
		
		Iterator<Fruit> it2 = fruitSet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
