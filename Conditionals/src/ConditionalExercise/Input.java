package ConditionalExercise;

public class Input {

    public static void main(String[] args) {

    	System.out.println((Variable1 (2, 3, false)));
    	
    }
    
    public static int Variable1 (int a, int b, boolean c) {
    	if(c == true) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }
		return 0;
	
    }
 }

