package com.kh.example.animal.model.vo;

public class Dog {
	private String name;
	private int age;
	private double weight;
	private double height;
	private String hair;
	
	
	public Dog() {}
	
	public Dog(String name, int age, double weight, double height, String hair) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.hair = hair;			
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
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	
	public String inform() {
		return name + " " + age + " " + weight + " " + height + " " + hair;
	}
	

}
