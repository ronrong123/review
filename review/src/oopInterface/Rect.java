package oopInterface;


public class Rect
extends Shape //속성, 메서드
implements Drawable, Movable // 추상메서드(동작)
{	
//extends는 클래스를 상속받는것 implements는 부모를(interface) 상속
//interface는 모두 추상메서드라 override를 꼭 해야함 	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
	}
}
