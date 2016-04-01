package team04.week4.bill;

public class Calculator {
	private double billCharged;
	private int User_Used_bill;
	private int lineCount;
	private int totalMinutesUsed;
	private planType plantype;
	//privte userLines userlines;
	
	public double calculateBasicRate(Account account){
	lineCount = account.getLineCount();
	totalMinutesUsed = account.getTotalUsedMinutes();
	plantype = account.getPlantype();
	
		
		
	}
	
}
