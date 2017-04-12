package com.wl.day8;
/*
     public protected 默认 private
              公开的       受保护的       默认的      私有
当前类      Yes    Yes     Yes    Yes
当前包      Yes    Yes     Yes    No
子类         Yes    Yes      No    No
其他包     Yes    No       No    No
*/
public class Student {
	public Student(String name){
		System.out.println("有参构造");
	}
	
	// this表示当前对象
	public Student(String name, int age){
		System.out.println("带两个参数的有参构造");
		this.name = name;
		this.age = age;
	}
	
	public Student(){
		System.out.println("无参构造");
	}
	
	// 成员变量《属性》
	String number;
	String name;
	String sex;
	static String classes; // static静态的，类的
	int age;
	String hobby;
	
	
	
	public void study(){
		System.out.println(classes + "的" + name + "在快乐的学习");
	}
	
	public void play(){
		
	}
	
	public static void doExam(){
		
	}
	
//	public static void doHomework(){
//		System.out.println("做作业");
//	}
}