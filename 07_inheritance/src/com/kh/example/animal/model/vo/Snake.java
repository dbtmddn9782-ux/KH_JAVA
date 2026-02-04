package com.kh.example.animal.model.vo;

public class Snake {
	private String name;
	private int age;
	private double weight;
	private String pattern;
	
	public Snake() {}
	
	public Snake(String name, int age, double weight, String pattern) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.pattern = pattern;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAGe(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public String inform() {
		return name + " " + age + " " + weight + " " + pattern;
	}

}
