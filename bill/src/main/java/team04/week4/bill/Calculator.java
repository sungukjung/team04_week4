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
<<<<<<< HEAD
			double BasicRate = userPlanType.getBasicMonthlyRate();
			return BasicRate;
		}

	private double calculateAdditionalRate() {
			double numberOfLine = user.line;
			double additionalRate;
			
			if(numberOfLine >= 4) {
				additionalRate = 2 * userPlanType.getAdditionalLineRate() + 5 * (user.line-3);
			}
			else {
				additionalRate = (user.line-1) * userPlanType.getAdditionalLineRate();
			}
			
			return additionalRate;
		}
=======
	}

	private double calculateAdditionalRate() {
	}
>>>>>>> d30c0c9e65f19ab0e85c2e23c07c63fe40e95760

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
