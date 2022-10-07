import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("whatis your name? ");
		String name = myInput.nextLine();
		
		System.out.println("what is your age ? "); 
		int age = myInput.nextInt();
		
		System.out.println("your name is " + name + " - " + "your age is " + age + " yr ");

	}

}
