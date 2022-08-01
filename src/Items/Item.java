package Items;

//메뉴별 정보
public class Item {
	
	String name;
	int price;	
	String ItemInfo;//맛 , 무게 , 한줄설명
	int count;
	
	public Item(String name, int price, String ItemInfo) {
		this.name=name;
		this.price=price;
		this.ItemInfo=ItemInfo;
	}
	
	public String getItemInfo() {
		return ItemInfo;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name+"\n"+price+"원\n"+ItemInfo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;
	}
	public void minusCount(int count) {
		this.count -= count;
	}

	
	

}