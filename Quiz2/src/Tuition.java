import java.util.Scanner;

public class Tuition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter intitial tution: ");
		double tuition = input.nextDouble();
		
		System.out.println("Enter percent increases for tuition: ");
		double percentinc = input.nextDouble() / 100 + 1;
		
		System.out.println("Enter repayment APR: ");
		double APR = input.nextDouble();
		
		System.out.println("Enter term: ");
		double term = input.nextDouble();
		
		double totaltuition = 0;
		
		for(int year = 0; year <4; year++){
			tuition = tuition * percentinc;
			System.out.println("Tuition for year " + (year + 1) + " is " + tuition);
		}
		
		double P = tuition;
		double r = APR / 1200;
		double n = term;
		
		double EMI = (P * r * Math.pow(r + 1, n)) / ( Math.pow(r + 1, n) - 1);
		
		System.out.println("Total tuition equals " + tuition);
		System.out.println("Monthly payment is " + EMI);
	}
}