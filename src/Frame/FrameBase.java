package Frame;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameBase  extends JFrame{
   
   private static FrameBase instance; 
   
   private FrameBase(JFrame j) {
      
      //해상도
      Toolkit tk=Toolkit.getDefaultToolkit();
      
      //기본 JFrame 환경설정
     // setTitle("책임GYM");
      setLayout(null);
      setBounds(((int)tk.getScreenSize().getWidth())/2 -300,
               ((int)tk.getScreenSize().getHeight())/2 -400,
               600, 800);
      
      

      getContentPane().setBackground(new Color(226, 224, 222)); 
      setSize(600, 800);
      
      
     // j.setVisible(true);
      
      
    } //생성자
   
    //싱글톤기법 사용을 위한 method
   static public void getInstance(JFrame j) {
      instance=new FrameBase(j);
      
      instance.getContentPane().removeAll();
      
      instance.revalidate();
      instance.repaint();
   }

   @Override
   public int getDefaultCloseOperation() {
      // TODO Auto-generated method stub
      return super.getDefaultCloseOperation();
   }

}