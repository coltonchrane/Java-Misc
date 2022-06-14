public class AnyCorrectChoiceQuestion extends Question {
    public AnyCorrectChoiceQuestion() {
        super();

    }

    public void setAnswer(String correctResponse) {
        answer += correctResponse + " ";
        super.setAnswer(answer);
    }

    public void addChoice(String choice, boolean correct) {
        super.setText(choice);
        if (correct) {
            setAnswer(choice);
        }
    }

    public boolean checkAnswer(String response) {
        return answer.trim().toLowerCase().contains(response.trim().toLowerCase());
    }


	public void display() {
        super.display();
        System.out.println("Provide anyone of correct answers!");
        System.out.println("If they are more than one provide them separated with spaces!");
    }
	public String toString() 
	{
        return getClass().getName();
	}
}
