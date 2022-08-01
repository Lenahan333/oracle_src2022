package Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import health.Exercise;
import user.Userinfo;

public class Frame_cross extends JFrame{

	public Frame_cross(Userinfo u) {
		
		JFrame f = new JFrame();
		
		f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);
		
		JButton exercise = new JButton("운동하기");
		JButton purchase = new JButton("구매하기");
		JButton stretch = new JButton("스트레칭");
		
		exercise.setBounds(300,200,100,100);
		purchase.setBounds(300,400,100,100);
		stretch.setBounds(300,600,100,100);
		
		
		f.add(exercise);
		f.add(purchase);
		f.add(stretch);
		
		
		f.setVisible(true);
		
		
		exercise.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(u.getUserGender().equals("M")) {
				FrameBase.getInstance(new Frame_main_male(u));
				f.dispose();
				}else {
					FrameBase.getInstance(new Frame_main_female(u));
					f.dispose();
				}
			}
		});
		
		
		purchase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameBase.getInstance(new FrameCategory(u));
			}
		});
		
		stretch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				FrameBase.getInstance(new Frame_stretch(u));
			}
		});
	}
}
