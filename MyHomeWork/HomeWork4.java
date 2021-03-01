package MyHomeWork;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWork4 {

    public static void main(String[] args) {

        // String sentence_3 = "hello dear, how are you?";
        // boolean result;
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         *Hint: use ternary operator
         */
        // String sentence_4 = "We all ARe Good ProgRommeR";
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         */
        // String fullName = "";

        /**
         * 1. Display the length of your fullname.
         * 2. Does your name start with 'K' (ignore cases)
         * 3. Does your full name contain 'a' (ignore cases)
         */

        String sentence_3 = "hello dear, how are you?";
        System.out.println("\nMy first sentence is: " + sentence_3);
        int lenghtOfsentence = sentence_3.length();
        System.out.println("1.The length of sentence is " + lenghtOfsentence + ".");
        boolean result = lenghtOfsentence > 10 ? true : false;
        System.out.println("2.Is my sentence is greater than 10? The answer is " + result
                + ".");

        String sentence_4 = "We all ARe Good ProgRommeR";
        System.out.println("\nMy second sentence is: " + sentence_4 + ".");
        int lenghtOfSentence4 = sentence_4.length();
        System.out.println("1.The length of sentence is " + lenghtOfSentence4 + ".");

        //String sentence4InLowerCase = sentence_4.toLowerCase();
        //System.out.println("2.The sentence in LowerCase - " + sentence4InLowerCase);

        String replaceMySentence = sentence_4.replace('r', 'f');
        String replaceMySentence_1 = replaceMySentence.replace('R', 'f');
        System.out.println("3.Replaced all 'r' with 'f': " + replaceMySentence_1);


        String myFullName = "Anna Kutovaya";
        System.out.println("\nMy full name is: " + myFullName + ".");
        int lengthOfMyFullName = myFullName.length();
        System.out.println("1.The length of my name " + lengthOfMyFullName + ".");
        String myFullNameInLowerCase = myFullName.toLowerCase();
        String myFullNametoUpperCase = myFullName.toUpperCase();
        boolean findFirstLetterOfMyName_K = myFullName.startsWith("K");
        boolean findFirstLetterOfMyName_k = myFullName.startsWith("k");
        System.out.println("2.Does your name start with 'K'? " + findFirstLetterOfMyName_K + ".");
        System.out.println("3.Does your name start with 'k'? " + findFirstLetterOfMyName_k + ".");
        boolean isMyFullNameContains_a = myFullNameInLowerCase.contains("a");
        System.out.println("4.Does your full name contain 'a'? " + isMyFullNameContains_a + ".");


        /// Lab Lesson:

        /**
         * Store valid or invalid in String variable (validOrInvalid)
         * Store a String "myName" variable.
         * if
         *      length of string stored in myName variable >10, validOrInvalid = valid
         * else,
         *      validOrInvalid = invalid
         */
        System.out.println("\nSession Lab:");

        String myName = "Happy Peace";
        int lentOfMyName = myName.length();
        String validOrInvalid = lentOfMyName > 10 ? "Valid" : "Invalid";
        System.out.println("1." + validOrInvalid);

        /**
         * Store a String "myName" variable.
         * if myName length is >5, Assign 1st character of your name to 'myChar' (char) variable.
         * else, Assign Last character of your name to 'myChar' (char) variable.
         * Pseudo Coding
         * 1.Store name value in myName variable
         * int LastIndex = myName.Length ()-1
         * using ternary
         */

        myName = "Happy Peace";
        int myNameLastIndex = lentOfMyName - 1;
        char myChar = lentOfMyName > 5 ? myName.charAt(0) : myName.charAt(myNameLastIndex);
        System.out.println("2 MyChar is: " + myChar);

        /**
         * * Store a String "myName" variable.
         * if
         *      myName length is >5, Assign 1st character of your name to 'myLetter' (String) variable.
         * else,
         *      Assign Last character of your name to 'myLetter' (String) variable.
         *
         * Pseudo Coding
         * 1.Store name value in myName variable
         * int LastIndex = myName.Length ()-1
         * using ternary
         */

        myName = "Happy Peace";
        myNameLastIndex = lentOfMyName - 1;
        String myLetter = lentOfMyName > 5 ? myName.substring(0, 1) : myName.substring(lentOfMyName - 1);
        System.out.println("3 MyLetter is: " + myLetter);


        String sentence = "I'm a good programmer and this a good day to be cool";
        String[] aftersplit_oo = sentence.split("oo");
        System.out.println("4.My sentence is: " + Arrays.toString(aftersplit_oo));

        /**
         * Enter your first name and my code will:
         * 1. Print the name in TitleCase
         * 2. Print the number of letters in your first name.
         */

        String myFirstName = "  anna  ";
        String myNewFirstName = myFirstName.trim();
        String myNewFirstNameToLowerCase = myNewFirstName.toLowerCase();
        int myNewFirstNamelength = myNewFirstName.length();
        String firstLetterName = myNewFirstNameToLowerCase.toUpperCase().substring(0, 1);
        String firstletterRestname = myNewFirstNameToLowerCase.substring(1);
        System.out.println("5.Print the name in TitleCase: " + firstLetterName + firstletterRestname);
        System.out.println("The number of letters in my name: " + myNewFirstNamelength);

        /**
         * String sentence_1 = "Happy peace Grow"
         *
         * If
         *      String contains any vowel, print the index of 'a',
         * else
         *      print index of 'z' from given sentence.
         *
         * PS: Pls DO NOT consider cases.
         */

        String sentence_1 = "Happy peace Grow";
        String sentence1LowerCase = sentence_1.toLowerCase();
        boolean isContainsVowel = sentence1LowerCase.contains("a")
                || sentence1LowerCase.contains("e")
                || sentence1LowerCase.contains("i")
                || sentence1LowerCase.contains("o")
                || sentence1LowerCase.contains("u");

        int indexResult = isContainsVowel ? sentence1LowerCase.indexOf("a") : sentence1LowerCase.indexOf("z");
        System.out.println("6.If my sentence contains any vowel, print the index of 'a': " + indexResult);


    }


}
