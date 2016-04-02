package team04.week4.bill;

public class Calculator {
	private planType userPlanType;
	private User user;
	private double ExceedRate = 0;
	private double billCharged;

	Calculator(int line, int min, String plan) {
		user = new User(line, min, plan);
		if ("silver".equals(plan)) {
			userPlanType = new silverPlan();
		}

		else {
			userPlanType = new goldPlan();
		}
	}

	private double calculateBasicRate() {
		double BasicRate = userPlanType.getBasicMonthlyRate();
		return BasicRate;
	}

	private double calculateAdditionalRate() {
		double numberOfLine = user.line;
		double additionalRate;

		if (numberOfLine >= 4) {
			additionalRate = 2 * userPlanType.getAdditionalLineRate() + 5 * (user.line - 3);
		} else {
			additionalRate = (user.line - 1) * userPlanType.getAdditionalLineRate();
		}

		return additionalRate;
	}

	private double calculateExceededRate() {
		int ExceedMinute = user.min - userPlanType.getIncludedMinute();

		if (0 < ExceedMinute) {

			ExceedRate = userPlanType.getExcessMinuteRate() * ExceedMinute;
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
