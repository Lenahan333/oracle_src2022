package Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import health.Exercise;
import user.Userinfo;

public class Frame_Chest extends JFrame{
	Exercise ex = new Exercise();
	
	public Frame_Chest(Userinfo u) {
		List<Exercise> exlist = ex.ExList_chest();
		JFrame f = new JFrame();
		
		
		f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);

		JButton jback = new JButton("뒤로가기");
		f.add(jback);
		jback.setBounds(50,50,100,100);
		
		
		
		
		
		JButton ex1 = new JButton(exlist.get(0).ExName);
		JButton ex2 = new JButton(exlist.get(1).ExName);
		JButton ex3 = new JButton(exlist.get(2).ExName);
		
		
		f.add(ex1);
		ex1.setBounds(250,200,200,100);
		f.add(ex2);
		ex2.setBounds(250,400,200,100);
		f.add(ex3);
		ex3.setBounds(250,600,200,100);
		
		f.setSize(600,800);
		f.setTitle("가슴");
	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    f.setVisible(true);
	    
	    jback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameBase.getInstance(new Frame_main_male(u));
				f.dispose();
			}
		});

		ex1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameBase.getInstance(new Frame_ExerciseInfo(u,exlist.get(0),1));
			}
		});
		
		ex2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameBase.getInstance(new Frame_ExerciseInfo(u,exlist.get(1),1));
			}
		});
		
		ex3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameBase.getInstance(new Frame_ExerciseInfo(u,exlist.get(2),1));
			}
		});
		
		
		
	}
	
	
}
