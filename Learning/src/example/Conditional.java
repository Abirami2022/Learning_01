package example;

public class Conditional {

	public static void main(String[] args) {
		 int price = 1000;
		 
		 if(price<=500) {
			 System.out.println("a");
		 }
		 else if (price!=1000) {
			System.out.println("b");
		}
		 else if (price==1000) {
			System.out.println("Correct"); 
		}
		 else if (price>1000) {
			System.out.println("c");
		}
		 
	}

}
