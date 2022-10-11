import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		// j'appelle la method printHello() "void" pour afficher "hello word";
		
		printHello();  
		
		// j'appelle la methode printNumber "return" pour afficher "5"; sinon on peut la stocher dans une variable int number = printNumber();
		// first method
		int number = printNumber(); 
		System.out.println(number);
		
		//second method
		System.out.println(printNumber());
		
		//appelle la method myProfil
		
		myProfil("khiat", "amina", 33);
		
		//appelle la method  mult
		double result = mult(5, 3);
		System.out.println(result);
		
		// la method sum
		int resu=sum(5);
		System.out.println(resu);
		
		// la method factorial
		
		int resultF = factorail(5);
		System.out.println(resultF);
	
		
		
		}
	/////////////////////////////////////////////Les Methodes///////////////////////////////////////
	
	// method void;
	
	public static void printHello() {
		System.out.println("Hello world");

	}
	
	// method return;
	
	public static int printNumber() {
		
		return 5;
	}
	
	// method avec des param 
	
	public static void myProfil(String fname, String lname, int age ) {
		
		System.out.println(fname +" "+ lname+ " " + age + "ans");	
	}
	
	public static double mult(double num1,double num2) {
		return num1 * num2;
	}
	
	// la summation
	
	public static int sum(int num) {
		if(num > 0) {
		return num+sum(num-1);
		}else {
			return 0;
			}
		}
	// factorial
	
	public static int factorail(int number) {
		if(number == 1) {return 1;}else {
		return number * factorail(number-1);}
	}
	
}
