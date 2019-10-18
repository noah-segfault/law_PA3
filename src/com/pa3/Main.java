package com.pa3;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static final int QUESTIONS = 10;

    public static void questionResponse(boolean reception)
    {
        SecureRandom rand = new SecureRandom();
        int responses = rand.nextInt(4) + 1;

        if (reception)
        {
            switch (responses)
            {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        else
        {
            switch (responses)
            {
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don't give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }
    }

    public static int multiplicationQuestion(int input1, int input2)
    {
        Scanner scnr = new Scanner(System.in);
        int studentInput = 0;
        float answer = 0;
        boolean response = false;

        System.out.println("How much is " + input1 + " times " + input2 + "?");
        studentInput = scnr.nextInt();
        answer = input1 * input2;

        if ((answer) != (double)studentInput)
        {
            response = false;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 0;
        }
        else
        {
            response = true;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 1;
        }
    }

    public static int additionQuestion(int input1, int input2)
    {
        Scanner scnr = new Scanner(System.in);
        int studentInput = 0;
        float answer = 0;
        boolean response = false;

        System.out.println("How much is " + input1 + " plus " + input2 + "?");
        studentInput = scnr.nextInt();
        answer = input1 + input2;

        if ((answer) != (double)studentInput)
        {
            response = false;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 0;
        }
        else
        {
            response = true;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 1;
        }
    }

    public static int subtractionQuestion(int input1, int input2)
    {
        Scanner scnr = new Scanner(System.in);
        int studentInput = 0;
        float answer = 0;
        boolean response = false;
        if (input2 > input1)
        {
            System.out.println("How much is " + input2 + " minus " + input1 + "?");
            studentInput = scnr.nextInt();
            answer = input2 - input1;
        }
        else
        {
            System.out.println("How much is " + input1 + " minus " + input2 + "?");
            studentInput = scnr.nextInt();
            answer = input1 - input2;
        }


        if ((answer) != (double)studentInput)
        {
            response = false;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 0;
        }
        else
        {
            response = true;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 1;
        }
    }

    public static int divisionQuestion(int input1, int input2)
    {
        Scanner scnr = new Scanner(System.in);
        float studentInput = 0;
        float answer = 0;
        boolean response = false;
        if (input2 > input1)
        {
            System.out.println("How much is " + input2 + " divided by " + input1 + "? (Answer to the hundredth)");
            studentInput = scnr.nextFloat();
            answer = (float) input2 / (float) input1;
        }
        else
        {
            System.out.println("How much is " + input1 + " divided by " + input2 + "? (Answer to the hundredth)");
            studentInput = scnr.nextFloat();
            answer = (float) input1 / (float)input2;
        }


        if ((Math.abs(studentInput - answer) < 0.01))
        {
            response = true;
            System.out.printf("Student Answer: %.2f" , (double)studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 1;
        }
        else
        {
            response = false;
            System.out.printf("Student Answer: %.2f" , studentInput);
            System.out.printf("     Correct Answer: %.2f\n", answer);
            questionResponse(response);
            return 0;
        }
    }

    public static void gradeCheck(int grade)
    {
        Scanner scnr = new Scanner(System.in);
        int difficulty = 0;
        int questionType = 0;
        float score = grade / QUESTIONS;
        if (grade < 0.75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
            System.out.println("Enter your level of difficulty (1-4)");
            difficulty = scnr.nextInt();
            System.out.println("Enter the math problems you wish to solve +, -, /, * or a mix (1-5)");
            questionType = scnr.nextInt();
            questionGenerator(difficulty , questionType);
        }
    }

    public static void questionGenerator(int difficulty, int question)
    {
        SecureRandom rand = new SecureRandom();
        int num1 = 0;
        int num2 = 0;
        int questionFive = 0;
        int correct = 0;
        int setting = 0;
        int right = 0;
        int i = 0;

        switch (difficulty)
        {
            case 1:
                setting = 10;
                break;
            case 2:
                setting = 100;
                break;
            case 3:
                setting = 1000;
                break;
            case 4:
                setting = 10000;
                break;
            default:
                setting = 10;
                break;
        }

        while (i < QUESTIONS) {
            num1 = rand.nextInt(setting);
            num2 = rand.nextInt(setting);
            if (question == 1)
            {
                correct = additionQuestion(num1, num2);
            }
            else if (question == 2)
            {
                correct = subtractionQuestion(num1, num2);
            }
            else if (question == 3)
            {
                correct = multiplicationQuestion(num1, num2);
            }
            else if (question == 4)
            {
                correct = divisionQuestion(num1 + 1, num2 + 1);
            }
            else if (question == 5)
            {
                questionFive = rand.nextInt(3) + 1;
                switch (questionFive)
                {
                    case 1:
                        correct = additionQuestion(num1, num2);
                        break;
                    case 2:
                        correct = subtractionQuestion(num1, num2);
                        break;
                    case 3:
                        correct = multiplicationQuestion(num1, num2);
                        break;
                    case 4:
                        correct = divisionQuestion(num1 + 1, num2 + 1);
                        break;
                }
            }
            if (correct == 1) {
                right++;
            }
            i++;
        }
        gradeCheck(right);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int difficulty;
        int questionType;
        System.out.println("Enter your level of difficulty (1-4)");
        difficulty = scnr.nextInt();
        System.out.println("Enter the math problems you wish to solve +, -, *, / or a mix (1-5)");
        questionType = scnr.nextInt();
        questionGenerator(difficulty , questionType);
    }
}
