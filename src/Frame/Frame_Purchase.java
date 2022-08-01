package Frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

//import food.MyMenu;
import Frame.FrameBase;
//import Frame.FrameBasket;
//import Frame.FrameStoreSelect;
import user.Userinfo;

public class Frame_Purchase extends JFrame{

   public Frame_Purchase(int sum,Userinfo u) {

      setTitle("주문 하기");
      
      setBounds(500,100,600,800);
      setBackground(Color.white);
      setLayout(null);
      setLocationRelativeTo(null);
      
      ImageIcon bk1 = new ImageIcon("뒤로가기1.png");
      ImageIcon bk2 = new ImageIcon("뒤로가기2.png");
      ImageIcon p1 = new ImageIcon("결제하기.png");
      ImageIcon p2 = new ImageIcon("결제하기2.png");
      setBackground(new Color(255,255,255)); //배경색 
      setLayout(null);
      setSize(600,800);
      
      /*
      int total =0;
      for(int i = 0 ; i< MyMenu.buylist.size(); i++) {
         total += MyMenu.buylist.get(i).getPrice() * MyMenu.buylist.get(i).getCount();
      }
      */
      
      //폰트 
      Font font = (new Font("MONOSPACED", Font.BOLD , 15));
      
      //주문내역
      
      JPanel b1 = new JPanel(); 
      b1.setLayout(new GridLayout(1, 5));
      b1.setBounds(40, 20, 500, 120); 
      b1.setBackground(new Color(255,255,255));
      b1.setBorder(
         new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "주문내역", 
         TitledBorder.LEADING, 
         TitledBorder.TOP, 
         new Font("MONOSPACED", Font.BOLD , 17), 
         new Color(000, 000, 000) ));
         add(b1);
         
         TextArea MyMenu = new TextArea(""
               + "결제금액 : "+sum, 0,0,TextArea.SCROLLBARS_NONE);
         //+ "결제금액 : " +   total+" 원", 0,0,TextArea.SCROLLBARS_NONE);
         b1.add(MyMenu);
         
     
      //배송지 입력
      
      JPanel b3 = new JPanel(); // 배송지 패널 생성
      b3.setLayout(new GridLayout(5, 5));
      b3.setBounds(40, 250, 500, 180); // , ,가로넓이
      b3.setBackground(new Color(255,255,255));
      b3.setBorder(
         new TitledBorder( new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), //테두리없음
         "배송정보", //내용
         TitledBorder.LEADING, //텍스트 정렬방식:양쪽정렬
         TitledBorder.TOP, //텍스트 표시 위치 : 상단
         new Font("MONOSPACED", Font.BOLD , 20), //폰트 지정안함
         new Color(000, 000, 000) )); //색상
         add(b3);
         
      // 주소
            JLabel lb = new JLabel("기본 배송지");
            b3.add(lb);   
            JLabel deAdd = new JLabel(u.getUserAdd());
            b3.add(deAdd);
            
      // 전화번호       
            JButton jb = new JButton("주소 입력");
            
            b3.add(new JLabel("새 주소"));
            b3.add(jb);
           
            JLabel j12 = new JLabel(u.getUserAdd());
          
            jb.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String ss;
					ss = JOptionPane.showInputDialog("주소지를 입력해주세요.");
					j12.setText(ss);
					
				}
			});
            
            b3.add(j12);
            
            
            //결제하기 버튼
            JButton btnBuy = new JButton(p1);
            //btnBuy.setBorderPainted(false);
            btnBuy.setEnabled(false);
            
            btnBuy.addActionListener(new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent e) {
               
                     JOptionPane.showMessageDialog(
                   null , "              주문이 완료되었습니다"+"\n");
                     
               FrameBase.getInstance(new FrameCategory(u));
                  
               }
               
            });
         
            
      
            
      // 결제수단 
            JPanel b4 = new JPanel(); 
            b4.setLayout(new FlowLayout());
            b4.setBounds(40, 500, 500, 70);
            b4.setBackground(new Color(255,255,255));
            b4.setBorder(
                  new TitledBorder( new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), //테두리없음
                  "결제수단", //내용
                  TitledBorder.LEADING, //텍스트 정렬방식:양쪽정렬
                  TitledBorder.TOP, //텍스트 표시 위치 : 상단
                  new Font("MONOSPACED", Font.BOLD , 20), 
                  new Color(000, 000, 000)));
                  add(b4);
            
            Label laber3 = new Label("결제수단");
            CheckboxGroup group = new CheckboxGroup();
            Checkbox card = new Checkbox("Card", group,true);
            Checkbox money = new Checkbox("GymPay",group,false);
            Checkbox orgpay = new Checkbox("bluePay",group,false);
         
            
            Font font2 = (new Font("MONOSPACED", Font.BOLD , 25));
         
            b4.add(card);
            b4.add(money);
            b4.add(orgpay);
            
            b4.setVisible(true);
            
      
      //뒤로가기 버튼
            
            JButton btnBack = new JButton(bk1);
            JButton btnBack2 = new JButton(bk2);
            btnBack.setBorderPainted(false); //버튼테두리없앰
            btnBack.setRolloverIcon(bk2); //마우스 올리면 이미지 변경됨
            btnBack2.setBorderPainted(false); 
            btnBack.setBackground(new Color(255,255,255));
            btnBack.setSize(250, 100);
            btnBack.setLocation(40, 600);
            add(btnBack);
            
            btnBack.addActionListener(new ActionListener() {
         
               @Override
               public void actionPerformed(ActionEvent e) {
            	  dispose();
                  FrameBase.getInstance(new FrameBasket(u)); 
               }
            });
            
            btnBuy.setBackground(new Color(255,255,255));
            btnBuy.setSize(250, 100);
            btnBuy.setLocation(300, 600);
            
            btnBuy.setBorderPainted(false); //버튼테두리없앰
            btnBuy.setRolloverIcon(p2); //마우스 올리면 이미지 변경됨
            
            
            add(btnBuy);
                     
      setVisible(true);      

   }//생성자/


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
   
   
