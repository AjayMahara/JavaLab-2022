import java.lang.Math;

public class Armstrong {
	public static void main(String[] args) {
		int n=1;
		for(int i=0; ;i++)	// Infinite loop that will break when explicit condition is met 
		{
			if(arm_check(i)==true) {
				System.out.println(i);
				n++;
			}
			if(n==100)
				break;
		}
	}
	public static boolean arm_check(int n) {
		int pow=(int)Math.log10(n)+1;
		int sum=0,x=n;
		while(n>0) {
			int rem=n%10;
			sum=sum+ (int)Math.pow(rem, pow);
			n=n/10;
		}
		return x==sum;
	}
}
