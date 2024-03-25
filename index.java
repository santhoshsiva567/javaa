
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class index {
	public static void main(String[] args)
	{ 
		ArrayList<String>names = new ArrayList <String>();
		names.add("shankar");
		names.add("chandru");
		names.add("karthik");
		names.add("anu");
		names.add("bavana");
		names.add("santhosh");
		
		Collections.sort(names);
	   System.out.println(names);
		names.clear();
		System.out.println("after clear"+names);
		ArrayList<String>candidates = new ArrayList <String>();
		HashSet<String>uniqueNames=new HashSet<String>();
		
		names.add("bala");
		names.add("sreemathi");
		names.add("sankar");
		names.add("moni");
		names.add("abi");
		
		for (String name :uniqueNames) {
			candidates.add(name);
		}
		System.out.println(candidates);
		
	
		
	}
}
	

