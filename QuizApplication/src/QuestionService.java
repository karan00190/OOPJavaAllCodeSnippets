import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    //we need to create objects
    public QuestionService(){
        questions[0]= new Question(1,"Which language supports platform Independency ? ", "Java","cpp","python","Javascript","Java");
        questions[1]= new Question(2,"Which language is best for data science ? ", "Java","cpp","python","Javascript","python");
        questions[2]= new Question(3,"Which language is frontend language ? ", "Java","cpp","python","Javascript","Javascript");
        questions[3]= new Question(4,"Which language is the fastest language ? ", "Java","cpp","python","Javascript","cpp");
        questions[4]= new Question(5,"Which language has Garbage collector feature ? ", "Java","cpp","python","Javascript","Java");



    }
    //Hard coded question creation
    public void playQuiz()
    {
        int i =0;
        for(Question q :questions)
        {
            System.out.println("Q"+q.getId()+"\n");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.println("Your answer: ");
            selection[i]=sc.nextLine();
            i++;
        }
        for(String s : selection)
        {
            System.out.println("Your answer in every questions : "+s);
        }

//
    }
    public void printScore()
    {
        int score =0;
        for(int i =0; i< questions.length; i++)
        {
             Question que = questions[i];  //just created a class reference to access each and every question
             String actualAnswer = que.getAnswer();  //call the right answers
             String userAnswer = selection[i];
             if(actualAnswer.equals(userAnswer))
             {
                 score++;
             }

        }

        System.out.println("Your score is "+score+"/5");
    }




}
