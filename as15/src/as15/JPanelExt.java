package as15;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelExt extends JPanel {
	private String picType = "Happy";
	
		public JPanelExt(){
		
		}
		@Override 
		public void paintComponent (Graphics g){
			super.paintComponent(g);
			if(picType.equalsIgnoreCase("happy")){
				g.drawOval(0,0,100,100);
			      g.fillOval(25,25,10,10);
			      g.fillOval(65,25,10,10);
			      g.drawArc(25,25,50,50,0,-180);
			}
			else if (picType.equalsIgnoreCase("sad")){
			    g.drawOval(0,0,100,100);
			      g.fillOval(25,25,10,10);
			      g.fillOval(65,25,10,10);
			      g.drawArc(25,50,50,50,0,180);
			}
			else if (picType.equalsIgnoreCase("picture")){
				
				java.net.URL url = getClass( ).getResource ("myfile.gif");
		          ImageIcon imageIcon = new ImageIcon (url);
		          Image image = imageIcon.getImage( );
				g.drawImage (image,0,0,this.getWidth( ), this.getHeight ( ) , this);
			}
		}
		public String getPicType() {
			return picType;
		}
		public void setPicType(String picType) {
			this.picType = picType;
			repaint();
		}

}
