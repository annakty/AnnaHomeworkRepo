package MyHomeWork.HomeWork10;

public class School {

    public static void main(String[] args) {

        Students student1 = new Students();
        //Enrol Course Student
        student1.enrollStudent("Tomas", "NY", "PM");

        //Student Profile
        student1.getStudentProfile();

        //Fee Deposit
        System.out.println("Student Fee Deposit: " + student1.feeDeposit(500));
        System.out.println("Student Fee Deposit: " + student1.feeDeposit(200));


        Students student2 = new Students();
        //Enrol Course Student
        student2.enrollStudent("Alisa", "LA", "QA");

        //Student Profile
        student2.getStudentProfile();

        //Fee Deposit
        System.out.println("Student Fee Deposit: " + student2.feeDeposit(100));
        System.out.println("Student Fee Deposit: " + student2.feeDeposit(200));
        student2.changeCourse("PM");


        // School Summary
        Students.schoolSummary();

    }

}
