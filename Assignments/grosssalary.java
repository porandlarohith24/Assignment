
//  WAP to read basic salary from user and find gross salary
//  gs=hra+da+bs
//   hra is 56%  da is 90%  on basic
import java.util.Scanner;
class grosssalary{
    
    public static void main(String args[]){    
        
        float bs=0,gs=0,da=0,hra=0;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter basic salary");
        bs=s.nextFloat();
        
        hra=(bs/100)*56;
        da=(bs/100)*90;
        
        gs=hra+da+bs;
        System.out.println("Hra amount: "+hra);
        System.out.println("Da amount: "+da);
        System.out.println("Gross salary is : "+gs);
        
        
    }
}
