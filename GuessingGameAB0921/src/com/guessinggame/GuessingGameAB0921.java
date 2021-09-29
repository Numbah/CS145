package com.guessinggame;
//Programmer: Alambey Byrd
//Class: CS145
//Date: 09/27/21
//Assignment: LAB1 Guessing Game


import java.util.Random;
import java.util.Scanner;

public class GuessingGameAB0921 {
        public static void main(String[] args){
                        Scanner input = new Scanner(System.in);
                    int t = 0;
                    int x = 0;
                    int gg = 0;
                    int ibg = 0;
                    int bg = 0;

                    Intro();
              while ( x<=0 ) {
                  int g = theGame();
                  gg = gg + g;
                  if (t >= 1) {
                      ibg = bg;
                      bg = bestGuest(g, ibg);
                  } else {
                      bg = gg;
                  }
                  t++;
                  System.out.println("Do you want to play again? y/n");
                  String d = input.next();
                  d = d.substring(0, 1);
                  int y = 0;
                  while (y <=0) {
                  if (d.equals("y")) {
                  System.out.println("It's like skittles cant just have or play one!");
                        y++;
                  } else if (d.equals("n")) {
                        x++;
                        theResults(t,gg,bg);
                        y++;
                    } else{
                      System.out.println("Please input a variation of Yes or No.");
                      y--;
                      y++;
                      d = input.next();
                    }// End of else statement
                  }
              }// End of While loop
        }// End of Main Method

        public static void Intro() {
                System.out.println("Welcome to the Guessing Game!\nThe rules are simple. I'll be thinking of a number between 1 and 100.");
                System.out.println("It'll be your job to guess that number correctly. Don't worry, I'll be here to help out slightly enjoy the game.");
        }// End of Intro Method

        public static int theGame() {
                        Random rand = new Random();
                        Scanner input = new Scanner(System.in);
                    int r = rand.nextInt(100)+1;
                    int g = 0;
                        System.out.println("\nWhat's your guess?");
                    int n;
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Please enter an integer.");
                    }    n = input.nextInt();
                        System.out.println("Your guess was " + n);
            // End of While loop
            while (n !=r) if (n < r) {
                System.out.println("Your guess was kinda low? Aim higher!");
                while (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Please enter an integer.");
            }    n = input.nextInt();
                if ( r-n<=10){
                    switch (r-n) {
                        case 10:
                        case 9:
                            System.out.println("You're starting to feel your toes again.");
                            break;
                        case 8:
                        case 7:
                            System.out.println("Warmth is coming back to your hands.");
                            break;
                        case 6:
                        case 5:
                            System.out.println("Now you're getting somewhere!");
                            break;
                        case 4:
                        case 3:
                            System.out.println("You can feel the steam from the coffee brewing.");
                            break;
                        case 2:
                        case 1:
                            System.out.println("You might as well be touching the sun at this point.");
                            break;
                    }
                } if (r-n>10) {
                    System.out.println("Your ice cold baby!");
                }System.out.println("Your guess was " + n);
                g++;
            } else {
                System.out.println("Your guess was a bit off try lower.. maybe?");
                while (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Please enter an integer.");
                } n = input.nextInt();
                if ( (r-n)*(-1)<10 ){
                    switch ((r-n)*(-1)) {
                        case 9:
                            System.out.println("You're starting to feel your toes again.");
                            break;
                        case 8:
                        case 7:
                            System.out.println("Warmth is coming back to your hands.");
                            break;
                        case 6:
                        case 5:
                            System.out.println("Now you're getting somewhere!");
                            break;
                        case 4:
                        case 3:
                            System.out.println("You can feel the steam from the coffee brewing.");
                            break;
                        case 2:
                        case 1:
                            System.out.println("You might as well be touching the sun at this point.");
                            break;
                    }
                //} if (r-n<9) {
                    //{
                        //if (r - n < 0)
                    //System.out.println("Your ice cold baby!");
                //}
            }System.out.println("Your guess was " + n);
                g++;
            }// End of if/else statement
                        g++;
                if (g == 1) {
                    System.out.println("You got it right in 1 guess!");
                } else {
                    System.out.println("Nice job you got it right in " + g + " guesses");
                } return g;
        }// End of theGame Method

        public static void theResults(int t, int g, int bg) {
            double a = g / t;
            System.out.println("Total Number of Games:" + t);
                            System.out.println("Total Number of Guesses:" + g);
                            System.out.printf("Average Number of Guesses per game: %1.2f%n", a);
                            System.out.println("Your best game had " +bg+ " guesses!");
        }// End of theResults Method

        public static int bestGuest(int g, int gg) {
            return Math.min(g,gg);
        }// End of bestGuest Method

}// End of Class Method