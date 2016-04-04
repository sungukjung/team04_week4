package edu.team04.bill;

public class Calculator {
	private PlanType userPlanType;
	private User user;
	private double exceedRate = 0;
	private double billCharged;
	static final int FAMILY_DISCOUNT = 4;
	static final int ADDITIONAL_LINE_DISCOUNT = 2;
	static final int ADDITIONAL_LINE_FEE = 5;
	static final int ADDITIONAL_LINE_BASELINE = 3;

	Calculator(int line, int min, String plan) {
		user = new User(line, min, plan);
		if ("silver".equals(plan)) {
			userPlanType = new SilverPlan();
		} else {
			userPlanType = new GoldPlan();
		}
	}

	private double calculateBasicRate() {
		double basicRate;
		basicRate = userPlanType.getBasicMonthlyRate();
		return basicRate;
	}

	private double calculateAdditionalRate() {
		double numberOfLine = user.line;
		double additionalRate;

		if (numberOfLine >= FAMILY_DISCOUNT) {
			additionalRate = ADDITIONAL_LINE_DISCOUNT * userPlanType.getAdditionalLineRate() + ADDITIONAL_LINE_FEE * (user.line - ADDITIONAL_LINE_BASELINE);
		} else {
			additionalRate = (user.line - 1) * userPlanType.getAdditionalLineRate();
		}

		return additionalRate;
	}

	private double calculateExceededRate() {
		int exceedMinute = user.min - userPlanType.getIncludedMinute();

		if (0 < exceedMinute) {

			exceedRate = userPlanType.getExcessMinuteRate() * exceedMinute;
		}
		return exceedRate;
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
