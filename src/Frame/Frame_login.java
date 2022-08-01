package Frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import user.Userinfo;

public class Frame_login extends JFrame{
	
	
	public Frame_login(){
		
		JFrame f = new JFrame();
		
		f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);
		
		Label b2= new Label("아이디");
		f.add(b2);
		Label b3= new Label("비밀번호");
		f.add(b3);
		TextField b4 = new TextField();
		f.add(b4);
		TextField b5 = new TextField();
		f.add(b5);
		b5.setEchoChar('*');//암호화
		b4.setFocusTraversalKeysEnabled(false);
		b4.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()== KeyEvent.VK_TAB) {
				b5.requestFocus();
			}
		}
		});
		
		
		JButton b6 = new JButton("로그인");
		JRootPane rootp = rootPane.getRootPane();
		rootp.setDefaultButton(b6);
		f.add(b6);
		JButton register = new JButton("회원가입");
		
		f.add(register);
		
		b2.setBounds(40, 265, 40, 40);
		b3.setBounds(40, 305, 60, 40);
		b4.setBounds(150, 265, 200, 30);
		b5.setBounds(150, 305, 200, 30);
		b6.setBounds(380, 265, 80, 30);
		register.setBounds(380, 305, 90, 30);
		
		//벡터는 이제 잘 안 쓰는 객체
		//
		List<Component> order = new ArrayList<>();
		order.add(b4);
		order.add(b5);
		order.add(b6);
		order.add(register);
		
		
		
		f.setSize(600, 800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("로그인 화면 ");
		f.setVisible(true);
		
		
		
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {//로그인 할때 
				Userinfo user = new Userinfo();
				
				Map<String,Userinfo> map = user.userlist();
				
				
					
					if(!map.containsKey(b4.getText())){
						JOptionPane.showMessageDialog(null, "입력하신 아이디가 존재하지 않습니다.");
					}else{
						if(map.get(b4.getText()).getUserPwd().equals(b5.getText())) {
							JOptionPane.showMessageDialog(null, "로그인이 되었습니다.");
							
							FrameBase.getInstance(new Frame_cross(map.get(b4.getText())));
							f.dispose();
						}else {
							JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
						}
					} 
					
				
			}
		});// 버튼 b6
		
		
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame_joinmember fj = new Frame_joinmember();		
				}
		});
		
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_ENTER) {
			Toolkit.getDefaultToolkit().beep();
		
		}
	}
	

}
