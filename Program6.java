//Program to calculate simple interest p n r 
import java.util.Scanner; 
  
class Program6
{ 
   public static void main(String args[]) 
   { 
      int t, p, r, s; 
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter time period in years : ");
      t = in.nextInt(); 
      System.out.println("Enter Principle Amount : ");
      p  = in.nextInt(); 
      System.out.println("Enter Rate of interest : ");
      r  = in.nextInt();
      s  =  p*r*t/100 ;
      System.out.println("Simple Interest is  = "+s); 
   } 
} 