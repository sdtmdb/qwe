package day13;

public class Computer {
	private String cid;
	private String cpu;
	private String motherBoard;
	private int hardDiskSize;
	private int memorySize;
	private String gpu;
	private double price;

	public Computer(String cid) {
		this.cid = cid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public void setHardDiskSize(int hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", cpu=" + cpu + ", motherBoard=" + motherBoard + ", hardDiskSize="
				+ hardDiskSize + ", memorySize=" + memorySize + ", gpu=" + gpu + ", price=" + price + "]";
	}

}
