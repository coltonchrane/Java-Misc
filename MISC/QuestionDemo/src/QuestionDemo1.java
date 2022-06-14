
import java.util.Scanner; 	 
/**	
   This program shows a simple quiz with one question.	
*/ 	
public class QuestionDemo1

{ 	
   public static void main(String[] args)  	
   {
	   
	      FillInQuestion question = new FillInQuestion( "_James Gosling_ was the inventor of Java.");	 
	      Scanner in = new Scanner(System.in);
	      question.display();
	      System.out.println("Your answer: ");
	      String response = in.nextLine();
	      System.out.println(question.checkAnswer(response));
   }
}
