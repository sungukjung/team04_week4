package edu.team04.bill;

public class GoldPlan implements PlanType {

	private double goldBasicRate = 49.95;
	private int goldIncludedMinute = 1000;
	private double goldExcessRate = 0.45;
	private double goldAdditionalLineRate = 14.5;
	private double goldFamilyDiscountRate = 5;

	public double getBasicMonthlyRate() {
		return goldBasicRate;
	}

	public double getExcessMinuteRate() {
		return goldExcessRate;
	}

	public double getAdditionalLineRate() {
		return goldAdditionalLineRate;
	}

	public int getIncludedMinute() {
		return goldIncludedMinute;
	}

	public double getFamilyDiscountRate() {
		return goldFamilyDiscountRate;
	}
}