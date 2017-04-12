package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("world");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		// 判断集合是否为空
		System.out.println(list.isEmpty());
		// 项目中判断集合是否为空，
		if(list == null || list.isEmpty()){
			
		}
		// 判断字符串是否为空
		String s = null;
		if(s == null || s.trim().equals("")){
			
		}
		
		// 判断集合是否包含某个对象
		System.out.println(list.contains("Hello"));
		
		// 将集合转换成数组
		Object [] arr = list.toArray();
		// 将数组转换成集合
		List<Object> list1 = Arrays.asList(arr);
		
		// 查找某个元素的下标，没找到就返回-1
		System.out.println(list.indexOf("world1"));
		
		// 从后往前查找某个元素的下标，没找到就返回-1
		System.out.println(list.lastIndexOf("world"));
		
		// 截取子数组
		List<String> list2 = list.subList(1, 4);
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println("===" + list2.get(i));
//		}
		
//		// 添加一个集合
//		list.addAll(list2);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("----" + list.get(i));
//		}
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("world");
		list3.add("1");
		list3.add("2");
		list.addAll(list3);
		for (int i = 0; i < list3.size(); i++) {
			System.out.println("....." + list3.get(i));
		}
		
		
//		list.removeAll(list2);
		// for循环
		for (int i = 0; i < list.size(); i++) {
			System.out.println("~~~~~" + list.get(i));
		}
		//foreach循环
		for (String str : list) {
			System.out.println(str);
		}
		
		// 简单迭代器接口进行迭代
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println("====" + str);
		}
		
		// 允许前后移动，能够得到index
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.previousIndex());
			String str = lit.next();
			System.out.println("----" + str);
		}
		
		
		ListIterator<String> lit1 = list.listIterator(list.size());
		while(lit1.hasPrevious()){
			System.out.print(lit1.nextIndex());
			String str = lit1.previous();
			System.out.println("====" + str);
		}
//		
//		System.out.println(list.size());
		
		ListIterator<String> lit2 = list.listIterator();
		System.out.println(lit2.next());
		System.out.println(lit2.next());
		System.out.println(lit2.previous());
		System.out.println(lit2.previous());
	}
}
