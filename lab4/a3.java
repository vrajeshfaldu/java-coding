import java.util.*;
public class a3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int temp;
		int arry[]= new int[n];
		for(int i=0;i<n;i++){
			arry[i]=sc.nextInt();
		}
		for(int i=0;i<n/2;i++){
			temp=arry[i];
			arry[i]=arry[n-i-1];
			arry[n-i-1]=temp;
		}
		System.out.print("reverse is=");
		for(int i=0;i<n;i++)
		{
			System.out.print(arry[i]);
		}
	}
}