
public class Demo
{
	public static void main(String[] args)
	{
		SortedDblList<Person> personList = new SortedDblList<Person>();
		SortedDblList<Student> studentList = new SortedDblList<Student>();
		
		Person harrison = new Person("Harrison", "Woodward", 1111, "10/03/1994");
		Person oliver = new Person("Oliver", "Woodward", 9234, "05/01/1995");
		Person taylor = new Person("Taylor", "Bremer", 2222, "07/29/1994");
		
		Student david = new Student("David", "Feiman", 4567, "Jan 1, 1995", "Terry");
		Student kern = new Student("Kern", "Carlton", 2345, "Feb 1, 1995", "Terry");
		Student mitchell = new Student("Mitchell", "Marino", 1235, "Nov 22, 1994", "Franklin");
		
		Person[] people = {harrison, oliver, taylor};
		Student[] students = {david, kern, mitchell};
		
		for (Person p : people)
		{
			System.out.println(p.toString());
			if(!personList.add(p))
			{
				System.out.println("did not add");
			}
			else
			{
				System.out.println("added");
			}
		}
		System.out.println("Person List");
		personList.printList();
		
		for (Student s : students)
		{
			System.out.println(s.toString());
			if(!studentList.add(s))
			{
				System.out.println("did not add");
			}
			else
			{
				System.out.println("added");
			}
		}
		System.out.println("Student List");
		studentList.printList();
	}
	

}
