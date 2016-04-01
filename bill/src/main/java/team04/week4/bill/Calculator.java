package team04.week4.bill;
import Account;
import planType;
import userLine;
public class Calculator {
	private planType plantype;
	private double billCharged;
	private int User_Used_bill;
	
	private int lineCount;
	private int totalMinutesUsed;
		
	private double BasieRate;
	private double FamilyDiscountRate;
	private double BasicMonthlyRate;
	private double ExcessMonthlyRate;
	private double AddtionalRate;
	private double ExceededRate;
	
	//privte userLines userlines;
	
	public double setUserAccount(Account account){
		lineCount = account.getLineCount();
		totalMinutesUsed = account.getTotalUsedMinutes();
		plantype = account.getPlantype();
		BasieRate= account.getBasieRate();
	}
	
	public double calculateBasicRate(){
		BasieRate = plantype.getBasicMonthlyRate();
	}
	
	public double calculateAdditionalRate(){
		AddtionalRate = plantype.getAdditionalLineRate();
	}
	
	public double calculateExceededRate(){
		ExceededRate = plantype.getExcessMinuteRate();
	}
	
	
	
}
