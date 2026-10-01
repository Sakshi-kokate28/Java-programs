import java .util.*;
class Calculation
{
    public static void main(String A[])
    {
        int No1 =0, No2 =0 ,Ans =0;
        char ch ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number");
        No1 = sobj.nextInt();

        System.out.println("Enter Operators(+,/,*, -)");
        ch = sobj.next().charAt(0);

        System.out.println("Enter Second Number");
        No2 = sobj .nextInt();

        switch(ch)
        {
            case '+':
            System.out.println("Addition of the = " + (No1 + No2));
            break;

            case '/':
            System.out.println("Division of the = "   +( No1  / No2));
            break;

            case '*':
            System.out.println("Multiplication of the = " +(No1 * No2));
            break;

            case '-':
            System.out.println("Subtraction of the = " + ( No1 - No2));
            break;
        }



    }
}