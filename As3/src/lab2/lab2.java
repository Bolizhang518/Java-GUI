//Assignment #: 3
//Student Name: Boli zhang
//Class:  comsc-255
package lab2;

public class lab2 {
private double length;
private double width;

public lab2 (double l, double w){
	length = l;
	width = w;
}

public double compArea (){
	double a; 
	a = length * width;
	return a;
}
public double compPerim(){
	double p;
	p= 2 * (length + width);
	return p;
}
public double compDiag (){
	return 0;
}

}
