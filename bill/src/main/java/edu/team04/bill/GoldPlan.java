package edu.team04.bill;

public class GoldPlan implements PlanType {

	private double basicRate = 49.95;
	private int includedMinute = 1000;
	private double excessRate = 0.45;
	private double additionalLineRate = 14.5;
	private double familyDiscountRate = 5;
	
	
	public double getBasicMonthlyRate() {
		return basicRate;
	}

	public double getExcessMinuteRate() {
		return excessRate;
	}

	public int getIncludedMinute() {
		return includedMinute;
	}

	public double getFamilyDiscountRate() {
		return familyDiscountRate;
	}

	public double getAdditionalLineRate() {
		return additionalLineRate;
	}
}