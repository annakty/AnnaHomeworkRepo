package MyHomeWork;

import java.util.Locale;

public class HomeWork7 {
    public static void main(String[] args) {

        /**
         * String sentence1 = "hApPy nEw yeAr";
         * sout (sentence); // hApPy nEw yeAr
         * //code
         * sout (sentence); // Happy New Year
         */

        System.out.println("\nTask #1: Convert sentence from hApPy nEw yeAr to Happy New Year");
        String sentence1 = "hAppY nEW yEaR   ";
        System.out.println("The original version: " + sentence1);
        String[] sentence1Array = sentence1.split(" ");
        sentence1 = "";

        //sentence1 = sentence1Array[0].substring(0, 1).toUpperCase() + sentence1Array[0].substring(1).toLowerCase() + " "; //Happy
        //sentence1 = Happy
        //sentence1 = sentence 1 + sentence1Array[1].substring(0, 1).toUpperCase() + sentence1Array[1].substring(1).toLowerCase() + " ";
        //sentence1 = Happy_+ New_
        //sentence1 = sentence 1 + sentence1Array[2].substring(0, 1).toUpperCase() + sentence1Array[2].substring(1).toLowerCase() + " ";
        //sentence1 = Happy_+ New_+ Year_

        for (int i = 0; i < sentence1Array.length; i++) {
            sentence1 = sentence1 + sentence1Array[i].substring(0, 1).toUpperCase() + sentence1Array[i].substring(1).toLowerCase() + " ";
        }
        sentence1 = sentence1.trim();
        System.out.println("The final result: " + sentence1 + ".");

        /**
         * Create abbreviation:
         * String sentence2 = "Lab sessIONS clAsses";
         * // code
         * LSC
         */

        System.out.println("\nTask #2: Create abbreviation for 'Lab sessIONS clAsses'");
        String sentence2 = "Lab sessIONS clAsses";
        System.out.println("The original version: " + sentence2);
        String[] sentence2Array = sentence2.split(" ");
        sentence2 = "";

        for (int i = 0; i < sentence2Array.length; i++) {
            sentence2 = sentence2 + sentence2Array[i].substring(0, 1).toUpperCase();
        }
        sentence2 = sentence2.trim();
        System.out.println("The final result: " + sentence2 + ".");

//        for (int i = 0; i < sentence2Array.length; i++) {
//            if (i == 0) {
//                sentence2 = sentence2Array[i].substring(0, 1).toUpperCase();
//            } else {
//                sentence2 = sentence2 + sentence2Array[i].substring(0, 1).toUpperCase();
//            }
//        }
        sentence2="";
        for (String word : sentence2Array) {
            sentence2 = sentence2+word.substring(0,1).toUpperCase();
        }
        System.out.println("The final result in Enhanced loop: " + sentence2 + ".");

        /** Reverse a string
         */

        System.out.println("\nTask #3: Revert a sentence");
        String sentence3 = "Be at peace";
        System.out.println("The original version: " + sentence3);
        String[] sentence3Array = sentence3.split("");
        sentence3 = "";

        for (int i = sentence3Array.length - 1; i >= 0; i--) {
            sentence3 = sentence3 + sentence3Array[i];
        }
        System.out.println("The final result: " + sentence3 + ".");

    }
}
