import java.util.*;
public class a1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String arry=sc.nextLine();
		int i,count=0,count2=0;

		
		for(i=0;i<arry.length();i++)
		{
			char ch=arry.charAt(i);
			if(ch==' '){
				continue;
			}

			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
			else{
				count2++;
			}
		}
		System.out.println("vowels are="+count);
		System.out.println("consonatans are="+count2);
	}
}