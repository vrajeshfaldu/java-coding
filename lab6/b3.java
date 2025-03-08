import java.util.*;
class Sentence{
	String s;
	int a,e,i,o,u;
	int vowel;

	public void sentencePrint(){
			Scanner sc=new Scanner(System.in);
		    while(true){

			System.out.println("enter Sentence");
 			String s=sc.nextLine();
 			if(s.equals("quit")){
 				break;
 			}
 			for(int j=0;j<s.length();j++){
 				char ch=s.charAt(j);
 				if(ch=='a'){
 					vowel++;
 					a++;
 				}
 				else if(ch=='e'){
 					vowel++;
 					e++;
 				}
 				else if(ch=='i'){
 					vowel++;
 					i++;
 				}
 				else if(ch=='o'){
 					vowel++;
 					o++;
 				}
 				else if(ch=='u'){
 					vowel++;
 					u++;
 				}
 			}

		}
		System.out.println("totel vowel="+vowel);
		System.out.println("a="+a+" e="+e+" i="+i+" o="+o+" u="+u);
	}
}
public class b3{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Sentence t1= new Sentence();
		t1.sentencePrint();

	}
}