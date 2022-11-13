//Program to take array as an input from user

import java.util.Arrays;
import java.util.Scanner;

class Array3{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int [] x = new int[5];
        System.out.println("Enter "+x.length +" integer values : ");

        for (int i=0; i<x.length; ++i)
        {
            x[i]= scan.nextInt();

        }
        System.out.println("Array elements are : ");

        System.out.println(Arrays.toString(x));

    }
}