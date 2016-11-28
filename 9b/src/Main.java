import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception
	  {
		
	    BufferedReader br = new BufferedReader(new FileReader("in.txt"));
	    PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));
	    
	    String in,out = null,name=null,gradeType=null;
		int id=0,examCount;
		int[] examScores=null;
	    in = br.readLine();
	    int stCount = Integer.parseInt(in);
	    for(int i=0;i < stCount;i++){
	    	in= br.readLine();
	    	  pw.println(in);
	    	  pw.flush();
	    	StringTokenizer stk = new StringTokenizer(in,",");
			in = stk.nextToken().trim();
			id = Integer.parseInt(in);
			name = stk.nextToken().trim();
			
			in = stk.nextToken().trim();
			examCount = Integer.parseInt(in);
			examScores = new int [examCount];
	    }
	    //Create a PrintWriter object for outputting to a file out.txt.
	 //out = "1 John Adam (A) \n";
	 //out = out + "5 Mary Russell (A) \n";
	    
	    pw.println(out);
	    pw.flush();
	    
	    //input the first line of the file containing the number of students
	  // = br.readLine();
	 //   studentCount = Integer.parseInt(in);
}
	
}
	
