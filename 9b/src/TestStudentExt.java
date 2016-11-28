
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class TestStudentExt {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("in.txt"));
		    PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));
		    
		
		    String newLine = System.getProperty("line.separator");
		String in, out, name=null,gradeType=null;
		int id=0,examCount;
		int[] examScores=null;
		in = br.readLine();
		int stCount= Integer.parseInt(in);
		//creat new student
		StudentExt[]ste = new StudentExt [stCount];
		for(int i=0;i<stCount;i++){
			in= br.readLine();
	    	 // pw.println(in);
	    	  pw.flush();
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
			gradeType =stk.nextToken().trim();
			ste[i] = new StudentExt(id,name,examScores,gradeType);	
		}
		String outA="",outB="",outC="",outD="",outF="",outCR="",outNCR="",outAll="";
		
		for(int i=0;i<ste.length;i++){
			String grade = ste[i].findGrade();
			if(grade.equalsIgnoreCase("A")){
				outA=outA+ ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			else if(grade.equalsIgnoreCase("B")){
				outB=outB+ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			else if(grade.equalsIgnoreCase("C")){
				outC=outC+ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			else if(grade.equalsIgnoreCase("D")){
				outD=outD+ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			else if(grade.equalsIgnoreCase("F")){
				outF=outF+ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			else if(grade.equalsIgnoreCase("CR")){
				outCR=outCR+ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			else if(grade.equalsIgnoreCase("NCR")){
				outNCR=outNCR+ste[i].getId() + " " + ste[i].getName() + "\n ( " 
			     + grade+" )\n"+newLine;
			
			}
			
		}
		
		outAll =newLine+ outA + outB + outC +outD+ outF+outCR +outNCR;
		pw.println(outAll);
	    pw.flush();
		//JOptionPane.showMessageDialog(null, outAll);
	}
	
}
