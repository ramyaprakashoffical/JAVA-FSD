package typecasting;

public class typeCasting {

	public static void main(String[] args) {
		//implicit conversion
				System.out.println("Implicit Type Casting");
				byte num1 = 100 ;
				System.out.println("num1 = " + num1);
				int num2 = num1 ;
				System.out.println("num1 = " + num2);
				double num3 = num2 ;
				System.out.println("num1 = " + num3);
				
				System.out.println("\n");
				
				System.out.println("Explicit Type Casting");
				//explicit conversion
				
				int enum4 = 88 ;
				byte enum5 = (byte)enum4;
				System.out.println("enum5 = " + enum5);
				
				
				


	}

}


