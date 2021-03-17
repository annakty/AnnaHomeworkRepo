package KnowledgeBaseOfJava;

public class VariableScope {

    /**
     * Field Variable (Global Variable or Class Variable)
     * 1. Variable which we can access/use anywhere if side the class
     * 2. We create field variable (static), when we need to share the variable value between two or more methods.
     * Scope (of field variable) - Entire class
     *
     * Constant variable:
     * add java key word: final datatype varName = value;
     */

    static String name = "Happy Peace";
    static int num = 10;
    static int b = 10;
    static char score = 'A';
    final static int routingNumber = 12345678;

    public static void main(String[] args) {

        /**
         * Local variable
         * Variable which we created inside a method
         * Scope: within the method.
         */

        System.out.println("Inside the Main Method --------------- ");
        String msgSecret = "Initial value of variable - msgSecret";
        int a = 10;
        if (a > 5) {
            int b = 22;
            String username = "user1";
            System.out.println("\n" + a);
            System.out.println(username + " has " + b + " houses");
            System.out.println("Routing number: " +routingNumber);

            b = b * 10;
            System.out.println(b);
        }

        score = 'D';
        String username = "super user";
        System.out.println(username);
        System.out.println("name - " + name);
        System.out.println(b);
        System.out.println(name);
        System.out.println(username);
        System.out.println(a);

    }

    public static void sayHelloToUser() {

        System.out.println("Inside the New method-----------");
        System.out.println("hello - " + name);
        double salary = 109348549.90;
    }

}
