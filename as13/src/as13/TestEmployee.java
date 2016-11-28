package as13;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestEmployee {
   
	  public static void main(String [] args){
		//  	int n, nw, nm , ne;
		
		  	int nw = 3;
		  	int nm = 2;
		  	int ne =1;
		  	int n = nw + nm + ne;
		  	Employee[] emp = new Employee [n];
		  	int empIndex = 0 ;
		  	String in,token,delim = ",";
		  	String name;
		  	double salary,pctBonus,travelExpense;
		  	int optionsCount;
		  	StringTokenizer stk = null;
		  	new worker("a",1.1,0.5);
		  	
		  	for (int i = 0 ;i < nw;i++){
		  		in = JOptionPane.showInputDialog (null ,"Enter a worker data: ");
		  		stk = new StringTokenizer(in,delim) ;
		  		name = stk.nextToken().trim();
		  		in = stk.nextToken().trim();
		  		salary = Double.parseDouble (in);
		  		in = stk.nextToken().trim();
		  		pctBonus = Double.parseDouble(in);
		  		emp[empIndex] = new worker(name,salary,pctBonus);
		  		
		  		empIndex++;
		  	}
		  	for (int i = 0 ;i < nm;i++){
		  		in = JOptionPane.showInputDialog (null ,"Enter a Manager data: ");
		  		stk = new StringTokenizer(in,delim) ;
		  		name = stk.nextToken().trim();
		  		in = stk.nextToken().trim();
		  		salary = Double.parseDouble (in);
		  		in = stk.nextToken().trim();
		  		pctBonus = Double.parseDouble(in);
		  		in = stk.nextToken().trim();
		  		travelExpense = Double.parseDouble(in);
		  		emp[empIndex] = new Manager(name,salary,pctBonus,travelExpense);

		  		empIndex ++;
		  		
		  	}
		  	for (int i = 0 ;i < ne;i++){
		  		in = JOptionPane.showInputDialog (null ,"Enter a Executive data: ");
		  		stk = new StringTokenizer(in,delim) ;
		  		name = stk.nextToken().trim();
		  		in = stk.nextToken().trim();
		  		salary = Double.parseDouble (in);
		  		in = stk.nextToken().trim();
		  		pctBonus = Double.parseDouble(in);
		  		in = stk.nextToken().trim();
		  		travelExpense = Double.parseDouble(in);
		  		in = stk.nextToken().trim();
		  		optionsCount = Integer.parseInt(in);
		  		
		  		emp[empIndex] = new Executive(name,salary,pctBonus,travelExpense,optionsCount);
		  		empIndex ++;
		  		
		  	}
		  //ploymorphic loop 
		  	double bonus;
		  	String out="";
		  for(int i=0;i<emp.length;i++){
			  bonus  =  emp[i].computeBonus();
			  out = out + " Name: " + emp[i].getName() + "\n";
			  out = out + " salary: " + emp[i].getSalary() + "\n";
			  if(emp[i] instanceof worker)
			  {
			    out = out + "Pct Bonus: " + ((worker)emp[i]).getPctBonus() + "\n";
			    out = out + "total Bonus: " + bonus + "\n";
			  }
			  if(emp[i] instanceof Manager)
			  {
			    out = out + "Pct Bonus: " + ((Manager)emp[i]).getPctBonus() + "\n";
			   out = out + "total Bonus: " + bonus + "\n";
			    out = out + "Travel Expense:" +( (Manager)emp[i]).getTravelExpense() + "\n";
			  }
			  if(emp[i] instanceof Executive)
			  {
				  out = out + "Pct Bonus: " + ((Executive)emp[i]).getPctBonus() + "\n";
				 out = out + "total Bonus: " + bonus + "\n";
				  out = out + "Travel Expense:" +( (Executive)emp[i]).getTravelExpense() + "\n";
			      out = out + "Options Count" + ((Executive)emp[i]).getOptionsCount() + "\n";
			  }
			  
		  }
		  JOptionPane.showMessageDialog(null, out);
		  
		  	
	  }
}

//John Adam, 60000, .05
//Rick Smith, 65000, .05
//Raymond Woo, 70000, .05
//Ray Bartlett, 80000, .10, 5000
//Mary Russell, 85000, .10, 5000
//Andy Wong, 100000, .15, 10000, 500
