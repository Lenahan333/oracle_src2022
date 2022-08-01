package Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import user.Userinfo;

public class Frame_main_female extends JFrame{
	
	
	public Frame_main_female(Userinfo u) {
		
		JFrame f = new JFrame();
		
		f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);
		
        
        JButton Up = new JButton("상체");
        JButton Down = new JButton("하체");
        JButton All = new JButton("전신");
        JButton Sale = new JButton("상품 주문");
        f.add(Up);
        f.add(Down);
        f.add(All);
        f.add(Sale);
        
        
        Up.setBounds(125, 330, 80, 30);
        Down.setBounds(240, 330, 80, 30); 
        All.setBounds(340, 330, 80, 30); 
        Sale.setBounds(300, 550, 130, 30); 
    
        f.setSize(600,800);
        f.setTitle("여자");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);  
	
    
    Up.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameBase.getInstance(new Frame_up(u)); 
			f.dispose();
		}
	});
    
    
    Down.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameBase.getInstance(new Frame_down(u)); 
			f.dispose();
		}
	});
    
    
    All.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameBase.getInstance(new Frame_all(u)); 
			f.dispose();
		}
	});
    
    Sale.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			FrameBase.getInstance(new FrameCategory(u));
			f.dispose();
		}
	});
	}
}