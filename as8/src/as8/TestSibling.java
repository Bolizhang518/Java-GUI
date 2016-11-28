package as8;

import javax.swing.JOptionPane;

public class TestSibling {
public static void main(String[] args){
	String name,in,out;
	int age,weight,height;
	
	name = JOptionPane.showInputDialog("Enter name");
	out = JOptionPane.showInputDialog("Enter age");
	age = Integer.parseInt(out);
	out = JOptionPane.showInputDialog("Enter weight");
	weight = Integer.parseInt(out);
	out = JOptionPane.showInputDialog("Enter height");
	height = Integer.parseInt(out);
	
	SiblingExt sibe1 = new SiblingExt (name,age,weight,height);
	
	name = JOptionPane.showInputDialog("Enter name");
	out = JOptionPane.showInputDialog("Enter age");
	age = Integer.parseInt(out);
	out = JOptionPane.showInputDialog("Enter weight");
	weight = Integer.parseInt(out);
	out = JOptionPane.showInputDialog("Enter height");
	height = Integer.parseInt(out);
	
	SiblingExt sibe2 = new SiblingExt (name,age,weight,height);
	
	name = JOptionPane.showInputDialog("Enter name");
	out = JOptionPane.showInputDialog("Enter age");
	age = Integer.parseInt(out);
	out = JOptionPane.showInputDialog("Enter weight");
	weight = Integer.parseInt(out);
	out = JOptionPane.showInputDialog("Enter height");
	height = Integer.parseInt(out);
	
	SiblingExt sibe3 = new SiblingExt (name,age,weight,height);
	
	SiblingExt youngest,lightest,tallest;
	//youngest 
	if(sibe1.getAge()<sibe2.getAge()&& sibe1.getAge()<sibe3.getAge()){
		youngest = sibe1;
	}
	else if (sibe2.getAge()<sibe1.getAge()&& sibe2.getAge()<sibe3.getAge()){
		youngest = sibe2;
	}
	else
		youngest = sibe3;
	//lightest
	if(sibe1.getWeight()<sibe2.getWeight()&& sibe1.getWeight()<sibe3.getWeight()){
		lightest = sibe1;
	}
	else if (sibe2.getWeight()<sibe1.getWeight()&& sibe2.getWeight()<sibe3.getWeight()){
		lightest = sibe2;
	}
	else
		lightest = sibe3;
  // tallest  
	if(sibe1.getHeight()>sibe2.getHeight()&& sibe1.getHeight()>sibe3.getHeight()){
		tallest = sibe1;
	}
	else if (sibe2.getHeight()>sibe1.getHeight()&& sibe2.getHeight()>sibe3.getHeight()){
		tallest = sibe2;
	}
	else
		tallest = sibe3;
	
	
	
   out ="The Youngest Sibling: "+ youngest.getName()+" "+youngest.getWeight()+" "+youngest.getHeight() +"\n";
   out = out + "The Lightest Sibling: " +lightest.getName()+" "+lightest.getWeight()+" "+lightest.getHeight()+"\n";
   out = out + "The Tallest Sibling:  " + tallest.getName()+" "+tallest.getWeight()+" "+tallest.getHeight()+"\n";
   JOptionPane.showMessageDialog(null, out);
   
}
}
