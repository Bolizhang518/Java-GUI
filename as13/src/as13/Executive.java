package as13;

public  class Executive extends Employee {
	private double pctBonus;
	private double travelExpense;
	private int optionsCount;
	public Executive(String name, Double salary, double pctBonus, double travelExpense, int optionsCount) {
		super(name, salary);
		this.pctBonus = pctBonus;
		this.travelExpense = travelExpense;
		this.optionsCount = optionsCount;
	}
	public double getPctBonus() {
		
		return pctBonus;
	}
	public double getTravelExpense() {
		return travelExpense;
	}
	public int getOptionsCount() {
		return optionsCount;
	}
	@Override
	public double computeBonus() {
		// TODO Auto-generated method stub
		double bonus = (salary * pctBonus) + 1000;
		return bonus;
	}
	
	

	
}
