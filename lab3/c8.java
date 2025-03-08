import java.util.Scanner;
public class c8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0,min=0,i,j,count=0;
		
		if(a>b)
		{
			max=a;
			min=b;
		}

		else{
			max=b;
			min=a;
		}
		for(i=min;i<=max;i++){
			
			count=0;
			for(j=1;j<=i;j++){
			if(i%j==0){
				count++;
			}	
		}
		if(count<=2)
			{
				System.out.println(i);	
			}
		}
		
	}

}