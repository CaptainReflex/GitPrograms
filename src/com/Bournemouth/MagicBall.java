package com.Bournemouth;
import java.util.Scanner;
public class MagicBall {

    public static void main(String[] args) {
        int randomInt = (int) Math.floor((Math.random() * 8) + 1);
        System.out.println("Welcome to my Magic 8 Ball program that I created. Would you like to play ?");
        Scanner input = new Scanner(System.in);
        boolean loopcheck = true;
        String play = input.nextLine();
        do{

         if (play.equalsIgnoreCase("yes")) {
             System.out.println("Think of a question, when you have, type it down and press 'Enter' ");
             String question = input.nextLine();
            if (!play.contains("[a-zA-Z]+") && play.length() > 2) {


                int eightBall = (int) (Math.random() * 8);


                switch (eightBall) {
                    case 0 -> System.out.println("As I see it, yes.");
                    case 1 -> System.out.println("Ask again later.");
                    case 2 -> System.out.println("Better not tell you now.");
                    case 3 -> System.out.println("Cannot predict now.");
                    case 4 -> System.out.println("Concentrate and ask again.");
                    case 5 -> System.out.println("Don't count on it.");
                    case 6 -> System.out.println("It is certain.");
                    case 7 -> System.out.println("It is decidedly so.");
                }
                System.out.println("Would you like to go again ? (yes or no)");
                String shakeAgain = input.nextLine();
                if (shakeAgain.equalsIgnoreCase("yes")) {
                    loopcheck = true;
                } else {
                    loopcheck = false;
                    System.out.println("Thankyou for playing.");
                    System.exit(0);
                }
            }
                }else if (play.equalsIgnoreCase("no")){
             System.out.println("Maybe next time");
             System.exit(0);
         }
            } while (loopcheck);

        }
    }


