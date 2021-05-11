import java.util.*;
public class StudentMarks {
	//javac StudentMarks.java
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter the number of students");
		//int num = in.nextInt();
		HashMap<String, Integer> studentsMarks = new HashMap<String, Integer>();
		/*for(int i = 0; i < num; i++) {
			System.out.println("Enter the Student name");
			String name = in.next();
			System.out.println("Enter the marks");
			int marks = in.nextInt();
			studentsMarks.put(name, marks);
		}
		for (String i : studentsMarks.keySet()) {
			System.out.println("Name: " + i + " 	Marks: " + studentsMarks.get(i));
		}*/
		String yes = "Y";
		
		while(yes.equalsIgnoreCase("Y")) {
			System.out.println("Enter the Student name");
			String name = in.next();
			System.out.println("Enter the marks");
			int marks = in.nextInt();
			studentsMarks.put(name, marks);
			System.out.println("Do you want to add another student? Y or N");
			yes = in.next();
		}
		for (String i : studentsMarks.keySet()) {
			System.out.println("Name: " + i + " 	Marks: " + studentsMarks.get(i));
		}
	}
}