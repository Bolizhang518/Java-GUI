//Assignment #: 3
//Student Name: Boli zhang
//Class:  comsc-255
package lab2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double len1 = 10;
		double wid1 =5; 
		double len2 = 30;
		double wid2 =15;
		
		lab2 rec1 = new lab2 (len1,wid1);
		lab2 rec2 = new lab2(len2,wid2); 
		double area1 = rec1.compArea();
		double area2 = rec2.compArea();
		
		double perim1 = rec1.compPerim();
		double perim2 = rec2.compPerim();
		
		String out;
		out = "Values for the first object:  \n";
		out = out +"length: "+len1+"\n" ;
		out = out +"width: " +wid1+"\n" ;
		out = out +"Perim = " + perim1+"\n";
		out = out+"Area = " + area1 + "\n";
		
		javax.swing.JOptionPane.showMessageDialog(null,out);

		out = "Values for the second object:  \n";
		out = out +"length: "+len2+"\n" ;
		out = out +"width: " +wid2+"\n" ;
		out = out +"Perim = " + perim2+"\n";
		out = out+"Area = " + area2 + "\n";
		
		javax.swing.JOptionPane.showMessageDialog(null,out);
		
	}

}
