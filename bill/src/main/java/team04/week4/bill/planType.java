package team04.week4.bill;

interface planType{
	public double getBasicMonthlyRate();
	public double getExcessMinuteRate();
	public int getIncludedMinute();
	public double getFamilyDiscountRate();
	public double getAdditionalLineRate();
}