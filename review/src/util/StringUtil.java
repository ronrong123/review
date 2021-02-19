package util;

public class StringUtil {
	//1. String -> int
	public static int toInt(String s) {//Integer -> int
		if(s == null) 
			return -1;		
		return Integer.parseInt(s);
	}
	//2. int -> String
	public static String toStr(int s) {
		return Integer.toString(s);
	}
	//3. String -> 확장자 : LastIndexOf, substr
	public static String getExt(String s) {
		String result = "";
		int last = s.lastIndexOf('.');
		result = s.substring(last);
		return result;
	}	
	//4. String -> path, 파일명
	/**
	 * 경로명에서 확장자를 추출
	 * @param pathname
	 * 	파일명
	 * @return 확장자
	 * 
	 */
	public static String getFilename(String s) {
		String result = "";
		//to do
		return result;
	}
	/**
	 *  경로명에서 경로추출
	 *  @ param s  경로명 "c:/img/item/p01.jpg
	 *  @return 경로 c:/img/item
	 */
	public static String getPath(String s) {
		String result = "";
		//to do
		return result;
	}
}
