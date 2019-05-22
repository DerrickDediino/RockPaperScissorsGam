package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Rock, Paper, Scissors Game.  You have 7 rounds.");
        System.out.println("Pick Rock, Paper, or Scissors to Start (Rock = \"0\", Paper = \"1\", and Scissors = \"2\").");
        Scanner keyboard = new Scanner(System.in);
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
