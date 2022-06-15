import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str,rev_str="";
		System.out.print("Enter a string: ");
		str=sc.nextLine();
		short len = (short) str.length();
		for(int i = len-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev_str += ch;
		}
		System.out.println("Reverse string is "+rev_str);
		sc.close();
	}

}
