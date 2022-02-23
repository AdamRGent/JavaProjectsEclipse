package Calculator1;

public class Calculator2 {
	

	public static double add (double num1, double num2) {
		double sum = num1 + num2;
		return sum; 
	}
	
	public static double subtract (double num1, double num2) {
		double sum = num1 - num2;
		return sum; 
	}
	
	public static double multiply (double num1, double num2) {
		double sum = num1 * num2;
		return sum; 
	}
	
	public static double divide (double num1, double num2) {
		double sum = num1 / num2;
		if(num1 > num2) {
            System.out.println(sum);
        } else {
            System.out.println("Can not execute this sum");
        }
		return sum; 
	}
}
