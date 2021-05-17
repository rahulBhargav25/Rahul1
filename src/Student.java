
public class Student {
	private String name;
	private static int rollNo;
	
	public Student(String name) {
		rollNo++;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
	
}
