//  WAP to read units from user and generate bill.

//           first 50 units the charges are: 0.50 p/u
//           next 100 units the charges are: 0.75 p/u
//           next 100 units the charges are: 1.25 p/u
//           above 250 units the charges are: 2.25 p/u

//   add 18% Gst on bill.


//           50    50*0.50  ==> 25 
//           51    (50*0.50) + (1*0.75) 
//           80    50*0.50 + 30*0.75

//           180    50*0.50+ (100*0.75)+30*1.25
import java.util.Scanner;
class electricitybill{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter units");
        int units=s.nextInt();   
        double bill=0;
        if(units<=50){
            
            bill=units*0.50;
        }
        else if(units<=150){
            
            bill=(50*0.50)+(units-50)*0.75;
        }
        else if(units<=250){
            
            bill=(50*0.50)+(100*0.75)+(units-150)*1.25;
        }
        else{
                 bill=(50*0.50)+(100*0.75)+(100*1.25)+(units-250)*2.25;            
        }
        
        double gst= (bill*18)/100;
        System.out.println("Bill: "+ bill);
        System.out.println("GST: "+ gst);
        
        bill=bill+gst;
        System.out.println("Final Bill: "+ bill);
        
    }
}
