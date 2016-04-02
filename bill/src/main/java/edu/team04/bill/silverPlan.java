package edu.team04.bill;

public class silverPlan implements planType {
	
	private double basicRate = 29.95;
	private int includedMinute = 500;
	private double additionalLineRate = 21.50;
	private double excessRate = 0.54;
	private double familyDiscountRate = 5;
	
	public double getBasicMonthlyRate(){
		return basicRate;
	}
	public double getExcessMinuteRate(){
		return excessRate;
	}
	public int getIncludedMinute(){
		return includedMinute;
	}
	public double getFamilyDiscountRate(){
		return familyDiscountRate;
	}
	public double getAdditionalLineRate(){
		return additionalLineRate;
	}
}
