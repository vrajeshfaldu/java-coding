import java.util.Scanner;
public class b6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%4==0)
		{
			System.out.println("leap year");

		}
		else{
			System.out.println("not a leap year");
		}
	}
}