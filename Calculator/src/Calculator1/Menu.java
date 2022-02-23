package Calculator1;


import java.util.Scanner;

public class Menu {

	    Scanner scan = new Scanner(System.in);

	    public void menu() {
	    
		Boolean menuFlag = true;
		String menuOption = "";
		double num1;
		double num2;
		 
			
		System.out.println("Welcome to the Calculator app");

		while (menuFlag) {
			System.out.println("=".repeat(40));
			System.out.println("Please Select which option you woud like to perform");
			System.out.println("=".repeat(40));
			System.out.println(("\t1). Addition"));
			System.out.println("\t2). Subtract");
			System.out.println("\t3). Multiply");
			System.out.println("\t4). Divide");
			System.out.println("=".repeat(40));
			System.out.println("\t0). EXIT");

			String menuOption1 = this.scan.nextLine(); 
			
			switch (menuOption1) {
			case "1":
				System.out.println("Please enter first number");
				num1 = scan.nextDouble();
				System.out.println("Please enter second number");
				num2 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Your answer is: ");
				System.out.println(Calculator2.add(num1, num2));
				break;
				
			case "2":
				System.out.println("Please enter first number");
				num1 = scan.nextDouble();
				System.out.println("Please enter second number");
				num2 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Your answer is: ");
				System.out.println(Calculator2.subtract(num1, num2));
				break;
				
			case "3":
				System.out.println("Please enter first number");
				num1 = scan.nextDouble();
				System.out.println("Please enter second number");
				num2 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Your answer is: ");
				System.out.println(Calculator2.multiply(num1, num2));
				break;			
				
			case "4":
				System.out.println("Please enter first number");
				num1 = scan.nextDouble();
				System.out.println("Please enter second number");
				num2 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Your answer is: ");
				System.out.println(Calculator2.divide(num1, num2));
				break;	
				
			case "0":
				menuFlag = false;
				System.out.println("Thank you for using the app, goodbye!");
				break;
						
			}
		}

	   }
	}


