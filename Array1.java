// Program to print array as an loop
class Array1{
    public static void main (String[] args)
    {
        int[] marks = {15,12,19,8,17};

        System.out.println("Using for loop");
        for (int i =0 ; i<marks.length; ++i)
        {
            System.out.println("Marks of " + i +" student is " +marks[i]);
        }
    }
}