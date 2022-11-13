//Program to Calculate Average of 5 number
import java.util.Scanner;

class Program7
{
    public static void main(String[] args) 
    {
        
        int a1, a2, a3, a4, a5, avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        a1 = in.nextInt();
        System.out.println("Enter 2nd Number : ");
        a2 = in.nextInt();
        System.out.println("Enter 3rd Number : ");
        a3 = in.nextInt();
        System.out.println("Enter 4th Number : ");
        a4 = in.nextInt();
        System.out.println("Enter 5th Number : ");
        a5 = in.nextInt();
        avg = (a1+a2+a3+a4+a5)/5;
        System.out.println("The Average of Entered Numbers is "+avg);

    }
}