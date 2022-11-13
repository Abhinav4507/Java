class sample
{
	private int i;
	private float a;
	
	public sample(int x, int y)
	{
		i=x;
		a=y;
	}
	public void display()
	{
		System.out.println("value of i is "+i+" value of a is "+a);
	}
}


public class ArrayObj {

	public static void main(String[] args) {
		
		
		//sample s= new sample(2,3);
		sample[] arr= new sample[3];
		arr[0]= new sample(10,20);
		arr[1]= new sample(10,20);
		arr[2]= new sample(10,20);
		for(sample s1:arr)
		{
			s1.display();
		}

	}

}