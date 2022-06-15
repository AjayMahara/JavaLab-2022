import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte age;
		System.out.print("Enter the age : ");
		age = sc.nextByte();
		if(age<18)
			System.out.println("Not Eligible to vote !!");
		else if(age <=0 && age >=150)
			System.out.println("Invalid Age !!");
		else
			System.out.println("Eligible to vote !!");
		sc.close();
	}
}
