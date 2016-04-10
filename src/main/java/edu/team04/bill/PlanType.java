package edu.team04.bill;

interface PlanType{
	public double getBasicMonthlyRate();
	public double getExcessMinuteRate();
	public int getIncludedMinute();
	public double getFamilyDiscountRate();
	public double getAdditionalLineRate();
	
}