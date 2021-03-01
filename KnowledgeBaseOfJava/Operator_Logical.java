package KnowledgeBaseOfJava;

public class Operator_Logical {

    public static void main(String[] args) {


        /**
         * Comparison (>, <, >=, <=, ==, !=) -->> boolean type
         * > - greater then
         * >= - greater then or equal to
         * < - less then
         * <= - less then or equal to
         * == - equal to
         * != - is NOT equal to
         *
         * Logical Operator (&&, ||, !)
         * Logical Operators - we use logical operators to join two or more conditions.
         * Final result will always be a boolean datatype.
         *
         * && -->>> AND Operator
         * (all combined conditions must be true to get final result as true.
         * If any one of the condition is false, final result is false.
         *
         * || -->>> OR Operator
         * Anya one of the combined conditions is to be true to get final result as true.
         * If all conditions are false, then final result will be false.
         *
         * !  -->>> NOT Operator
         * Not Operator will make true as false and vice-versa)
         *
         *
         * is today a weekday? -->> True
         * is it raining right now? -->> False
         *
         * is today a weekday AND is it raining right now? -->> false
         * is today a weekday OR is it raining right now? -->> true
         *
         * credit score > 700 AND is customer first time home buyer? >> 1.1
         * credit score > 700 OR is customer first time home buyer? >> 1.1
         *
         */

        int lVal1=10, lVar2=20, lVar3=30, lVar4=40;

        boolean lRes1 = lVal1 <= lVar3; //true
        System.out.println("lRes1 ->> " +lRes1);

        boolean lRes2 = lVal1 <= lVar3 && lVar2==lVar4; //false
        System.out.println("lRes2 ->> " +lRes2);

        boolean lRes3 = lVal1 <= lVar3 || lVar2==lVar4; //true
        System.out.println("lRes3 ->> " +lRes3);

        boolean lRes4 = (lVal1 <= lVar3) && !(lVar2 <= lVar3+lVal1); //true
        System.out.println("lRes4 ->> " +lRes4);
    }



}
