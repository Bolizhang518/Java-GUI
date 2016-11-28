package as6;

import java.util.Arrays;

public class Statistics  {
 private double[]data;
 private double[]sdata;
 public static int count =0;
 public Statistics (double[] d){
	 Statistics.count++;
	 data = d.clone();
	 sdata = d.clone();
	 Arrays.sort(sdata);
 }

public double[] original(){
	return data.clone();
}
public double[] sorted(){
	return sdata.clone();
}
public static double[] compSorted(double[] d){

	 Statistics stat = new Statistics(d);
	 double[] sort = stat.findsorted();
	 return sort;
	 } 
 public static double compMin(double[] d){

	 Statistics stat = new Statistics(d);
	 double min = stat.findMin();
	 return min;
	 } 
 public static double compMax(double[] d){
	 Statistics stat = new Statistics(d);
	 double max = stat.findMax();
	 return max;
		
	 }
 public static double compMean(double[] d){
	 Statistics stat = new Statistics(d);
	 double mean = stat.findMean();
	 return mean;
	 }
 public static double compMed(double[] d){
	 Statistics stat = new Statistics(d);
	 double med = stat.findMedian();
	 return med;
	 }
 
  public double findMin(){
	return sdata[0];
 }
 public double findMax(){
	return sdata[sdata.length-1];
 }
 public double findMean(){
	 double sum=0;
	 for(int i=0;i<sdata.length;i++){
		 sum = sum + sdata[i];
	 }
	 double mean = sum/sdata.length;
	 
		 return mean;
 }
 public double findMedian()
 {
		double med = sdata[sdata.length/2];
	    return med;
 }
 public double[] findsorted()
 {
	double[]temp = sdata.clone();
	return temp;
 }
 
}
