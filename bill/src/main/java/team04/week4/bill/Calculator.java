package team04.week4.bill;

public class Calculator {
	private planType userPlanType;
	private User user;
	private double ExceedRate = 0;
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

	private double calculateExceededRate(){
		int ExceedMinute= user.min - IncludedMinutes;
		int IncludedMinutes =userPlanType.getIncludedMinute();
		int ExcessMinuteRate = userPlanType.getExcessMinuteRate();

			if(0<ExceedMinute){
				
				ExceedRate = ExcessMinuteRate*ExceedMinute;
				}
			return 	ExceedRate;	
		}

	

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
