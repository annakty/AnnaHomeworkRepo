package KnowledgeBaseOfJava;

public class Operator_AdvancedAssignment {

    public static void main(String[] args) {

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         * ++ -->> increment by 1
         * int  num=15;
         * using increment operator  to add 5 int num;
         *
         *
         * num+=5 <---> num=num+5
         *
         *
         */

        int num=15;
        System.out.println(num+=5);

        int var1=10;
        var1+=5;
        System.out.println(var1);// 15
        var1-=2;
        System.out.println(var1); //13
        var1*=10;
        System.out.println(var1);  //130
        var1/=9;
        System.out.println(var1); // 14
        var1%=9;
        System.out.println(var1); //5
    }
}
