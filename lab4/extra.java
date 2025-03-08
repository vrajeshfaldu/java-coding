import java.util.*;
public class extra{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String arry=sc.nextLine();
		int i,count=0,count2=0,count3=0,count4=0;
		
		
		for(i=0;i<arry.length();i++)
		{
			char ch=arry.charAt(i);
			if(ch==' '){
				continue;
			}

			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				count3++;
			}
			else if(ch>='B' && ch<='Z'){
				count2++;
			}
			else{
				count4++;
			}
		}
		System.out.println("vowels small are="+count);
		System.out.println("consonatans uper are="+count2);
		System.out.println("vowels uper are="+count3);
		System.out.println("consonatans small are="+count4);
	}
}