package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import health.Exercise;
import user.Userinfo;

public class Frame_ExerciseInfo extends JFrame{
	
	Frame_ExerciseInfo(Userinfo u, Exercise e, int i){
		JFrame f = new JFrame();
		
		f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);
		
      
        TextArea story=new TextArea(
				e.toString(),
				0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story.setSize(580,270);
		story.setLocation(0, 375);
		story.setBackground(new Color(0xFFD700));
        story.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        f.add(story);
        
        f.setSize(600,800);
		f.setTitle("운동 소개");
	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    f.setVisible(true);
	    
	   
	    JButton jback = new JButton("뒤로가기");
		f.add(jback);
		jback.setBounds(50,50,100,100);
		
		jback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(i==1) {
					FrameBase.getInstance(new Frame_Chest(u));
					f.dispose();
				}else if(i==2) {
					FrameBase.getInstance(new Frame_back(u));
					f.dispose();
				}else if(i==3) {
					FrameBase.getInstance(new Frame_leg(u));
					f.dispose();
				}else if(i==4) {
					FrameBase.getInstance(new Frame_up(u));
					f.dispose();
				}
				else if(i==5) {
					FrameBase.getInstance(new Frame_down(u));
					f.dispose();
				}
				else if(i==6) {
					FrameBase.getInstance(new Frame_all(u));
					f.dispose();
				}else if(i==7) {
					FrameBase.getInstance(new Frame_stretch(u));
					f.dispose();
				}
			}
		});
	}
	
	public static String addstring(String[] s) {
		String str= null;
		
		for(int i=0;i<s.length;i++) {
			str+=s[i]+"\n";
		}
		
		return str;
	}
	

}
