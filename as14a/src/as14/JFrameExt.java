package as14;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExt extends JFrame implements ActionListener {

private JPanel jpMain = new JPanel();
private JPanel jp1 = new JPanel();
private JPanel jp2 = new JPanel();
private JPanel jp3 = new JPanel();
private JLabel jlbFrom = new JLabel("From");
private JLabel jlbTo = new JLabel("To   ");
private JTextField jtfFrom = new JTextField(10);
private JTextField jtfTo = new JTextField(10);
private JButton jbtFtoC = new JButton("FtoC");
private JButton jbtCtoF = new JButton("CtoF");

public JFrameExt() {
	super();

	this.setTitle("Convertor");
	jpMain.setBackground(Color.yellow);
	this.setContentPane(jpMain);
	jp1.setBackground(Color.red);
	jp2.setBackground(Color.green);
	jp3.setBackground(Color.magenta);
	GridLayout gl = new GridLayout (3,1);
	jpMain.setLayout(gl);
	jpMain.add(jp1);
	jpMain.add(jp2);
	jpMain.add(jp3);
	jp1.add(jlbFrom);
	jp1.add(jtfFrom);
	jp2.add(jlbTo);
	jtfTo.setEditable(false);
	jp2.add(jtfTo);
	jp3.add(jbtFtoC);
	jp3.add(jbtCtoF);
	//register youself 
	jbtFtoC.addActionListener(this);
	jbtCtoF.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==jbtFtoC){
//	System.out.println("actionPerformed: jbtFtoC ");	
	String sFrom = jtfFrom.getText().trim();
	double dFrom = Double.parseDouble(sFrom);
	double f = Double.parseDouble(sFrom);
	double c = 5.0/9.0 * (f-32.0);
	jtfTo.setText(""+c);
	}
	else if (e.getSource() == jbtCtoF){
		//System.out.println("actionPerformed: jbtCtoF ");	
		String sFrom = jtfFrom.getText().trim();
		double c = Double.parseDouble(sFrom);
		double f = (9.0/5.0 *  c ) +(32.0);
		jtfTo.setText("" + f );
	}
	
}

}
