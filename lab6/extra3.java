import java.util.*;
class BankDemo{
	int accountNum;
	String accountType;
	double balance;
	public void getter(){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter accountNum:");
		this.accountNum=sc.nextInt();

		System.out.println("enter accountType:");
		this.accountType=sc.nextLine();
		this.accountType=sc.nextLine();


		System.out.println("enter balnce:");
		this.balance=sc.nextDouble();

		
	}
	public void setter(){
		System.out.println("height:"+this.accountNum);
		System.out.println("width:"+this.accountType);
		System.out.println("depth:"+this.balance);	
	}
	
}
public class extra3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		BankDemo t1=new BankDemo();
		BankDemo t2=new BankDemo();
		BankDemo t3=new BankDemo();

		t1.getter();
		t1.setter();

		t2.getter();
		t2.setter();

		t3.getter();
		t3.setter();



		
	}
}