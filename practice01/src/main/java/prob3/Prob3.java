package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int num, odd =0, even =0; 
		System.out.print("숫자를 입력하시오: ");
		num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i%2==0)
				odd += i;
			else
				even += i;
		}
		System.out.println("");
		int a = (num%2==0) ? odd : even;
		System.out.print("결과 값 :" +a);
		
		
		scanner.close();
	}
}