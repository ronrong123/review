package oop;

//교수
public class Prof extends Member {
	
	String dept;

	@Override
	//상속받은 메서드를 재정의
	public void sal() {
		System.out.println("교수 급여");
	}

	@Override
	//Member에 있는 print를 고쳐씀
	public void print() {
		super.print(); //부모에있는 print를 부르는것
		System.out.println("교수");
	}
}
