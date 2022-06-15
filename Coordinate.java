import java.util.Scanner;
import java.lang.Math;

class TwoDPoint{
	static int ctr=1;
	static Scanner sc = new Scanner(System.in);
	 static void input(ThreeDPoint P){
		 System.out.println("Enter the x and y coordinate for point "+ctr+":");
		 ctr++;
		 P.x=sc.nextInt();
		 P.y=sc.nextInt();
	}	 
	static void Display(ThreeDPoint P) {
		System.out.println("Coordinates are: x="+P.x+" y="+P.y);
	}	
	static double Distance(ThreeDPoint P, ThreeDPoint Q) {
		double distance = 0.00;
		int diff1= P.x - Q.x, diff2= P.y - Q.y, diff3= P.z - Q.z;
		distance = Math.sqrt(Math.pow(diff1,2) + Math.pow(diff2,2) + Math.pow(diff3,2));
		return distance;
	}	
	static Boolean Collinear(ThreeDPoint P, ThreeDPoint Q, ThreeDPoint R) {
		double slope1,slope2;
		slope1 = (P.x - Q.x) / (P.y - Q.y);
		slope2 = (R.x - P.x) / (R.y - P.y);
		if(slope1==slope2)
			return true;
		return false;
	}	
}

class ThreeDPoint extends TwoDPoint{
	int x=0,y=0,z=0;
	static int ctr=1;
	static Scanner sc2 = new Scanner(System.in);
	static void input(ThreeDPoint P) {
		System.out.println("Enter the x,y,and z coordinates of point "+ctr+":");
		ctr++;
		P.x=sc2.nextInt();
		P.y=sc2.nextInt();
		P.z=sc2.nextInt();
	}	
	static void display(ThreeDPoint P) {
		System.out.println("Coordinates are: x="+P.x+" y="+P.y+" z="+P.z);
	}		
	static Boolean Collinear(ThreeDPoint P,ThreeDPoint Q,ThreeDPoint R) {
		// To check Collinearity between points in 3-D plane we check their direction cosines.		
		float co1 = (Q.x-P.x )/ (R.x - P.x);
		float co2 = (Q.y-P.y )/ (R.y - P.y);
		float co3 = (Q.z-P.z )/ (R.z - P.z);
		if(co1 == co2 && co2 == co3)
			return true;
		return false;
	}
}

public class Coordinate {
	public static void main(String [] args) {	
		
	ThreeDPoint P =new ThreeDPoint();
	ThreeDPoint Q =new ThreeDPoint();
	ThreeDPoint R =new ThreeDPoint();	
	TwoDPoint.input(P);
	TwoDPoint.input(Q);
	TwoDPoint.input(R);	
	TwoDPoint.Display(P);
	TwoDPoint.Display(Q);
	TwoDPoint.Display(R);	
	double dis = TwoDPoint.Distance(P, Q);
	System.out.println("Distace b/w point 1 and 2= "+dis);
	System.out.println("Collinear= "+ TwoDPoint.Collinear(P, Q, R));	
	/*ThreeDPoint A = new ThreeDPoint();
	ThreeDPoint B = new ThreeDPoint();
	ThreeDPoint C = new ThreeDPoint();*/	
	ThreeDPoint.input(P);
	ThreeDPoint.input(Q);
	ThreeDPoint.input(R);	
	ThreeDPoint.display(P);
	ThreeDPoint.display(Q);
	ThreeDPoint.display(R);
	System.out.println("Distance between 3-D point 1 and 2 is= "+TwoDPoint.Distance(P,Q));
	System.out.println("Collinear= "+ThreeDPoint.Collinear(P,Q,R));
	}
}