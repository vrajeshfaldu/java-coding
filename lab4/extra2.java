import java.util.*;
public class extra2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,i;
		for(i=0;i<n;i++){
			System.out.println("enter number");
		   a[i]=sc.nextInt();
		}
		System.out.println("enter num who want to search");
		int s=sc.nextInt();
		for(i=0;i<n;i++){
			if(a[i]==s)
			{
				count++;
			}
		}
		if(count==0){
			System.out.println("not available");
			
		}
		else{
			System.out.println("search number count="+count);
			
		}
	}
}