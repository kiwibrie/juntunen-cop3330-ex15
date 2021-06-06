package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String correctPassword = "abc$123";

        String passwordAttempt = myApp.prompt();

        if(passwordAttempt.equals(correctPassword)){
            myApp.printCorrect();
        } else {
            myApp.printIncorrect();
        }
    }

    public void printCorrect(){
        System.out.println("Welcome!");
    }

    public void printIncorrect(){
        System.out.println("I don't know you.");
    }

    public String prompt(){
        System.out.print("What is the password? ");
        return in.nextLine();
    }

}