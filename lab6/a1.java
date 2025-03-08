import java.util.*;
class Circle{
	 double r;
	 Circle(){
	 	r=0;
	 }
	 Circle(double r){
	 	this.r=r;
	 }
	 public double area(){
	 	return 3.14*r*r;
	 }
		
}
public class a1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Circle t=new Circle(5.0);
		
		System.out.println(t.area());

	}
}