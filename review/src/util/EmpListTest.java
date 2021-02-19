package util;

public class EmpListTest {
	public static void main(String[] args) {
		EmpList emplist = new EmpList();
		emplist.addEmp(new Emp(1,"홍길동","인사"));
		emplist.addEmp(new Emp(2,"김기자","기획"));
		emplist.addEmp(new Emp(3,"김초밥","개발"));
		
		//첫번째 사원의 이름은?		
		System.out.println(emplist.getName(0));
		
		//첫번째 사원 삭제
		emplist.delEmp(0);
		//전체 리스트 출력
		System.out.println(emplist.getList());
		//
		emplist.getNames();
		System.out.println("과제:" + emplist.getNameStr());
	}
}
