package Calculator1;

public class Calculator2 {
	

	public static int add (int num1, int num2) {
		int sum = num1 + num2;
		return sum; 
	}
	
	public static int subtract (int num1, int num2) {
		int sum = num1 - num2;
		return sum; 
	}
	
	public static int multiply (int num1, int num2) {
		int sum = num1 * num2;
		return sum; 
	}
	
	public static float divide (float num1, float num2) {
		float sum = num1 / num2;
		if(num1 > num2) {
            System.out.println(sum);
        } else {
            System.out.println("Can not execute this sum");
        }
		return sum; 
	}
}
