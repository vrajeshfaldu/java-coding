import java.util.*;
class Student{
	int id_no;
	int no_of_subject;
	String []grade;
	int []subjectcredit;
	int []subjectcode;
	Student(int id_no,int no_of_subject,int []subjectcode,int []subjectcredit,String []grade){
		this.id_no=id_no;
		this.no_of_subject=no_of_subject;
		this.subjectcredit=subjectcredit;
		this.subjectcode=subjectcode;
		this.grade=grade;

	}
	public void spi(){
		int total=0,totalcredit=0;
		for(int j=0;j<no_of_subject;j++){
			totalcredit=this.subjectcredit[j]+totalcredit;
		if(this.grade[j].equals("A++")){
			total=total+10*this.subjectcredit[j];
		}
		else if(this.grade[j].equals("A+")){
			total=total+9*this.subjectcredit[j];
		}
		else if(this.grade[j].equals("A")){
			total=total+8*this.subjectcredit[j];
		}

		else if(this.grade[j].equals("B+")){
			total=total+7*this.subjectcredit[j];
		}
		else if(this.grade[j].equals("B")){
			total=total+6*this.subjectcredit[j];
		}

		else if(this.grade[j].equals("C")){
			total=total+5*this.subjectcredit[j];
		}
	}
		double spi=(double)total/totalcredit;
		System.out.println("spi="+spi);

	}
	public void display(){
		System.out.println("Student ID:"+this.id_no);
		for(int j=0;j<no_of_subject;j++){
		System.out.println("Subject Grade:"+this.grade[j]);
		System.out.println("Subject Credit:"+this.subjectcredit[j]);
		System.out.println("Subject Code:"+this.subjectcode[j]);

		}
	}
}
public class a1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Students=");
		int n=sc.nextInt();
		
		int i;
		int [] arry=new int[n];

		Student []stu=new Student[n];
		for(i=0;i<n;i++){
			System.out.println("Enter student ID:");
			int id_no=sc.nextInt();

			System.out.println("Enter no of subject:");
			int no_of_subject=sc.nextInt();
			int []subjectcode=new int[no_of_subject];
			int []subjectcredit=new int[no_of_subject];
			String[]grade=new String[no_of_subject];



			for(int j=0;j<no_of_subject;j++){
				System.out.println("Enter Subjectcode:");
				subjectcode[j]=sc.nextInt();

				System.out.println("Enter Subject Credit:");
				subjectcredit[j]=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Subject Grade:");
				grade[j]=sc.nextLine();
				
			}
			stu[i]=new Student(id_no,no_of_subject,subjectcode,subjectcredit,grade);
			stu[i].display();
			stu[i].spi();
			}			
		}


	}
