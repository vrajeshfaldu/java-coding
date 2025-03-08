import java.util.*;
class Student{
	String name;
	int rollno;
	double spi;
	String course;
	public void getter(){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter name:");
		this.name=sc.nextLine();

		System.out.println("enter rollno:");
		this.rollno=sc.nextInt();

		System.out.println("enter spi:");
		this.spi=sc.nextDouble();

		System.out.println("enter course:");
		this.course=sc.nextLine();
		this.course=sc.nextLine();

	}
	public void setter(){
		System.out.println("name:"+this.name);
		System.out.println("rollno:"+this.rollno);
		System.out.println("spi:"+spi);
		System.out.println("course:"+course);

	}

}
public class extra1{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Student t1=new Student();

		t1.getter();
		System.out.println();
		t1.setter();

	}
}