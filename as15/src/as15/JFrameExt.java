package as15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExt extends JFrame implements ActionListener{

private JPanelExt jpe = new JPanelExt();
private JPanel jp = new JPanel ();
private JPanel jpMain = new JPanel();
private JButton jbtHappy = new JButton("Happy");
private JButton jbtSad = new JButton("sad");
private JButton jbtPicture = new JButton("Picture");

public JFrameExt() {
	jp.setBackground(Color.magenta);
	jpe.setBackground(Color.cyan);
	this.setContentPane(jpMain);
	BorderLayout bl = new BorderLayout();
	jpMain.setLayout(bl);
	jpMain.add(jpe,BorderLayout.CENTER);
	jpMain.add(jp, BorderLayout.SOUTH); 
	jp.add(jbtHappy);
	jp.add(jbtSad);
	jp.add(jbtPicture);
	jbtHappy.addActionListener(this);
	jbtSad.addActionListener(this);
	jbtPicture.addActionListener(this);
}
@Override 
public void actionPerformed(ActionEvent e){
	if (e.getSource() == jbtHappy){
		jpe.setPicType("Happy");
		jpe.repaint();
	}
	else if (e.getSource() == jbtSad){
		jpe.setPicType("Sad");
	}
	else if(e.getSource() == jbtPicture){
		jpe.setPicType("Picture");
	}
}

}
