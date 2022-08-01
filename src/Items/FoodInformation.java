package Items;

import java.util.ArrayList;

import Items.FoodCategory;
import Items.ItemCollect;

public class FoodInformation {
	private static ArrayList<FoodCategory> list;
	ItemCollect itemcollect = new ItemCollect();

	public FoodInformation() {
		if (list == null) {
			init();
		}
	}

	private void init() {
		list = new ArrayList<FoodCategory>();

		// 카테고리1 정보
		list.add(new FoodCategory("프로틴",ItemCollect.getProtein()));

		// 카테고리2 정보
		list.add(new FoodCategory("닭가슴살",ItemCollect.getChicken()));
				
		// 카테고리3 정보				
		list.add(new FoodCategory("샐러드",ItemCollect.getSalad()));
				
		// 카테고리4 정보				
		list.add(new FoodCategory("스낵",ItemCollect.getSnack()));
				
	}

	public FoodCategory searchCategory(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getcName().equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	}

