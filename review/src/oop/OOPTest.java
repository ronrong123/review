package oop;

import java.util.ArrayList;

/**
 * 다형성
 * 1. 부모클래스 타입의 참조변수가 자식 객체를 참조할 수 있다.
 * 2. 메서드를 불렀을때 실행되는 메서드는 참조하는 객체의 메서드를 호출 (실행결과 다를 수 있다)
 */
public class OOPTest {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		//다형성을 하는 이유는 부모가 자식을 참조할수있고 실행할때 참조하는 대상의 메서드를 모두 호출 가능하기떄문에
		//list도 부모타입으로 담으면 안에있는 자식을 모두 담을수있어서 prof, emp를 쓰지않고 member로 씀
		Member member;
		
		member = new Prof();
		//부모클래스는 자식객체를 참조할수있음
		member.setName("김유신");
		member.print();
		member.sal();
		list.add(member);
		//최고 조상은 Object
		
		member = new Emp();
		member.setName("홍길동");
		member.print();
		member.sal();
		list.add(member);
		
		long a = 10;
		int b = (int)a;
		//long값은 int에 담을수없어서 형변환
		for(Member m: list) {
			m.sal();
			m.print();
			if(m instanceof Emp) {
				//참조대상이 emp라면
				((Emp)m).meth(); //다운캐스팅(형변환)
				//객체간의 형변환은 부모 자식간에만 가능
			}
		}
	}

}
