package oopInterface;

//상수와 추상메서드만 가지는게 interface임
//개발표준 : 메서드(기능)
public interface Drawable {
	//interface는 모두 추상임 앞에 생략이되어있음
	String color = "black";
	void draw();
}