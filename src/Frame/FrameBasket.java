package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Items.ItemCollect;
import Items.MyItem;
import Frame.FrameBase;
import Frame.FrameBasket;
import user.Userinfo;


public class FrameBasket extends JFrame{
	
	public FrameBasket(Userinfo u) {
		
		JFrame f=new JFrame("장바구니");

		f.setBackground(Color.white);
		f.setLayout(null);
		f.setSize(600, 800);
		f.setLocationRelativeTo(null);
		
		Font font1 = (new Font("MONOSPACED", Font.BOLD , 15));
		Font font2 = (new Font("MONOSPACED", Font.BOLD , 17));
		
		//장바구니 틀
		JPanel basket = new JPanel(); 
		basket.setLayout(null);
		basket.setBounds(10, 10, 560, 550); 
		basket.setBackground(Color.white);
		basket.setBorder(new TitledBorder( null, "장바구니", TitledBorder.CENTER, TitledBorder.TOP, new Font("MONOSPACED", Font.BOLD , 25), new Color(000, 000, 000) ));

		JLabel list = new JLabel("    상품명     	     판매가격    수량    총 금액");
		list.setBounds(50, -40, 500, 200);
		list.setFont(font2);
		basket.add(list);
		
		JLabel name[]=new JLabel[16];
		JLabel price[]=new JLabel[16];
		JLabel count[]=new JLabel[16];
		JLabel total[]=new JLabel[16];
		
		JSpinner s = new JSpinner();
		s.setSize(40,20);

		JCheckBox c=new JCheckBox();
		c.setSize(20,20);
		
		JCheckBox jb[]=new JCheckBox[16];
		JSpinner js[]=new JSpinner[16];
			
		if(!MyItem.buylist.isEmpty()) {

			for(int i=0; i<MyItem.buylist.size(); i++) {
				
				switch(i) {
				case 0 :
					
					int value0 = 0 ;
					value0 += MyItem.buylist.get(0).getCount();
					
					name[0] = new JLabel(MyItem.buylist.get(0).getName()); 
					price[0] = new JLabel(MyItem.buylist.get(0).getPrice()+"원"); 
					count[0] = new JLabel(MyItem.buylist.get(0).getCount()+"개");
					total[0] = new JLabel(value0*MyItem.buylist.get(0).getPrice()+"원");
										
					name[0].setFont(font1);
					price[0].setFont(font1);
					count[0].setFont(font1);
					total[0].setFont(font1);

					basket.add(name[0]);
					basket.add(price[0]);
					basket.add(count[0]);
					basket.add(total[0]);
					
					name[0].setBounds(40, 15, 220, 200);
					price[0].setBounds(250,15,110,200);
					count[0].setBounds(360,15,60,200);
					total[0].setBounds(430,15,100,200);
					
					jb[0]=new JCheckBox();
					jb[0].setSize(c.getSize());
					jb[0].setLocation(12,105);
					basket.add(jb[0]);
					
					js[0] = new JSpinner();
					js[0].setValue(value0);
					js[0].setLocation(500, 105);
					js[0].setSize(s.getSize());
					basket.add(js[0]);
					
					js[0].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
							if(!e.getSource().equals(0)) {
						MyItem.buylist.get(0).setCount((int)((JSpinner)e.getSource()).getValue());
						count[0].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[0].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(0).getPrice()+"원");	
							}
						}
					});

					
					break;
		
				case 1 :
					int value1 = 0 ;
					value1 += MyItem.buylist.get(1).getCount();
					
					name[1] = new JLabel(MyItem.buylist.get(1).getName()); 
					price[1] = new JLabel(MyItem.buylist.get(1).getPrice()+"원"); 
					count[1] = new JLabel(MyItem.buylist.get(1).getCount()+"개");
					total[1] = new JLabel(value1*MyItem.buylist.get(1).getPrice()+"원");
					

					name[1].setFont(font1);
					price[1].setFont(font1);
					count[1].setFont(font1);
					total[1].setFont(font1);

					basket.add(name[1]);
					basket.add(price[1]);
					basket.add(count[1]);
					basket.add(total[1]);
					
					name[1].setBounds(40, 40, 220, 200);
					price[1].setBounds(250,40,110,200);
					count[1].setBounds(360,40,60,200);
					total[1].setBounds(430,40,100,200);
					
					jb[1]=new JCheckBox();
					jb[1].setSize(c.getSize());
					jb[1].setLocation(12,130);
					basket.add(jb[1]);
					
					js[1] = new JSpinner();
					js[1].setValue(value1);
					js[1].setLocation(500, 130);
					js[1].setSize(s.getSize());
					basket.add(js[1]);
						
					js[1].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(1).setCount((int)((JSpinner)e.getSource()).getValue());
						count[1].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[1].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(1).getPrice()+"원");	
						}
					});
					
					
					break;
		
				case 2 :
					int value2 = 0 ;
					value2 += MyItem.buylist.get(2).getCount();
					
					name[2] = new JLabel(MyItem.buylist.get(2).getName()); 
					price[2] = new JLabel(MyItem.buylist.get(2).getPrice()+"원"); 
					count[2] = new JLabel(MyItem.buylist.get(2).getCount()+"개");
					total[2] = new JLabel(value2*MyItem.buylist.get(2).getPrice()+"원");
					

					name[2].setFont(font1);
					price[2].setFont(font1);
					count[2].setFont(font1);
					total[2].setFont(font1);

					basket.add(name[2]);
					basket.add(price[2]);
					basket.add(count[2]);
					basket.add(total[2]);
					
					name[2].setBounds(40, 65, 220, 200);
					price[2].setBounds(250,65,110,200);
					count[2].setBounds(360,65,60,200);
					total[2].setBounds(430,65,100,200);
					
					jb[2]=new JCheckBox();
					jb[2].setSize(c.getSize());
					jb[2].setLocation(12,155);
					basket.add(jb[2]);
					
					js[2] = new JSpinner();
					js[2].setValue(value2);
					js[2].setLocation(500, 155);
					js[2].setSize(s.getSize());
					basket.add(js[2]);
						
					js[2].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(2).setCount((int)((JSpinner)e.getSource()).getValue());	
						count[2].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[2].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(2).getPrice()+"원");	
						}
					});
					
					break;
		
				case 3 :
					int value3 = 0 ;
					value3 += MyItem.buylist.get(3).getCount();
					
					name[3] = new JLabel(MyItem.buylist.get(3).getName()); 
					price[3] = new JLabel(MyItem.buylist.get(3).getPrice()+"원"); 
					count[3] = new JLabel(MyItem.buylist.get(3).getCount()+"개");
					total[3] = new JLabel(value3*MyItem.buylist.get(3).getPrice()+"원");
					

					name[3].setFont(font1);
					price[3].setFont(font1);
					count[3].setFont(font1);
					total[3].setFont(font1);

					basket.add(name[3]);
					basket.add(price[3]);
					basket.add(count[3]);
					basket.add(total[3]);
					
					name[3].setBounds(40, 90, 220, 200);
					price[3].setBounds(250,90,110,200);
					count[3].setBounds(360,90,60,200);
					total[3].setBounds(430,90,100,200);
					
					jb[3]=new JCheckBox();
					jb[3].setSize(c.getSize());
					jb[3].setLocation(12,180);
					basket.add(jb[3]);

					js[3] = new JSpinner();
					js[3].setValue(value3);
					js[3].setLocation(500, 180);
					js[3].setSize(s.getSize());
					basket.add(js[3]);
						
					js[3].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(3).setCount((int)((JSpinner)e.getSource()).getValue());		
						count[3].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[3].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(3).getPrice()+"원");	
						}
					});
					
					break;
		
				case 4 :
					int value4 = 0 ;
					value4 += MyItem.buylist.get(4).getCount();
					
					name[4] = new JLabel(MyItem.buylist.get(4).getName()); 
					price[4] = new JLabel(MyItem.buylist.get(4).getPrice()+"원"); 
					count[4] = new JLabel(MyItem.buylist.get(4).getCount()+"개");
					total[4] = new JLabel(value4*MyItem.buylist.get(4).getPrice()+"원");
					

					name[4].setFont(font1);
					price[4].setFont(font1);
					count[4].setFont(font1);
					total[4].setFont(font1);

					basket.add(name[4]);
					basket.add(price[4]);
					basket.add(count[4]);
					basket.add(total[4]);
					
					name[4].setBounds(40, 115, 220, 200);
					price[4].setBounds(250,115,110,200);
					count[4].setBounds(360,115,60,200);
					total[4].setBounds(430,115,100,200);
					
					jb[4]=new JCheckBox();
					jb[4].setSize(c.getSize());
					jb[4].setLocation(12,205);
					basket.add(jb[4]);
					
					js[4] = new JSpinner();
					js[4].setValue(value4);
					js[4].setLocation(500, 205);
					js[4].setSize(s.getSize());
					basket.add(js[4]);
					
					js[4].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(4).setCount((int)((JSpinner)e.getSource()).getValue());
						count[4].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[4].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(4).getPrice()+"원");	
						}
					});
						
					break;
		
				case 5 :
					int value5 = 0 ;
					value5 += MyItem.buylist.get(5).getCount();
					
					name[5] = new JLabel(MyItem.buylist.get(5).getName()); 
					price[5] = new JLabel(MyItem.buylist.get(5).getPrice()+"원"); 
					count[5] = new JLabel(MyItem.buylist.get(5).getCount()+"개");
					total[5] = new JLabel(value5*MyItem.buylist.get(5).getPrice()+"원");
					

					name[5].setFont(font1);
					price[5].setFont(font1);
					count[5].setFont(font1);
					total[5].setFont(font1);

					basket.add(name[5]);
					basket.add(price[5]);
					basket.add(count[5]);
					basket.add(total[5]);
					
					name[5].setBounds(40, 140, 220, 200);
					price[5].setBounds(250,140,110,200);
					count[5].setBounds(360,140,60,200);
					total[5].setBounds(430,140,100,200);
					
					jb[5]=new JCheckBox();
					jb[5].setSize(c.getSize());
					jb[5].setLocation(12,230);
					basket.add(jb[5]);
					
					js[5] = new JSpinner();
					js[5].setValue(value5);
					js[5].setLocation(500, 230);
					js[5].setSize(s.getSize());
					basket.add(js[5]);
						
					js[5].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
					    MyItem.buylist.get(5).setCount((int)((JSpinner)e.getSource()).getValue());
						count[5].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[5].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(5).getPrice()+"원");	
						}
					});
					
					break;
		
				case 6 :
					int value6 = 0 ;
					value6 += MyItem.buylist.get(6).getCount();
					
					name[6] = new JLabel(MyItem.buylist.get(6).getName()); 
					price[6] = new JLabel(MyItem.buylist.get(6).getPrice()+"원"); 
					count[6] = new JLabel(MyItem.buylist.get(6).getCount()+"개");
					total[6] = new JLabel(value6*MyItem.buylist.get(6).getPrice()+"원");
					

					name[6].setFont(font1);
					price[6].setFont(font1);
					count[6].setFont(font1);
					total[6].setFont(font1);

					basket.add(name[6]);
					basket.add(price[6]);
					basket.add(count[6]);
					basket.add(total[6]);
					
					name[6].setBounds(40, 165, 220, 200);
					price[6].setBounds(250,165,110,200);
					count[6].setBounds(360,165,60,200);
					total[6].setBounds(430,165,100,200);
					
					jb[6]=new JCheckBox();
					jb[6].setSize(c.getSize());
					jb[6].setLocation(12,255);
					basket.add(jb[6]);
					
					js[6] = new JSpinner();
					js[6].setValue(value6);
					js[6].setLocation(500, 255);
					js[6].setSize(s.getSize());
					basket.add(js[6]);
						
					js[6].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(6).setCount((int)((JSpinner)e.getSource()).getValue());		
						count[6].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[6].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(6).getPrice()+"원");	
						}
					});
					
					break;
		
				case 7 :
					int value7 = 0 ;
					value7 += MyItem.buylist.get(7).getCount();
					
					name[7] = new JLabel(MyItem.buylist.get(7).getName()); 
					price[7] = new JLabel(MyItem.buylist.get(7).getPrice()+"원"); 
					count[7] = new JLabel(MyItem.buylist.get(7).getCount()+"개");
					total[7] = new JLabel(value7*MyItem.buylist.get(7).getPrice()+"원");
					

					name[7].setFont(font1);
					price[7].setFont(font1);
					count[7].setFont(font1);
					total[7].setFont(font1);

					basket.add(name[7]);
					basket.add(price[7]);
					basket.add(count[7]);
					basket.add(total[7]);
					
					name[7].setBounds(40, 190, 220, 200);
					price[7].setBounds(250,190,110,200);
					count[7].setBounds(360,190,60,200);
					total[7].setBounds(430,190,100,200);
					
					jb[7]=new JCheckBox();
					jb[7].setSize(c.getSize());
					jb[7].setLocation(12,280);
					basket.add(jb[7]);
					
					js[7] = new JSpinner();
					js[7].setValue(value7);
					js[7].setLocation(500, 280);
					js[7].setSize(s.getSize());
					basket.add(js[7]);
					
					js[7].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(7).setCount((int)((JSpinner)e.getSource()).getValue());
						count[7].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[7].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(7).getPrice()+"원");	
						}
					});
						
					break;
		
				case 8 :
					int value8 = 0 ;
					value8 += MyItem.buylist.get(8).getCount();
					
					name[8] = new JLabel(MyItem.buylist.get(8).getName()); 
					price[8] = new JLabel(MyItem.buylist.get(8).getPrice()+"원"); 
					count[8] = new JLabel(MyItem.buylist.get(8).getCount()+"개");
					total[8] = new JLabel(value8*MyItem.buylist.get(8).getPrice()+"원");
					

					name[8].setFont(font1);
					price[8].setFont(font1);
					count[8].setFont(font1);
					total[8].setFont(font1);

					basket.add(name[8]);
					basket.add(price[8]);
					basket.add(count[8]);
					basket.add(total[8]);
					
					name[8].setBounds(40, 215, 220, 200);
					price[8].setBounds(250,215,110,200);
					count[8].setBounds(360,215,60,200);
					total[8].setBounds(430,215,100,200);
					
					jb[8]=new JCheckBox();
					jb[8].setSize(c.getSize());
					jb[8].setLocation(12,305);
					basket.add(jb[8]);
					
					js[8] = new JSpinner();
					js[8].setValue(value8);
					js[8].setLocation(500, 305);
					js[8].setSize(s.getSize());
					basket.add(js[8]);
					
					js[8].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(8).setCount((int)((JSpinner)e.getSource()).getValue());		
						count[8].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[8].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(8).getPrice()+"원");	
						}
					});
						
					break;
				case 9 :
					int value9 = 0 ;
					value9 += MyItem.buylist.get(9).getCount();
					
					name[9] = new JLabel(MyItem.buylist.get(9).getName()); 
					price[9] = new JLabel(MyItem.buylist.get(9).getPrice()+"원"); 
					count[9] = new JLabel(MyItem.buylist.get(9).getCount()+"개");
					total[9] = new JLabel(value9*MyItem.buylist.get(9).getPrice()+"원");
					

					name[9].setFont(font1);
					price[9].setFont(font1);
					count[9].setFont(font1);
					total[9].setFont(font1);

					basket.add(name[9]);
					basket.add(price[9]);
					basket.add(count[9]);
					basket.add(total[9]);
					
					name[9].setBounds(40, 240, 220, 200);
					price[9].setBounds(250,240,110,200);
					count[9].setBounds(360,240,60,200);
					total[9].setBounds(430,240,100,200);
					
					jb[9]=new JCheckBox();
					jb[9].setSize(c.getSize());
					jb[9].setLocation(12,330);
					basket.add(jb[9]);
					
					js[9] = new JSpinner();
					js[9].setValue(value9);
					js[9].setLocation(500, 330);
					js[9].setSize(s.getSize());
					basket.add(js[9]);
					
					js[9].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(9).setCount((int)((JSpinner)e.getSource()).getValue());
						count[9].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[9].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(9).getPrice()+"원");	
						}
					});
						
					break;
		
				case 10 :
					int value10 = 0 ;
					value10 += MyItem.buylist.get(10).getCount();
					
					name[10] = new JLabel(MyItem.buylist.get(10).getName()); 
					price[10] = new JLabel(MyItem.buylist.get(10).getPrice()+"원"); 
					count[10] = new JLabel(MyItem.buylist.get(10).getCount()+"개");
					total[10] = new JLabel(value10*MyItem.buylist.get(10).getPrice()+"원");
					

					name[10].setFont(font1);
					price[10].setFont(font1);
					count[10].setFont(font1);
					total[10].setFont(font1);

					basket.add(name[10]);
					basket.add(price[10]);
					basket.add(count[10]);
					basket.add(total[10]);
					
					name[10].setBounds(40, 265, 220, 200);
					price[10].setBounds(250,265,110,200);
					count[10].setBounds(360,265,60,200);
					total[10].setBounds(430,265,100,200);
					
					jb[10]=new JCheckBox();
					jb[10].setSize(c.getSize());
					jb[10].setLocation(12,355);
					basket.add(jb[10]);
					
					js[10] = new JSpinner();
					js[10].setValue(value10);
					js[10].setLocation(500, 355);
					js[10].setSize(s.getSize());
					basket.add(js[10]);
					
					js[10].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
					    MyItem.buylist.get(10).setCount((int)((JSpinner)e.getSource()).getValue());			
						count[10].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[10].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(10).getPrice()+"원");	
						}
					});	
					
					break;
				case 11 :
					int value11 = 0 ;
					value11 += MyItem.buylist.get(11).getCount();
					
					name[11] = new JLabel(MyItem.buylist.get(11).getName()); 
					price[11] = new JLabel(MyItem.buylist.get(11).getPrice()+"원"); 
					count[11] = new JLabel(MyItem.buylist.get(11).getCount()+"개");
					total[11] = new JLabel(value11*MyItem.buylist.get(11).getPrice()+"원");
					

					name[11].setFont(font1);
					price[11].setFont(font1);
					count[11].setFont(font1);
					total[11].setFont(font1);

					basket.add(name[11]);
					basket.add(price[11]);
					basket.add(count[11]);
					basket.add(total[11]);
					
					name[11].setBounds(40, 290, 220, 200);
					price[11].setBounds(250,290,110,200);
					count[11].setBounds(360,290,60,200);
					total[11].setBounds(430,290,100,200);
					
				    jb[11]=new JCheckBox();
					jb[11].setSize(c.getSize());
					jb[11].setLocation(12,380);
					basket.add(jb[11]);

					js[11] = new JSpinner();
					js[11].setValue(value11);
					js[11].setLocation(500, 380);
					js[11].setSize(s.getSize());
					basket.add(js[11]);
						
					js[11].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(11).setCount((int)((JSpinner)e.getSource()).getValue());		
						count[11].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[11].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(11).getPrice()+"원");	
						}
					});
					
					break;
		
				case 12 :
					int value12 = 0 ;
					value12 += MyItem.buylist.get(12).getCount();
					
					name[12] = new JLabel(MyItem.buylist.get(12).getName()); 
					price[12] = new JLabel(MyItem.buylist.get(12).getPrice()+"원"); 
					count[12] = new JLabel(MyItem.buylist.get(12).getCount()+"개");
					total[12] = new JLabel(value12*MyItem.buylist.get(12).getPrice()+"원");
					

					name[12].setFont(font1);
					price[12].setFont(font1);
					count[12].setFont(font1);
					total[12].setFont(font1);

					basket.add(name[12]);
					basket.add(price[12]);
					basket.add(count[12]);
					basket.add(total[12]);
					
					name[12].setBounds(40, 315, 220, 200);
					price[12].setBounds(250,315,110,200);
					count[12].setBounds(360,315,60,200);
					total[12].setBounds(430,315,100,200);
					
					jb[12]=new JCheckBox();
					jb[12].setSize(c.getSize());
					jb[12].setLocation(12,405);
					basket.add(jb[12]);
					
					js[12] = new JSpinner();
					js[12].setValue(value12);
					js[12].setLocation(500, 405);
					js[12].setSize(s.getSize());
					basket.add(js[12]);
						
					js[12].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(12).setCount((int)((JSpinner)e.getSource()).getValue());
						count[12].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[12].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(12).getPrice()+"원");	
						}
					});
					
					break;
					
				case 13 :
					int value13 = 0 ;
					value13 += MyItem.buylist.get(13).getCount();
					
					name[13] = new JLabel(MyItem.buylist.get(13).getName()); 
					price[13] = new JLabel(MyItem.buylist.get(13).getPrice()+"원"); 
					count[13] = new JLabel(MyItem.buylist.get(13).getCount()+"개");
					total[13] = new JLabel(value13*MyItem.buylist.get(13).getPrice()+"원");
					

					name[13].setFont(font1);
					price[13].setFont(font1);
					count[13].setFont(font1);
					total[13].setFont(font1);

					basket.add(name[13]);
					basket.add(price[13]);
					basket.add(count[13]);
					basket.add(total[13]);
					
					name[13].setBounds(40, 340, 220, 200);
					price[13].setBounds(250,340,110,200);
					count[13].setBounds(360,340,60,200);
					total[13].setBounds(430,340,100,200);
					
					jb[13]=new JCheckBox();
					jb[13].setSize(c.getSize());
					jb[13].setLocation(12,430);
					basket.add(jb[13]);
	
					js[13] = new JSpinner();
					js[13].setValue(value13);
					js[13].setLocation(500, 430);
					js[13].setSize(s.getSize());
					basket.add(js[13]);	
					
					js[13].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(13).setCount((int)((JSpinner)e.getSource()).getValue());	
						count[13].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[13].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(13).getPrice()+"원");	
						}
					});
					
					break;
					
				case 14 :
					int value14 = 0 ;
					value14 += MyItem.buylist.get(14).getCount();
					
					name[14] = new JLabel(MyItem.buylist.get(14).getName()); 
					price[14] = new JLabel(MyItem.buylist.get(14).getPrice()+"원"); 
					count[14] = new JLabel(MyItem.buylist.get(14).getCount()+"개");
					total[14] = new JLabel(value14*MyItem.buylist.get(14).getPrice()+"원");
					

					name[14].setFont(font1);
					price[14].setFont(font1);
					count[14].setFont(font1);
					total[14].setFont(font1);

					basket.add(name[14]);
					basket.add(price[14]);
					basket.add(count[14]);
					basket.add(total[14]);
					
					name[14].setBounds(40, 365, 220, 200);
					price[14].setBounds(250,365,110,200);
					count[14].setBounds(360,365,60,200);
					total[14].setBounds(430,365,100,200);
					
					jb[14]=new JCheckBox();
					jb[14].setSize(c.getSize());
					jb[14].setLocation(12,455);
					basket.add(jb[14]);
					
					js[14] = new JSpinner();
					js[14].setValue(value14);
					js[14].setLocation(500, 455);
					js[14].setSize(s.getSize());
					basket.add(js[14]);
						
					js[14].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(14).setCount((int)((JSpinner)e.getSource()).getValue());	
						count[14].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[14].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(14).getPrice()+"원");	
						}
					});
					
					break;
					
				case 15 :
					int value15 = 0 ;
					value15 += MyItem.buylist.get(15).getCount();
					
					name[15] = new JLabel(MyItem.buylist.get(15).getName()); 
					price[15] = new JLabel(MyItem.buylist.get(15).getPrice()+"원"); 
					count[15] = new JLabel(MyItem.buylist.get(15).getCount()+"개");
					total[15] = new JLabel(value15*MyItem.buylist.get(15).getPrice()+"원");
					

					name[15].setFont(font1);
					price[15].setFont(font1);
					count[15].setFont(font1);
					total[15].setFont(font1);

					basket.add(name[15]);
					basket.add(price[15]);
					basket.add(count[15]);
					basket.add(total[15]);
					
					name[15].setBounds(40, 390, 220, 200);
					price[15].setBounds(250,390,110,200);
					count[15].setBounds(360,390,60,200);
					total[15].setBounds(430,390,100,200);
					
					jb[15]=new JCheckBox();
					jb[15].setSize(c.getSize());
					jb[15].setLocation(12,480);
					basket.add(jb[15]);
					
					js[15] = new JSpinner();
					js[15].setValue(value15);
					js[15].setLocation(500, 480);
					js[15].setSize(s.getSize());
					basket.add(js[15]);
						
					js[15].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(15).setCount((int)((JSpinner)e.getSource()).getValue());		
						count[15].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[15].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(15).getPrice()+"원");	
						}
					});
					
					break;
					
				case 16 :
					int value16 = 0 ;
					value16 += MyItem.buylist.get(16).getCount();
					
					name[16] = new JLabel(MyItem.buylist.get(16).getName()); 
					price[16] = new JLabel(MyItem.buylist.get(16).getPrice()+"원"); 
					count[16] = new JLabel(MyItem.buylist.get(16).getCount()+"개");
					total[16] = new JLabel(value16*MyItem.buylist.get(16).getPrice()+"원");
					

					name[16].setFont(font1);
					price[16].setFont(font1);
					count[16].setFont(font1);
					total[16].setFont(font1);

					basket.add(name[16]);
					basket.add(price[16]);
					basket.add(count[16]);
					basket.add(total[16]);
					
					name[16].setBounds(40, 415, 220, 200);
					price[16].setBounds(250,415,110,200);
					count[16].setBounds(360,415,60,200);
					total[16].setBounds(430,415,100,200);
					
					jb[16]=new JCheckBox();
					jb[16].setSize(c.getSize());
					jb[16].setLocation(12,505);
					basket.add(jb[16]);
					
					js[16] = new JSpinner();
					js[16].setValue(value16);
					js[16].setLocation(500, 505);
					js[16].setSize(js[16].getSize());
					basket.add(js[16]);
					
					js[16].addChangeListener(new ChangeListener() {					
						@Override
						public void stateChanged(ChangeEvent e) {
						MyItem.buylist.get(16).setCount((int)((JSpinner)e.getSource()).getValue());	
						count[16].setText(((JSpinner)e.getSource()).getValue().toString()+"개");
						total[16].setText((int)(((JSpinner)e.getSource()).getValue())*MyItem.buylist.get(16).getPrice()+"원");	
						}
					});
						
					break;
				}
			}
		}
		

		JButton btnDeleteAll = new JButton("전체 삭제");
		JButton btnDeleteSelect = new JButton("선택 삭제");


		btnDeleteAll.setFont(font2);
		btnDeleteAll.setBackground(new Color(255, 255, 255));
		btnDeleteAll.setBounds(300, 570, 130, 30);
		btnDeleteAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyItem.buylist.clear();
				basket.removeAll();
				basket.revalidate();
				basket.repaint();
				}
		});
		

		btnDeleteSelect.setFont(font2);
		btnDeleteSelect.setBackground(new Color(255, 255, 255));
		btnDeleteSelect.setBounds(440, 570, 130, 30);
		btnDeleteSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					for(int i=0;i<MyItem.buylist.size();i++) {
						if(jb[i].isSelected()) {
						MyItem.buylist.remove(i);
						}	
						basket.revalidate();
						basket.repaint();

				}
					f.dispose();
					FrameBase.getInstance(new FrameBasket(u));

	}
		});
		
		
		f.add(btnDeleteAll);
		f.add(btnDeleteSelect);

		JButton begin = new JButton("뒤로가기");

		JButton payment = new JButton("결제하기");

		begin.setBorder(null);
		payment.setBorder(null);
		
		begin.setBounds(40,650,250,50);			
		begin.setFont(new Font("MONOSPACED", Font.BOLD, 20));
		
		payment.setBounds(300,650,250,50);
		payment.setFont(new Font("MONOSPACED", Font.BOLD, 20));
		
		//버튼 이벤트(뒤로가, 결제하기)
		begin.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {

				f.dispose();
				FrameBase.getInstance(new FrameCategory(u));
				
			}
		});
		payment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum=0;
				for(int i=0;i<MyItem.buylist.size();i++) 			{
					String str=total[i].getText();
					String restr=str.replaceAll("[^0-9]","");
				sum+=Integer.parseInt(restr);
				
				}
				
				f.dispose();
				FrameBase.getInstance(new Frame_Purchase(sum,u));
				}
			});
		f.add(basket);
		f.add(begin); //처음버튼
		f.add(payment); //결제버튼

		f.setVisible(true);
		
	}
}
		
