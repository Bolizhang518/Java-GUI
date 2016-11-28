package JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExt extends JFrame{
	private double north;
	private double south;
	private double east;
	private double west;
	private double midwest;
	private JPanel jpMain = new JPanel();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	
	public JFrameExt(double north, double south, double east, double west, double midwest) 
			 {
		super();
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.midwest = midwest;
		
		jpMain.setBackground(Color.yellow);
		this.setContentPane(jpMain);
		jp1.setBackground(Color.red);
		jp2.setBackground(Color.green);
		jp3.setBackground(Color.magenta);
		jpMain.add(jp1);
		jpMain.add(jp2);
		jpMain.add(jp3);
		
	}
	public JFrameExt (){
		
	}
	@Override
	 public void paint ( Graphics g){
		double total = north + south + east +west+midwest;
		int startAngle = 0;
		int arcLength = 0;
		g.setColor(Color.green);
		startAngle =0;
		arcLength = (int) ( north / total  *  360 );
		g.fillArc(50, 50, 400, 400, startAngle, arcLength);
		
		g.setColor(Color.red);
		startAngle = startAngle + arcLength;
		arcLength = (int) ( south / total  *  360 );
		g.fillArc(50, 50, 400, 400, startAngle, arcLength);
		
		g.setColor(Color.blue);
		startAngle = startAngle + arcLength;
		arcLength = (int) ( east / total  *  360 );
		g.fillArc(50, 50, 400, 400, startAngle, arcLength);
		
		g.setColor(Color.yellow);
		startAngle = startAngle + arcLength;
		arcLength = (int) ( west / total  *  360 );
		g.fillArc(50, 50, 400, 400, startAngle, arcLength);
		
		g.setColor(Color.magenta);
		startAngle = startAngle + arcLength;
		arcLength = (int) ( midwest / total  *  360 );
		g.fillArc(50, 50, 400, 400, startAngle, arcLength);
		
	
	}
	
//private double north;
//private double south;
//private double east;
//private double west;
//private double midwest;
//private JPanel jpMain = new JPanel();
//private JPanel jp1 = new JPanel();
//private JPanel jp2 = new JPanel();
//private JPanel jp3 = new JPanel();
//
//public JFrameExt(double north, double south, double east, double west, double midwest) {
//	super();
//	this.north = north;
//	this.south = south;
//	this.east = east;
//	this.west = west;
//	this.midwest = midwest;
//	this.setTitle("Pie chart");
//	jpMain.setBackground(Color.yellow);
//	this.setContentPane(jpMain);
//	jp1.setBackground(Color.red);
//	jp2.setBackground(Color.green);
//	jp3.setBackground(Color.magenta);
//	jpMain.add(jp1);
//	jpMain.add(jp2);
//	jpMain.add(jp3);
//}

}
