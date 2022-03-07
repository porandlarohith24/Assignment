
// WAP to accept number and check it is zero or +ve or -ve number
import java.util.Scanner;
class positivenumber{
    public static void main(String args[]){
       int num=0;
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter number");
       num=s.nextInt();
       
       if(num>0){
           System.out.println("+ve number");
       }
       else if(num<0){
           System.out.println("-ve number");
           
       }
       else{
           System.out.println("Zero");
       }
       
       
       
       
    }
}