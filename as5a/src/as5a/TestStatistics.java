package as5a;

import javax.swing.*;
import java.util.*;
import java.text.*;

public class TestStatistics
{

  public static void main (String[] args)
  {
    String in,out,token;
    double [] x;
    int size;
    double min,max,mean,median;

    //input data size
    in = JOptionPane.showInputDialog("Enter data size");
    size = Integer.parseInt(in);

    //create an array object of above size
    x = new double [size];

    //input data values
    for (int i=0; i<x.length; i++)
    {
    	in = JOptionPane.showInputDialog("Enter a data value");
      x[i] = Integer.parseInt(in);
    }
       
    //Create Statistics object
    Statistics st = new Statistics (x);

    //Get original data from Statistics object 
    double [] originalData = st.getOriginalData ( );

    //Get sorted data from Statistics object
    double [] sortedData = st.getSortedData ( );

    //Find min,max,mean,median values form Statistics object
    min = st.findMin();
    max = st.findMax();
    mean = st.findMean();
    median = st.findMedian();

    //Build output string and display output
    out = "Origional Data:\n"; 
    for(int i = 0; i<originalData.length; i++)
        out = out + originalData[i] + " "+ " \n";
    
    for(int i = 0; i<sortedData.length; i++)
    	out= out+"Sorted Data: "+sortedData[i]+" "+"\n";
      
    	out= out+"Entered Min value is: "+min+" "+"\n";
    	out= out+"Entered Max value is: "+max+" "+"\n";
    	out= out+"Entered Mean value is: "+mean+" "+"\n";
    	out= out+ "Entered Median value is: "+median+" "+"\n";
    	
    	JOptionPane.showMessageDialog(null,out);
        
    





  }
}

