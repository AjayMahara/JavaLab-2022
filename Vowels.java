import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		short len = (short)str.length();
		for(int i=0;i<len;i++) {
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				System.out.print(str.charAt(i)+" ");
		}
		sc.close();
	}
}
