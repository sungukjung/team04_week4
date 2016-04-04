package edu.team04.bill;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private App() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String planType;
		String minUsage;
		String numberOfLines;
		int min;
		int lines;
		double totalFee;
		Calculator cal;
		Logger log = Logger.getLogger(App.class.getName());

		while (true) {
			log.info("input your plan type(exit is 0)");

			planType = scan.nextLine();
			if ("0".equals(planType))
				break;

			log.info("your plan type is " + planType);

			log.info("input your usage(minutes)");

			minUsage = scan.nextLine();
			min = Integer.parseInt(minUsage);

			log.info("your plan usage is " + minUsage + " minutes");

			log.info("input your number of lines");

			numberOfLines = scan.nextLine();
			lines = Integer.parseInt(numberOfLines);

			log.info("your line is " + numberOfLines);

			cal = new Calculator(lines, min, planType);

			totalFee = cal.calculateTotalRate();

			log.info("your total fee is " + totalFee);
		}
	}
}