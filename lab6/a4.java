import java.util.*;
class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;
	public  void getAccountDetails(){
		Scanner sc=new Scanner(System.in);

		this.accountNo=sc.nextInt();
		sc.nextLine();	
		this.userName=sc.nextLine();
		this.email=sc.nextLine();
		this.accountType=sc.nextLine();
		this.accountBalance=sc.nextInt();

	}
	public void displayAccountDetails(){
		System.out.println("account  no="+this.accountNo);
		System.out.println("name="+this.userName);
		System.out.println("email="+this.email);
		System.out.println("account type="+this.accountType);
        System.out.println("accountBalance="+this.accountBalance);
	}


}
public class a4{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Bank_Account t1=new Bank_Account();

		t1.getAccountDetails();
		System.out.println();
		t1.displayAccountDetails();

	}
}