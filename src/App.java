/*
 * Jean LaFrance
 * 03/02/2024
 * CSC109 - Assignment 6
 * Program to simulate being at the DMV
 */

public class App {
    public static void main(String[] args) throws Exception {

        int queue;               //Random number given to user (1 - 100)

        //Welcome user to DMV
        System.out.println("Welcome to the DMV!");

        //Gives user random number between 1 and 100. User will wait until called
        queue = (int)(Math.random() * 100) + 1;
        System.out.println("Your number is " + queue + ". Please wait until your number is called.\n");

        //Call out numbers 1 at a time. Start at number after user's
        for(int i = (queue < 100) ? (queue + 1) : (1); i != queue; i++) {

            //When number goes over 100, start at 1
            if(i > 100){
                i = 1;
            }

            //Sleep between numbers called.
            //This DMV is fast, should only take 50 second for your number to be called
            try {
                System.out.println("Calling number " + i +"!");
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Weird exception");
            }
        }
        
        System.out.println("Calling number " + queue +"!\n");

        //Inform user that they lack the required paperwork
        System.out.println("Hello, happy to help you!");
        System.out.println("...Oh, I'm so sorry.");
        System.out.println("Please return with the required forms, two forms of identification,\n" + 
            "an envelope addressed to you, and a $90 dollar fee.");

    }
}