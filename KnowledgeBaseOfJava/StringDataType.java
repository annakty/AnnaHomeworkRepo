package KnowledgeBaseOfJava;

import java.util.Arrays;

public class StringDataType {

    public static void main(String[] args) {

        /** String: is not-primitive datatype.
         * Can store single or multiple characters
         * while storing the value in variable, value must  be within double quotes
         *
         **String is a class // with many methods
         */
        String myName = "Happy Peace";
        System.out.println("Full name: " + myName);
        //Full name: Happy Peace

        String singles = "a b c d e     f";
        String info = "Value in single variable ->";
        int num = 10;
        System.out.println(info + num + singles);
        // Value in single variable ->10a b c d e     f

        /**
         * Index starts from 0. ALWAYS INT.
         * Last Index ALWAYS length-1.
         */

        /** How to find length of a String?
         * Use Method: length()  //  method to fount of length of any string
         * method is a piece of code to perform a task.
         */

        String cityName = "New York"; // length = 8, last index = 7 (8-1), start index =0

        int cityNameLength = cityName.length();
        System.out.println("\n Length of " + cityName + " is " + cityNameLength + ".");


        /**
         * To convert entire string value in lowercase/UpperCase.
         * Method: toLowerCase ()/UpperCase
         *This method is not going yo change the original velue,
         *It will convert the value in lowercase/uppercase, return the result to User.
         */

        cityName = "NeW YoRk cItY";
        String cityNameToLowerCase = cityName.toLowerCase();
        System.out.println("\nCity name in LowerCase: " + cityNameToLowerCase);

        cityName = cityNameToLowerCase;
        System.out.println("City name is " + cityName);

        String cityNameInUpperCase = cityName.toUpperCase();
        System.out.println("\nCity name in UpperCase: " + cityNameInUpperCase);

        cityName = cityNameInUpperCase;
        System.out.println("City name is " + cityName);

        /**
         * COMPARISON:
         * For comparison, when we need to verify two String identical
         * Method: equals()
         * Returns: boolean
         * for example to compare the password!
         */

        boolean isCityNameisequal = cityNameInUpperCase.equals(cityNameToLowerCase);
        System.out.println("\nCity name compare is: " + isCityNameisequal);
        boolean isCityNameisequal2 = cityName.equals(cityNameToLowerCase);
        System.out.println("City name compare is: " + isCityNameisequal2);


        /**
         * For comparison, when we need to verify two Strings have the same value
         * Method: equalsIgnoreCase()
         * Returns: boolean
         */

        boolean isCityNameisequal3 = cityNameInUpperCase.equalsIgnoreCase(cityNameToLowerCase);
        System.out.println("\nCity name compare in equalsToIgnore method is: " + isCityNameisequal3);
        boolean isCityNameisequal4 = cityName.equalsIgnoreCase(cityNameToLowerCase);
        System.out.println("City name compare in equalsToIgnore method is: " + isCityNameisequal4);

        /**
         * CONTAINS:
         * To find if a particular sequence is present in the string
         * Method: contains()
         * Return: boolean
         * do NOT ignore the case
         */

        /**
         * Task: Verify if cityName contains 'new'.
         * Note: Pls ignore case.
         * Expected ans: true
         */
        //1. lowerCase cityName
        //2. Use Contain Method

        String myCityName = "nEw yORk";
        boolean isMyCityContains_new = myCityName.contains("new");
        System.out.println("\nDoes the city contains 'new?' - " + isCityNameisequal);

        String myCityNameInLowerCase = myCityName.toLowerCase();
        boolean isMyCityContains_new1 = myCityNameInLowerCase.contains("new");
        System.out.println("\nDoes the city contains 'new?' - " + isMyCityContains_new1);

        /**
         * REPLACE:
         * To replace in string
         * Method: replace
         *
         * It will replace all instances.
         * This method will NOT change the original value,
         * it will replace the date, and returns a new String
         */
        String myCityName2 = "nEw YOrk";
        String cityNameReplace_Y_Z = myCityName2.replace('Y', 'Z');
        System.out.println("CityName: " + cityNameReplace_Y_Z);

        String cityNameReplaceMultiple = myCityName2.replace("w Y", "-Hello-");
        System.out.println(cityNameReplaceMultiple);

        /**
         * To find the char present at given index
         * Method:  charAt()
         * Return: char
         * myCityName2 = "nEw YOrk";
         */

        char charAtIndex1 = myCityName2.charAt(1);
        System.out.println("In " + myCityName2 + " char at Index 1: " + charAtIndex1);

        /**
         * Task: Write a code to print the char present at last index of the string.
         * String = "Hello World";
         *
         * 1.find the length of string,
         * 2. Using the length value, calculate the last Index (lastIndex=Length-1)
         * 3. Using charAt method, we can find the char present at last index
         */

        char lastIndexChar = myCityName.charAt(cityNameLength - 1);
        int lastIndexOr = cityNameLength - 1; //as teacher told
        char lastIndexChar1 = myCityName.charAt(lastIndexOr); // as teacher told
        System.out.println("The last Index in CityName is: " + lastIndexChar + " or " + lastIndexChar1);


        /**  // cityName: New YoRt citY
         * To find the index of given value (FIRST occurrence).
         * NOT ignore Case
         * Method: indexOf()
         * if the given value found,
         *   will return the index of FIRST occurence of the given value.
         * else
         *   return -1
         */

        cityName = "new york City iN the ToWN";
        int indexOfN = cityName.indexOf("N"); // it will give us 15 index
        System.out.println("Index of 'N' in '" + cityName + "is : " + indexOfN);

        /**
         * find multiple characters
         */

        int indexOf_word = cityName.indexOf("or"); // it will give us 5 index
        System.out.println("Index of 'or' in '" + cityName + "is : " + indexOf_word);
        int indexOf_Z = cityName.indexOf("Z"); // it will give us -1 value.it mens that we DO NOT have it.
        System.out.println("Index of 'Z' in '" + cityName + "is : " + indexOf_Z);


        /**
         * to find the index of LAST occurence of the given value
         * Method: lastIndexOf()
         * Returns: int
         */
        cityName = "New york City in the ToWN of the UNited States of America";
        int lastIndexOfN = cityName.lastIndexOf("N");
        System.out.println("Index of 'N' in '" + cityName + "is : " + lastIndexOfN);

        int lastIndexOfP = cityName.lastIndexOf("P");
        System.out.println("Index of 'N' in '" + cityName + "is : " + lastIndexOfP);


        /**
         * To find the string starts with given value
         * Method: startWith()
         * Return: boolean
         */
        cityName = "nEw York City";
        boolean cityNameStartsWith_ne = cityName.startsWith("ne");
        System.out.println("\nDoes my city name STARS with 'ne'? " + cityNameStartsWith_ne);

        boolean cityNameStartsWith_nEw_Y = cityName.startsWith("nEw Y");
        System.out.println("Does my city name STARS with 'nEw Y'? " + cityNameStartsWith_nEw_Y);

        /**
         * To find the string ends with given value
         * Method: endsWith()
         * Return: boolean
         */

        boolean cityNameEndWith_ty = cityName.endsWith("ty");
        System.out.println("\nDoes my city name ends with 'ty'? " + cityNameEndWith_ty);
        boolean cityNameEndWith_tY = cityName.endsWith("ty");
        System.out.println("Does my city name ends with 'tY'? " + cityNameEndWith_tY);

        /**
         * To REMOVE spaces from the beginning (before the first character
         * and the (after the last character) from a String
         * Method: trim()
         *
         * This method will not change original value,
         * it will removes extra spaces and return new string.
         */

        cityName = "   New york    City in     the ToWN of the    UNited States of America     .   ";
        String cityNameTrim = cityName.trim();
        System.out.println("\n#"+cityName +"#");
        System.out.println("#"+cityNameTrim +"#");

        /**
         * To fetch a portion from String using index value
         * Method: subString()
         * Return: String
         *
         * Example: "New york city in the town"
         * give me string from index 1-4 -->> "ew " 1,2,3 (the last index NOT PROVIDED and count)
         * give me string from index 1 -->> "ew york city in the town" (up to the end)
         *
         * Input is only beginIndex:
         *    if beginIndex is valid (within the index-range)
         *       returns string from beginIndex to end of the string.
         *
         *    else
         *       StringOutofBoundsException
         *
         * Input is beginIndex and endIndex;
         *    if beginIndex and endIndex are valid (within the index-range)
         *       returns string from beginIndex up to endIndex-1;
         *    else
         *        StringOutofBoundsException
         *
         *  It will not change the original string value.
         */

        cityName="New york city in the town";
        String cityNameSubString = cityName.substring(1,5);
        System.out.println("\nMy City Name SubString from index 1 to 5: " +cityNameSubString );

        String cityNameSubStringWithEnd = cityName.substring(10); //starts from index 10.
        System.out.println("My City Name SubString from beginning index 10: " +cityNameSubStringWithEnd);

        /**
         * SPLIT Method
         * New york city in the town"
         *
         * to cut the string value from a specific point into multiple string value
         * Method: Split()
         * Return: String []
         *
         */

        cityName="New york city in the town";
        String [] cityNameSplitby_o = cityName.split("o");
        System.out.println("\nCityName:"+cityName);
        System.out.println("cityName after split (direct value): "+cityNameSplitby_o);

        //shortcut to print Array values
        System.out.println("Array after Split:" + Arrays.toString(cityNameSplitby_o));
        String [] cityNameSplitby_space = cityName.split(" ");
        System.out.println("Split by space:" + Arrays.toString(cityNameSplitby_space));

        //nothing -->> give us array with every character at each index
        String [] cityNameSplitby_nothing = cityName.split("");
        System.out.println("Split by nothing:" + Arrays.toString(cityNameSplitby_nothing));







    }
}
