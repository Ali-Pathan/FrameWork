package Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		double fNumber, sNumber, Answer;
	System.out.println("Enter First number and Press Enter");
		fNumber = cal.nextDouble();
		
	System.out.println("Enter Second number");
		sNumber = cal.nextDouble();
		
		Answer = fNumber / sNumber;
		DecimalFormat deci = new DecimalFormat("0.0000");
	System.out.println(deci.format(Answer));
	}
	

}
//34.6, 54.2