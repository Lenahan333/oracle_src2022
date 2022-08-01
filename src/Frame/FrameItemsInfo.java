package Frame;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import Items.Item;
import Items.ItemCollect;
import user.Userinfo;
import Items.BasketMethod;

public class FrameItemsInfo extends JFrame {

   public FrameItemsInfo(Userinfo u,ArrayList<Item> a) {
      
      JFrame f=new JFrame("메뉴 선택");

        f.setBounds(500,100,600,800);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
    	BasketMethod method = new BasketMethod();
        
      JButton btnprotein = new JButton("프로틴");
      JButton btnsnack = new JButton("스낵");
      JButton btnchicken = new JButton("닭가슴살");
      JButton btnsalad = new JButton("샐러드");

      btnprotein.setBounds(0, 0, 150, 60);
      btnprotein.setFont(new Font("monospaced", Font.BOLD, 15));
      btnprotein.setBackground(new Color(255, 255, 255));
      btnprotein.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            ArrayList a1=ItemCollect.getProtein();
            f.dispose();
            FrameBase.getInstance(new FrameItemsInfo(u,a1));
         }
      });
      
      btnsnack.setBounds(btnprotein.getBounds());
      btnsnack.setLocation((int) btnprotein.getLocation().getX() + 150, // 버튼위치
            (int) btnprotein.getLocation().getY());
      btnsnack.setFont(new Font("monospaced", Font.BOLD, 15));
      btnsnack.setBackground(new Color(255, 255, 255));
      btnsnack.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            ArrayList a1=ItemCollect.getSnack();
            f.dispose();
            FrameBase.getInstance(new FrameItemsInfo(u,a1));
         }
      });
      
      btnchicken.setBounds(btnprotein.getBounds());
      btnchicken.setLocation((int) btnsnack.getLocation().getX() + 150, // 버튼위치
            (int) btnprotein.getLocation().getY());
      btnchicken.setFont(new Font("monospaced", Font.BOLD, 15));
      btnchicken.setBackground(new Color(255, 255, 255));
      btnchicken.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            ArrayList a1=ItemCollect.getChicken();
            f.dispose();
            FrameBase.getInstance(new FrameItemsInfo(u,a1));
         }
      });

      btnsalad.setBounds(btnchicken.getBounds());
      btnsalad.setLocation((int) btnchicken.getLocation().getX() + 150, // 버튼위치
            (int) btnchicken.getLocation().getY());
      btnsalad.setFont(new Font("monospaced", Font.BOLD, 15));
      btnsalad.setBackground(new Color(255, 255, 255));


      btnsalad.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            ArrayList a1=ItemCollect.getSalad();
            f.dispose();
            FrameBase.getInstance(new FrameItemsInfo(u,a1));
            
         }
      });

      f.add(btnprotein);
      f.add(btnsnack);
      f.add(btnchicken);
      f.add(btnsalad);

      // 아이템

      ImageIcon iteml = new ImageIcon(((Item) a.get(0)).getName()+".png");
      JLabel lblitem1 = new JLabel(iteml);
      lblitem1.setSize(100, 100);// 배달이미지 사이즈
      lblitem1.setLocation(40, 75);// 배달이미지 위치
      f.add(lblitem1);

      ImageIcon item2 = new ImageIcon(((Item) a.get(1)).getName()+".png");
      JLabel lblitem2 = new JLabel(item2);
      lblitem2.setBounds(lblitem1.getBounds());
      lblitem2.setLocation((int) lblitem1.getLocation().getX(), // 버튼위치
            (int) lblitem1.getLocation().getY() + 100);
      f.add(lblitem2);

      ImageIcon item3 = new ImageIcon(((Item) a.get(2)).getName()+".png");
      JLabel lbliem3 = new JLabel(item3);
      lbliem3.setBounds(lblitem1.getBounds());
      lbliem3.setLocation((int) lblitem2.getLocation().getX(), // 버튼위치
            (int) lblitem2.getLocation().getY() + 100);
      f.add(lbliem3);

      ImageIcon item4 = new ImageIcon(((Item) a.get(3)).getName()+".png");
      JLabel lblitem4 = new JLabel(item4);
      lblitem4.setBounds(lblitem1.getBounds());
      lblitem4.setLocation((int) lbliem3.getLocation().getX(), // 버튼위치
            (int) lbliem3.getLocation().getY() + 100);
      f.add(lblitem4);

      ImageIcon item5 = new ImageIcon(((Item) a.get(4)).getName()+".png");
      JLabel lblitem5 = new JLabel(item5);
      lblitem5.setBounds(lblitem1.getBounds());
      lblitem5.setLocation((int) lblitem4.getLocation().getX(), // 버튼위치
            (int) lblitem4.getLocation().getY() + 100);
      f.add(lblitem5);

      
      // 아이템 관련 텍스트
      TextArea story1 = new TextArea(a.get(0)
            +"\n\n" 
            +"", 0, 0, TextArea.SCROLLBARS_NONE);

      story1.setSize(330, 90);
      story1.setLocation((int) lblitem1.getLocation().getX() + 120, (int) lblitem1.getLocation().getY());
      story1.setBackground(new Color(255, 255, 255));
      story1.setFont(new Font("monospaced", Font.BOLD, 16));
      f.add(story1);

      TextArea story2 = new TextArea(a.get(1)
            +"\n\n" 
            +"", 0, 0, TextArea.SCROLLBARS_NONE);

      story2.setBounds(story1.getBounds());
      story2.setLocation((int) lblitem2.getLocation().getX() + 120, (int) lblitem2.getLocation().getY());
      story2.setBackground(new Color(255, 255, 255));
      story2.setFont(new Font("monospaced", Font.BOLD, 16));
      f.add(story2);

      TextArea story3 = new TextArea(a.get(2) 
            +"\n\n" 
            +"", 0, 0, TextArea.SCROLLBARS_NONE);

      story3.setBounds(story1.getBounds());
      story3.setLocation((int) lbliem3.getLocation().getX() + 120, (int) lbliem3.getLocation().getY());
      story3.setBackground(new Color(255, 255, 255));
      story3.setFont(new Font("monospaced", Font.BOLD, 16));
      f.add(story3);

      TextArea story4 = new TextArea(a.get(3)
            +"\n\n" 
            +"", 0, 0, TextArea.SCROLLBARS_NONE);

      story4.setBounds(story1.getBounds());
      story4.setLocation((int) lblitem4.getLocation().getX() + 120, (int) lblitem4.getLocation().getY());
      story4.setBackground(new Color(255, 255, 255));
      story4.setFont(new Font("monospaced", Font.BOLD, 16));
      f.add(story4);
      
      TextArea story5 = new TextArea(a.get(4)
            +"\n\n" 
            +"", 0, 0, TextArea.SCROLLBARS_NONE);

      story5.setBounds(story1.getBounds());
      story5.setLocation((int) lblitem5.getLocation().getX() + 120, (int) lblitem5.getLocation().getY());
      story5.setBackground(new Color(255, 255, 255));
      story5.setFont(new Font("monospaced", Font.BOLD, 16));
      f.add(story5);
      
      //----------플마 버튼----------
      
        
         JLabel txt1=new JLabel("1",JLabel.CENTER);
         JLabel txt2=new JLabel("1",JLabel.CENTER);
         JLabel txt3=new JLabel("1",JLabel.CENTER);
         JLabel txt4=new JLabel("1",JLabel.CENTER);
         JLabel txt5=new JLabel("1",JLabel.CENTER);

         EtchedBorder  eborder=new EtchedBorder(EtchedBorder.RAISED);
         txt1.setBorder(eborder);
         txt2.setBorder(eborder);
         txt3.setBorder(eborder);
         txt4.setBorder(eborder);
         txt5.setBorder(eborder);
         
         txt1.setSize(30,30);
         txt1.setLocation(500,90);
         txt1.setHorizontalAlignment(JLabel.CENTER);
         txt1.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
         txt1.setBackground(Color.white);
         txt2.setSize(30,30);
         txt2.setLocation((int)txt1.getLocation().getX(),(int)txt1.getLocation().getY()+100);
         txt2.setHorizontalAlignment(JLabel.CENTER);
         txt2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
         txt2.setBackground(Color.white);
         txt3.setSize(30,30);
         txt3.setLocation((int)txt1.getLocation().getX(),(int)txt2.getLocation().getY()+100);
         txt3.setHorizontalAlignment(JLabel.CENTER);
         txt3.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
         txt3.setBackground(Color.white);
         txt4.setSize(30,30);
         txt4.setLocation((int)txt1.getLocation().getX(),(int)txt3.getLocation().getY()+100);
         txt4.setHorizontalAlignment(JLabel.CENTER);
         txt4.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
         txt4.setBackground(Color.white);
         txt5.setSize(30,30);
         txt5.setLocation((int)txt1.getLocation().getX(),(int)txt4.getLocation().getY()+100);
         txt5.setHorizontalAlignment(JLabel.CENTER);
         txt5.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
         txt5.setBackground(Color.white);
         
         f.add(txt1);
         f.add(txt2);
         f.add(txt3);
         f.add(txt4);
         f.add(txt5);
         
         JButton upbtn1=method.getplusbutton(1,txt1);
         JButton upbtn2=method.getplusbutton(2,txt2);
         JButton upbtn3=method.getplusbutton(3,txt3);
         JButton upbtn4=method.getplusbutton(4,txt4);
         JButton upbtn5=method.getplusbutton(5,txt5);
         
         
           upbtn1.setSize(150,30);
           upbtn2.setSize(150,30);
           upbtn3.setSize(150,30);
           upbtn4.setSize(150,30);
           upbtn5.setSize(150,30);
           
           upbtn1.setLocation(480,75);
           upbtn2.setLocation(480,175);
           upbtn3.setLocation(480,275);
           upbtn4.setLocation(480,375);
           upbtn5.setLocation(480,475);
           
           upbtn1.setBorderPainted(false);
           upbtn1.setContentAreaFilled(false);
           upbtn1.setFocusPainted(false);      
           upbtn2.setBorderPainted(false);
           upbtn2.setContentAreaFilled(false);
           upbtn2.setFocusPainted(false);      
           upbtn3.setBorderPainted(false);
           upbtn3.setContentAreaFilled(false);
           upbtn3.setFocusPainted(false);      
           upbtn4.setBorderPainted(false);
           upbtn4.setContentAreaFilled(false);
           upbtn4.setFocusPainted(false);      
           upbtn5.setBorderPainted(false);
           upbtn5.setContentAreaFilled(false);
           upbtn5.setFocusPainted(false);     

           
            f.add(upbtn1);
            f.add(upbtn2);
            f.add(upbtn3);
            f.add(upbtn4);
            f.add(upbtn5);
           
            

            JButton downbtn1=method.getminusbutton(1, txt1);
            JButton downbtn2=method.getminusbutton(2, txt2);
            JButton downbtn3=method.getminusbutton(3, txt3);	
            JButton downbtn4=method.getminusbutton(4, txt4);
            JButton downbtn5=method.getminusbutton(5, txt5);
              
               
              downbtn1.setSize(150,30);
              downbtn2.setSize(150,30);
              downbtn3.setSize(150,30);
              downbtn4.setSize(150,30);
              downbtn5.setSize(150,30);
              
              downbtn1.setLocation(480,100);
              downbtn2.setLocation(480,200);
              downbtn3.setLocation(480,300);
              downbtn4.setLocation(480,400);
              downbtn5.setLocation(480,500);
              //-----------------------------------
              downbtn1.setBorderPainted(false);
              downbtn1.setContentAreaFilled(false);
              downbtn1.setFocusPainted(false);      
              downbtn2.setBorderPainted(false);
              downbtn2.setContentAreaFilled(false);
              downbtn2.setFocusPainted(false);      
              downbtn3.setBorderPainted(false);
              downbtn3.setContentAreaFilled(false);
              downbtn3.setFocusPainted(false);      
              downbtn4.setBorderPainted(false);
              downbtn4.setContentAreaFilled(false);
              downbtn4.setFocusPainted(false);      
              downbtn5.setBorderPainted(false);
              downbtn5.setContentAreaFilled(false);
              downbtn5.setFocusPainted(false);    
              
               f.add(downbtn1);
               f.add(downbtn2);
               f.add(downbtn3);
               f.add(downbtn4);
               f.add(downbtn5);
               
               JButton addCartbtn1=method.getbuyButton(1,txt1, a);
               JButton addCartbtn2=method.getbuyButton(2,txt2, a);
               JButton addCartbtn3=method.getbuyButton(3,txt3, a);
               JButton addCartbtn4=method.getbuyButton(4,txt4, a);
               JButton addCartbtn5=method.getbuyButton(5,txt5, a);
               
               addCartbtn1.setSize(50,35);
               addCartbtn1.setLocation(510,130);
               addCartbtn2.setSize(50,35);
               addCartbtn2.setLocation(510,230);
               addCartbtn3.setSize(50,35);
               addCartbtn3.setLocation(510,330);
               addCartbtn4.setSize(50,35);
               addCartbtn4.setLocation(510,430);
               addCartbtn5.setSize(50,35);
               addCartbtn5.setLocation(510,530);
               
               addCartbtn1.setBorderPainted(false);
               addCartbtn1.setContentAreaFilled(false);
               addCartbtn1.setFocusPainted(false); 
               addCartbtn2.setBorderPainted(false);
               addCartbtn2.setContentAreaFilled(false);
               addCartbtn2.setFocusPainted(false); 
               addCartbtn3.setBorderPainted(false);
               addCartbtn3.setContentAreaFilled(false);
               addCartbtn3.setFocusPainted(false); 
               addCartbtn4.setBorderPainted(false);
               addCartbtn4.setContentAreaFilled(false);
               addCartbtn4.setFocusPainted(false); 
               addCartbtn5.setBorderPainted(false);
               addCartbtn5.setContentAreaFilled(false);
               addCartbtn5.setFocusPainted(false); 
               
               
               f.add(addCartbtn1);
               f.add(addCartbtn2);
               f.add(addCartbtn3);
               f.add(addCartbtn4);
               f.add(addCartbtn5);
      

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
            f.dispose();
            FrameBase.getInstance(new FrameCategory(u));
            
         }
      });
      
      JButton btnToBasker = new JButton("장바구니 이동");

      btnToBasker.setBackground(new Color(0xA6A6A6));
      btnToBasker.setSize(183, 87);
      btnToBasker.setLocation(391, 0);
      btnToBasker.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
      bottomSet.add(btnToBasker);
      
      btnToBasker.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {

        		f.dispose();
				FrameBase.getInstance(new FrameBasket(u));
            
            
         }
      });
      bottomSet.add(btnToBasker);
      f.add(bottomSet, BorderLayout.SOUTH);
      f.setVisible(true);
      
   }
}