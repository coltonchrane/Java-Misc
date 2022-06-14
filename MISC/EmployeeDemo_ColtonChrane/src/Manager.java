public class Manager extends Employee 
{ 
	private String department;

public Manager(String string, float salary) 
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
return "Employee: " + getName() + " Salary: " + getSalary() + " Department: " + getDepartment(); 
} 

} 
