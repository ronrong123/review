package util;

import java.util.Date;

public class WrapperTest {

	public static void main(String[] args) {
		int retult = StringUtil.toInt("1234");
		System.out.println(retult);
		
		String s = StringUtil.toStr(1234);
		System.out.println(s);
		
		//파일명에서 확장자만 추출
		String ext = StringUtil.getExt("b.s.a.hwp"); //.뒤에거는 자르기
		System.out.println(ext);
		
		Date result = DateUtil.toDate("2021-02-10");
		System.out.println(result);

		String str = DateUtil.toStr(new Date());
		System.out.println(str);
		
		String str2 = DateUtil.toStr(new Date(),"yyyy");
		System.out.println(str2);
	}

}
