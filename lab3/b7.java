import java.util.Scanner;
public class b7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,i,m,p;
		p=n;
		for(i=0;n!=0;i++)
		{
			m=n%10;
			sum=sum*10+m;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==p)
		{
			System.out.println(" number is palindrome");
		}
		else{
			System.out.println("number is not palindrome");
		}

	}
}