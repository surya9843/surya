package divide;

public class Gmail {
	public static void main(String[] args) throws Mail {
		String mail="Surya@gmail";
			try {
				if(mail.contains("g21mail")) {	
			
				throw new Mail("contains gmail");
				}
			else {
                 System.out.println("not contains gamil");
			}
	
	}
			catch(StringIndexOutOfBoundsException s) {
				System.out.print(s);
			}
	}

}
