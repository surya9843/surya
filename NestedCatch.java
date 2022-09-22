package divide;

public class NestedCatch {
	public static void main(String[] args) {
		String[]names= {"ram","vicky","surya","raj"};
		try {
		System.out.println(names[1]);
		
		System.out.println(names[1].charAt(10));
		
		int num=Integer.parseInt(names[1]);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.print(ae);
		}
		catch(StringIndexOutOfBoundsException ae) {
			System.out.print(ae);
		}
		catch(NumberFormatException ae) {
		System.out.print(ae);
		
	}
	
	}
}
