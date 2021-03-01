package KnowledgeBaseOfJava;

import java.util.Arrays;

public class ArrayDataType {

    public static void main(String[] args) {
        /**
         *Array: is non-primitive datatype.
         *Can store multiple value of SAME datatype.
         *Symbol of Array: []
         *
         * Syntax:
         * data type [] arrName = new datatype [count];
         * count is the total number of value you want to store.
         *   OR
         * datatype [] arrNAme ={value1, value2, value3, value4};
         *
         *
         * This to know before creation an Array:
         * 1. What will be the datatype of value you are going to store.
         * 2. Total number of value that you need to store.
         *      OR
         *    All the value that you want to store in array.
         *
         * What to create an array to store names of top-5 students of this batch?
         *
         */

        double[] myBill = new double[5];  // Array -->> { , , , , , }
        // Array -> {0, 1, 2, 3, 4}
        myBill[3] = 23.31; // Array -->> { , , 23.31, , , }
        myBill[0] = 10.10; // Array -->> { 10.10, , 23.31, , }

        System.out.println(myBill); //store memory location [D@f6f4d33
        //shortcut to print an Array
        System.out.println(Arrays.toString(myBill)); //[10.1, 0.0, 0.0, 23.31, 0.0]
        System.out.println(myBill[3]); // 23.31

        // Store the value at index-2 in new variable (footbill)
        double footBill = myBill[2];

        //Change the value at Index-4
        // new value should be total of value at index-o and Index3
        myBill[4] = myBill[0] + myBill[3];

        System.out.println(Arrays.toString(myBill)); //[10.1, 0.0, 0.0, 23.31, 33.41]

        /**
         * To find the length of Array
         * length  <-- In Array, length is a variable, NOT method.
         */

        int myBillLength = myBill.length;
        System.out.println("The length of myBill Array: " + myBillLength);

        /**
         * Creating array when User is aware of all value that going to be stored
         */
        String[] myCars = {"Ford", "Tesla", "BMW", "Merc", "NissaN"};
        System.out.println("Number of my car companies: " + myCars.length);

        //Verify if my 2nd fav car is BMW (ignore the case)
        boolean myFavCar = myCars[1].equalsIgnoreCase("BMW");
        System.out.println("Is my second favorite car is 'BMW'? / " + myFavCar);

        // Print my 10th fav car company
        //System.out.println(myCars[10]); //when the index is not present - ArrayIndexOutOfBoundsException

        // Print the 10th fav car company if present,
        // else print the least fav car company.
        String car10 = myCars.length >= 10 ? myCars[9] : myCars[myCars.length - 1];
        System.out.println("My last favorite car is "+car10);


    }

}



