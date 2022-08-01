package Frame;

import java.awt.Checkbox;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import user.Userinfo;

public class Frame_joinmember extends JFrame{
	
	public Frame_joinmember() {
		JPanel p = new JPanel();
		
		Label name = new Label("이름");	
        Label id = new Label("아이디");
        Label pwd = new Label("패스워드");
        Label add = new Label("주소");
        Label gender = new Label("성별");
        add(name);
        add(id);
        add(pwd);
        add(add);
        add(gender);
        
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        
//        Checkbox male = new Checkbox("남자");
//        Checkbox female = new Checkbox("여자");
        JRadioButton male = new JRadioButton("남자");
        JRadioButton female = new JRadioButton("여자");
        ButtonGroup gdbtn = new ButtonGroup();
        gdbtn.add(male);
        gdbtn.add(female);
        
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        
        add(male);
        add(female);
        
        t3.setEchoChar('*');
        JButton register = new JButton("회원가입");
        JButton cancel = new JButton("취소");
        add(register);
        add(cancel);
        name.setBounds(40, 10, 40, 40);
        id.setBounds(40, 50, 40, 40);
        pwd.setBounds(40,90,60,40);
        add.setBounds(40, 130, 40, 40);
        gender.setBounds(40, 170, 60, 40);
        t1.setBounds(120, 10, 200, 30);
        t2.setBounds(120, 50, 200, 30);
        t3.setBounds(120, 90, 200, 30);
        t4.setBounds(120, 130, 280, 30);
        
        male.setBounds(130,165,50,50);
        female.setBounds(180,165,50,50);
        
        register.setBounds(125, 330, 80, 30);
        cancel.setBounds(240, 330, 80, 30); 
    add(p);
	setSize(600,800);
	setTitle("회원가입");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
   
   register.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			Userinfo user = new Userinfo();
			Map<String, Userinfo> map = user.userlist();
			
			if(map.containsKey(t2.getText())) {
				JOptionPane.showMessageDialog(null, "아이디가 존재합니다. 다른 아이디를 입력해주세요.");
			} else {
			
			BufferedWriter bos = new BufferedWriter(new FileWriter("회원명단.txt",true));
			bos.write(t1.getText()+"/");
			bos.write(t2.getText()+"/");
			bos.write(t3.getText()+"/");
			bos.write(t4.getText()+"/");
			if(male.isSelected()) {
				bos.write("M"+"\n");	
			}else {
				bos.write("F"+"\n");
			}
			
			bos.close();
			JOptionPane.showMessageDialog(null, "회원가입을 축하합니다!!");
			dispose();
		}
		}catch (Exception ex){
			JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
		}
		
			}
   		});
   
   
   cancel.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
		
		}
   	});
   
   
	}//생성자
	
	
	
}