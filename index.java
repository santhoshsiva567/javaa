
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class index {
	public static void main(String[] args)
	{ 
		ArrayList<String>names = new ArrayList <String>();
		names.add("santhosh");
		names.add("johan");
		names.add("kowsi");
		names.add("dinesh");
		names.add("rajesh");
		names.add("sathish");
		
		Collections.sort(names);
	   System.out.println(names);
		names.clear();
		System.out.println("after clear"+names);
		ArrayList<String>candidates = new ArrayList <String>();
		HashSet<String>uniqueNames=new HashSet<String>();
		
		names.add("logesh");
		names.add("mani");
		names.add("bharathi");
		names.add("divi");
		names.add("gayathri");
		
		for (String name :uniqueNames) {
			candidates.add(name);
		}
		System.out.println(candidates);
		
	
		
	}
}
	

