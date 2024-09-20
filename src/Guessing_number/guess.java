package Guessing_number;

import javax.swing.JOptionPane;

public class guess {

    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1); //generate random num
        int userinput = 0; 
       
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1; 
         
        while (userinput != computerNumber)
        {
            if(count<=5) {
            	String response = JOptionPane.showInputDialog(null, 
                        "Enter a guess between 1 and 100", "Guessing Game", 3); 
                    userinput = Integer.parseInt(response); 
              
                    JOptionPane.showMessageDialog(null, ""+ guessMethod(userinput, computerNumber, count)); 
                    count++;
            }
        }  
    }
    
    public static String guessMethod(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
