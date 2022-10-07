import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		
		System.out.println(" What time is it ? ");
		int time = myInput.nextInt();
	
		
	
	if (time <= 12 && time>= 6) {
		
		System.out.println("Morning");
		
	}
	
	if (time > 12 && time < 20 ) {
		
		System.out.println("Evening");
		
	} else {
		
		System.out.println( "nignt");

	}

	}

}
