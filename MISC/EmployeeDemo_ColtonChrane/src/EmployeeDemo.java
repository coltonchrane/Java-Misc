
public class EmployeeDemo
{

	public static void main(String[] args)
	{
		/**
		   This program tests the Employee class and its subclasses.
		*/
		      Employee e = new Employee("", 0);
		      Manager m = new Manager("",0);
		      Executive v = new Executive("",0);
		      e.setName("John");
		      e.setSalary(100);
		      m.setName("Bill");
		      m.setSalary(100);
		      m.setDepartment("Manager");
		      v.setName("Jim");
		      v.setSalary(101);
		      v.setDepartment("Head Honcho");
			      
		      System.out.println(e.toString());
		      System.out.println(m.toString()); 
		      System.out.println(v.toString());
}

}
