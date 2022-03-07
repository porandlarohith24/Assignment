import java.util.Scanner;
class strong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,sum=0,rem,temp;
        System.out.println("enter number");
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            num=num/10;
            sum=sum+fact;
        }
        if(temp==num)
        System.out.println(sum+"is strong number");
        else
         System.out.println(sum+"is not strong number");
        
            
        }
    }
