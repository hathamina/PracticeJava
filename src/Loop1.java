import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		System.out.println("enter the number : ");
	   	int n = myInput.nextInt();
		
		
//		
//		for( int i = 1; i<=n; i++) {
//			
//			if(i< n) {
//				System.out.print(i + ",");
//			}else {
//			
//			System.out.print(i);}
//			
//		}
	   	
	   	int i = 1;
	   	while (i <= n) {
	   		
	   		if(i<n){
	   		System.out.print(i + ", ");
	   			}else {
	   				System.out.print(i);
	   		}
	   		i++;
		}
	   	
	   			
	}

}

