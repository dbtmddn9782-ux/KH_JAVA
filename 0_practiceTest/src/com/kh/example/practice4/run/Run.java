package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		Book b2 = new Book("자바", "한빛", "유승우");
		b2.inform();
		Book b3 = new Book("자바", "한빛", "유승우", 50000, 25.0);
		b3.inform();
	}

}
