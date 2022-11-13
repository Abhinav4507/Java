class a{
    public a()
    {
        System.out.println("I am constructor of base class a-0 arg");
    }
    public a(int x)
    {
        System.out.println("I am constructor of base class a-l arg");
    }
}
class b extends a
{
    public b()
    {
        System.out.println("I am constructor of derived class a-0 arg");
    }
    public b(int y)
    {
           super(y);
        System.out.println("I am constructor of derived class a-l arg");

    }

}
public class inherit2 {
    public static void main (String[] args)
    {
        
    } 
}