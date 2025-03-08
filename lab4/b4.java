import java.util.*;
public class b4{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String arry=sc.nextLine();
		int length=0;
		for(char c:arry.toCharArray()){
			length++;
		}
		for(int i=length/2;i<=length;i++){
			System.out.print(arry.charAt(i));


		}
	}
}