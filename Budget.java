/**
 * Sean Pichay
 * ITSC1212 - 202, Mazumder
 * @version 1.0
 * @since   2022-02-11
 * Budget
 * Shows budget and if you are within budget
 */
import java.util.Scanner;

public class Budget {
    public static void main(String[] args){
        // ***********
        // Project 1
        // ***********
        //Creates a new scanner and lists variables below with calculations.
        Scanner scnr = new Scanner(System.in);
        double rent = 625;
        double internet = 27;
        double grocery = 250;
        double fun = 150;
        double wage = 10;
        double totalExpense = rent + internet + grocery + fun;
        double hoursPerWeek = (totalExpense / wage) / 4;
        double hours100 = (totalExpense + 100) / wage;
        //Prints variables out with two decimal points.
        System.out.println("Hourly wage is $" + String.format("%.2f",wage) + ".");
        System.out.println("Rent is $" + String.format("%.2f",rent) + ".");
        System.out.println("Internet bill is $" + String.format("%.2f",internet) + ".");
        System.out.println("Grocery bill is $" + String.format("%.2f",grocery) + ".");
        System.out.println("Allowance is $" + String.format("%.2f",fun) + ".");
        System.out.println("Total monthly expense is $" + String.format("%.2f",totalExpense));
        System.out.println("Hours needed per week to break even is " + String.format("%.2f",hoursPerWeek) + ".");
        System.out.println("Hours needed per month to save $100.00 is " + String.format("%.2f",hours100) + ".");
        //Asks user to input hours per week and month and calls method to calculate if you are in budget or not.
        System.out.println("How many hours do you work per week?");
        double choice = scnr.nextDouble();
            calculateWeek(choice);
        System.out.println("How many hours do you work per month?");
        double choice2 = scnr.nextDouble();
            calculateMonth(choice2);

    }
    //Methods taking in choice and uses if else statement to return strings.
    public static void calculateMonth(double choice2) {
        if(choice2 >= 115.20){
            System.out.println("You can save $100.00 per month.");
        }else {
            System.out.println("You cannot save $100.00 per month.");
        }
    }

    public static void calculateWeek(double choice) {
        if(choice >= 26.30){
            System.out.println("You can break even per week.");
        } else {
            System.out.println("You cannot break even per week.");
        }
    }
}
