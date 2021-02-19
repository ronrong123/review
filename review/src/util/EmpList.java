package util;

import java.util.ArrayList;

public class EmpList {
	ArrayList<Emp> list;
	public EmpList() {
		list = new ArrayList<>();
	}
	//추가
	public void addEmp(Emp emp) {
		//to do
		list.add(emp);
	}
	//해당사원 이름조회
	public String getName(int index) {
		String name="";
		//to do
		name = list.get(index).name;
		return name;
	}	
	//삭제
	public void delEmp(int index) {
		//to do
		list.remove(index);
	}	
	//전체 이름 조회
	public void getNames() {
		for(Emp e:list) {
			System.out.println(e.name);
		}
	}	
	
	//전체 이름만 리턴
	public String getNameStr() {
		String names="";
		for(Emp e:list) {
			names += e.name;
		}
		return names;
	}
	//list 조회
	public ArrayList<Emp> getList(){
		return list;
	}
}


