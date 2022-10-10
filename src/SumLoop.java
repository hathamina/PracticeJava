import java.util.Scanner;

public class SumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		System.out.println("entrez un numéro  :");
		int n = myInput.nextInt();
		
		int oldSum =0;
		int newSum = 0;
		int i=1;
		while(i<=n) {
			newSum = oldSum + i;
			oldSum = newSum;
			i++;
		}
		
		System.out.print(newSum);
		
		
	}

}
