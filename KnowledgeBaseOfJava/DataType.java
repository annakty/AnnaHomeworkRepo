package KnowledgeBaseOfJava;

public class DataType {
    public static void main(String[] args) {

        /**
         * Numbers
         *   whole   ->> byte, short, int, long
         *   decimal ->> float, double
         *
         *Text
         *   single-letter   ->> char
         *   multiple-letter ->> string,
         *
         *Yes/No
         *   true/false         ->> boolean
         */

        /** Question: How many datatype we have in Java? 2 types: PRIMITIVE and NON-PRIMITIVE
         *1) Primitive: byte, short, int, long, float, char, double, boolean
         *byte - can store only whole numbers ranging from -128 to 127
         *short - can store only whole numbers ranging from -32 768 to 32 767
         *int - can store only whole numbers ranging from -2 147 0000 000 to 2 147 000 000
         *In general, we use int-variable to store any whole number.
         *
         *long - can store only whole numbers ranging from -9 000 000 000 000 000 000 to 9 000 000 000 000 000 000
         *to store any value as 'long' in java-memory, we need to add 'L' after  the value then only java will treat the value as 'long'
         */
        long numOfStars = 9999999999999L;

        /**
         * float - can store value with decimal point.
         * f is an indicator for Java to theat decimal-value as float instead of double
         */
        float mortgageRate = 1.8f;

        /**
         *double - can store value with decimal point.
         * char - we can store only single character (single letter).
         * while storing the value in value, value must be within single -character
         /**
         * boolean - we can store only true or false
         *2) Non-Primitive: (datatype created by Users of Java)
         *String, Array, User defined Class, Interface


         /**
         *  To store a data we need a variables.
         *  IMP: Type of data must be same as datatype of variable.
         *
         * Syntax to create a variable:
         *      datatype variableName; //create variable (name= 'variableName') of datatype.
         *      VariableName = value;  // storing value in variableName variable.
         *      -- OR --
         *      datatype variableName
         *      //create variable (name= 'variableName') of datatype
         *      // storing value in variableName variable.
         *
         *Good practices to provide names:
         *1.variable:
         *   ->> variable name should related to the shored value
         *   ->> stars with lowercase
         *   ->> never stats with digit or special character
         *   ->> should always follow camelCaseFormat  //camel case format --->>> camelCaseFormat
         *
         *2.Class:
         *   ->> variable name should related to code inside
         *   ->> stars with Uppercase
         *   ->> never stats with digit or special character
         *   ->> should always follow CamelCaseFormat  //camel case format --->>> CamelCaseFormat
         *
         *3.Package:
         *   ->> variable name should related to the java classes inside
         *   ->> stars with Uppercase
         *   ->> never stats with digit or special character
         *   ->> should always follow CamelCaseFormat  //camel case format --->>> CamelCaseFormat
         *
         *
         * EXAMPLE: Write to code to store number of cars in your house (2)
         * byte numOfCars = 2;           // 2 is a value of byte type.... and abc is variable byte type
         *
         */

        short noOfDaysInYear = 365;
        short currentYear = 2021;

        //print like. there are 365 days in 2021;


        System.out.println("there are " + noOfDaysInYear + " days in " + currentYear);





    }

}
