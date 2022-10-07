import java.util.Scanner;

public class ternaryOperateur {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println(" Entrer your note : ");
		int note = myInput.nextInt();
// first method		
		
//		if (note > 80) {
//			
//			System.out.println("Excelent");
//			
//		}else {
//			
//			System.out.println("very good ");
//		}
		
// second method	 	

		String result = ( note > 80 )? "Excelent":"Very good";
		System.out.print(result);
		
	}
	
	

}
