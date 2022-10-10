import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter size of traigngle:  ");
		
		int n = myInput.nextInt();
		
		for (int i = 1; i<= n; i++) {   
			
			for(int j=1; j<=i; j++) {	
				System.out.print("*");
			}
			System.out.println();
			
		
		}
		
	}
}
