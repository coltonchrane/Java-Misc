import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class SentenceReverser 
{
	  public static void main(String[] args) 
	  {
	    Scanner in = new Scanner(System.in);
	    System.out.printf("1. Enter string to reverse : ");
	    String inputString = in.nextLine();

	    if (inputString == null || inputString.length() == 0) 
	    {
	      System.out.println("Enter the valid string");
	      return;
	    }
	    String reverse = reverseStringWW(inputString);
	    System.out.printf("\n3. Reverse string using stack is : %s", reverse);
	  } 
	  
	  private static String reverseStringWW(String inputString) 
	   {
	     String[] arrString = inputString.trim().split(Pattern.quote(" "));
	     Stack stack = new Stack();
	     for(String input : arrString) {
	    	   if(input.endsWith("."))
	    	   {
	    	      stack.push(input.toLowerCase().substring(0, input.length() - 1));
	    	   }
	    	   else
	    	   {
	    	      stack.push(input);
	    	   }
	    	}
	    StringBuilder builder = new StringBuilder();
	    while( !stack.isEmpty())
	    {
	        if(stack.size() == 1)
	        {
	            String element = stack.pop().toString();
	            builder.append(element.substring(0, 1).toLowerCase() + 
	            element.substring(1)).append(" ");
	        }
	        else
	        {
	            builder.append(stack.pop()).append(" ");
	        }
	    }
	    builder.append(".");
	    String result = builder.toString();
	    return result.substring(0, 1).toUpperCase() + result.substring(1);
	    
	  }
	}