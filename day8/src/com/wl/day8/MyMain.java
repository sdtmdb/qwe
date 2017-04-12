package com.wl.day8;

public class MyMain {

	public static void main(String[] args) {
//		int [] arr = new int[10];
		// 创建对象
		Student s = new Student();
		// 调用属性并赋值
		s.name = "张三";
		s.age = 20;
		Student.classes = "1班";
		// 调用方法
		
		
		
		Student s1 = new Student();
		s1.name = "李四";
		s1.age = 20;
		s1.classes = "2班";
		
		
		Student s2 = new Student("王五", 22);
		
		
		s.study();
		s1.study();
		s2.study();
		
		Student s3 = new Student();
		s3.study();
	}

}
