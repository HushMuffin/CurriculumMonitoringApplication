/**
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Team Number: 6
 * Members:
 * Ang, Julienne - 2232357
 * Angobung, Charles Jacob - 2232594
 * Bacasen, Katelyn Ann - 2212033
 * Dacanay, Kurt Jonas - 2232981
 * Nonato, Marius Glenn - 2232731
 * Santos, Lourdene Eira - 2233120
 * <p>
 * CLASS CODE & Schedule: 9301 CS 122 7:30 - 8:30 & 9:00 - 10:30 TF
 * Date of Programming: March-28-2023
 * Activity Name: Final Group Project 1
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Problem Description:
 * Create an application that may be used by a BSCS student of Saint Louis University in monitoring his/her
 * progress with respect to the curriculum that he/she is pursuing.
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Inputs:
 * //TODO: Lourdene - Add the inputs needed for the program
 * <p>
 * Outputs:
 * //TODO: Lourdene - Add the outputs needed for the program
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * General Algorithm: //TODO: Katelyn - Create the General Algorithm
 * 1.
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 *  Authors:
 *  @author Ang, Julienne
 *  @author Angobung, Charles Jacob
 *  @author Bacasen, Katelyn Ann
 *  @author Dacanay, Kurt Jonas
 *  @author Nonato, Marius Glenn
 *  @author Santos, Lourdene Eira
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Improvements:
//TODO: Lourdene - Design/Organization of printed strings upon running the program
//TODO: Lourdene - Introduction statement (add showIntroduction method)
//TODO: Lourdene - Exit statement (add showExit method)
//TODO: Marius & Nash - Student Average (include the course list table and show the student
        average on the bottom of the table)
//TODO: Marius & Katelyn & Lourdene - Student Shifter Feature (where the student may be a
        shifter from another program. The course finished by the student through another
        program and is credited to his/her BSCS program should be made part of the record
        and the equivalent course should be easily traced)
 */
/* Errors:
//TODO: Lourdene - Add Arithmetic Exception (for option 6: where student average grade
        errors resulting from the division of 0 when there is not a single grade provided or inputted)
//TODO: Julienne - Add Empty (“”) Entered Input (where the user only pressed enter in the input
        statement; display a warning message and show again the input statement where the user
        input will be entered again or given a chance to input again.
 */

/**
 * The CurriculumMonitoringApplication Class is the main class that provides options to be
 * used by a Bachelor of Science of Computer Science (BSCS) student of Saint Louis University
 * in monitoring of the student's progress with respect to the curriculum that they are pursuing.
 */
/*
    Algorithm:
    1. Reads the contents of the csv file and populates the ArrayList with instances of Course
    2. Prints an action list for user to choose
    3. Runs the chosen action
    4. Uses the elements from the ArrayList to show/modify curriculum data depending on
       user's choice of action
    5. Updates the csv file using PrintWriter
    6. End of program
 */
public class CurriculumMonitoringApplication {
    //Declare the static variables for CurriculumMonitoringApplication
    //TODO: Lourdene - Add static variables description
    static Scanner keyboard = new Scanner(System.in);
    static BufferedReader inputStream;
    static ArrayList<Course> list = new ArrayList<>();
    static File file = new File("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/" +
            "BSCSCurriculumData1.csv");

    /**
     * Main method for running the main functionality of the application program.
     *
     * @param args
     */
    /*
        Algorithm:
        1. Declare a new object of CurriculumMonitoringApplication
        2. Invoke the "run" method.
    */
    public static void main(String[] args) throws IOException {
        CurriculumMonitoringApplication program = new CurriculumMonitoringApplication();
        program.run();
    } // end of main method

    //TODO: Marius - Add run method description (javadoc comment) and algorithm (multi-line comment)
    public static void run() throws IOException {
        Scanner scan = new Scanner(System.in);
        int choice=0;
        String enter;

        populateArrayList(list); //invokes populateArrayList method
        System.out.println("\n---Curriculum Monitoring Application---");

        while(choice != 9){ //loops if user did not input 8
            listOfChoices();
            System.out.println("-----");
            choice = numberReader("Enter your choice: ");
            runChoices(choice);

            System.out.println();
            System.out.print("Press enter key to go back.");
            enter = scan.nextLine();
        }
    } // end of run method

    /**
     * Method to reads then returns an integer prompts an error if user entered a String value
     *
     * @param prompt - the string message
     * @return choice - the choice of the user
     */
    //TODO: Marius - Add numberReader method algorithm (multi-line comment)
    public static int numberReader(String prompt){
        int choice =0;
        boolean b = false;
        do { //loops and prompts an error if user entered a String to the scanner
            try {
                System.out.print(prompt);
                choice = keyboard.nextInt();
                b = true;
            } catch (Exception e) {
                System.out.println("Invalid value, try again.");
                keyboard.next();
            }
        }while (!b);

        return choice;
    }

    /**
     * Method to show the list of actions for the user to choose from.
     */
    //TODO: Lourdene - Add listOfChoices method algorithm (multi-line comment)
    public static void listOfChoices(){
        System.out.println();
        System.out.println("<1> Show subjects for each school term");
        System.out.println("<2> Show subjects with grades for each term");
        System.out.println("<3> Show student's with grades and remarks for each term");
        System.out.println("<4> Enter grade for subjects recently finished");
        System.out.println("<5> Edit a course");
        System.out.println("<6> Show student's average grade for all finished subjects");
        System.out.println("<7> Show student's sorted grades");
        System.out.println("<8> Show student's failed subjects only");
        System.out.println("<9> Quit");
        //TODO: Put more to be choices add
    } // end of listOfChoices method

    /**
     * Method to do the chosen action from the list using switch-case.
     *
     * @param choice - the number choice of the user
     */
    //TODO: Nash - Add runChoices method algorithm (multi-line comment)
    public static void runChoices(int choice) throws IOException {
        switch (choice){
            case 1: showSubsForEachTerm();//invokes showSubsForEachTerm()
                break;

            case 2: showSubsWithGradesForEachTerm();//invokes showSubsWithGradesForEachTerm()
                break;

            case 3: showSubsWithGradesAndRemarksForEachTerm();//invokes showSubsWithGradesAndRemarksForEachTerm()
                break;

            case 4: enterGrades();//invokes enterGrades()
                break;

            case 5: editACourse();//invokes editACourse()
                break;

            case 6: showAverageGrade(); //invokes showAverageGrade()
                break;

            case 7:
                showSortedGrades();//invokes showSortedGrades()
                break;

            case 8:
                showFailedSubs(); //invokes showFailedSubs()
                break;

            case 9: //closes the program
                System.out.println("Program closed.");
                saveFile();
                System.exit(0);

            default:
                System.out.println("Enter values from 1-9 only.");
                System.out.println("----------");
        }
    } // end of runChoices method

    /**
     * Method to print the subjects for each term.
     */
    //TODO: Nash - Add showSubsForEachTerm method algorithm (multi-line comment)
    public static void showSubsForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;

        System.out.printf("%-10s%-10s%-20s%-85s%s%n","Year","Term","Course number","Descriptive Title","Units");
        //prints the list of courses
        for(int i=0; i<list.size(); i++){
            //asks user to press enter if it reaches the line for new term
            if(i == 10 || i == 20|| i == 22|| i == 32|| i == 42|| i == 46|| i == 55|| i == 63|| i == 64|| i == 70){
                System.out.print("Press enter to see term "+list.get(i).getTerm()+" for year "+list.get(i).getYear());
                enter = scan.nextLine();
                System.out.println();
                System.out.printf("%-10s%-10s%-20s%-85s%s%n","Year","Term","Course number","Descriptive Title","Units");
            }
            System.out.printf("%-10s",list.get(i).getYear());
            System.out.printf("%-10s",list.get(i).getTerm());
            System.out.printf("%-20s",list.get(i).getCourseNumber());
            System.out.printf("%-85s",list.get(i).getDescTitle());
            System.out.printf("%s",list.get(i).getUnits());
            System.out.println();
        }
    } // end of showSubsForEachTerm method

    /**
     * Method to print the subjects with grades for each term.
     */
    //TODO: Julienne - Add showSubsWithGradesForEachTerm method algorithm (multi-line comment)
    public static void showSubsWithGradesForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number","Descriptive Title","Units","Grades");
        //prints the list of courses
        for(int i=0; i<list.size(); i++){
            //asks user to press enter if it reaches the line for new term
            if(i == 10 || i == 20|| i == 22|| i == 32|| i == 42|| i == 46|| i == 55|| i == 63|| i == 64|| i == 70){
                System.out.print("Press enter to see term "+list.get(i).getTerm()+" for year "+list.get(i).getYear());
                enter = scan.nextLine();
                System.out.println();
                System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number","Descriptive Title","Units","Grades");
            }
            System.out.printf("%-10s",list.get(i).getYear());
            System.out.printf("%-10s",list.get(i).getTerm());
            System.out.printf("%-20s",list.get(i).getCourseNumber());
            System.out.printf("%-85s",list.get(i).getDescTitle());
            System.out.printf("%-15s",list.get(i).getUnits());

            //if grade is 0, mark as not graded yet
            if(list.get(i).getGrades() == 0){
                System.out.printf("%s","Not yet graded");
            }else{
                System.out.printf("%d",list.get(i).getGrades());
            }
            System.out.println();
        }
    } // end of showSubsWithGradesForEachTerm method

    /**
     * Method to print the subjects with grades remarks for each term
     * where it will print "Failed", if grade is less than 75.
     * And, else it will print "Passed".
     */
    //TODO: Julienne - Add showSubsWithGradesAndRemarksForEachTerm method algorithm (multi-line comment)
    public static void showSubsWithGradesAndRemarksForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%-15s%s%n","Year","Term","Course number","Descriptive Title","Units","Grades","Remarks");
        //prints the list of courses
        for(int i=0; i<list.size(); i++){
            //asks user to press enter if it reaches the line for new term
            if(i == 10 || i == 20|| i == 22|| i == 32|| i == 42|| i == 46|| i == 55|| i == 63|| i == 64|| i == 70){
                System.out.print("Press enter to see term "+list.get(i).getTerm()+" for year "+list.get(i).getYear());
                enter = scan.nextLine();
                System.out.println();
                System.out.printf("%-10s%-10s%-20s%-85s%-15s%-15s%s%n","Year","Term","Course number","Descriptive Title","Units","Grades","Remarks");
            }
            System.out.printf("%-10s",list.get(i).getYear());
            System.out.printf("%-10s",list.get(i).getTerm());
            System.out.printf("%-20s",list.get(i).getCourseNumber());
            System.out.printf("%-85s",list.get(i).getDescTitle());
            System.out.printf("%-15s",list.get(i).getUnits());

            //if grade is 0, mark as not graded yet
            if(list.get(i).getGrades() == 0){
                System.out.printf("%-15s","Not yet graded");
            }else{
                System.out.printf("%-15d",list.get(i).getGrades());
            }

            //if grade is less than 75, mark as failed
            if(list.get(i).getGrades() != 0 && list.get(i).getGrades()<75){
                System.out.printf("%s","Failed");
            }else{
                System.out.printf("%s","Passed");
            }

            System.out.println();
        }
    } // end of showSubsWithGradesAndRemarksForEachTerm method

    /**
     * Method to lists all the unfinished course and ask
     * user to choose the finished course, then the program
     * will ask to enter the grade for the course.
     */
    //TODO: Katelyn - Add enterGrades method algorithm (multi-line comment)
    public static void enterGrades() {
        ArrayList<Integer> limit= new ArrayList<>();
        ArrayList<Course> unfinSubs= new ArrayList<>();
        int numOfSub=0, grade;

        System.out.println("\nList of unfinished subjects:");
        int max=0;
        for(Course course: list){
            if(course.getGrades() == 0){
                max++;
                System.out.println(max+": "+course.getCourseNumber()+" = "+course.getDescTitle());
                unfinSubs.add(course);
            }
        }

        //reads the number corresponding to the finished subject and if it is greater than i or less than 1
        //it will show an error message
        numOfSub = numberReader("\nEnter the number corresponding to the recently finished subject: ");
        while(numOfSub > max || numOfSub < 1){
            System.out.println("Enter 1-"+max+" only. Try again.");
            numOfSub = numberReader("Enter the number corresponding to the recently finished: ");
        }

        //reads the grade and if it is greater than 99 or less than 75, it will show an error message
        grade = numberReader("Enter the grade: ");
        while(grade > 99 || grade < 70){
            System.out.println("Enter 70-99 only. Try again.");
            grade = numberReader("Enter the grade: ");
        }

        //sets the grade to the recently finished subject
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDescTitle().equals(unfinSubs.get(numOfSub-1).getDescTitle())){
                list.get(i).setGrades(grade);
                System.out.println(list.get(i).getDescTitle()+"= "+list.get(i).getGrades());
            }
        }

    } // end of enterGrades method

    /**
     * Method to allow the user to choose an elective course for them to edit.
     */
    //TODO: Lourdene - Add editACourse method algorithm (multi-line comment)
    public static void editACourse(){
        //declare variables
        ArrayList<Course> listElectives= new ArrayList<>();
        ArrayList<Course> listRecommended= new ArrayList<>();
        int choice,x=1, courseChoice;
        Course cn101 = new Course("CN", "Computational Science", 3.0);
        Course gv101 = new Course("GV", "Graphics and Visual Computing", 3.0);
        Course pd101 = new Course("PD", "Parallel and Distributed Computing", 3.0);
        Course is101 = new Course("IS", "Intelligent Systems", 3.0);
        Course sf101 = new Course("SF", "System Fundamentals", 3.0);

        //add Recommended elective courses to the arrayList
        listRecommended.add(cn101);
        listRecommended.add(gv101);
        listRecommended.add(pd101);
        listRecommended.add(is101);
        listRecommended.add(sf101);

        //prints the courses to be edited
        System.out.printf("%n%-10s%-10s%-10s%-20s%-40s%s%n","","Year","Term","Course number","Descriptive Title","Units");
        for(int i=0; i<list.size(); i++){
            //if it reaches text line of elective, print
            if(i == 68 || i == 69 || i==74 || i==75){
                System.out.printf("%-10s",(x++)+":");
                System.out.printf("%-10s", list.get(i).getYear());
                System.out.printf("%-10s", list.get(i).getTerm());
                System.out.printf("%-20s", list.get(i).getCourseNumber());
                System.out.printf("%-40s", list.get(i).getDescTitle());
                System.out.printf("%s", list.get(i).getUnits());
                System.out.println();
            }
        }

        //asks user to choose a course to be edited
        System.out.println("\nPick the corresponding number of the course to be edited");
        choice = numberReader("Enter the number: ");
        //if entered number is not 1-4, error will prompt
        while(choice < 1 || choice > 4){
            System.out.println("\nEnter 1-4 only. Try again.");
            choice = numberReader("Enter the number: ");
        }

        //Prints the elective Recommended Electives
        System.out.printf("%n%-10s%-20s%-40s%s%n","","Course number","Descriptive Title","Units");
        x=1;
        for(Course course : listRecommended){
            System.out.printf("%-10s",(x++)+":");
            System.out.printf("%-20s", course.getCourseNumber());
            System.out.printf("%-40s", course.getDescTitle());
            System.out.printf("%s", course.getUnits());
            System.out.println();
        }

        //asks user to choose a course to replace the chosen elective
        System.out.println("\nPick the corresponding number of your chosen elective course");
        courseChoice = numberReader("Enter the number: ");
        //if entered number is not 1-5, error will prompt
        while(courseChoice < 1 || courseChoice > 5){
            System.out.println("\nEnter 1-5 only. Try again.");
            courseChoice = numberReader("Enter the number: ");
        }

        //edits the chosen course based on the chosen elective course
        switch(choice){
            case 1:
                switch (courseChoice) {
                    case 1 -> {
                        list.get(68).setCourseNumber(cn101.getCourseNumber());
                        list.get(68).setDescTitle(cn101.getDescTitle());
                        list.get(68).setUnits(cn101.getUnits());
                        list.get(68).setGrades(0);
                    }
                    case 2 -> {
                        list.get(68).setCourseNumber(gv101.getCourseNumber());
                        list.get(68).setDescTitle(gv101.getDescTitle());
                        list.get(68).setUnits(gv101.getUnits());
                        list.get(68).setGrades(0);
                    }
                    case 3 -> {
                        list.get(68).setCourseNumber(pd101.getCourseNumber());
                        list.get(68).setDescTitle(pd101.getDescTitle());
                        list.get(68).setUnits(pd101.getUnits());
                        list.get(68).setGrades(0);
                    }
                    case 4 -> {
                        list.get(68).setCourseNumber(is101.getCourseNumber());
                        list.get(68).setDescTitle(is101.getDescTitle());
                        list.get(68).setUnits(is101.getUnits());
                        list.get(68).setGrades(0);
                    }
                    case 5 -> {
                        list.get(68).setCourseNumber(sf101.getCourseNumber());
                        list.get(68).setDescTitle(sf101.getDescTitle());
                        list.get(68).setUnits(sf101.getUnits());
                        list.get(68).setGrades(0);
                    }
                }
                break;

            case 2:
                switch (courseChoice) {
                    case 1 -> {
                        list.get(69).setCourseNumber(cn101.getCourseNumber());
                        list.get(69).setDescTitle(cn101.getDescTitle());
                        list.get(69).setUnits(cn101.getUnits());
                        list.get(69).setGrades(0);
                    }
                    case 2 -> {
                        list.get(69).setCourseNumber(gv101.getCourseNumber());
                        list.get(69).setDescTitle(gv101.getDescTitle());
                        list.get(69).setUnits(gv101.getUnits());
                        list.get(69).setGrades(0);
                    }
                    case 3 -> {
                        list.get(69).setCourseNumber(pd101.getCourseNumber());
                        list.get(69).setDescTitle(pd101.getDescTitle());
                        list.get(69).setUnits(pd101.getUnits());
                        list.get(69).setGrades(0);
                    }
                    case 4 -> {
                        list.get(69).setCourseNumber(is101.getCourseNumber());
                        list.get(69).setDescTitle(is101.getDescTitle());
                        list.get(69).setUnits(is101.getUnits());
                        list.get(69).setGrades(0);
                    }
                    case 5 -> {
                        list.get(69).setCourseNumber(sf101.getCourseNumber());
                        list.get(69).setDescTitle(sf101.getDescTitle());
                        list.get(69).setUnits(sf101.getUnits());
                        list.get(69).setGrades(0);
                    }
                }
                break;

            case 3:
                switch (courseChoice) {
                    case 1 -> {
                        list.get(74).setCourseNumber(cn101.getCourseNumber());
                        list.get(74).setDescTitle(cn101.getDescTitle());
                        list.get(74).setUnits(cn101.getUnits());
                        list.get(74).setGrades(0);
                    }
                    case 2 -> {
                        list.get(74).setCourseNumber(gv101.getCourseNumber());
                        list.get(74).setDescTitle(gv101.getDescTitle());
                        list.get(74).setUnits(gv101.getUnits());
                        list.get(74).setGrades(0);
                    }
                    case 3 -> {
                        list.get(74).setCourseNumber(pd101.getCourseNumber());
                        list.get(74).setDescTitle(pd101.getDescTitle());
                        list.get(74).setUnits(pd101.getUnits());
                        list.get(74).setGrades(0);
                    }
                    case 4 -> {
                        list.get(74).setCourseNumber(is101.getCourseNumber());
                        list.get(74).setDescTitle(is101.getDescTitle());
                        list.get(74).setUnits(is101.getUnits());
                        list.get(74).setGrades(0);
                    }
                    case 5 -> {
                        list.get(74).setCourseNumber(sf101.getCourseNumber());
                        list.get(74).setDescTitle(sf101.getDescTitle());
                        list.get(74).setUnits(sf101.getUnits());
                        list.get(74).setGrades(0);
                    }
                }
                break;

            case 4:
                switch (courseChoice) {
                    case 1 -> {
                        list.get(75).setCourseNumber(cn101.getCourseNumber());
                        list.get(75).setDescTitle(cn101.getDescTitle());
                        list.get(75).setUnits(cn101.getUnits());
                        list.get(75).setGrades(0);
                    }
                    case 2 -> {
                        list.get(75).setCourseNumber(gv101.getCourseNumber());
                        list.get(75).setDescTitle(gv101.getDescTitle());
                        list.get(75).setUnits(gv101.getUnits());
                        list.get(75).setGrades(0);
                    }
                    case 3 -> {
                        list.get(75).setCourseNumber(pd101.getCourseNumber());
                        list.get(75).setDescTitle(pd101.getDescTitle());
                        list.get(75).setUnits(pd101.getUnits());
                        list.get(75).setGrades(0);
                    }
                    case 4 -> {
                        list.get(75).setCourseNumber(is101.getCourseNumber());
                        list.get(75).setDescTitle(is101.getDescTitle());
                        list.get(75).setUnits(is101.getUnits());
                        list.get(75).setGrades(0);
                    }
                    case 5 -> {
                        list.get(75).setCourseNumber(sf101.getCourseNumber());
                        list.get(75).setDescTitle(sf101.getDescTitle());
                        list.get(75).setUnits(sf101.getUnits());
                        list.get(75).setGrades(0);
                    }
                }
                break;
        }//end of switch

        System.out.println("Course edited successfully.");
    }// end of editACourse method

    /**
     * Method to compute and show the average grade of a student.
     */
    //TODO: Charles - Add showAverageGrade method algorithm (multi-line comment)
    public static void showAverageGrade(){
        int average = 0, count=0; //declare variables

        //Adds all the marked grades to variable average and increments count
        for (Course course : list) {
            if(course.getGrades() != 0){
                average += course.getGrades();
                count++;
            }
        }

        average /= count; //calculates the average
        System.out.println("----------");
        System.out.println("Student's Average Grade: "+ average);
    } // end of showAverageGrade method

    /**
     * Method to create a new ArrayList with same elements of the list
     * then sorts and prints the sorted array list.
     */
    //TODO: Charles - Add showSortedGrades method algorithm (multi-line comment)
    public static void showSortedGrades() {
        ArrayList<Course> sortList = new ArrayList<>(list);
        Collections.sort(sortList);

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number","Descriptive Title","Units","Grades");
        for (Course course : sortList){
            System.out.printf("%-10s", course.getYear());
            System.out.printf("%-10s", course.getTerm());
            System.out.printf("%-20s", course.getCourseNumber());
            System.out.printf("%-85s", course.getDescTitle());
            System.out.printf("%-15s", course.getUnits());

            //if grade is 0, mark as not graded yet
            if(course.getGrades() == 0){
                System.out.printf("%s","Not yet graded");
            }else{
                System.out.printf("%d", course.getGrades());
            }

            System.out.println();
        }
    } // end of showSortedGrades method

    /**
     * Method to print the courses that have grades lower than 75.
     */
    //TODO: Katelyn - Add showFailedSubs method algorithm (multi-line comment)
    public static void showFailedSubs(){
        System.out.println("----------");
        System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number","Descriptive Title","Units","Grades");
        for(Course course : list){
            if(course.getGrades() < 75 && course.getGrades() != 0){
                System.out.printf("%-10s", course.getYear());
                System.out.printf("%-10s", course.getTerm());
                System.out.printf("%-20s", course.getCourseNumber());
                System.out.printf("%-85s", course.getDescTitle());
                System.out.printf("%-15s", course.getUnits());
                System.out.printf("%d", course.getGrades());
                System.out.println();
            }
        }
    } // end of showFailedSubs method

    /**
     * Method to read from the csv file and populates
     * the ArrayList with Course instances.
     */
    //TODO: Julienne - Add populateArrayList method algorithm (multi-line comment)
    public static void populateArrayList(ArrayList<Course> list) throws IOException {
        inputStream = new BufferedReader(new FileReader(file));
        String line = inputStream.readLine(); //skips the first line
        Course course;

        //populates the ArrayList
        while((line = inputStream.readLine()) != null){
            String[] data = line.split(",");
            course = new Course(data[0],data[1],data[2],data[3],Double.parseDouble(data[4]),Integer.parseInt(data[5]));
            list.add(course); //adds the course to the list
        }
    } // end of populateArrayList method

    /**
     * Method to update the csv file of the program curriculum.
     *
     * @throws IOException
     */
    //TODO: Marius - Add saveFile method algorithm (multi-line comment)
    public static void saveFile() throws IOException {
        PrintWriter pW = new PrintWriter(new FileOutputStream("" +
                "AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/BSCSCurriculumData1.csv"));

        //Writes the elements of list to the PrintWriter
        pW.println("year,\"term(1=first term, 2=second term, 3=short term)\",course number,descriptive title,units,Grades");
        for(Course course : list){
            pW.println(course.toString());
        }

        pW.close();
        pW.flush();
    } // end of saveFile method

} // end of CurriculumMonitoringApplication class