package AutoWiring;

/**
 * Created by Nick on 2/12/2017.
 */
public class Exam    {
    private AnswerChecker answerChecker;
    private String subject;

    public AnswerChecker getAnswerChecker(){
        return answerChecker;
    }
    public void setAnswerChecker(AnswerChecker answerChecker){
        this.answerChecker = answerChecker;
        System.out.println("Create Answer checker with setter");
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void examCheck(){
        answerChecker.checkAnswers();
    }

}
