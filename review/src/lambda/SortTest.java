package lambda;

import java.util.ArrayList;
import java.util.Collections;

import util.Emp;


public class SortTest {

	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1,"홍길동","인사"));
		emplist.add(new Emp(2,"김초밥","회계"));
		emplist.add(new Emp(3,"김기자","기획"));
		
		Collections.sort(emplist,(Emp o1, Emp o2) -> 
				o1.getDept().compareTo(o2.getDept())
			);
		//override가 하나여야 람다식을 할수있고 넘길 값과 바디만 있으면됨
		System.out.println(emplist);
		
	}
}
/*
class EmpCompare implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getDept().compareTo(o2.getDept());
	}
}
*/