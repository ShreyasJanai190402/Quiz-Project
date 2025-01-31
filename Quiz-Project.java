package com.java;

import java.util.Scanner;
class Question {

    private String question;

    private String[] options;

    private int correctAnswerIndex;

    public Question(String question, String[] options, int correctAnswerIndex) {

        this.question = question;

        this.options = options;

        this.correctAnswerIndex = correctAnswerIndex;

    }

    public String getQuestion() {

        return question;

    }

    public String[] getOptions() {

        return options;

    }


    public int getCorrectAnswerIndex() {

        return correctAnswerIndex;

    }

}

class QuizService {

    private Question[] questions;

    public QuizService() {

        initializeQuestions();

    }

    private void initializeQuestions() {

        questions = new Question[]{

                new Question("what is the capital of Maharashtra?",

                        new String[]{"New Delhi", "Mumbai", "Pune", "Nagpur"}, 1),

                new Question(" Which of the keyword must be used to inherit the class ",

                        new String[]{"super", "this", "extend", " extends"}, 3),

                new Question("What is 4 + 5?",

                        new String[]{"3", "4", "5", "9"}, 3)

        };

    }

    public void startQuiz() {

        Scanner scanner = new Scanner(System.in);

        int score = 0;



        System.out.println("Welcome to the Quiz!");

        System.out.println("---------------------");


        for (int i = 0; i < questions.length; i++) {

            Question question = questions[i];

            System.out.println((i + 1) + ". " + question.getQuestion());


            String[] options = question.getOptions();

            for (int j = 0; j < options.length; j++) {

                System.out.println((j + 1) + ": " + options[j]);

            }


            System.out.print("Your answer: ");

            int userAnswer = scanner.nextInt();



            if (userAnswer - 1 == question.getCorrectAnswerIndex()) {

                System.out.println("Correct!\n");

                score++;

            } else {

                System.out.println("Wrong! The correct answer was: " + options[question.getCorrectAnswerIndex()] + "\n");

            }

        }

        System.out.println("Quiz Over!");

        System.out.println("Your score: " + score + "/" + questions.length);

    }

}
public class Main {
    public static void main(String[] args) {

        QuizService quizService = new QuizService();

        quizService.startQuiz();


    }

}
