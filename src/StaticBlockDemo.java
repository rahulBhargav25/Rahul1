
public class StaticBlockDemo {
	static {
		
		System.out.println("inside static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
	
	static {
		System.out.println("inside static 2 block");
	}
}
