
interface Cab2{
	public String bookCab(String src,String dest);
}

 /*class Ola implements Cab2{

	
	public void bookCab(String src,String dest) {
		System.out.println(src+" "+dest);
		return "price :2000";
		
	}
	
}*/

public class TestEx2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cab2 c=new Ola();
		//c.bookCab("hyd","del");
		

		Cab2 c=(src,dest)->{System.out.println(src+" "+dest);
		return "800";
		};
		System.out.println(c.bookCab("hyd","del"));
	}

}
