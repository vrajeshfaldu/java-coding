import java.util.*;
class A{
	
	public void sortArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arry[]=new int[n];
		int i,j,temp;

		for( i=0;i<n;i++){
			System.out.println("enter the element:");
			arry[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arry[j]<arry[i]){
				temp=arry[i];
				arry[i]=arry[j];
				arry[j]=temp;
			}

			}
		}
		for(i=0;i<n;i++){
			System.out.println(arry[i]);
		}
		
    }
    public void searchArray(){
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arry[]=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			System.out.println("enter the element:");
			arry[i]=sc.nextInt();
		}
		System.out.println("enter search element:");
		int p=sc.nextInt();
		for(i=0;i<n;i++){
			if(arry[i]==p){
				System.out.println("your element is="+arry[i]);
			}
			else{
				System.out.println("not found");
			}
		}


    }
    public void sumArray(){
    	Scanner sc=new Scanner(System.in);
    	int sum=0;
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arry[]=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			System.out.println("enter the element:");
			arry[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			sum=sum+arry[i];
		}
		System.out.println("sum="+sum);


    }
    public void avgArray(){
    	Scanner sc=new Scanner(System.in);
    	double sum=0;
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arry[]=new int[n];
		int i,j;
		for(i=0;i<n;i++){
			System.out.println("enter the element:");
			arry[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			sum=sum+arry[i];
		}
		double avg;
		avg=sum/n;
		System.out.println("avg="+avg);
    }

    
}
public class extra4{
	public static void main(String[]args){
		A  t1=new A();
		t1.sortArray();
		t1.searchArray();
		t1.sumArray();
		t1.avgArray();

	}
	
}
	