import java.util.ArrayList;

public class arrayTest {

	public static void main(String[] args) {

		ComparatorStudents c = new ComparatorStudents();
		Student anna = new Student(1234, "anna", "artin");
		Student peter = new Student(2334, "peter", "büller");
		Student udo = new Student(4232, "udo", "büller");
		Student peter2 = new Student(5274, "peter", "clemens");
		Student peter3 = new Student(1, "peter", "clemens");

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(peter2);
		list.add(peter3);
		list.add(anna);
		list.add(udo);
		list.add(peter);

		list.sort(c);

		System.out.println("ende");

	}
}
