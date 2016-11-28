package as11;

import javax.swing.JOptionPane;

public class TestStuts {
	public static void main(String[] args){
		String in,out;
		Status[] stat = new Status[6];
		int statIndex=0; 
		for (int i =0;i<3;i++){
			in = JOptionPane.showInputDialog("enter length: ");
			double length = Double.parseDouble(in); //converte to double
			
			in = JOptionPane.showInputDialog("enter weigth: ");
			double width = Double.parseDouble(in); //converte to double
			stat [statIndex] = new Rectangle(length,width);
			statIndex++;
			
		}
		
		for (int i =0;i<2;i++){
			in = JOptionPane.showInputDialog("enter name: ");
			String name = in;
			
			in = JOptionPane.showInputDialog("enter age: ");
			int age = Integer.parseInt(in); 
			
			in = JOptionPane.showInputDialog("enter width: ");
			int weight = Integer.parseInt(in);//converte to double
			
			stat [statIndex] = new Sibling(name,age,weight);
			statIndex++;
			
		}
		for (int i =0;i<1;i++){
	
			
			in = JOptionPane.showInputDialog("enter ID: ");
			int id = Integer.parseInt(in); 
			
			in = JOptionPane.showInputDialog("enter name: ");
			String name = in;
			
			in = JOptionPane.showInputDialog("enter score count: ");
			int scoreCount = Integer.parseInt(in);//converte to double
			int []scores = new int [scoreCount];
			for(int j=0;j<scores.length;j++){
				in = JOptionPane.showInputDialog("enter score: ");
				scores[j] = Integer.parseInt(in);
			}
			stat [statIndex] = new Student(id,name,scores);
			statIndex++;
			
		}
		//polymorphic 
		
	for (int i=0;i<6;i++){
		stat[i].displayStatus();
	}
	out = "";
	for (int i=0;i<6;i++){
		out = out + stat[i].getStatus();
	}
	JOptionPane.showMessageDialog(null, out);
	}
}
