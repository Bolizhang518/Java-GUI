//Assignment #: 4
//Student Name: Boli zhang
//Class:  comsc-255

package as4;

import javax.swing.*;
public class TestSibling
{
  public static void main(String[] args)
  {
    String in, out;
    String name;
    int age;
    int weight;

    in = JOptionPane.showInputDialog("Enter name of sibling 1");
    name = in;
    in = JOptionPane.showInputDialog("Enter age of sibling 1");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 1");
    weight = Integer.parseInt(in);
    Sibling sib1 = new Sibling (name,age,weight);

    in = JOptionPane.showInputDialog("Enter name of sibling 2");
    name = in;
    in = JOptionPane.showInputDialog("Enter age of sibling 2");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 2");
    weight = Integer.parseInt(in);
    Sibling sib2 = new Sibling (name,age,weight);

    in = JOptionPane.showInputDialog("Enter name of sibling 3");
    name = in;
    in = JOptionPane.showInputDialog("Enter age of sibling 3");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 3");
    weight = Integer.parseInt(in);
    Sibling sib3 = new Sibling (name,age,weight);

    Sibling youngest=null;

    if ( (sib1.getAge() < sib2.getAge()) && (sib1.getAge() < sib3.getAge()) )
    {
      //sib1 is the youngest
      youngest = sib1;

    }
    else if ( (sib2.getAge() < sib1.getAge()) && (sib2.getAge() < sib3.getAge()) )
    {
      //sib2 is the youngest
      youngest = sib2;
    }
    else if ( (sib3.getAge() < sib1.getAge()) && (sib3.getAge() < sib2.getAge()) )
    {

      //sib3 is the youngest
      youngest = sib3;
    }

    Sibling tallest=null;
    //Determine the tallest.
    if ( (sib1.getWeight() < sib2.getWeight()) && (sib1.getWeight() < sib3.getWeight()) )
    {
      //sib1 is the youngest
    	tallest = sib1;

    }
    else if ( (sib2.getWeight() < sib1.getWeight()) && (sib2.getWeight() < sib3.getWeight()) )
    {
      //sib2 is the youngest
    	tallest = sib2;
    }
    else if ( (sib3.getWeight() < sib1.getWeight()) && (sib3.getWeight() < sib2.getWeight()) )
    {

      //sib3 is the youngest
    	tallest = sib3;
    }

    //Display the youngets
    out = "The youngest sibling: " + youngest.getName()+ " " +
                                     youngest.getAge() + " " +
                                     youngest.getWeight() + "\n";

    JOptionPane.showMessageDialog(null,out);
    
    out = "the Lightest sibling: " + tallest.getName()+ " "+
    		tallest.getAge()+ " "+
    		tallest.getWeight()+ " "+ "\n";
 
    JOptionPane.showMessageDialog(null, out);

  }
}

