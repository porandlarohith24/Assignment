// WAP to accept age from user and print he/she is eligible for voting.

import java.util.Scanner;
class voting{
    public static void main(String args[]){
        int age=0;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter age to check voter eligibility");
        age=s.nextInt();  //56
        
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}