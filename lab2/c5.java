 import java.util.*;
public class c5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println("first is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("second is largest");
		}
		else if(c>a && c>b)
		{
			System.out.println("third is largest");
		}

	}
}