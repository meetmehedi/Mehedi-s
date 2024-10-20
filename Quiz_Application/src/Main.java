
public class Main {
        public static void main(String[] args) {
            Question q1 = new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, "Paris");
            Question q2 = new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, "Mars");
            Question q3 = new Question("Who wrote 'Hamlet'?", new String[]{"Shakespeare", "Dante", "Chaucer", "Homer"}, "Shakespeare");

            Question[] questions = {q1, q2, q3};

            Quiz quiz = new Quiz(questions);
            quiz.start();
        }
    }