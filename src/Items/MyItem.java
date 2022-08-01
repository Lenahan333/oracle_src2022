package Items;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
//장바구니에 쓰일 클래스로, 장바구니는 싱글톤으로 작성되었습니다.
public class MyItem {

	private static MyItem instance;

	//장바구니역할을 해줄 배열방.
	public static ArrayList<Item> buylist = new ArrayList<Item>();
	
	//각 메뉴의 갯수를 정할 수 있는 수량설정값, 1~9까지 조작가능
	public static int count1 = 1;
	public static int count2 = 1;
	public static int count3 = 1;
	public static int count4 = 1;
	public static int count5 = 1;
	
	//해당 클래스의 객체를 갖고갑니다
	public static MyItem getMyItem() {
		if (instance == null) {
			instance = new MyItem();
		}
		return instance;
	}
	
	//장바구니에 음식을 담는 메서드
	public static void add(Item i) {
		buylist.add(i);
		JOptionPane.showMessageDialog(null, i.getName() + "을 장바구니에 담았습니다.");
	}
	
	//장바구니를 비우는 메서드
	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null,"장바구니를 비웠습니다.");
	}
	
	public static void countitem1(int c) {
		count1 = c;
	}

	public static void countitem2(int c) {
		count2 = c;
	}

	public static void countitem3(int c) {
		count3 = c;
	}

	public static void countitem4(int c) {
		count4 = c;
	}
	
	public static void countitem5(int c) {
		count5 = c;
	}
	//모든 count 초기화
	public static void resetcount() {
		MyItem.count1=1;
    	MyItem.count2=1;
    	MyItem.count3=1;
    	MyItem.count4=1;
    	MyItem.count5=1;
	}

}