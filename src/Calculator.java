
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		double num1, num2, result;
		char operator;
		
		System.out.println("What is your name ? : ");
		String name = myInput.next();
		
		System.out.println(" Hello " + name + " Choose an operator : + , - , * , / , %  : ");
		operator = myInput.next().charAt(0);
		
		System.out.println("entrer first number : ");
		num1 = myInput.nextDouble();
		
		System.out.println("Entrer second number : ");
		num2 = myInput.nextDouble();
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " +num2  + " = " + result);
			break;
			
		case '-':
			result=num1 - num2;
			System.out.println(num1 + " - " +num2  + " = " + result);
			break;
		case '*':
			result=num1 * num2;
			System.out.println(num1 + " * " +num2  + " = " + result);
			break;
		case '/':
			result=num1 - num2;
			System.out.println(num1 + " / " + num2  + " = " + result);
			break;
		case '%':
			result=num1 - num2;
			System.out.println(num1 + " % " + num2  + " = " + result);
			break;

		default:
			System.out.println("Invalid operator !");
			break;
		}
		
		
		 
		

	}

}
