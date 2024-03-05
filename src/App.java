/*
 * Jean LaFrance
 * 03/02/2024
 * CSC109 - Assignment 6
 * Program to simulate being at the DMV
 */

public class App {
    public static void main(String[] args) throws Exception {

        int queue;                  //Position of user in queue
        int waitTime = 200;         //Length of DMV queue

        //Welcome user to DMV
        System.out.println("Welcome to the DMV!");

        //Gives user random number between 1 and waitTime. User will wait until called
        queue = (int)(Math.random() * waitTime) + 1;
        System.out.println("Your number is " + queue + ". Please wait until your number is called.\n");

        //Call out numbers 1 at a time. Start at number after user's
        for(int i = (queue < waitTime) ? (queue + 1) : (1); i != queue; i++) {

            //When number goes over waitTime, start at 1
            if(i > waitTime){
                i = 1;
            }

            //Sleep between numbers called.
            //This DMV is fast, should only take (waitTime * 0.5) seconds for your number to be called
            try {
                System.out.println("Calling number " + i +"!");
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Weird exception");
            }
        }
        
        //Call user's number
        System.out.println("Calling number " + queue +"!\n");

        //Inform user that they lack the required paperwork
        System.out.println("Hello, happy to help you!");
        System.out.println("...Oh, I'm so sorry. You do not have the required documents");
        System.out.println("Thank you for wasting everyone's time. We have other people waiting, and you are holding up the line, so please leave.");//peer addition
        System.out.println("And next time please use your brain before deciding to come here ;)");
    }
}
