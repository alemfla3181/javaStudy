package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		while( true ) {			
			/* 게임 작성 */
			System.out.println( "수를 결정하였습니다. 맞추어 보세요" );
			System.out.println( "1-100" );
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			
			int min =1, max =100;
			for(int i=1;i<=100;i++ ) {
				System.out.print(i+">>");
				int num = scanner.nextInt();				
				if(min>num || num>max) {
					System.out.println(min+"-"+max+"범위");
					i--;
					continue;
				}
				if(num == correctNumber) {
					System.out.println(correctNumber);
					System.out.println("찾았습니다.");
					break;
				}else {					
					if(num < correctNumber) {
						min = num;
						System.out.println("더 높게");
					}else {
						max = num;
						System.out.println("더 낮게");
					}
				}
				System.out.println(min+"-"+max);
			}					
			
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}		
		scanner.close();
	}

}