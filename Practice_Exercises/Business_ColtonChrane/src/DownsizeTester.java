import java.util.LinkedList;
import java.util.ListIterator;
public class DownsizeTester {

	public static void main(String[] args)
	{
		LinkedList<String> staff = new LinkedList<String>();
		staff.addLast("Diana");
		staff.addLast("Harry");
		staff.addLast("Romeo");
		staff.addLast("Tom");
		System.out.println("Original: " + staff);
		Business.downsize(staff,2);
		System.out.println("Downsized: " + staff);
		   
	}

}
