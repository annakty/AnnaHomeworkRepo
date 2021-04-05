package MyHomeWork;

import java.util.Arrays;

public class HomeWork10 {
    public static class School {

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
            System.out.println("Student Fee Deposit: " +student2.feeDeposit(200));
            student2.changeCourse("PM");


            // School Summary
            Students.schoolSummary();

        }

    }

    public static class Students {
        /**
         * Variable which will store values like:
         * school name
         * student name
         * student ID
         * student enrolled course-name
         * courses offered by school
         * total number of students
         * student fee-balance
         * student address
         */
        static String schoolName = "ABC";
        static String[] offeredCourses = {"QA", "Web", "PM"};
        static double[] feesCourses = {1000, 2000, 3000};
        static int totalNumberOfStudents = 0;

        String studentName = "N/A"; //it's up to us show the default name or not.
        String studentEnrolledCourse;
        int studentID;
        double studentFeeBalance = 0.00;
        String studentAddress;
        double totalPaydByStudent = 0.00;


        public void enrollStudent(String name, String addr, String course) {
            /*
            if course is available in school, we should inform student the fees-balance
            increase the total number of students
            we should student the studentID
             */
            boolean isCourseAvailable = false;
            for (int i = 0; i < offeredCourses.length; i++) {
                if (offeredCourses[i].equalsIgnoreCase(course)) {
                    totalNumberOfStudents++;
                    studentID = totalNumberOfStudents;
                    isCourseAvailable = true;
                    studentName = name;
                    studentEnrolledCourse = offeredCourses[i];
                    studentFeeBalance = feesCourses[i];
                    studentAddress = addr;
                    break;
                }
            }
            if (isCourseAvailable) {
                System.out.println("\nEnrollment done successfully. Student ID is: " + studentID);
            } else
                System.out.println("\nRequested course " + course + " is not available in the school.");

        }

        /**
         * Method to display Student profile
         * ID
         * Name
         * Course
         * <p>
         * method name: getStudentProfile
         * input: n/a
         * return type: String/void
         */

        public void getStudentProfile() {
            System.out.println("Student Profile:" +
                    "\nStudent ID: " + studentID +
                    "\nStudent name: " + studentName +
                    "\nStudent Course: " + studentEnrolledCourse +
                    "\nStudent Fee Balance: " + studentFeeBalance + "\n");
        }

        /**
         * Method to fee deposit
         * <p>
         * method name: feeDeposit
         * input: double
         * return type: double
         */

        public double feeDeposit(double feeDeposit) {
            if (feeDeposit > 0) {
                totalPaydByStudent = totalPaydByStudent + feeDeposit;
            } else {
                System.out.println("Invalid deposit amount entered: " + feeDeposit);
            }
            return totalPaydByStudent;
        }

        /**
         * Student to change course
         * Req:
         * 1. earlier deposited fees should be subtracted from new course fee
         * 2. Show error (saying, Same course entered) if student enrolled course as new course
         * 3. Show error (saying, Invalid course entered) if student enter a course not offered by school
         * <p>
         * method name: changeCourse
         * input:
         * return type:
         * <p>
         * does course 'X' exist in offeredCourse?
         * sout (Invalid course entered)
         * is the current enrolment is 'X' or not> studentEnrolledCourse?
         * if false - sout (same course entered)
         * if above two conditions are false
         * double courseFee = find the fee of current enrolled course
         * double deposit = courseFee-studentFeeBalance
         * <p>
         * find the amount deposited by student
         * find the fee of new course
         * subtract newFees from preDepositedAmount
         * studentEnrolledCourse = X
         */

        public void changeCourse(String newCourse) {

            if (newCourse.equalsIgnoreCase(studentEnrolledCourse)) {
                System.out.println("Same course entered");
            } else if (newCourse.length() == 0) {
                System.out.println("Invalid course entered");

            } else {
                for (int i = 0; i < offeredCourses.length; i++) {
                    if (newCourse.equalsIgnoreCase(offeredCourses[i])) {
                        studentFeeBalance = feesCourses[i] - totalPaydByStudent;
                        studentEnrolledCourse = offeredCourses[i];
                        System.out.println("Student New Enrolled Course is: " + studentEnrolledCourse + ". Student Fee Balance is: " + studentFeeBalance + ".");
                        break;

                    } else if (i == offeredCourses.length - 1) {
                        System.out.println("\nRequested course " + newCourse + " is not available in the school.");
                        break;
                    }
                }
            }
        }


        /**
         * Method to display School summary:
         * School Name
         * Course Offered
         * Total numbers of student
         * <p>
         * method name: schoolSummary
         * input: n/a
         * return type: String
         */

        public static void schoolSummary() {
            System.out.println("\nSchool Summary:" +
                    "\nSchool Name: " + schoolName +
                    "\nCourse Offered: " + Arrays.toString(offeredCourses) +
                    "\nTotal number of student: " + totalNumberOfStudents);
        }

    }
}
