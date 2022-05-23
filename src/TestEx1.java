
interface Cab{
	public void bookCab();
}

/* class Ola implements Cab{

	
	public void bookCab() {
		System.out.println("cab booked");
		
	}
	
}*/

public class TestEx1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cab c=new Ola();
		//c.bookCab();
		

		Cab c=()->System.out.println("cab booked");
		c.bookCab();
	}

}
