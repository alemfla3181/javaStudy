package prob04;

public class StringUtil {
	public static String concatenate(String[] str) {
		String Str = "";
		for(int i=0; i<str.length; i++) {
			Str += str[i];
		}
		return Str;
	}
}
