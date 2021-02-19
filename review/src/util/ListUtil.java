package util;

import java.util.ArrayList;

public class ListUtil {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();		
		
		//추가:무조건 제일 끝에 
		list.add("딸기");				
		//삽입:중간에도 가능
		list.add(0, "키위");
		//수정
		list.set(1, "포도");		
		//삭제
		list.remove(0);		
		//단건조회
		list.get(0);		
		//전체조회
		System.out.println(list);
	}
}
