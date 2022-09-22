package divide;

public class InvalidAge {

	public static void main(String[] args) {
	int age=19;
	
	
	try {
	if(age<20) {
	throw new Age("Less th 18");
	}
	
	else {
		System.out.print("Invalid age");
	}
	}
	catch( Exception ne) {
		System.out.print(ne);
	}

}
}
