import java.util.*;
public class a2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		System.out.println("enter the rows:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
			}

			for(j=1;j<=i;j++){
				if( j%2==1){
					System.out.print(" ");
				}
				else if( j%2==0){
					System.out.print(" ");
				}

				System.out.print("*");
			}
			System.out.println("");
		}

		for(i=n-1;i>=1;i--)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");

			}
			for(j=1;j<=i;j++)
			{
				if( j%2==1){
					System.out.print(" ");
				}
				else if( j%2==0){
					System.out.print(" ");
				}
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}