package as11;

import javax.swing.JOptionPane;

public class Rectangle implements Status{
	private double width;
	private double length;

	public Rectangle (double l,double w){
		length = l;
		width = w;
		
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		String status =  " Rectangle\n";
			status = status + " Length= " + length + ", Width = " + width + "\n";
		
		return status;
	}

	@Override
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
		
	}
}
