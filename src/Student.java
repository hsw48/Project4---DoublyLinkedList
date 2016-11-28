import java.util.Date;

public class Student extends Person 
{
	private String collegeName;

	public Student(String first, String last, int id, String date, String college) {
		super(first, last, id, date);
		collegeName = college;
	}
	
	public void setCollegeName(String name)
	{
		collegeName = name;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	
	public String toString()
	{
		return super.toString() + " [" + collegeName + "]";
	}
}
