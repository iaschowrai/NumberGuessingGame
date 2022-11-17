package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10 + 1);
        int userInput = 0;

        //System.out.println("The correct guess would be " + randomNumber);

        int count = 1;
        while (userInput != randomNumber) {
            String response = JOptionPane.showInputDialog(null, "Guess a Number between 1 to 10", "Guessing Number", 3);
            userInput = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userInput, randomNumber, count));

            count++;
        }
    }

    public static String determineGuess(int userInput, int randomNumber, int count){
        if(userInput <= 0 || userInput>10){
            return "Your guess is invalid";
        }
        else if (userInput == randomNumber){
            return "Correct! \n Total Guesses: " + count;
        }
        else if (userInput < randomNumber){
            return "Your guess is too low, try again.\nTry Number: "+ count;
        }
        else if(userInput > randomNumber){
            return "Your guess too high, try again.\nTry Number: "+ count;
        }
        else{
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}



