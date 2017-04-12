package day13;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("1");
		
//		ArrayList<String> list2 = new ArrayList<>();
//		list2.add("1");
		
		List<String> list2 = list.subList(0, 1);
		
		list.add("2");
		list.add("3");
		
//		ArrayList<String> list3 = new ArrayList<>();
//		list3.add("1");
//		list3.add("1");
//		list.addAll(list3);
		
		
		
		list.removeAll(list2);
		
		System.out.println(list.size());

	}

}
