import java.util.*;
import java.lang.Math;

class Methods{
	static void Traverse(int arr[]) {
		int n=arr.length;
		System.out.println("Traversing the array: ");
		for(byte i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void BubbleSort(int arr[]) {
		int temp,n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nPrinting The array in sorted order: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void Average(int arr[]) {
		int n=arr.length,sum=0;
		System.out.println("\nMinimum Element= "+arr[0]+" Maximum Element= "+arr[n-1]);
		for(int i=0;i<n;i++)
			sum+=arr[i];
		System.out.println("Average= "+(float)sum/n);
	}
	static void OddEve(int arr[]) {
		byte odd=0,prime=0,n=(byte)arr.length;
		for(byte i=0;i<n;i++) {
			if(arr[i]==0)
				continue;
			else if(arr[i]%2!=0)
				odd++;
			byte flag=0;
			int till=(int)Math.sqrt(arr[i]);
			for(byte j=2;j<=till;j++) {
				if(arr[i]%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				prime++;
		}
		System.out.println("Odd= "+odd+" Even= "+(int)(n-odd));
		System.out.println("Prime= "+prime+" Composite= "+(int)(n-prime));
	}
}

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte n;
		System.out.print("Enter the size of the array: ");
		n =sc.nextByte();
		int arr[]= new int[n];
		for(byte i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		Methods.Traverse(arr);
		Methods.BubbleSort(arr);
		Methods.Average(arr);
		Methods.OddEve(arr);
		sc.close();
	}	
}
