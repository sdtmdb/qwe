package day13;

import java.util.LinkedList;

public class LinkedDemo {
	public static void main(String[] args) {
		// 
		LinkedList<String> list = new LinkedList<>();
		// �õ�����Ԫ�أ����Ϊnull�����׳��쳣
		list.element();
		list.getFirst();
		// �õ�����Ԫ�أ����Ϊnull���򷵻�null
		list.peek();
		list.peekFirst();
		// �õ���βԪ�أ����Ϊnull�����׳��쳣
		list.getLast();
		// �õ���βԪ�أ����Ϊnull���򷵻�null
		list.peekLast();
		// ���ز�ɾ������Ԫ�أ����Ϊnull����ɾ��ֱ�ӷ���null
		list.poll();
		list.pollFirst();
		// ���ز�ɾ����βԪ�أ����Ϊnull����ɾ��ֱ�ӷ���null
		list.pollLast();
		// ���ز�ɾ������Ԫ�أ����Ϊnull�����׳��쳣
		list.pop();
		list.removeFirst();
		// ���Ԫ�ص�����
		list.push("");
		list.addFirst("");
		list.offerFirst("");
		// ���Ԫ�ص���β
		list.add("");
		list.addLast("");
		list.offer("");
		list.offerLast("");
		
		
	}
}
