package edu.team04.bill;

public class Calculator {
	private PlanType userPlanType;
	private User user;
	private double ExceedRate = 0;
	private double billCharged;
	final static int familyDiscount = 4;
	final static int additionalLineDiscount = 2;
	final static int additionalLineFee = 5;
	final static int additionalLineBaseLine = 3;

	Calculator(int line, int min, String plan) {
		user = new User(line, min, plan);
		if ("silver".equals(plan)) {
			userPlanType = new SilverPlan();
		}

		else {
			userPlanType = new GoldPlan();
		}
	}

	private double calculateBasicRate() {
		double basicRate = userPlanType.getBasicMonthlyRate();
		return basicRate;
	}

	private double calculateAdditionalRate() {
		double numberOfLine = user.line;
		double additionalRate;

		if (numberOfLine >= familyDiscount) {
			additionalRate = additionalLineDiscount * userPlanType.getAdditionalLineRate() + additionalLineFee * (user.line - additionalLineBaseLine);
		} else {
			additionalRate = (user.line - 1) * userPlanType.getAdditionalLineRate();
		}

		return additionalRate;
	}

	private double calculateExceededRate() {
		int exceedMinute = user.min - userPlanType.getIncludedMinute();

		if (0 < exceedMinute) {

			ExceedRate = userPlanType.getExcessMinuteRate() * exceedMinute;
		}
		return ExceedRate;
	}

	public double calculateTotalRate(){
		billCharged = calculateBasicRate()+calculateAdditionalRate()+calculateExceededRate();
		return billCharged;
	}

	class User {
		int line;
		int min;
		String plan;

		User(int line, int min, String plan) {
			this.line = line;
			this.min = min;
			this.plan = plan;
		}

	}

}
