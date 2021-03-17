package MyHomeWork;

import java.util.Arrays;

public class HomeWork5 {

    public static void main(String[] args) {

        /**
         * String threeWordSentence_1 = "hApPy nEw yeAr";
         * sout (threeWordSentence_1); // hApPy nEw yeAr
         * //code
         * sout (hApPy nEw yeAr); // Happy New Year
         */

        String threeWordSentence_1 = "  hApPy nEw yeAr";
        threeWordSentence_1 = threeWordSentence_1.trim().toLowerCase();
        System.out.println("1.Three Words Sentence #1: " + threeWordSentence_1);
        String[] array = threeWordSentence_1.split(" ");
        String word1 = array[0].substring(0, 1).toUpperCase() + array[0].substring(1);
        String word2 = array[1].substring(0, 1).toUpperCase() + array[1].substring(1);
        String word3 = array[2].substring(0, 1).toUpperCase() + array[2].substring(1);
        System.out.println("Result: " + word1 + " " + word2 + " " + word3);

        /**
         * Create abbreviation:
         * String threeWordSentence_2 = "Lab sessIONS clAsses";
         * // code
         * LSC
         */

        String threeWordSentence_2 = "Lab   sessIONS clAsses";
        threeWordSentence_2 = threeWordSentence_2.trim().toLowerCase();
        System.out.println("\n2.Three Words Sentence #2 in Lower case: " + threeWordSentence_2);
        String[] array2 = threeWordSentence_2.split("\\s+");
        String abb1 = array2[0].substring(0, 1).toUpperCase();
        String abb2 = array2[1].substring(0, 1).toUpperCase();
        String abb3 = array2[2].substring(0, 1).toUpperCase();

        System.out.println("Result: " + abb1 + abb2 + abb3);

        /**
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a Last Name, Does last name ends with 'a' (ignore cases)
         *      else print, "No Last Name entered"
         * 3. If user has a Last Name, print the 1st letter of last name
         *      else print, "No Last Name entered"
         * 4. Print the number of letters in the first name
         */

        String fullName = "  anna kutovaya  ";

        String fullNameWithoutSpace = fullName.toLowerCase().trim();
        System.out.println("\nUser Full Name without space: " + fullNameWithoutSpace + ".");

        String[] fullNameSplitBySpace = fullNameWithoutSpace.split(" ");
        System.out.println("User full name in Array: " + Arrays.toString(fullNameSplitBySpace));

        String firstName = fullNameSplitBySpace[0];
        String lastName = fullNameSplitBySpace[fullNameSplitBySpace.length - 1];
        System.out.println("After split, the first name is: " + firstName + " and last name is: " + lastName + ".");

        boolean firstNameStartLetter_k = firstName.substring(0, 1).equalsIgnoreCase("k");
        System.out.println("\n1.Does User First name start 'K'? / " + firstNameStartLetter_k + ".");

        if (fullNameSplitBySpace.length >= 2) {

            boolean lastNameEnds = lastName.endsWith("a");
            System.out.println("2.Does last name ends with 'a'? / " + lastNameEnds);

            char firstLetterOfLastName = lastName.charAt(0);
            System.out.println("3.Last name starts with " + firstLetterOfLastName);
        } else {
            System.out.println("No Last Name entered");
        }

        int numberOfLettersInFirstName = firstName.length();
        System.out.println("Number of letters in the first name: " + numberOfLettersInFirstName);

    }

}
