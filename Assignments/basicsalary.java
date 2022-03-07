// WAP to read basic salary and find gross salary.
//     gs=hra+da+bs

//     if basic <=10000
//           hra is 62% on basic
//           da  is 78% on basic
//     if basic 10000-20000
//           hra is 69% on basic
//           da  is 87% on basic
//     if basic is above 20000
//           hra is 78% on basic
//           da  is 89% on basic
import java.util.Scanner;
class basicsalary{
    public static void main(String args[]) {
        Float hra, da, gs;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basicsalary");
        float basic = sc.nextFloat();
        if (basic <= 10000) {
            hra = (basic * 62) / 100;
            da = (basic * 78) / 100;
        } else if (basic > 10000 && basic < 20000) {
            hra = (basic * 69) / 100;
            da = (basic * 87) / 100;
        } else {
            hra = (basic * 78) / 100;
            da = (basic * 89) / 100;
        }
        gs=hra+da+basic;
        System.out.println("gs "+gs);
    }

}