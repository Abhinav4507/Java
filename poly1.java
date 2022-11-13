abstract class vehicle
{
    public abstract void speed();
    public abstract void maintenance();
    public abstract void value();
}
class fourwheel extends vehicle
{
    public void speed()
    {
        System.out.println("I am in four wheeler speed");
    }
    public void maintenance()
    {
        System.out.println("I am in four wheeler maintenance");
    }
    public void value()
    {
        System.out.println("I am in four wheeler value");
    }
}
class twowheel extends vehicle
{
    public void speed()
    {
        System.out.println("I am in two wheeler speed");
    }
    public void maintenance()
    {
        System.out.println("I am in two wheeler maintenance");
    }
    public void value()
    {
        System.out.println("I am in two wheeler value");
    }
}
class airbone extends vehicle
{
    public void speed()
    {
        System.out.println("I am in airbone speed");
    }
    public void maintenance()
    {
        System.out.println("I am in airbone maintenance");
    }
    public void value()
    {
        System.out.println("I am in airbone value");
    }
}
public class poly1 
{
    public static void main (String[] args)
    {
        vehicle a,b,c;
        a = new fourwheel();
        b = new twowheel();
        c = new airbone();
        a.speed();
        b.maintenance();
        c.value();
    }
}