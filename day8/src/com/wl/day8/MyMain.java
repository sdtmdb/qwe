package com.wl.day8;

public class MyMain {

	public static void main(String[] args) {
//		int [] arr = new int[10];
		// ��������
		Student s = new Student();
		// �������Բ���ֵ
		s.name = "����";
		s.age = 20;
		Student.classes = "1��";
		// ���÷���
		
		
		
		Student s1 = new Student();
		s1.name = "����";
		s1.age = 20;
		s1.classes = "2��";
		
		
		Student s2 = new Student("����", 22);
		
		
		s.study();
		s1.study();
		s2.study();
		
		Student s3 = new Student();
		s3.study();
	}

}
