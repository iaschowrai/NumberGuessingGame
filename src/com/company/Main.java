package com.company;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        int computerNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;

        System.out.println("The correct guess would be " + computerNumber);

        int count = 1;
        while (userAnswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null, "Guess a Number between 1 to 100", "Guessing Number", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));

            count++;
        }
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if(userAnswer <= 0 || userAnswer>100){
            return "Your guess is invalid";

        }
        else if (userAnswer == computerNumber){
            return "Correct! \n Total Guesses: " + count;
        }
        else if (userAnswer < computerNumber){
            return "Your guess is too low, try again.\n Try Number: "+ count;
        }
        else if(userAnswer > computerNumber){
            return "Your guess too high, try again.\nTry Number: "+ count;
        }
        else{
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}



