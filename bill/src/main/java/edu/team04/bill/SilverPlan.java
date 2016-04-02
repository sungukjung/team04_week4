package edu.team04.bill;

public class SilverPlan implements PlanType {

	private double silverBasicRate = 29.95;
	private int silverIncludedMinute = 500;
	private double silverAdditionalLineRate = 21.50;
	private double silverExcessRate = 0.54;
	private double silverFamilyDiscountRate = 5;

	public double getBasicMonthlyRate() {
		return silverBasicRate;
	}

	public double getExcessMinuteRate() {
		return silverExcessRate;
	}

	public int getIncludedMinute() {
		return silverIncludedMinute;
	}

	public double getFamilyDiscountRate() {
		return silverFamilyDiscountRate;
	}

	public double getAdditionalLineRate() {
		return silverAdditionalLineRate;
	}
}
