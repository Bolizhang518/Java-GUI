package As5b;

import javax.swing.*;
import java.util.*;
import java.text.*;

public class TestStatistics
{

  public static void main (String[] args)
  {
    String in="",out,token="";
    String delim = ", ";
    double d;
    double [] x;
    int size;
    double min,max,mean,median;

    //input data size
    in = JOptionPane.showInputDialog("Enter data size"); //check 
    size = Integer.parseInt(in);
  //Build pattern string
   
    String pattern = ".000";
    DecimalFormat df = new DecimalFormat (pattern);
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
        out = out + df.format(originalData[i]) + " "+ " \n";
    
    for(int i = 0; i<sortedData.length; i++)
    	out= out+"Sorted Data: "+df.format(sortedData[i])+" "+"\n";
      
    	out= out+"Entered Min value is: "+df.format(min)+" "+"\n";
    	out= out+"Entered Max value is: "+df.format(max)+" "+"\n";
    	out= out+"Entered Mean value is: "+df.format(mean)+" "+"\n";
    	out= out+ "Entered Median value is: "+df.format(median)+" "+"\n";
    	
    	JOptionPane.showMessageDialog(null,out);
        
    





  }
}

