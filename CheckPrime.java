import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short num,flag=0;
		System.out.println("Enter a number: ");
		num = sc.nextShort();
		short k = (short)Math.sqrt(num);
		System.out.println("Sqrt = "+k);
		for(int i=2;i<=k;i++) {
			if(num % i ==0) {
				flag = 1;
				break;
			}
		}
		if(flag==1)
			System.out.println(num+" is not a prime number.");
		else
			System.out.println(num+" is a prime number.");
		sc.close();
	}
}
