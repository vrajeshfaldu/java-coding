import java.util.Scanner;

public class a3 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number for array size:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter the number to rotate array:");
        int num=sc.nextInt();

        for(int i=0;i<n;i++){
         array[i]=sc.nextInt();
        }
        int array2[]=new int[n-num];//after pointing element
        int array3[]=new int[num];// before pointing element

        for(int i=0;i<num;i++){
            array3[i]=array[i];
        }
        for(int i=0;i<n-num;i++){
           array2[i]=array[num+i];
        }
        
      int newarray[]=new int [n]; 
      int index=0; 
        for(int i=0;i<n-num;i++){
            newarray[index++]=array2[i];
        }
        for(int j=0;j<num;j++){
            newarray[index++]=array3[j];
        }

        for(int i=0;i<n;i++){
            System.out.println(newarray[i]);
        }
    }
    
}