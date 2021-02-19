package oop;

public abstract class Member {
	//캡슐화
	private String name;
	String id;
	
	//getter : read
	//setter : write
	
	public Member() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal();
	//abstract: 하나라도 추상메서드가 포함되어있으면 추상클래스

	public void print() {
		System.out.println(name);
	}

}