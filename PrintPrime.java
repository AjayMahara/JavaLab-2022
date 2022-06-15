import java.util.Scanner;

public class PrintPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte flag=0;
		System.out.println("Prime numbers are:");
		for(int i=2;i<=100;i++) {
			flag=0;
			int k= (int)Math.sqrt(i);
			for(int j=2;j<k;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag == 0)
				System.out.print(i+" ");
		}
		sc.close();
	}
}
