package KnowledgeBaseOfJava;

import java.sql.SQLOutput;

public class Operator_Ternary {


    public static void main(String[] args) {

        /**
         * Ternary (?:)
         * Used in situation where you want to assign value to a variable
         * depending upon conditions
         ***********
         * crScore=700;
         * boolean isBuyingFirstTime=true;
         * double mortgageRate = ccrScore > 700, it is 1.1 else 1.5;
         * sout (mortgageRate): 1.5
         *
         * double mortgageRate = ccrScore > 700 || Buying-First-Time, it is 1.1 else 1.5;
         * sout (mortgageRate): 1.1
         *
         * Syntax:
         * variableName = condition?valueWhenTrue:valueWhenFalse
         */

        int creditScore = 700;
        boolean isFirstTimeBuyer = true;
        double mortgageRate = creditScore>700 ?1.1:1.5;

        System.out.println("\nMortgage Rate is " +mortgageRate);
        System.out.println("Credit Score ->> " +creditScore+ ", Mortgage Rete: " +mortgageRate);

        double mortgageRate2 = creditScore>700 || isFirstTimeBuyer?1.1:1.5;
        System.out.println("Credit Score ->> " +creditScore+ ", Mortgage Rete: " +mortgageRate2);

        double mortgageRate3 = creditScore>700 && isFirstTimeBuyer?1.1:1.5;
        System.out.println("Credit Score ->> " +creditScore+ ", Mortgage Rete: " +mortgageRate3);



        int hour24Value=19;
        String greetingMsg = hour24Value>12? "Good Evening": "Good Day";
        System.out.println("\nGreeting Message: "+greetingMsg);

        hour24Value=10;
        String greetingMsg2 = hour24Value>12? "Good Evening": "Good Morning";
        System.out.println("Greeting Message: "+greetingMsg2);

        int hour24Value2=19;
        int val =19;
        int result=hour24Value2<12 ? val:val++;
        System.out.println("\nFirst Result: " +result);
        System.out.println("Value: " +val);

        int val2 =5;
        int result2=hour24Value2>12 ? val2:val2++;
        System.out.println("Second Result: " +result2);
        System.out.println("Value 2: " +val2);

        int val3=19, hour24Value3=19, creditScore3=700;
        boolean res=hour24Value3<10 ? creditScore3>650:val3>10; //true
        System.out.println("\nRes:" +res);

    }
}
