package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i=1; i<=99999; i++) {
			String num = Integer.toString(i);
			long cnt = num.chars().filter(ch -> ch == '3' || ch=='6' || ch== '9').count();
			if(cnt>0) {
				System.out.print(i+" ");
				for(int j=0; j<cnt; j++)
					System.out.print("짝");
				System.out.println();
			}
		}		
	}
}