//Program to find the Mutiplication of two integer a and b
import java.util.Scanner; 
  
class Program4
{ 
   public static void main(String args[]) 
   { 
      int x, y, z; 
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter 1st Number : ");
      x = in.nextInt(); 
      System.out.println("Enter 2nd Number : ");
      y = in.nextInt(); 
      z = x * y; 
      System.out.println("Multiplication of entered integers = "+z); 
   } 
} 