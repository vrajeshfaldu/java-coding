import java.util.*;
class Time{
	int hour;
	int minite;
	public void time(int hour,int minite){
		this.hour=hour;
		this.minite=minite;
	}
	public void addtion(int hour,int minite){
		this.hour+=hour;
		this.minite+=minite;
		if(this.minite>=60){
			this.minite-=60;
			this.hour+=1;
		}
	}
}
public class a2{
	public static void main(String [] args){
		Time t1=new Time();
		Time t2=new Time();
	
		t1.time(2,40);
		t1.addtion(3,40);
		t1.addtion(3,10);
		System.out.println(t1.hour+":"+t1.minite);
		
	}
}