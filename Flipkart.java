package divide;



public class Flipkart {
	public static void main(String[] args)  {
		int price=10000;
		try {
		if(price<=10000) {
	     throw new ProductNotFoundExpection("less than tenthousand");
		}
		else {
			System.out.println("product list");
		}
		}
		catch(Exception e) {
			System.out.println(e);
			
		
		}	

}
}