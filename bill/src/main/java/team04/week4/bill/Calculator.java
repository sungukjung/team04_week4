package team04.week4.bill;

public class Calculator {
	private planType userPlanType;
	private User user;
	private double exceedRate = 0;
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

	private double calculatebasicrate() {
		double basicrate = userPlanType.getBasicMonthlyRate();
		return basicrate;
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
		int exceedminute = user.min - userPlanType.getIncludedMinute();

		if (0 < exceedminute) {

			exceedRate = userPlanType.getExcessMinuteRate() * exceedminute;
		}
		return exceedRate;
	}

	public double calculateTotalRate(){
		billCharged = calculatebasicrate()+calculateAdditionalRate()+calculateExceededRate();
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
