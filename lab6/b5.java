	class Complexnumber{
	double real;
	double imaginary;

	Complexnumber(double real){
		this.real=real;
		this.imaginary=0;
	}

	Complexnumber(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public void addtion(Complexnumber t2){
		this.real+=t2.real;
		this.imaginary+=t2.imaginary;

	}
	public void print(){
		System.out.println(this.real +"+"+this.imaginary+"i");
	}

}
public class b5{
	public static void main(String []args){
		Complexnumber t1=new Complexnumber(10);
		Complexnumber t2=new Complexnumber(11,20);

		t1.addtion(t2);
		t1.print();




	}
}