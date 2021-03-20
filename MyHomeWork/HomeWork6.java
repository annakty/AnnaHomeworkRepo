package MyHomeWork;

import java.util.Locale;

public class HomeWork6 {

    public static void main(String[] args) {
        System.out.println("Task #1: --------------------");

        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the precentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: Less than or equal 50
         */

        double studentScore = 100;
        double totalPossibleScore = 700;
        double percentage = (studentScore / totalPossibleScore) * 100;
        //calculate percentage
        //your percentage: xx.yy and your Grade is: z
        percentage = Math.round(percentage * 100) / 100;

        if (studentScore > 700 || studentScore <= 0) {
            System.out.println("Entered Invalid student score");
        } else if (percentage >= 90.00 && percentage <= 100) {
            System.out.println("Percentage of student  score is " + percentage + " and your Grade is A.");
        } else if (percentage >= 80.00 && percentage <= 89.99) {
            System.out.println("Percentage of student  score is " + percentage + " and your Grade is B.");
        } else if (percentage >= 70.00 && percentage <= 79.99) {
            System.out.println("Percentage of student  score is " + percentage + " and your Grade is C.");
        } else if (percentage >= 60.00 && percentage <= 69.99) {
            System.out.println("Percentage of student  score is " + percentage + " and your Grade is D.");
        } else if (percentage >= 50.01 && percentage <= 59.99) {
            System.out.println("Percentage of student  score is " + percentage + " and your Grade is E.");
        } else if (percentage <= 50.00) {
            System.out.println("Percentage of student  score is " + percentage + " and your Grade F: Less than or equal 50");
        }

        System.out.println("\nTask #2: --------------------");
        /**
         * store value in an in variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number divisible by 3 and 5 , print "divisible by both"
         * if not divisible by 3 and 5 , print the number
         */

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number " + num + " divisible by both.");
        } else if (num % 5 == 0) {
            System.out.println("The number " + num + " divisible by 5.");
        } else if (num % 3 == 0) {
            System.out.println("The number " + num + " divisible by 3.");
        } else {
            System.out.println("The number is " + num + ".");
        }

        System.out.println("\nTask #3: --------------------");
        /** Checking car mode (P, D, N, R)    //// switch
         * if car mode is P and "you can park car"
         * if car mode is D "drive car"
         *    if drive type is Snow, display "You are on Snow mode"
         *    if drive type is Sport, display "You are on Sport mode"
         *    if drive type is Eco, display "You are on Eco mode"
         * if car mode is N and you can "put car in car wash"
         * if car mode is R and you can "revere the car"
         */

        char carGear = 'D'; // P, D, N, R
        String driveType = "Eco"; // Snow, Sport, Eco

        switch (carGear) {
            case 'P':
                System.out.println("You can park car.");
                break;
            case 'D':
                System.out.println("Drive car.");
                switch (driveType) {
                    case "Snow":
                        System.out.println("You are on Snow mode.");
                    case "Sport":
                        System.out.println("You are on Sport mode.");
                    case "Eco":
                        System.out.println("You are on Eco mode.");
                        break;
                }
                break;
            case 'N':
                System.out.println("Put car in car wash.");
                break;
            case 'R':
                System.out.println("Revere the car.");
        }

        num =46;
       int num1 = 17;
       int result =num%num1;
        System.out.println(result);

    }
}
