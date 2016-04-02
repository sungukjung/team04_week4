package edu.team04.bill;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in); 
        String planType, minUsage, numberOfLines;
        int min, lines;
        double totalFee;
        Calculator cal;
        PrintStream out = System.out;
       
        while(true){
        	out.println("input your plan type(exit is 0)");
        	
        	planType = scan.nextLine();
        	if ( "0".equals(planType) )
        		break;
        	
        	out.println("your plan type is "+planType);
        	
        	out.println("input your usage(minutes)");
        	
        	minUsage = scan.nextLine();
        	min = Integer.parseInt(minUsage);
        	
        	out.println("your plan usage is "+minUsage+ " minutes");
        	
        	out.println("input your number of lines");
        	
        	numberOfLines = scan.nextLine();
        	lines = Integer.parseInt(numberOfLines);
        	
        	out.println("your line is "+numberOfLines);
        	
        	cal = new Calculator(lines, min, planType);
        	
        	totalFee = cal.calculateTotalRate();
        	
        	out.printf("your total fee is %.2f%n",totalFee);
        }        
    }
}
