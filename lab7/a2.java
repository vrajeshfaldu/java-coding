class Book{
	private String authorname;
	Book(String authorname){
		this.authorname=authorname;

	}
	public void display (){
	System.out.println("authorname="+this.authorname);
    }
}

	class BookPublication extends Book {
		private String title;
		BookPublication(String authorname,String title){
			super(authorname);
			this.title=title;
		}

		public void display(){
			super.display();
			System.out.println("title="+this.title);					
		}
	
	}
	 
	class PaperPublication extends Book{
		private String title;
		PaperPublication(String authorname,String title){
			super(authorname);
			this.title=title;
		}
			public void display(){
			super.display();

			System.out.println("title"+this.title);
			
			

		}
		
}
public class a2{
	public static void main(String[] args){
		String a=args[0];
		String b=args[1];
		String c=args[2];
		Book b1;

		if( args[1].equals("book")){
			 b1= new BookPublication(a,c);
			 b1.display();

		}
		else if(args[1].equals("paper")){
			 b1=new PaperPublication(a,c);
			 b1.display();
		}
	}
}