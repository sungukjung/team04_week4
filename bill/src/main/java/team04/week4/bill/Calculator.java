package team04.week4.bill;

public class Calculator {
	private planType userPlanType;
	private User user;

	private double billCharged;

	Calculator(int line, int min, String plan) {
		user = new User(line, min, plan);
		if (plan.equals("silver")) {
			userPlanType = new silverPlan();
		}

		else {
			userPlanType = new goldPlan();
		}
	}


	private double calculateBasicRate() {
		}

	private double calculateAdditionalRate() {
		}

	private double calculateExceededRate() {
		}
	
	public double calculateTotalRate(){
		billCharged = 
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
