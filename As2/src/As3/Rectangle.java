//Assignment #: 2
//Student Name: Boli zhang
//Class:  comsc-255
package As3;
import javax.swing.JOptionPane;
public class Rectangle{
	public static void main(String[] args){
		String l,w;
		l = JOptionPane.showInputDialog("length: ");
		Double l1 = Double.parseDouble(l);
		l = JOptionPane.showInputDialog("width: ");
		Double l2 = Double.parseDouble(l);
		
		w = "length: "+l1+ "\n" + "wdith: " +l2 + "\n";
		w = w+"Area: " +computeArea(l1,l2)+ "\n" ;
		w = w +"Perimete: " +computePerim(l1,l2)+ "\n";
		
		JOptionPane.showMessageDialog(null, w);
		
		//System.out.println("Area: " +computeArea(3,4));
		
		//System.out.println("Perim: " +computePerim(3,4));
	}
	
	public static double computeArea (double len, double wid)
	{
    return len*wid;
    
	}
	
	
	public static double computePerim (double len, double wid){

		double sum = 2*(len + wid);
		return sum;
	}
	
}
