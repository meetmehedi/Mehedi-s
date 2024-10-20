import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Your answer (choose the option number): ");
            int userAnswer = scanner.nextInt();

            if (question.isCorrect(options[userAnswer - 1])) {
                score++;
            }
        }

        System.out.println("Quiz over! Your score: " + score + "/" + questions.length);
    }
}