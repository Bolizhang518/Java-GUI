package as10;
import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args){
	       
        String in, out;
        int day, month;
        
        in = JOptionPane.showInputDialog("enter the day (dd)");
        day = Integer.parseInt(in);

        in = JOptionPane.showInputDialog("enter the month (mm)");
        month = Integer.parseInt(in);

        Day date = new Day (day, month);

        out = "Day Number for " + date.getMonth() + "/" + date.getDay() +
              " is " + date.findDayNum();
        
        JOptionPane.showMessageDialog(null,out);
 
 
 }
}
