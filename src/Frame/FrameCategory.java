package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Items.FoodCategory;
import Items.FoodInformation;
import Items.Item;
import Items.ItemCollect;
import user.Userinfo;

public class FrameCategory extends JFrame{
	
	public FrameCategory(Userinfo u) {
		
	    JFrame f=new JFrame("상품 카테고리 선택");
	     
	    f.setBounds(500,100,600,800);
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        //보충제
        
		ImageIcon protein = new ImageIcon("보충제.png");
		JButton btnProtein = new JButton(protein);
		btnProtein.setName("보충제");
		
		btnProtein.setSize(170,160);
		btnProtein.setLocation(82,110);
		btnProtein.setBorderPainted(false);
		btnProtein.setContentAreaFilled(false);
		btnProtein.setFocusPainted(false);		
		f.add(btnProtein);
		
		JLabel l1=new JLabel();
		l1.setText("프로틴");
		l1.setFont(new Font("Serif",Font.BOLD,11));
		l1.setFont((l1.getFont().deriveFont(15.0f)));
		l1.setBounds(getBounds());
	

		f.add(l1);
		
		
		
 		btnProtein.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList a1=ItemCollect.getProtein();
				f.dispose();
				FrameBase.getInstance(new FrameItemsInfo(u,a1));
				
			}
		});
		
		//----------------------------------------------------
		//간식
		ImageIcon snack = new ImageIcon("간식.png");
		JButton btnSnack = new JButton(snack);
		btnSnack.setName("간식");

		btnSnack.setSize(160,160);
		btnSnack.setLocation(330,110);
		btnSnack.setBorderPainted(false);
		btnSnack.setContentAreaFilled(false);
		btnSnack.setFocusPainted(false);
		f.add(btnSnack);
		
		
		btnSnack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList a1=ItemCollect.getSnack();
				f.dispose();
				FrameBase.getInstance(new FrameItemsInfo(u,a1));
				
			}
		});
		
		//----------------------------------------------------
		//닭가슴살 
		ImageIcon chicken = new ImageIcon("닭가슴살.png");
		JButton btnChicken = new JButton(chicken);
		btnChicken.setName("닭가슴살");

		btnChicken.setSize(160,160);
		btnChicken.setLocation(82,340);
		btnChicken.setBorderPainted(false);
		btnChicken.setContentAreaFilled(false);
		btnChicken.setFocusPainted(false);
		f.add(btnChicken);
		
		
		btnChicken.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ArrayList a1=ItemCollect.getChicken();
				f.dispose();
				FrameBase.getInstance(new FrameItemsInfo(u,a1));
				
			}
		});
		
		//----------------------------------------------------
		//샐러드
		
		ImageIcon salad = new ImageIcon("샐러드.png");
		JButton btnSalad = new JButton(salad);
		btnSalad.setName("샐러드");

		btnSalad.setSize(160,160);
		btnSalad.setLocation(330,340);
		btnSalad.setBorderPainted(false);
		btnSalad.setContentAreaFilled(false);
		btnSalad.setFocusPainted(false);
		f.add(btnSalad);
		
		
		btnSalad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ArrayList a1=ItemCollect.getSalad();
				f.dispose();
				FrameBase.getInstance(new FrameItemsInfo(u,a1));
				
			}
		});
		
		// 하단
		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setLayout(null);
		bottomSet.setBackground(Color.white);

		JButton btnBack = new JButton("뒤로가기");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(u.getUserGender().equals("M")) {
					f.dispose();
					FrameBase.getInstance(new Frame_main_male(u));
				}
				else {
					f.dispose();
				FrameBase.getInstance(new Frame_main_female(u));
				}
					
				
			}
		});
		
		JButton btnNext = new JButton("장바구니");

		btnNext.setBackground(new Color(0xA6A6A6));
		btnNext.setSize(183, 87);
		btnNext.setLocation(391, 0);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnNext);
		
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				f.dispose();
				FrameBase.getInstance(new FrameBasket(u));
				
			}
		});
		bottomSet.add(btnNext);
		f.add(bottomSet, BorderLayout.SOUTH);
		f.setVisible(true);
	}


}
