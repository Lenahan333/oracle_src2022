package Items;

import java.util.ArrayList;

import Items.Item;

public class FoodCategory {

	String cName;//카테고리 이름
	ArrayList<Item> itemlist=new ArrayList<Item>();// 메뉴의 이름과 가격정보 배열방
	
	
	public FoodCategory() {
		// TODO Auto-generated constructor stub
	}
	
	public FoodCategory(String cNamem,ArrayList<Item> itemlist) {
		this.cName=cName;
		this.itemlist=itemlist;
	}
	
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public ArrayList<Item> getitemlist() {
		return itemlist;
	}

	public void setmenulist(ArrayList<Item> itemlist) {
		this.itemlist = itemlist;
	}
	
	public String getItem(int num) {
		return itemlist.get(num).getName();
	}
	
	public int getItemPrice(int num) {
		return itemlist.get(num).getPrice();
	}
	

}
