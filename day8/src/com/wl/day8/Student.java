package com.wl.day8;
/*
     public protected Ĭ�� private
              ������       �ܱ�����       Ĭ�ϵ�      ˽��
��ǰ��      Yes    Yes     Yes    Yes
��ǰ��      Yes    Yes     Yes    No
����         Yes    Yes      No    No
������     Yes    No       No    No
*/
public class Student {
	public Student(String name){
		System.out.println("�вι���");
	}
	
	// this��ʾ��ǰ����
	public Student(String name, int age){
		System.out.println("�������������вι���");
		this.name = name;
		this.age = age;
	}
	
	public Student(){
		System.out.println("�޲ι���");
	}
	
	// ��Ա���������ԡ�
	String number;
	String name;
	String sex;
	static String classes; // static��̬�ģ����
	int age;
	String hobby;
	
	
	
	public void study(){
		System.out.println(classes + "��" + name + "�ڿ��ֵ�ѧϰ");
	}
	
	public void play(){
		
	}
	
	public static void doExam(){
		
	}
	
//	public static void doHomework(){
//		System.out.println("����ҵ");
//	}
}