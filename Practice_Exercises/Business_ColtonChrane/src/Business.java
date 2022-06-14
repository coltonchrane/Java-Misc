import java.util.LinkedList;
import java.util.ListIterator;
public class Business
{
	public static void downsize(LinkedList<String> staff, int n)
	{
		ListIterator<String> iter = staff.listIterator();
		for(int i = 0; i<n;i++)
		{
			iter.next();
		}
		iter.remove();
	}

}
