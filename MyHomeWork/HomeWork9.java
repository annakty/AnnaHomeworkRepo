package MyHomeWork;

import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println("\nTask #1: Write a method to convert given string into Titlecase");
        System.out.println(titleCaseSentence(" anna is a gOOd girl "));

        System.out.println("\nTask #2: Write a method that will reverse any given int-array");
        int[] myNum = {55, 44, 33, 22, 11};
        System.out.println("Result: " + Arrays.toString(reverseIntArray(myNum)));

        System.out.println("\nTask #3: Write a method that will tell grade to student for given score and MaxScore");
        System.out.println("Student Score: " +studentGrade(450));

        System.out.println("\nTask #4: Write a method that will return the numbers of words in given sentence.");
        System.out.println(numbersOfWordsInSentence("Do not fear the winds of adversity. Remember, a kite rises against the wind rather than with it"));
    }

    /**
     * Write a method to convert given string into Titlecase
     * eg: String sentence1 = "hApPy nEw yeAr";
     */

    public static String titleCaseSentence(String sentence) {
        sentence = sentence.trim();
        String[] sentenceArray = sentence.split("\\s+");
        String sentenceTitle = "";
        for (int i = 0; i < sentenceArray.length; i++) {
            sentenceTitle += sentenceArray[i].substring(0, 1).toUpperCase() + sentenceArray[i].substring(1).toLowerCase()+" ";
        }
        sentenceTitle = sentenceTitle.trim();
        return "Result: " + sentenceTitle + ".";
    }

    /**
     * Write a method that will reverse any given int-array
     * eg: [55,44,33,22,11]
     */

    public static int[] reverseIntArray(int[] num) {
        int[] numReverse = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--) {
            numReverse[i] = num[num.length - 1 - i];
        }
        return numReverse;
    }

    /**
     *  Write a method that will tell grade to student for given score and MaxScore
     */

    public static double studentGrade (double studentScore) {
        double totalPossibleScore = 700;
        double percentage = (studentScore / totalPossibleScore) * 100;
        percentage = Math.round(percentage * 100) / 100;

        if (studentScore > 700 || studentScore <= 0) {
            System.out.print("Entered Invalid student score");
        } else if (percentage >= 90.00 && percentage <= 100) {
            System.out.print ("Your Grade is A. ");
        } else if (percentage >= 80.00 && percentage <= 89.99) {
            System.out.print("Your Grade is B. ");
        } else if (percentage >= 70.00 && percentage <= 79.99) {
            System.out.print("Your Grade is C. ");
        } else if (percentage >= 60.00 && percentage <= 69.99) {
            System.out.print("Your Grade is D. ");
        } else if (percentage >= 50.01 && percentage <= 59.99) {
            System.out.print("Your Grade is E. ");
        } else if (percentage <= 50.00) {
            System.out.print("Your Grade F: Less than or equal 50. ");
        }
        return percentage;
    }

    /**
     * Write a method that will return the numbers of words in given sentence.
     */

    public static int numbersOfWordsInSentence (String sentence) {
        String sentenceOffSpace=sentence.trim();
        int numOfWords=1;
        for (int i=0; i <sentenceOffSpace.length(); i++) {
            if (sentenceOffSpace.charAt(i)== ' ' &&  i<sentenceOffSpace.length() -1 && sentenceOffSpace.charAt(i+1) !=' ') {
                numOfWords++;
            }
        }
        return numOfWords;
    }

}














