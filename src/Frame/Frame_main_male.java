package Frame;

import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import user.Userinfo;

public class Frame_main_male extends JFrame{
	
	
	
	public Frame_main_male(Userinfo u) {
		
		JFrame f = new JFrame();
		
		f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);
		
        
        JButton Chest = new JButton("가슴");
        JButton Back = new JButton("등");
        JButton Leg = new JButton("하체");
        JButton Sale = new JButton("상품 주문");
        f.add(Chest);
        f.add(Back);
        f.add(Leg);
        f.add(Sale);
        
        
        Chest.setBounds(125, 330, 80, 30);
        Back.setBounds(240, 330, 80, 30); 
        Leg.setBounds(340, 330, 80, 30); 
        Sale.setBounds(300, 600, 80, 30); 
    
    f.setSize(600,800);
	f.setTitle("남자");
	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f.setVisible(true);        
	
	Chest.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameBase.getInstance(new Frame_Chest(u)); 
			
			f.dispose();
		}
	});
	
	Back.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameBase.getInstance(new Frame_back(u)); 
			
			f.dispose();
		}
	});
	
	Leg.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameBase.getInstance(new Frame_leg(u)); 
			
			f.dispose();
		}
	});
	
    Sale.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			FrameBase.getInstance(new FrameCategory(u));
			f.dispose();
		}
	});
	}
}