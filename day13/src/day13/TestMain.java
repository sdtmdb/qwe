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
		c1.setMotherBoard("华硕");
		c1.setGpu("GT980");
		c1.setPrice(5000);
		
		Computer c2 = new Computer("1002");
		c2.setCpu("i5");
		c2.setHardDiskSize(1024 * 2);
		c2.setMemorySize(16);
		c2.setMotherBoard("微星");
		c2.setGpu("GT960");
		c2.setPrice(6000);
		
		Computer c3 = new Computer("1003");
		c3.setCpu("i7-6700");
		c3.setHardDiskSize(4 * 1024);
		c3.setMemorySize(32);
		c3.setMotherBoard("技嘉");
		c3.setGpu("GTX");
		c3.setPrice(10000);
		
		// 添加到集合
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		// 循环遍历
		for (int i = 0; i < list.size(); i++) {
			// 得到computer对象
			Computer c = list.get(i);
			// 打印信息
			c.print();
		}
		
		System.out.println("请输入计算机序号：");
		// 接收用户键盘输入
		int index = new Scanner(System.in).nextInt() - 1;
		
		// 判断用户输入的序号是否存在
		if (index < list.size() && index >= 0) {
			// 得到该序号的计算机并输出信息
			Computer c = list.get(index);
			c.print();
		}
	}
}
