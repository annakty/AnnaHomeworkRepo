package KnowledgeBaseOfJava;

public class ConditionalCode {
    public static void main(String[] args) {

        /**
         * Conditional loops (Conditional Code)
         * 1. if-else block
         * 2. switch block
         */

        /**
         * If you find oat milk at store and it is not expiring in 1 week
         *      buy 2 of those
         * else if almond mild if present
         *      buy 1 of it
         * else
         *      call me
         */

        int num = 10;
        if (num >= 5 && num <= 15) {
            System.out.println("Num is greater than 10");
        } else {
            System.out.println("Num is less or equal to 10");
        }

        /** if (condition(s)) {
         *      //if
         *      //block
         * } else if () {
         *      //else if
         *      //block
         * } else {
         *      //else
         *      //block
         * }
         */

        String days = "weekend"; //weekdays, weekend
        boolean anyMeeting = false; // true,false
        String clothes = "";
        /**
         * days = weekend; clothes = casual,
         * days = weekdays and meeting = false: clothes = formal,
         * days = weekdays and meeting = true; clothes = suit
         */

        if (days.trim().equalsIgnoreCase("weekend")) {
            clothes = "Casual";
        } else if (days.trim().equalsIgnoreCase("weekend") && anyMeeting == false) {
            clothes = "Formal";
        } else if (days.trim().equalsIgnoreCase("weekdays") && anyMeeting == true) {
            clothes = "Suit";
        } else {
            System.out.println("Invalid data entered");
            clothes = "Retry with valid data";
        }
        System.out.println("Prefers clothes: " + clothes);


        /**
         * anyMeeting == true  >>> is same as anyMeeting
         * true==true // (anyMeeting == true)
         * true
         *
         * false==true (anyMeeting == false)
         * false
         *
         * anyMeeting == false is the same as !anyMeeting
         * >>> for what value of anyMeeting the comparison result will be true
         * false == false (anyMeeting=false)
         *
         * true
         * true==false !anyMeeting-->false
         * false
         */


    }
}
