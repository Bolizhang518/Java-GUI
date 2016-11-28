package as11;

import javax.swing.JOptionPane;

public class Sibling implements Status{
	private String name;
	private int age;
	private int weight;
	
	public Sibling(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		String status = "Sibling\n";
			status = status + " name: " + name +
					", age =" + age + ", weight " + weight + "\n";
		
		return status;
	}

	@Override
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
		
	}
}
