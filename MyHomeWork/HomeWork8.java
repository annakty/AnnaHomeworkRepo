package MyHomeWork;

public class HomeWork8 {
    public static void main(String[] args) {
        /**Task 1:
         Add all the numbers from given array,
         and store final result in "total" variable.
         */

        System.out.println("\nTask #1 - Add all the numbers from given array,and store final result in \"total\" variable.");
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total=0;
        for (int i=0; i<doubleArray.length;i++) {
            total = total+doubleArray[i];
        }
        System.out.println("The total of numbers: " +total);


        /** Task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable palindromeL string which reads the same in reverse
         * eg:
         * level ->>>> level (palindrome)
         * eye -->>> eye (palindrome)
         * head ->> daeh (not palindrome)
         */

        String word = "eye";
        System.out.println( "\nTask #2 - Find out if the value stored in word variable is palindrome." +
                "\nThe word is:" + word);
        String[] wordArray = word.split("");
        word = "";
        String wordReverse = "";

        for (int i = wordArray.length - 1; i >= 0; i--) {
            wordReverse = wordReverse + wordArray[i];
        }
        for (int i =0; i<wordArray.length; i++) {
            word = word + wordArray[i];
        }
        boolean isPalindrome = wordReverse.equalsIgnoreCase(word);
        String resultOfPalindrome = (isPalindrome? "True": "False");
        System.out.println("Is a provided word is palindrome?: " +resultOfPalindrome);



        /** Task 3:
         * Find if the value stored in num variable is a prime or not.
         * And, store the final result in "isPrime" variable prime number ->> number which is only divisible by 1 and itself.
         * eg:
         * 5 ->>prime
         * 7->prime
         * 10-> not a prime
         */

        int number = 23;



    }
}
