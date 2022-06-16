package test;
import java.util.*;
import java.lang.*;

class TwoDpoint 
{
	 public int x,y;
	public static Scanner s = new Scanner(System.in);
   static void input(ThreeDpoint l)
   {
	   System.out.println("ENTER THE CO-ORDINATES OF POINT FOR 2D:");
	   l.x = s.nextInt();
	   l.y = s.nextInt();
	   
   }
    
   static double distance(TwoDpoint P, TwoDpoint Q)
   {
	  double res = Math.sqrt((Q.x - P.x) * (Q.x - P.x) + (Q.y - P.y) * (Q.y - P.y)); 
	  return res;
	   
   }
   static int collinear(TwoDpoint P, TwoDpoint Q,TwoDpoint R)
   {
	   double PQ = Math.sqrt(((Q.x - P.x) * (Q.x - P.x)) + ((Q.y - P.y) * (Q.y - P.y))); 

	   double QR = Math.sqrt(((R.x - Q.x) * (R.x - Q.x)) + ((R.y - Q.y) * (R.y - Q.y))); 

	   double PR = Math.sqrt(((R.x - P.x) * (R.x - P.x)) + ((R.y - P.y) * (R.y - P.y)));
	   
	   double c;
	   c = PQ + QR;
	   if(PR == c)
	   {
		   return 1;
	   }
	   else
	   {
		   return -1;
	   }
	   
   }
   public void display(TwoDpoint P, TwoDpoint Q,TwoDpoint R)
   {
	   System.out.println("THE CO-ORDINATES OF POINT 1:"+"("+P.x+","+P.y+")");
	   System.out.println("THE CO-ORDINATES OF POINT 2:"+"("+Q.x+","+Q.y+")");
	   System.out.println("THE CO-ORDINATES OF POINT 3:"+"("+R.x+","+R.y+")");
 	   
       	   
   }
   
	
}
class ThreeDpoint extends TwoDpoint 
{
   int z;
   public static void input3d(ThreeDpoint p)
   {
	   System.out.println("ENTER THE CO-ORDINATES OF POINT FOR 3D:");
	   p.x = s.nextInt();
	   p.y = s.nextInt();
	   p.z = s.nextInt();
	   
   }
  
  
    
   static double distance(ThreeDpoint P, ThreeDpoint Q,ThreeDpoint R)
   {
	  double res = Math.sqrt((Q.x - P.x) * (Q.x - P.x) + (Q.y - P.y) * (Q.y - P.y) + (R.y - P.x) * (R.y - P.x)); 
	  return res;
	   
   }
   static int collinear3D(ThreeDpoint P, ThreeDpoint Q,ThreeDpoint R)
   {

	   int a1,b1,c1,a2,b2,c2;
	   a1 = Q.x - P.x;
	   b1 = Q.y - P.y;
	   c1 = Q.z - P.z;
	   
	   a2 = R.x - Q.x;
	   b2 = R.y - Q.y;
	   c2 = R.z - Q.z;
	   
	   float h1 = a1/a2;
	   float h2 = b1/b2;
	   float h3 = c1/c2;
	   
	   if(h1 == h2 && h2 == h3)
	   {
		   return 1;
	   }
	   else
	   {
		   return -1;
	   }
	   
   }
   public void display3d(ThreeDpoint P, ThreeDpoint Q,ThreeDpoint R)
   {
	   System.out.println("THE CO-ORDINATES OF POINT 1:"+"("+P.x+","+P.y+","+P.z+")");
	   System.out.println("THE CO-ORDINATES OF POINT 2:"+"("+Q.x+","+Q.y+','+Q.z+")");
	   System.out.println("THE CO-ORDINATES OF POINT 3:"+"("+R.x+","+R.y+","+R.z+")");
 	  
       	   
   }
   
	
}

public class Plane
{
	
	public static void main(String args[])
	{
	
		  ThreeDpoint ob = new ThreeDpoint();
		 

		ThreeDpoint ob1 = new ThreeDpoint();
		ThreeDpoint ob2 = new ThreeDpoint();

        System.out.println("FOR 2D");
		TwoDpoint.input(ob);
		TwoDpoint.input(ob1);
		
		double d = TwoDpoint.distance(ob, ob1);
		TwoDpoint.input(ob2);
		int c = TwoDpoint.collinear(ob,ob1,ob2);
		System.out.println("DISTANCE BETWEEN TWO CO-ORDINATES IN 2D: "+d);
        if(c == 1)
        {
		System.out.println("POINTS ARE COLLINEAR");   
        }
        else
        {
        	System.out.println("POINTS ARE NOT COLLINEAR");   
            	
        }
		ob.display(ob,ob1,ob2);
		
		System.out.println("\n");
		System.out.println("FOR 3D");
		ThreeDpoint.input3d(ob);
		ThreeDpoint.input3d(ob1);
		double d1 = ThreeDpoint.distance(ob, ob1);
		ThreeDpoint.input3d(ob2);
		
		int c1 = ThreeDpoint.collinear3D(ob,ob1,ob2);
		System.out.println("DISTANCE BETWEEN TWO CO-ORDINATES IN 3D: "+d1);
      
		if(c1 == 1)
        {
		System.out.println("POINTS ARE COLLINEAR");   
        }
        else
        {
        	System.out.println("POINTS ARE NOT COLLINEAR");   
            	
        }
		ob.display3d(ob,ob1,ob2);
		
		
		
	}
	
	
}
