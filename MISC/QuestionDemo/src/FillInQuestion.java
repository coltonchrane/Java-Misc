
public class FillInQuestion extends Question
{
	public FillInQuestion(String questionText) {
	     super(questionText);
	      String temp1 = questionText.replaceAll("_\\w+","__");
	      String temp2 = temp1.replaceAll("\\w+_", "__");
	      String temp3 = temp2.replaceAll("__ __", "____");
	 
	 
	 
	      String tempSplit[] = questionText.split("_");
	      setAnswer(tempSplit[1]);
	 
	 
	   }
	 
	     public void setAnswer(String correctChoice){
	         super.setAnswer( correctChoice );
	 
	     }
	 
	     public boolean checkAnswer (String response){
	         return super.checkAnswer(response);
	 
	     }
	 
	     public String toString(){
	         return super.toString();
	     }
	 
	 
}
