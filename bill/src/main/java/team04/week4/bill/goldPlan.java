package team04.week4.bill;

public class goldPlan implements planType {

	public double basicRate = 49.95;
	public int includedMinute = 1000;
	public double excessRate = 0.45;
	public double additionalLineRate = 14.5;
	public double familyDiscountRate = 5;
	
	
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