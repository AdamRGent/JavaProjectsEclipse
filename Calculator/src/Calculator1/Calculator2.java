package Calculator1;

public class Calculator2 {
	public static void main (String[]args) {
		System.out.println((add(5 , 10)));
		System.out.println((subtract(19 , 8)));
		System.out.println((multiply(4 , 6)));
		System.out.println((divide(10 , 5)));
	}

	public static int add (int a, int b) {
		int sum = a + b;
		return sum; 
	}
	
	public static int subtract (int a, int b) {
		int sum = a - b;
		return sum; 
	}
	
	public static int multiply (int a, int b) {
		int sum = a * b;
		return sum; 
	}
	
	public static float divide (float a, float b) {
		float sum = a / b;
		if(a > b) {
            System.out.println(sum);
        } else {
            System.out.println("Can not execute this sum");
        }
		return sum; 
	}
}
