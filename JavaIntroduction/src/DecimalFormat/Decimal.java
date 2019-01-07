package DecimalFormat;

import java.text.DecimalFormat;

public class Decimal {

	public static void main(String[] args) {
		/*DecimalFormat deci = new DecimalFormat("0.00");
		double num1 = 12.5;
		double num2 = 37.9876;
		System.out.println(deci.format(num1) + "\n" + deci.format(num2));
		*/
		DecimalFormat decimal = new DecimalFormat("00.00");
		double number1 = 2.676;
		double number2 = 5.786;
		System.out.println(decimal.format(number1) + "\n" + decimal.format(number2));
	}

}
