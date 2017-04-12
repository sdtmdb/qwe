package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		List<Computer> list = new ArrayList<>();
		
		Computer c1 = new Computer("1001");
		c1.setCpu("i7");
		c1.setHardDiskSize(1024);
		c1.setMemorySize(8);
		c1.setMotherBoard("��˶");
		c1.setGpu("GT980");
		c1.setPrice(5000);
		
		Computer c2 = new Computer("1002");
		c2.setCpu("i5");
		c2.setHardDiskSize(1024 * 2);
		c2.setMemorySize(16);
		c2.setMotherBoard("΢��");
		c2.setGpu("GT960");
		c2.setPrice(6000);
		
		Computer c3 = new Computer("1003");
		c3.setCpu("i7-6700");
		c3.setHardDiskSize(4 * 1024);
		c3.setMemorySize(32);
		c3.setMotherBoard("����");
		c3.setGpu("GTX");
		c3.setPrice(10000);
		
		// ��ӵ�����
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		// ѭ������
		for (int i = 0; i < list.size(); i++) {
			// �õ�computer����
			Computer c = list.get(i);
			// ��ӡ��Ϣ
			c.print();
		}
		
		System.out.println("������������ţ�");
		// �����û���������
		int index = new Scanner(System.in).nextInt() - 1;
		
		// �ж��û����������Ƿ����
		if (index < list.size() && index >= 0) {
			// �õ�����ŵļ�����������Ϣ
			Computer c = list.get(index);
			c.print();
		}
	}
}
