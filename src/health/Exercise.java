package health;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import user.Userinfo;

public class Exercise {
	
	public String ExName;
	public String[] ExInfo;
	
	public Exercise(){
		
	}
	
	public Exercise(String Exname,String[] ExInfo){
		
		this.ExName = Exname;
		this.ExInfo = ExInfo;
		
	}
	
	public List<Exercise> ExList_chest(){
		

		List<Exercise> exlist = new ArrayList<Exercise>();

		try {
			
			
			String s;
			String[] array;
			int i =0;
			BufferedReader bos = new BufferedReader(new FileReader("가슴운동.txt"));
			while((s=bos.readLine())!=null){
				array=s.split("/");
				
			exlist.add(new Exercise(array[0],array));	
				
		
			
			}//while문 끝
			
			bos.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("파일에 문제가 있습니다.");
		}
	
		return exlist;
		
		
		
		
	}
	
	public List<Exercise> ExList_back(){
		

		List<Exercise> exlist = new ArrayList<Exercise>();

		try {
			
			
			String s;
			String[] array;
			int i =0;
			BufferedReader bos = new BufferedReader(new FileReader("등운동.txt"));
			while((s=bos.readLine())!=null){
				array=s.split("/");
				
			exlist.add(new Exercise(array[0],array));	
				
		
			
			}//while문 끝
			
			bos.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("파일에 문제가 있습니다.");
		}
	
		return exlist;
		
		
		
		
	}
	
		public List<Exercise> ExList_leg(){
		

		List<Exercise> exlist = new ArrayList<Exercise>();

		try {
			
			
			String s;
			String[] array;
			int i =0;
			BufferedReader bos = new BufferedReader(new FileReader("다리운동.txt"));
			while((s=bos.readLine())!=null){
				array=s.split("/");
				
			exlist.add(new Exercise(array[0],array));	
				
		
			
			}//while문 끝
			
			bos.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("파일에 문제가 있습니다.");
		}
	
		return exlist;
		
		
		
		
	}
	
	
		public List<Exercise> ExList_up(){
			

			List<Exercise> exlist = new ArrayList<Exercise>();

			try {
				
				
				String s;
				String[] array;
				int i =0;
				BufferedReader bos = new BufferedReader(new FileReader("상체운동.txt"));
				while((s=bos.readLine())!=null){
					array=s.split("/");
					
				exlist.add(new Exercise(array[0],array));	
					
			
				
				}//while문 끝
				
				bos.close();
						
				
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println("파일에 문제가 있습니다.");
			}
		
			return exlist;
			
			
			
			
		}
		
		public List<Exercise> ExList_down(){
			

			List<Exercise> exlist = new ArrayList<Exercise>();

			try {
				
				
				String s;
				String[] array;
				int i =0;
				BufferedReader bos = new BufferedReader(new FileReader("하체운동.txt"));
				while((s=bos.readLine())!=null){
					array=s.split("/");
					
				exlist.add(new Exercise(array[0],array));	
					
			
				
				}//while문 끝
				
				bos.close();
						
				
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println("파일에 문제가 있습니다.");
			}
		
			return exlist;
			
			
			
			
		}
		
		
		public List<Exercise> ExList_all(){
			

			List<Exercise> exlist = new ArrayList<Exercise>();

			try {
				
				
				String s;
				String[] array;
				int i =0;
				BufferedReader bos = new BufferedReader(new FileReader("전신운동.txt"));
				while((s=bos.readLine())!=null){
					array=s.split("/");
					
				exlist.add(new Exercise(array[0],array));	
					
			
				
				}//while문 끝
				
				bos.close();
						
				
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println("파일에 문제가 있습니다.");
			}
		
			return exlist;
			
			
			
			
		}	
		
		public List<Exercise> ExList_stretch(){
			

			List<Exercise> exlist = new ArrayList<Exercise>();

			try {
				
				
				String s;
				String[] array;
				int i =0;
				BufferedReader bos = new BufferedReader(new FileReader("스트레칭.txt"));
				while((s=bos.readLine())!=null){
					array=s.split("/");
					
				exlist.add(new Exercise(array[0],array));	
					
			
				
				}//while문 끝
				
				bos.close();
						
				
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println("파일에 문제가 있습니다.");
			}
		
			return exlist;
			
			
			
			
		}
	

	@Override
	public String toString() {
		
		
		return this.ExInfo[1]+"\n"+this.ExInfo[2]+"\n"+this.ExInfo[3]+"\n";
	}

	
	

}
