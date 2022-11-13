class comp
{
	private int real, imag;
     public comp()
     {
    	 
     }
     public comp(int r, int i)
     {
    	 real = r;
    	 imag= i;
     }
     public void setdata(int m, int n)
     {
    	 real=m;
    	 imag= n;
     }
     public void display ()
     {
    	 System.out.println("real data="+real);
    	 System.out.println("imaganery data="+imag);
     }
     public comp addcomplex(comp c2 )
     {
    	 comp c3;
    	 c3= new comp();
    	 c3.real = real + c2.real;
    	 c3.imag= imag +c2.imag;
    	 return c3;
    	 
     }
     public void addcomplex(comp c1, comp c2 )
     {
    	
    	 real = c1.real + c2.real;
    	 imag= c1.imag +c2.imag;
    	
    	 
     }
     
}

public class complex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       comp c1, c2,c4;
       c1= new comp();
       c4= new comp();
       
       c2= new comp(4,5);
       c1.setdata(3,4);
      // c2.setdata(4, 5);
       c4=c1.addcomplex(c2);
       c4.display();
       c4.addcomplex(c1, c2);
       c4.display();
       
	}

}