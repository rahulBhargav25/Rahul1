import java.util.Iterator;

public class ArrayDemo {
	public static void main(String[] args) {
		//declaration
		int[] marks;
		//initialization
		marks = new int[5];
		
		//initialize each element in array
		marks[0] = 80;
		marks[1] = 76;
		marks[2] = 65;
		marks[3] = 56;
		marks[4] = 65;
		
		//access array elements
		//for loop
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("==========================================================================");
		//for each loop
		for (int value: marks) {
			System.out.println(value);
		}
		
		//calculate the average of the numbers
//		for (int i = 0; i < marks.length; i++) {
//			marks[i]
//		}
		
		System.out.println("===========================================================================");
		int avg = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4])/(marks.length);
		System.out.println(avg);
		marks[4] = 87;
		System.out.println(marks[4]);
		
	}
}
