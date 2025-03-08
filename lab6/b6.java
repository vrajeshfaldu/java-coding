class 	object{
	static int x;
	object(){
		x++;
	}
}
public class b6{
	public static void main(String [] args){
		object t1=new object();
		object t2=new object();
		object t3=new object();
		object t4=new object();

		System.out.println(object.x);

	}
}