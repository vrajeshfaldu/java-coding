import java.util.*;
class Size{
	double height;
	double width;
	double depth;
	double volume1;
	double volume2;
	
	public void getter(){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter height:");
		this.height=sc.nextDouble();

		System.out.println("enter width:");
		this.width=sc.nextDouble();

		System.out.println("enter depth:");
		this.depth=sc.nextDouble();
		
	}
	public void setter(){
		System.out.println("height:"+this.height);
		System.out.println("width:"+this.width);
		System.out.println("depth:"+this.depth);	
	}
	public void volume( Size t1,Size t2){
		this.volume1=t1.height*t1.width*t1.depth;
		this.volume2=t2.height*t2.width*t2.depth;

		System.out.println("volume1="+this.volume1);
		System.out.println("volume2="+this.volume2);

	}

}
public class extra2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Size t1=new Size();
		Size t2=new Size();

		t1.getter();
		System.out.println();
		

		t2.getter();
		System.out.println();

		t1.volume(t1,t2);
	
	}

}