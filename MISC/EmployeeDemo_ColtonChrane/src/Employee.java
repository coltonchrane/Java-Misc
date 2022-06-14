
public class Employee
{
	private String name;
	private float salary;
	public Employee(String string,float salary)
	{
		name = "";
		salary = 0;	
	}
	public void setName(String name) 
	{
		this.name = name;
		this.salary = salary;
	} 
	public void setSalary(float salary)
	{
		this.salary = salary;
	} 
	public String getName() 
	{
		return this.name; 
	} 
	public float getSalary()
	{ 
		return this.salary;
	} 
	public String toString() 
	{ 
	return "Employee: " + getName() + " Salary: " + getSalary(); 
	} 
}
