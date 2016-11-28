package as5a;

import java.util.*;
import javax.swing.*;

public class Statistics
 {
  private double [] data;
  private double [] sdata;

  public Statistics (double [] d)
  {
    //create array
    data = new double [d.length];
    //copy contents into array
    System.arraycopy(d,0,data,0,d.length);
    //create array, copy contents and sort array.
    sdata = new double [d.length];
    System.arraycopy(d,0,sdata,0,d.length);
    Arrays.sort(sdata);
    
  }


  public double [] getOriginalData()
  {
    double [] temp = new double[data.length];
    System.arraycopy(data,0,temp,0,data.length);
    return temp;
  }
  public double [] getSortedData()
  {
	  double [] temp1 = new double[data.length];
	    System.arraycopy(sdata,0,temp1,0,sdata.length);
	    return temp1;
	  
  }
  public double findMin( )
  {
    return sdata[0];
  }
  public double findMax()
  {
    return sdata[sdata.length-1];
  }
  public double findMean ()
  {
    double sum=0, avg;
    for(int i=0;i<sdata.length;i++)
    {
      sum = sum + sdata[i];
    }
    avg = sum/sdata.length;
    return avg;
  }
  public double findMedian()
  {
		double med = sdata[sdata.length/2];
	    return med;
  }
}

