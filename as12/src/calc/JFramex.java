package calc;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFramex extends JFrame implements ActionListener{
	
	JPanel jpMain = new JPanel();
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JPanel jp4 = new JPanel();
	
	JLabel jlbNum1 = new JLabel("Num1");
	JTextField jtfNum1 = new JTextField(10);
	JLabel jlbNum2 = new JLabel("Num2");
	JTextField jtfNum2 = new JTextField(10);
	JLabel jlbNum3 = new JLabel("Result");
	JTextField jtfNum3 = new JTextField(10);
	JButton jbtAdd = new JButton("Add");
	JButton jbtSub = new JButton("Sub");
	JButton jbtMult = new JButton("Mult");
	JButton jbtDiv = new JButton("Div");
	JButton jbtClear = new JButton("Clear");
	
	
	
	public JFramex (){
	this.setContentPane(jpMain);
	jpMain.setBackground(Color.yellow);
	GridLayout gl = new GridLayout(4,1);
	jpMain.setLayout(gl);
	
	jpMain.add(jp1);
	jpMain.add(jp2);
	jpMain.add(jp3);
	jpMain.add(jp4);
	
	
	
	jp1.setBackground(Color.red);
	jp2.setBackground(Color.green);
	jp3.setBackground(Color.magenta);
	jp4.setBackground(Color.cyan);
	jp1.add(jlbNum1);
	jp1.add(jtfNum1);
	jp2.add(jlbNum2);
	jp2.add(jtfNum2);
	jp3.add(jlbNum3);
	jp3.add(jtfNum3);
	jp4.add(jbtAdd);
	jp4.add(jbtSub);
	jp4.add(jbtMult);
	jp4.add(jbtDiv);
	jp4.add(jbtClear);
	//register  with button 
	jbtAdd.addActionListener(this);
	jbtSub.addActionListener(this);
	jbtMult.addActionListener(this);
	jbtDiv.addActionListener(this);
	jbtClear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		if(ev.getSource()==jbtClear){
			jtfNum1.setText("");
			jtfNum2.setText("");
			jtfNum3.setText("");
			return;
			
		}
		String snum1 = jtfNum1.getText().trim();
		String snum2 = jtfNum2.getText().trim();
		double num1 = Double.parseDouble(snum1);
		double num2 = Double.parseDouble(snum2);
		
		if(ev.getSource()==jbtAdd){
	
		double res = num1 + num2;
		jtfNum3.setText(""+res);
		}
		else if ((ev.getSource()==jbtSub)){
			double res = num1 - num2;
			jtfNum3.setText(""+res);
		}
		else if ((ev.getSource()==jbtMult)){
			double res = num1 * num2;
			jtfNum3.setText(""+res);
		}
		else if ((ev.getSource()==jbtDiv)){
			double res = num1 / num2;
			jtfNum3.setText(""+res);
			
		}
		else if ((ev.getSource()==jbtClear)){
			JOptionPane.showMessageDialog(null, "Clear button clicked");
		}
	}
	
}
