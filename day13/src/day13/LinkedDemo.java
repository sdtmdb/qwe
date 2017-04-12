package day13;

import java.util.LinkedList;

public class LinkedDemo {
	public static void main(String[] args) {
		// 
		LinkedList<String> list = new LinkedList<>();
		// 得到链首元素，如果为null，或抛出异常
		list.element();
		list.getFirst();
		// 得到链首元素，如果为null，则返回null
		list.peek();
		list.peekFirst();
		// 得到链尾元素，如果为null，或抛出异常
		list.getLast();
		// 得到链尾元素，如果为null，则返回null
		list.peekLast();
		// 返回并删除链首元素，如果为null，则不删除直接返回null
		list.poll();
		list.pollFirst();
		// 返回并删除链尾元素，如果为null，则不删除直接返回null
		list.pollLast();
		// 返回并删除链首元素，如果为null，则抛出异常
		list.pop();
		list.removeFirst();
		// 添加元素到链首
		list.push("");
		list.addFirst("");
		list.offerFirst("");
		// 添加元素到链尾
		list.add("");
		list.addLast("");
		list.offer("");
		list.offerLast("");
		
		
	}
}
