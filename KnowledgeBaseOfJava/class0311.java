package KnowledgeBaseOfJava;

public class class0311 {

    public static void main(String[] args) {
        String monthName ="november";

        switch (monthName.toLowerCase()) {
            case"dec":
            case"jan":
            case"feb":
                System.out.println("Winter season");
                break;
            case"jun":
            case"jul":
            case"aug":
                System.out.println("Summer season");
                break;
            case"sep":
            case"oct":
            case"nov":
                System.out.println("Fall season");
                break;
            case"mar":
            case"apr":
            case"may":
                System.out.println("Spring Season");
                break;
            default:
                System.out.println("Invalid month name - " +monthName);

            };

        }

}


