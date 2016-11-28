package as6;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in,out;
		//input all data
		in = JOptionPane.showInputDialog("Enter All Data <separated by commas/spaces>: ");
		String delim = ",";
		//set decimal format  
		String in1 =JOptionPane.showInputDialog("Enter the Number of Decimal Places that the Result is Required: ");
		int places = Integer.parseInt(in1);
		
		String pattern = ".0";
		for (int i=0; i<places-1; i++){
            pattern = pattern + "0";
		}
		//Create a DecimalFormat object. Pass it the pattern string.
	    DecimalFormat df = new DecimalFormat (pattern);
	    
		//gice to tokenizer
		StringTokenizer stk = new StringTokenizer(in,delim);
		//get data size from token
		int size = stk.countTokens();
		//creat arry
		double [] x = new double[size];
		//fill up the arry 
		for (int i=0;i<x.length;i++){
			String token = stk.nextToken().trim();
			x[i]=Double .parseDouble(token);
		}
		//create statistics obj 
		Statistics stat = new Statistics (x);
		double min = stat.findMin();
		double max = stat.findMax();
		double mean = stat.findMean();
		double median = stat.findMedian();
		double[] original = stat.original();
		double[] sorted = stat.sorted();
		
		
		double min2 = Statistics.compMin(x);
		double max2 = Statistics.compMax(x);
		double mean2 = Statistics.compMean(x);
		double median2 =  Statistics.compMed(x);
		//build output 
		double[] compsorted = Statistics.compSorted(x);
		
		out = "original: \n";
				for(int i = 0; i<original.length; i++)
			        out = out + (original[i]) + " ";
		out = out + "Results Using Static Methods:"+ "\n" ;

		out = out+"\n"+"sorted: " ;
		for(int i = 0; i<sorted.length; i++)
	        out = out + (sorted[i]) + " ";
		
		out = out +"\n"+"Min = " +df.format(min)+ "\n";
		out = out+ "Max = " +df.format(max)+ "\n";
		out = out+ "Mean = " + df.format(mean)+ "\n";
		out = out+ "median = " + df.format(median)+ "\n";
		//comp 
		
		out = out+"\n"+"Results Using Static Methods: \n";
		out = out + "sorted Data: ";
				for(int i = 0; i<sorted.length; i++)
			        out = out + (compsorted[i]) + " ";
		out = out+" \n Mix = " + df.format(min2)+ "\n";
		out = out+ "Max = " + df.format(max2)+ "\n";
		out = out+ "Mean = " + df.format(mean2)+ "\n";
		out = out+ "Median = " + df.format(median2)+ "\n";
		out = out + "count: " + Statistics.count + "\n";
		//Display output
		JOptionPane.showMessageDialog(null, out);
		
		
	}

}
