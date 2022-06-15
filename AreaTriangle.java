import java.lang.Math;
import java.util.Scanner;

class Triangle{
	void CalArea(int b, int h) {
		float area  = (b*h)/2;
		System.out.println("Area = " + area);
	}
	void CalArea(float b, float h) {
		float area  = (b*h)/2;
		System.out.println("Area = " + area);
	}
	void CalArea(int a, int b,int c) {
		float s=(float) ((a+b+c)/2.0);
		float area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area = " + area);
	}
	void CalArea(float a, float b,float c) {
		float s=(a+b+c)/2;
		float area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area = " + area);
	}
}

public class AreaTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Select an option:");
		System.out.println("1. Base and height are in float.");
		System.out.println("2. Base and height are in int.");
		choice=sc.nextInt();
		Triangle T1=new Triangle();
		float base,height;
		base=sc.nextFloat();
		height=sc.nextFloat();
		if(choice == 1)
			T1.CalArea(base,height);
		else
			T1.CalArea((int) base, (int) height);
		System.out.println("Select an option:");
		System.out.println("1. All three sides are in float.");
		System.out.println("2. All three sides are in int.");
		choice=sc.nextInt();
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(choice == 1)
			T1.CalArea(a,b,c);
		else
			T1.CalArea((int) a, (int) b,(int) c);
		sc.close();
	}
}
