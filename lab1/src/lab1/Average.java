//Assignment #: 1
//Student Name: Boli zhang
//Class:  comsc-255
package lab1;
import javax.swing.JOptionPane;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in,out;
		in = JOptionPane.showInputDialog("enter number ");
		double num1 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("enter number ");
		double num2 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("enter number ");
		double num3 = Double.parseDouble(in);
		
		double sum = num1 + num2 + num3;
		out = "the sum of "+num1 + " + " +num2+ "+ " +num3 + " is: " +sum+ "\n"; 
		double avg = sum/3;
		//String sNum1 = "" + num1;
		out = out + "the average of " + num1 +  +num2 + "and" +num3+ "is" + avg + "\n";
		JOptionPane.showMessageDialog(null, out);;
		
	}

}
