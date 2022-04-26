package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}

		// 공백 문자 바꾸기
		String str = new String(c);
		str = str.replaceAll(" ", ",");
		

		// 수정된 배열 원소 출력
		System.out.println();
		System.out.println(str);
	}

}