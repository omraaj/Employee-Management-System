package employee.management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstPage extends JFrame implements ActionListener {

	FirstPage(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(80,30,1200,60);
		heading.setFont(new Font("Serif",Font.PLAIN,60));
		heading.setForeground(Color.RED);
		add(heading);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(50, 100, 1050, 500);
		add(image);
		
		JButton clickhere = new JButton("CLICK HERE");
		clickhere.setBounds(400, 400, 300, 70);
		clickhere.setBackground(Color.BLACK);
		clickhere.setForeground(Color.WHITE);
//		clickhere.addActionListener(this);
		image.add(clickhere);
		
		
		setLocation(100,50);
		setSize(1170,650);
		setVisible(true);
	}
	
	  public void actionPerformed(ActionEvent ae)
	  {
		setVisible(false);
	  }
	
	public static void main(String[] args) {
		
		new FirstPage();

	}

}
