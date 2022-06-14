import java.util.*;
public class Appointment {
	private int year;
	private int day;
	private int month;
	private String description;
	
/**
 *  Constructor	
 */
	public Appointment(int year, int day, int month, String description)
	{
		this.year = year;
		this.day = day;
		this.month = month;
		this.description = description;
	}
	public int GetDay()
	{
		return day;
	}
	public int GetMonth()
	{
		return month;
	}
	public int GetYear()
	{
		return year; 
	}
	public String GetDesc()
	{
		return description;
	}
	public boolean occursOn(int year, int month, int day)
	{
		ArrayList appointments = new ArrayList ();
		
		return false;
	}
}
