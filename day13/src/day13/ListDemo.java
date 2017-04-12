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
		// �жϼ����Ƿ�Ϊ��
		System.out.println(list.isEmpty());
		// ��Ŀ���жϼ����Ƿ�Ϊ�գ�
		if(list == null || list.isEmpty()){
			
		}
		// �ж��ַ����Ƿ�Ϊ��
		String s = null;
		if(s == null || s.trim().equals("")){
			
		}
		
		// �жϼ����Ƿ����ĳ������
		System.out.println(list.contains("Hello"));
		
		// ������ת��������
		Object [] arr = list.toArray();
		// ������ת���ɼ���
		List<Object> list1 = Arrays.asList(arr);
		
		// ����ĳ��Ԫ�ص��±꣬û�ҵ��ͷ���-1
		System.out.println(list.indexOf("world1"));
		
		// �Ӻ���ǰ����ĳ��Ԫ�ص��±꣬û�ҵ��ͷ���-1
		System.out.println(list.lastIndexOf("world"));
		
		// ��ȡ������
		List<String> list2 = list.subList(1, 4);
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println("===" + list2.get(i));
//		}
		
//		// ���һ������
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
		// forѭ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println("~~~~~" + list.get(i));
		}
		//foreachѭ��
		for (String str : list) {
			System.out.println(str);
		}
		
		// �򵥵������ӿڽ��е���
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println("====" + str);
		}
		
		// ����ǰ���ƶ����ܹ��õ�index
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
