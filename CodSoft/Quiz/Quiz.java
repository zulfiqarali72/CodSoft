/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codsoft.QuizApp;

/**
 *
 * @author Windows
 */
import java.util.List;


class Quiz {
    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private int score;

    public Quiz(List<QuizQuestion> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
    }

    public boolean hasNextQuestion() {
        return currentQuestionIndex < questions.size();
    }

    public QuizQuestion getNextQuestion() {
        if (hasNextQuestion()) {
            return questions.get(currentQuestionIndex++);
        }
        return null;
    }

    public void submitAnswer(int selectedOption, int correctOption) {
        if (selectedOption == correctOption) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }
}


