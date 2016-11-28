package as11;

import javax.swing.JOptionPane;

public class Student implements Status{
  private int id;
  private String name;
  private int[] scores;
  
public Student(int id, String name, int[] scores) {
	super();
	this.id = id;
	this.name = name;
	this.scores = scores;
}
@Override
public String getStatus() {
	// TODO Auto-generated method stub
	String status = " Student\n";
		status = status + "Id: " + id +
				", name = " + name + ", scores ";
	for (int i = 0;i<scores.length; i ++){
		status = status + scores[i] + " ";
	}
	status = status + "\n";
	return status;
}

@Override
public void displayStatus() {
	String status = getStatus();
	JOptionPane.showMessageDialog(null, status);
	
}
  
}
