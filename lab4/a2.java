import java.util.*;
public class a2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		float avg;
		System.out.println("enter the size=");
		int n=sc.nextInt();
		int arry[]=new int[n];
		for(int i=0;i<n;i++){
			arry[i]=sc.nextInt();
			sum=sum+arry[i];
		}
		avg=(float)sum/n;
		System.out.println(avg);


	}
}