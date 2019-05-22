package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Rock, Paper, Scissors Game.  You have 7 rounds.");
        System.out.println("Pick Rock, Paper, or Scissors to Start (Rock = \"0\", Paper = \"1\", and Scissors = \"2\").");
        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        int cP=0;
        int uP=0;
        while (loop) {
            int u = keyboard.nextInt();
            int c = (int) (Math.random() * 3);
            if(c==0&&u==2||c==1&&u==0||c==2&&u==1){
                System.out.println("Computer Choice: "+computerInput(c)+"\nYour Choice: "+userChoice(u)+"\nComputer Wins...");
                cP++;
                System.out.println("Score: "+"\nComputer: "+cP+"\nYou: "+uP);
            }
            else if (c==1&&u==2||c==0&&u==1||c==2&&u==0){
                System.out.println("Your Choice: "+userChoice(u)+"\nComputer Choice: "+computerInput(c)+"\nYou Win!!!");
                uP++;
                System.out.println("Score: "+"\nYou: "+uP+"\nComputer: "+cP);
            }
            else if (c==1&&u==1||c==0&&u==0||c==2&&u==2){
                System.out.println("Computer Choice: "+computerInput(c)+"\nYour Choice: "+userChoice(u)+"\nDraw.");
                cP++; uP++;
                System.out.println("Score: "+"\nComputer: "+cP+"\nYou: "+uP);
            }
            else {
                System.out.println("Invalid");
            }
            if (cP>uP&&cP+uP>=7){
                System.out.println("Game Over.\nComputer Wins.\nPress 3 to play again.");
            }
            else if (uP>cP&&cP+uP>=7){
                System.out.println("Congratulations!!!\nYou Won the Game!\nPress 3 to play again");
            }
            if (cP+uP>=7) {
                int pA = keyboard.nextInt();
                if (pA == 3) {
                    loop = true;
                    cP = 0;
                    uP = 0;
                }
                else {
                    loop=false;
                }
            }
        }
    }
    public static String computerInput(int c){
        String[]rPS=new String[3];
        rPS[0] = "rock";
        rPS[1] = "paper";
        rPS[2] = "scissors";

        switch (c){
            case 0:
                return rPS[0];
            case 1:
                return rPS[1];
            case 2:
                return rPS[2];
        }return "Invalid";
    }
    public static String userChoice(int keyboard){
        switch (keyboard){
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
        }return "Invalid";
    }
}
