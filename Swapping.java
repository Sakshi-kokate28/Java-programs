import java .util.*;
class Swapping
{
    public static void main(String A[])
    {
        int No1 = 0 ,No2 = 0;
        int Temp;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number");
        No1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        No2 = sobj .nextInt();

        System.out.println("before swapping" +No1 +" " + No2);

        Temp = No1 ;
        No1 = No2;
        No2 = Temp ;

        System.out.println("After Swapping" + No1+"  " + No2);

    }

}