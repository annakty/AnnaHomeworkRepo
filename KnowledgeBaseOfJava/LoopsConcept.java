package KnowledgeBaseOfJava;

import java.sql.SQLOutput;

public class LoopsConcept {

    public static void main(String[] args) {

        /**
         * Loops:
         * 1. For loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */


        /**
         * Ticket checker:
         *
         * 1.Start at seat-1, go upto the maxSeat No, seat+1
         *      pick ticket
         *      verify
         *      return ticket to the customer
         */

        String[] names1 = {"Happy", "Peace", "Grow", "Learn"};

        // System.out.println(names[0]); // var=0 (initial value =0)  <---- Initialization
        // System.out.println(names[1]); // var=1 (rate of change =+1)  <---- Increment
        // System.out.println(names[2]); // var=1
        //System.out.println(names[3]); // var=1 (last value = length -1) <---- Conditions

        //int var=1;
        //System.out.println(names [var]);

        /**
         * Syntax for loop:
         * for (initialization; condition ; increment) {
         *          // code inside
         *          // for loop
         *}
         */

        for (int i = 0; i <= names1.length - 1; i++) { // i=0,1,2,3
            System.out.println(names1[i]);
        }

        System.out.println("\n-----------");

        /**
         * initialization (int i=0)
         * evaluates condition ( i <= 3)
         * If result is true
         *      java enters the for-loop
         *      sout (names[1]);  // sout (names[0]; --->>> Happy
         *      while existing the for-loop, java increment/decrements the value of i.
         * else
         *      won't enter in the for-loop
         */

        /**
         * * evaluates condition with new value of ( i <= 3) // 1<=3 -->> true</=3>
         * If result is true
         *      java enters the for-loop
         *      sout (names[1]);  // sout (names[1]; ---->>>> Peace
         *      while existing the for-loop, java increment/decrements the value of i.
         * else
         *      won't enter in the for-loop
         *      ....
         *      until the condition result becomes false
         */

        //Print the words in reverse order

        String[] names2 = {"Happy", "Peace", "Grow", "Learn", "Sleep", "Share", "Teach", "Smile"};
        for (int i = names2.length - 1; i >= 0; i--) {
            System.out.println(names2[i]);
        }

        System.out.println("\n----------");

        for (int i = 1; i <= names2.length - 1; i++) {
            System.out.println(names2[i]);
        }

        /*
        Smile // sout (name2[names2.length-1]); // sout (name2[7]; // smile (int i = names2.length-1)
        Teach // sout (name2[names2.length-2]); // sout (name2[6]; // teacch (int i = names2.length-2)
        Share // sout (name2[names2.length-3]);
        Sleep // sout (name2[names2.length-4]);
        Learn
        Grow
        Peace
        Happy // sout (name2[names2.length-name2.length]);  // sout (name2[0]; // Happy
         */

        //Print "Hello 5 times.
        /**
         * Hello
         * Hello
         * Hello
         * Hello
         * Hello
         */

        System.out.println("\n-------------");

        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello");
        }


        String[] words = {"Happy", "Peace", "Grow", "Learn", "Sleep", "Share", "Teach", "Smile"};
        /*
        Print the words present in even index
        Happy // index-0  sout (names[0]) i=0   lastValue = lastIndex  increment=2
        Grow  // index-2  sout (names[2])
        Sleep // index-4  sout (names[4])
        Teach // index-6  sout (names[6])
         */

        System.out.println("\n-------------");

        for (int i = 0; i <= words.length - 1; i += 2) {
            System.out.println(words[i]);
        }

        System.out.println("\n-------------");

        for (int i = 0; i <= words.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(words[i]);
            }
        }
        /** Enhanced for-loop
         *      when you need to access values from index-0 to last-index, one by one
         *      in an array (or similar datatype)
         */

        String[] wordsAgain = {"Happy", "Peace", "Grow", "Learn", "Sleep", "Share", "Teach", "Smile"};
        System.out.println("\n-------------");

        for (int i = 0; i <= wordsAgain.length - 1; i++) {
            System.out.println(wordsAgain[i]);
        }

        System.out.println("\n-------------");
        /*
            for (datatype var:arrName) {
                //code inside the loop
            }

            for 1st loop -->>> var =arrName[0]
            for 2nd loop -->>> var =arrName[1]
            ....
            ....
         */

        for (String word : wordsAgain) {
            System.out.println(word);
        }

        System.out.println("\n-------------");

        for (String word : wordsAgain) {
            if (word.toLowerCase().contains("a")) {
                System.out.println(word);
            }
        }

        System.out.println("\n-------------");

        int[] ssnNumbers = {1111, 2222, 3333, 4444, 5555};
        /*
        1111
        2222
        3333
        4444
        5555
         */
        for (int i = 0; i < ssnNumbers.length; i++) { // i < ssNumbers.length (i<=4--0,1,2,3,4)
            System.out.println(ssnNumbers[i]);
        }
        System.out.println("\n-------------");

        for (int ssn : ssnNumbers) {
            System.out.println(ssn);
        }

        String sentence_2 = "how are you"; //5
        /**
         * Print all the vowels (a,e,i,o,u) present in the sentence
         */
        /*
         1. to lowercase then split by (" ")      // ["happy" "holidays"}
         2. for (int i=0 ; i<length ; i++)
         */

        String[] sentence2Array = sentence_2.split("");
        int count = 0;
        for (String letter : sentence2Array) {
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u")) {
                count++;
            }
        }
        System.out.println("\n\nCount: " + count);
    }
}
