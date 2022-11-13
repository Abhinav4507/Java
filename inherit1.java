class Example
{
	public void fun()
	{
		System.out.println("I am in Example class fun funtion");
	}
	public void save()
	{
		System.out.println("I am in Example class save funtion");
	}
	public void enc()
	{
		System.out.println("I am in Example class enc funtion");
	}
	public void open()
	{
		System.out.println("I am in Example class open funtion");
	}
}

class NewExample extends Example
    {
    	public void save()
    		{
    			System.out.println("I am in NewExample class save funtion");
    		} 
    	public void enc()
    		{
    			System.out.println("I am in NewExample class enc funtion");
    		}
    	public void autoupdate()
    	    {
    		    System.out.println("I am in NewExample class autoupdate funtion");
    	    }
    	public void open()
    		{
    			System.out.println("I am in NewExample class open funtion");
    			super.open();
            }

    }
public class inherit1 {
    
    public static void main(String[] args)
     {
	
        NewExample e = new NewExample();
        e.fun();
        e.save();
        e.enc();
        e.autoupdate();
        e.open();

	}

}