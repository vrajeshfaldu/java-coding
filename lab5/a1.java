import java.util.*;
public class a1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j;
		String a=sc.nextLine();
		
	
		
		for(i=0;i<a.length();i++){
			
			for(j=0;j<=i;j++)
			{
				
			    System.out.print(a.charAt(j));
			
			}
		
			System.out.println();
		}

	}
}