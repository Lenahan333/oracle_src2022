package Main;

import java.util.List;

import health.Exercise;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Exercise ex = new Exercise();
		
		List<Exercise> list = ex.ExList();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
