class keyword{
	static String x;
		keyword(){
			this.x="hello";
		}
}
public class c7{
	public static void main(String[]args){
		keyword t1=new keyword();
		System.out.println(keyword.x);

	}
}