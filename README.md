## Project Overview
This project is a simple number guessing game implemented in Java. The user is tasked with guessing a randomly generated number between 1 and 100. The game provides feedback if the guess is too high, too low, or correct. The user has a maximum of 5 attempts to guess the correct number.

## Features
Random Number Generation: The program generates a random number between 1 and 100 at the start.

## User Input: Users input their guess via a graphical input dialog (using JOptionPane).
  
## Project Structure
guess.java: The main file containing the logic for the number guessing game and the user interface using JOptionPane.

## How It Works
Random Number Generation:
The game generates a random number between 1 and 100 using Math.random() when the program starts.

## User Input:
The user is prompted to enter a guess using a pop-up dialog box.

## Feedback:
If the guess is too high or too low, the user receives feedback and is asked to try again.
If the guess is correct, the game ends and displays a success message.

## Attempt Limitation:
The user is allowed up to 5 guesses. If the user fails to guess correctly within the limit, the game will continue to ask for input, but the logic can be extended to limit or reset the game.

## Code Structure
guessMethod(int userAnswer, int computerNumber, int count):
Checks if the user’s guess is valid.
Compares the user’s guess with the randomly generated number.
Returns a message indicating whether the guess is too high, too low, or correct, along with the attempt count.

## Thank You
Thank you for using my GuessingNumber game app. I hope it helps you stay organized and productive.
