import java.util.*;
public class a1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float percentage;
			
		System.out.println("enter your first subject marks:");
		int marks1=sc.nextInt();
		System.out.println("enter your second subject marks:");
		int marks2=sc.nextInt();
		System.out.println("enter your third subject marks:");
		int marks3=sc.nextInt();
		System.out.println("enter your fourth subject marks:");
		int marks4=sc.nextInt();
		System.out.println("enter your fifth subject marks:");
		int marks5=sc.nextInt();
		percentage=(float)(marks1+marks2+marks3+marks4+marks5)/5;

			
			if(percentage>=60)
			{
				System.out.println("result=First division");
			}
			else if(59>=percentage && percentage>=50)
			{
				System.out.println("result=Second division");

			}
			else if(49>=percentage && percentage>=40)
			{
				System.out.println("result= third division");
			}
			else if(percentage<40)
			{
				System.out.println(" result=Fail");
			}
			System.out.println(percentage);

			
		
		

		
	}
}