package as13;

public  class Manager extends Employee {

	private double pctBonus;
	private double travelExpense;
	public Manager(String name, Double salary, double pctBonus, double travelExpense) {
		super(name, salary);
		this.pctBonus = pctBonus;
		this.travelExpense = travelExpense;
	}
	public double getPctBonus() {
		return pctBonus;
	}
	public double getTravelExpense() {
		return travelExpense;
	}
	@Override
	public double computeBonus() {
		// TODO Auto-generated method stub
		double bonus = (salary * pctBonus)+500;
		return bonus;
	}
	
	
	
}
