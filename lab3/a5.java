import java.util.Scanner;
public class a5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0;
		for(i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			System.out.println(" number is prime");
		}
		else{
			System.out.println(" number is not prime");

		}

	}
}