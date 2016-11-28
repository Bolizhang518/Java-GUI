package as13;

public   class worker extends  Employee {
	private double pctBonus;

	public worker(String name, Double salary, double pctBonus) {
		super(name, salary);
		this.pctBonus = pctBonus;
	}

	public double getPctBonus() {
		return pctBonus;
	}

	@Override
	public double computeBonus() {
		// TODO Auto-generated method stub
		double bonus = (salary * pctBonus);
		return bonus;
	} 
	

}
