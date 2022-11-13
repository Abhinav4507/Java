import java.io.BufferedReader;
import java.io.InputStreamReader;

class rac
{
	private int len, brd;
	
	public void getdata() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length and breadth : ");
		len= Integer.parseInt(br.readLine());
		brd= Integer.parseInt(br.readLine());
	}
	
	public void setdata(int l, int b)
	{
		len = l;
		brd= b;
	}
	

	public void display()
	{
		System.out.println("length = "+len);
		System.out.println("breadth = "+brd);
	}
	
	public void area_peri()
	{
		int a, p;
		a= len*brd;
		p= 2*(len+brd);
		System.out.println("Area = "+a);
		System.out.println("Perimeter = "+p);
	}
}

public class rectangle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

    rac r1;
    rac r2;
    r1= new rac();
    r2= new rac();

    r1.setdata(10, 20);
    r1.display();
    r1.area_peri();

    r2.getdata();
    r2.display();
    r2.area_peri();
    }

}