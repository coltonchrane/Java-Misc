
public class Executive extends Manager
{
	// Inherits name and salary fields from superclass 
	private String department; 

	public Executive(String string, float salary)
	{
		super(string, salary);
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	} 
	public String getDepartment()
	{
		return this.department;
		} 
	public String toString() 
	{ 
	return "Employee: " + getName() + " Salary: " + getSalary()+ " Department: " + getDepartment(); 
	} 

}
