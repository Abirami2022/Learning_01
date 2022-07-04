package example;

public class Exceptionhandling {
int c = 0;
	public static void main(String[] args) {
		int a = 12;
		try {
			int b= 13/0;	
		} 
		catch (ArithmeticException e) {
			System.out.println(a);	
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("The END");
		}
		
		




	}

}
