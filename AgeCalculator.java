import java.util.Scanner;

class DateDifference{
	int dob,mob,yob,nd,nm,ny;
	int arr[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	DateDifference(int dd, int mm, int yy){
		dob=dd;
		mob=mm;
		yob=yy;
	}
	void Difference(int cd,int cm, int cy) {
		if(cd<dob) {
			cd--;
			cd=arr[cm];
		}
		if(cm<mob) 
			cy--;
		nd=nd+cd-dob;
		nm=12+cm-mob;
		ny=cy-yob;
		if(nm>12)
			nm=nm-12;
		System.out.println(ny+" years "+nm+" months "+nd+" days");
		
	}
}

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d,m,y;
		System.out.println("Enter the date of birth in dd mm yyyy :");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		DateDifference DD= new DateDifference(d,m,y);
		System.out.println("Enter the current date in dd mm yyyy :");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		DD.Difference(d, m, y);
		sc.close();
	}
}
