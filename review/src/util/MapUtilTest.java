package util;

public class MapUtilTest {

	public static void main(String[] args) {
		MapUtil map = new MapUtil();
		map.addEmp(new Emp(1,"홍길동","인사"));
		map.addEmp(new Emp(2,"김기자","기획"));
		map.addEmp(new Emp(3,"김초밥","개발"));
		
		//2번 사번의 이름을 출력
		System.out.println(map.getName(2));
		
		//2번 사번 삭제
		map.delEmp(2);
		//전체출력
		System.out.println(map.getMap());
	}

}
