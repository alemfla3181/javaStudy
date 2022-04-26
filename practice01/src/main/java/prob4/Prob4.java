package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();		
		char[] arr = text.toCharArray();
		
		String result = "";
		for(int i=0; i<arr.length; i++) {
			result = result + arr[i];
			System.out.println(result);
		}
		
		scanner.close();
	}

}