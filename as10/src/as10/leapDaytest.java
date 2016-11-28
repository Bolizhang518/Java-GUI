package as10;
import javax.swing.JOptionPane;
public class leapDaytest {
	   public static void main(String[] args){
	       
           String in, out;
           int day, month, year;

           in = JOptionPane.showInputDialog("enter the day (dd)");
           day = Integer.parseInt(in);
             
           in = JOptionPane.showInputDialog("enter the month (mm)");
           month = Integer.parseInt(in);
            
           in = JOptionPane.showInputDialog("enter the year (yyyy)");
           year = Integer.parseInt(in);
            
           LeapDay date = new LeapDay (day, month, year);
             
           out = "Day Number for " + date.getMonth() + "/" + date.getDay() +
                 "/" + date.findYear() +" is " + date.findDayNum();
             
           JOptionPane.showMessageDialog(null,out);

    
    }

}
