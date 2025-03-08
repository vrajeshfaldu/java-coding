import java.util.*;
public class a2{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter two number");
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      String d=sc.nextLine();
      String c=sc.nextLine();

      if(c.equals("+"))
      {
         System.out.println("addition=");
         System.out.println(a+b);

      }
      else if(c.equals("-"))
      {
         System.out.println("substraction=");
         System.out.println(a-b);

      }
      else if(c.equals("*"))
      {
         System.out.println("multification");
         System.out.println(a*b);

      }
      else if(c.equals("/"))
      {
         System.out.println("division");
         System.out.println(a/b);

      }

      // int a=sc.nextInt();
      // int b=sc.nextInt();


      // System.out.println("choose your procces");
      // System.out.println("1=addition");
      // System.out.println("2=substraction");
      // System.out.println("3=multification");
      // System.out.println("4=division");

      // int choice=sc.nextInt();
      
      // if(choice==1)
      // {
      //    System.out.println("addition=");
      //    System.out.println(a+b);

      // }
      // else if(choice==2)
      // {
      //    System.out.println("substraction=");
      //    System.out.println(a-b);

      // }
      // else if(choice==3)
      // {
      //    System.out.println("multification");
      //    System.out.println(a*b);

      // }
      // else if(choice==4)
      // {
      //    System.out.println("division");
      //    System.out.println(a/b);

      // }
   }
}