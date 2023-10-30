/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codsoft.QuizApp;

/**
 *
 * @author Windows
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class QuizApp {
    public static void main(String[] args) {
        // Create quiz questions
        List<QuizQuestion> questions = new ArrayList<>();
        questions.add(new QuizQuestion("What is the capital of France?", List.of("Berlin", "Madrid", "Paris", "London"), 2));
        questions.add(new QuizQuestion("Which planet is known as the Red Planet?", List.of("Mars", "Venus", "Earth", "Jupiter"), 0));
        questions.add(new QuizQuestion("What is the largest mammal in the world?", List.of("Elephant", "Giraffe", "Blue Whale", "Lion"), 2));

        Quiz quiz = new Quiz(questions);

        Scanner scanner = new Scanner(System.in);

        while (quiz.hasNextQuestion()) {
            QuizQuestion question = quiz.getNextQuestion();
            if (question == null) {
                break;
            }

            System.out.println(question.getQuestion());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Select your answer (1-" + options.size() + "): ");
            int selectedOption = scanner.nextInt();

            // Assuming you have a timer to limit the time to answer.
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }, 20000); // 20 seconds

            int correctOption = question.getCorrectOption();
            quiz.submitAnswer(selectedOption, correctOption);
        }

        scanner.close();

        System.out.println("Quiz completed. Your score: " + quiz.getScore() + " out of " + questions.size());
    }
}

