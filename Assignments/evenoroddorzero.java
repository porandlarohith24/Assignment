import java.util.Scanner;

class evenoroddorzero
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

   
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    
    if ( num % 2 == 0)
        System.out.println("Entered number is even");
     else 
        System.out.println("Entered number is odd");
    if (num==0)
        System.out.println("Entered number is zero");
  }
}