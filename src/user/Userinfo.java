package user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import Frame.Frame_main_female;
import Frame.Frame_main_male;

public class Userinfo {
	
	//멤버변수
	private String userName;
	private String userGender;
	private String userPwd;
	private String userAdd;
	//생성자
	public Userinfo(){
		
	}
	
	public Userinfo(String userName,String userPwd,String userAdd,String userGender){
		this.userName=userName;
		this.userPwd = userPwd;
		this.userAdd = userAdd;
		this.userGender = userGender;
	}
	public Map<String, Userinfo> userlist() {
		
		Map<String, Userinfo> map = new HashMap<String, Userinfo>();
		

		try {
			
			
			String s;
			String[] array;
			int i =0;
			BufferedReader bos = new BufferedReader(new FileReader("회원명단.txt"));
			while((s=bos.readLine())!=null){
				array=s.split("/");
				
			map.put(array[1], new Userinfo(array[0],array[2],array[3],array[4]));
				
				
		
			
			}//while문 끝
			
			bos.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("파일에 문제가 있습니다.");
		}
	
		return map;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAdd() {
		return userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	
	
	//메서드
	
	

}
