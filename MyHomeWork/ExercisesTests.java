package MyHomeWork;

public class ExercisesTests {

    public static void main(String[] args) {

        // 1) Write a Java program to print 'Hello' on screen and then print your name on a separate line.

        System.out.println("Hello! \nMy name is Anna Kutovaya.");

        // 2) Write a Java program to print the sum of two numbers.

        int a=74;
        int b=36;
        int sumOfAandB=a+b;

        System.out.println(sumOfAandB);
        System.out.println(74+36);

        // 3. Write a Java program to divide two numbers and print on the screen.

        a=50;
        b=3;
        sumOfAandB=a/b;
        System.out.println(sumOfAandB);
        System.out.println(50/3);

        // 4. Write a Java program to print the result of the following operations.

        int a1=-5+8*6;
        int b1=(55+9) % 9;
        int c1=20 + -3*5 / 8;
        int d1=5 + 15/3 * 2 - 8 % 3;

        System.out.println(a1 + "\n" + b1 + "\n" +c1+ "\n" +d1);
        System.out.println(-5+8*6);
        System.out.println(a1);

        // 5. Write a Java program that takes two numbers as input and display the product of two numbers.5. Write a Java program that takes two numbers as input and display the product of two numbers.

        int x=25;
        int y=5;
        int z=25*5;
        System.out.println(x*y);
        System.out.println(z);

        //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        x=125;
        y=24;

        System.out.println("addition >> " + (x+y));
        System.out.println("substract >> " + (x-y));
        System.out.println("multipy >> " +x+ "+" +y+ "=" +(x*y));
        System.out.println(x/y);
        System.out.println(x%y);

        //
        // 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        double fTemp=212;
        double fToCel = (fTemp-32) * 5/9;
        System.out.println(fTemp+ " degree Fahrenheit is equal to " +fToCel+ " in Celsius.");

        // 2. Write a Java program that reads a number in inches, converts it to meters.

        double inch=1000;
        double inchToMeters = inch * 0.0254;
        System.out.println(inch+ " inch is " +inchToMeters+ " meters.");


        // 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.


        //4. Write a Java program to convert minutes into a number of years and days.
        int min=3456789;
        int minInADay = 60*24;
        int minInAYear = minInADay*365;
        int minyears=min/minInAYear;
        int remainingMinutes = min % minInAYear;
        int mindays=remainingMinutes/minInADay;

        System.out.println(min+ " minutes is approximately " +minyears+ " years and " +mindays + " days.");


        //5. Write a Java program that prints the current time in GMT.

        // 6. Write a Java program to compute body mass index (BMI).

        double weightInPounds=452;
        double heightInInches=7.2;
        double bmi=weightInPounds/heightInInches;
        System.out.println("Body Mass Index is " +bmi+ " .");

















    }
}
