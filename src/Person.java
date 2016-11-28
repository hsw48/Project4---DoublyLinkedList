import java.util.Date;

public class Person implements Comparable<Person> {
	
	private String firstName;
	private String lastName;
	private int idNumber;
	private String dateOfBirth;
	
	public Person(String first, String last, int id, String date)
	{
		if(id>9999)
		{
			System.out.print("ID must be four digits");
			return;
		}
		firstName = first;
		lastName = last;
		idNumber = id;
		dateOfBirth = date;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String name) 
	{
		firstName = name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String name)
	{
		lastName = name;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public void setIdNumber(int number)
	{
		idNumber = number;
	}
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(String date)
	{
		dateOfBirth = date;
	}
	
	public String toString()
	{
		return getIdNumber() + " " + getFirstName() + " " + getLastName() + " " + getDateOfBirth();
	}
	
	public int compareTo(Person p) 
	{
		if (p.getIdNumber() == idNumber)
		{
			return 0;
		}
		else if (p.getIdNumber() < idNumber)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}
