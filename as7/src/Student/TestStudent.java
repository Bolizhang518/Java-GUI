package Student;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStudent {
	public static void main(String[] args){
		String in, out, name=null;
		int id=0,examCount;
		int[] examScores=null;
		in = JOptionPane.showInputDialog("Enter studen count");
		int stCount= Integer.parseInt(in);
		//creat new student
		Student[]ste = new Student [stCount];
		for(int i=0;i<ste.length;i++){
			in = JOptionPane.showInputDialog("Enter data");
			StringTokenizer stk = new StringTokenizer(in,",");
			in = stk.nextToken().trim();
			id = Integer.parseInt(in);
			name = stk.nextToken().trim();
			
			in = stk.nextToken().trim();
			examCount = Integer.parseInt(in);
			examScores = new int [examCount];
			for(int j=0;j<examScores.length;j++){
				//in = JOptionPane.showInputDialog("Enter Enter score");
				in = stk.nextToken().trim();
				examScores[j] =  Integer.parseInt(in);
			}
			//gradeType =stk.nextToken().trim();
			ste[i] = new Student(id,name,examScores);	
		}
		String outA="",outB="",outC="",outD="",outF="",outCR="",outNCR="",outAll="";
		
		for(int i=0;i<ste.length;i++){
			String grade = ste[i].findGrade();
			if(grade.equalsIgnoreCase("A")){
				outA=outA+ste[i].getId() + " " + ste[i].getName() + " (" 
			     + grade+" )\n";
			
			}
			else if(grade.equalsIgnoreCase("B")){
				outB=outB+ste[i].getId() + " " + ste[i].getName() + " (" 
			     + grade+" )\n";
			
			}
			else if(grade.equalsIgnoreCase("C")){
				outC=outC+ste[i].getId() + " " + ste[i].getName() + " (" 
			     + grade+" )\n";
			
			}
			else if(grade.equalsIgnoreCase("D")){
				outD=outD+ste[i].getId() + " " + ste[i].getName() + " (" 
			     + grade+" )\n";
			
			}
			else if(grade.equalsIgnoreCase("F")){
				outF=outF+ste[i].getId() + " " + ste[i].getName() + " (" 
			     + grade+" )\n";
			
			}

			
		}
		outAll = outA + outB + outC +outD+ outF+outCR + outNCR;
		JOptionPane.showMessageDialog(null, outAll);
	}
	
}
