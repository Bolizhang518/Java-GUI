package as13;

public abstract  class Employee {
	private String name;
	protected Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public abstract double computeBonus();
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	
}
