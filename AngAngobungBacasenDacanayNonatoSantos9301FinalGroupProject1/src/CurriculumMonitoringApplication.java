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
import prog2.midgroup06.RoundRectangleButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Improvements:
//TODO: Lourdene - Design/Organization of printed strings upon running the program
//TODO: Lourdene - Introduction statement (add showIntroduction method)
//TODO: Lourdene - Exit statement (add showExit method)
//TODO: Marius & Nash & Lourdene - Think of a design for the GUU. Improve display of application program using GUI
//TODO: Marius & Lourdene - Student Shifter Feature (where the student may be a
        shifter from another program. The course finished by the student through another
        program and is credited to his/her BSCS program should be made part of the record
        and the equivalent course should be easily traced)
 */
/* Errors:
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
    //Declare instances for CurriculumMonitoringApplication
    private static JButton nextButton;

    //Declare the static variables for CurriculumMonitoringApplication
    //TODO: Lourdene - Add static variables description
    static Scanner keyboard = new Scanner(System.in);
    static BufferedReader inputStream;
    static ArrayList<Course> list = new ArrayList<>();
    static File file = new File("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/" +
            "BSCSCurriculumData1.csv");

    /**
     * Holds the colors used in the GUI of the program.
     */
    static Color pink = new Color(255, 175, 204);
    static Color peach = new Color(255, 229, 212);
    static Color darkPurple = new Color(105, 79, 93);
    static Color lightBlue = new Color(184, 193, 236);
    static Color navy = new Color(58, 79, 122);
    static Color purple = new Color(205, 180, 219);

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
        CurriculumMonitoringApplication program;
        try {
            program = new CurriculumMonitoringApplication();
            program.run();
        }catch (ArithmeticException exx){
            System.out.println(exx.getMessage());
        }
        System.exit(0);
    } // end of main method

    //TODO: Marius - Add run method description (javadoc comment) and algorithm (multi-line comment) after coding the GUI
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
     * @param prompt the string message
     * @return choice the choice of the user
     */
    //TODO: Marius - Add numberReader method algorithm (multi-line comment) after coding the GUI
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
    } // end of numberReader method

    /**
     * Method to show the list of actions for the user to choose from.
     */
    //TODO: Lourdene & Marius - Add listOfChoices method code and algorithm
    public static void listOfChoices(){
        JFrame choiceFrame = new JFrame();
        JPanel choicePanel = new JPanel(new BorderLayout());
        choicePanel.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));

        JLabel headerLabel = new JLabel("MAIN MENU", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.blue);
        headerPanel.add(headerLabel);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel buttonsPanel = new JPanel(new GridLayout(5, 2, 10,10));
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(30,20,30,20));

        JButton button1 = new JButton("Show course for each school term");
        JButton button2= new JButton("Show course with grades for each term");
        JButton button3 = new JButton("Show course with grades and remarks for each term");
        JButton button4 = new JButton("Enter grade for course recently finished");
        JButton button5 = new JButton("Add a finished course from another program");
        JButton button6 = new JButton( "Add a BSCS-credited course finished through another program");
        JButton button7 = new JButton("Edit an elective course");
        JButton button8 = new JButton("Show student's average grade for all finished courses");
        JButton button9 = new JButton( "Show student's sorted grades");
        JButton button10 = new JButton( "Show student's failed courses only");
        JButton button11 = new JButton("QUIT");
        buttonDesign(button1);
        buttonDesign(button2);
        buttonDesign(button3);
        buttonDesign(button4);
        buttonDesign(button5);
        buttonDesign(button6);
        buttonDesign(button7);
        buttonDesign(button8);
        buttonDesign(button9);
        buttonDesign(button10);
        buttonDesign(button11);

        JPanel quitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quitPanel.setBackground(Color.blue);
        quitPanel.add(button11);
        quitPanel.setBorder(BorderFactory.createEmptyBorder(2,0,50,0));

        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);
        buttonsPanel.add(button4);
        buttonsPanel.add(button5);
        buttonsPanel.add(button6);
        buttonsPanel.add(button7);
        buttonsPanel.add(button8);
        buttonsPanel.add(button9);
        buttonsPanel.add(button10);

        choicePanel.add(headerPanel, BorderLayout.NORTH);
        choicePanel.add(buttonsPanel, BorderLayout.CENTER);
        choicePanel.add(quitPanel, BorderLayout.SOUTH);
        button1.addActionListener(e -> {

        });
        choiceFrame.getContentPane().add(choicePanel);
        choiceFrame.setSize(731,612);
        choiceFrame.setLocationRelativeTo(null);
        choiceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        choiceFrame.setVisible(true);
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
    //TODO: Nash - Add showSubsForEachTerm method algorithm (multi-line comment) after coding the GUI
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
    //TODO: Julienne - Add showSubsWithGradesForEachTerm method algorithm (multi-line comment) after coding the GUI
    public static void showSubsWithGradesForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number",
                "Descriptive Title","Units","Grades");
        // Prints the list of courses
        for(int i=0; i<list.size(); i++){
            // Asks user to press enter if it reaches the line for new term
            if(i == 10 || i == 20|| i == 22|| i == 32|| i == 42|| i == 46|| i == 55|| i == 63|| i == 64|| i == 70){
                System.out.print("Press enter to see term "+list.get(i).getTerm()+" for year "+list.get(i).getYear());
                enter = scan.nextLine();
                System.out.println();
                System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number",
                        "Descriptive Title","Units","Grades");
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
    //TODO: Julienne - Add showSubsWithGradesAndRemarksForEachTerm method algorithm (multi-line comment) after coding the GUI
    public static void showSubsWithGradesAndRemarksForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%-15s%s%n","Year","Term","Course number",
                "Descriptive Title","Units","Grades","Remarks");
        // Prints the list of courses
        for(int i=0; i<list.size(); i++){
            // Asks user to press enter if it reaches the line for new term
            if(i == 10 || i == 20|| i == 22|| i == 32|| i == 42|| i == 46|| i == 55|| i == 63|| i == 64|| i == 70){
                System.out.print("Press enter to see term "+list.get(i).getTerm()+" for year "+list.get(i).getYear());
                enter = scan.nextLine();
                System.out.println();
                System.out.printf("%-10s%-10s%-20s%-85s%-15s%-15s%s%n","Year","Term","Course number",
                        "Descriptive Title","Units","Grades","Remarks");
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
            }else if (list.get(i).getGrades()==0){
                System.out.printf("%s","N/A");
            } else {
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
    //TODO: Katelyn - Add enterGrades method algorithm (multi-line comment) after coding the GUI
    /*
     * Algorithm:
     * 1. Create ArrayList limit to store the maximum number of unfinished subjects.
     * 2. Create ArrayList unfinSubs to store the unfinished subjects.
     * 3. Initialize variables numOfSub and grade to 0.
     * 4. Print the list of unfinished subjects with their corresponding numbers.
     * 5. Initialize max variable to keep track of the maximum number of unfinished subjects.
     * 6. Loop through each course in the list.
     *      a. If the course's grade is 0 (i.e., unfinished), increment max and add the course to unfinSubs.
     *      b. Print the number, course number, and description of the unfinished course.
     * 7. Prompt the user to enter the number corresponding to the recently finished subject.
     * 8. Validate the user's input. If it is greater than max or less than 1, show an error message and prompt again.
     * 9. Prompt the user to enter the grade.
     * 10. Validate the user's input. If it is greater than 99 or less than 70, show an error message and prompt again.
     * 11. Set the grade to the recently finished subject.
     *      a. Loop through each course in the list.
     *      b. If the description of the course matches the description of the selected unfinished subject, set the grade to the course.
     *      c. Print the description and grade of the updated course.
     */
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

        // Reads the number corresponding to the finished subject and if it is greater than i or less than 1
        // It will show an error message
        numOfSub = numberReader("\nEnter the number corresponding to the recently finished subject: ");
        while(numOfSub > max || numOfSub < 1){
            System.out.println("Enter 1-"+max+" only. Try again.");
            numOfSub = numberReader("Enter the number corresponding to the recently finished: ");
        }

        // Reads the grade and if it is greater than 99 or less than 75, it will show an error message
        grade = numberReader("Enter the grade: ");
        while(grade > 99 || grade < 70){
            System.out.println("Enter 70-99 only. Try again.");
            grade = numberReader("Enter the grade: ");
        }

        // Sets the grade to the recently finished subject
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
    //TODO: Lourdene - Add editACourse method algorithm (multi-line comment) after coding the GUI
    public static void editACourse(){
        // Declare variables
        ArrayList<Course> listElectives= new ArrayList<>();
        ArrayList<Course> listRecommended= new ArrayList<>();
        int choice,x=1, courseChoice;
        Course cn101 = new Course("CN", "Computational Science", 3.0);
        Course gv101 = new Course("GV", "Graphics and Visual Computing", 3.0);
        Course pd101 = new Course("PD", "Parallel and Distributed Computing", 3.0);
        Course is101 = new Course("IS", "Intelligent Systems", 3.0);
        Course sf101 = new Course("SF", "System Fundamentals", 3.0);

        // Add Recommended elective courses to the arrayList
        listRecommended.add(cn101);
        listRecommended.add(gv101);
        listRecommended.add(pd101);
        listRecommended.add(is101);
        listRecommended.add(sf101);

        // Prints the courses to be edited
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

        // Asks user to choose a course to be edited
        System.out.println("\nPick the corresponding number of the course to be edited");
        choice = numberReader("Enter the number: ");
        // If entered number is not 1-4, error will prompt
        while(choice < 1 || choice > 4){
            System.out.println("\nEnter 1-4 only. Try again.");
            choice = numberReader("Enter the number: ");
        }

        // Prints the elective Recommended Electives
        System.out.printf("%n%-10s%-20s%-40s%s%n","","Course number","Descriptive Title","Units");
        x=1;
        for(Course course : listRecommended){
            System.out.printf("%-10s",(x++)+":");
            System.out.printf("%-20s", course.getCourseNumber());
            System.out.printf("%-40s", course.getDescTitle());
            System.out.printf("%s", course.getUnits());
            System.out.println();
        }

        // Asks user to choose a course to replace the chosen elective
        System.out.println("\nPick the corresponding number of your chosen elective course");
        courseChoice = numberReader("Enter the number: ");
        // If entered number is not 1-5, error will prompt
        while(courseChoice < 1 || courseChoice > 5){
            System.out.println("\nEnter 1-5 only. Try again.");
            courseChoice = numberReader("Enter the number: ");
        }

        // Edits the chosen course based on the chosen elective course
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
        } //end of switch statement

        System.out.println("Course edited successfully.");
    } // end of editACourse method

    /**
     * Method to compute and show the average grade of a student.
     */
    //TODO: Charles - Add showAverageGrade method algorithm (multi-line comment) after coding the GUI
    public static void showAverageGrade() throws IOException {
        int average = 0, count=0; //declare variables

        //Adds all the marked grades to variable average and increments count
            for (Course course : list) {
                if (course.getGrades() != 0) {
                    average += course.getGrades();
                    count++;
                }
            }
        if (count == 0) {
            System.out.println("Invalid! No grades available to calculate the average grade.");
        } else {
            average /= count; // calculates the average
            System.out.println("----------");
            System.out.println("Student's Average Grade: " + average);
        }

        //TODO: Show this as a warning pop-up window (will let user choose to edit grades button or go back to main menu button)
        // Provides the user an option to edit grades
        System.out.print("Would you like to edit grades? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            // Call a method to edit grades
            enterGrades();
        } else {
            //TODO: Show this as a warning pop-up window (will let user choose to edit grades button or go back to main menu button)
            // Invoke the method to go back to the main menu
            int choice=0;
            String enter;

            while(choice != 9){ //loops if user did not input 8
                listOfChoices();
                System.out.println("-----");
                choice = numberReader("Enter your choice: ");
                runChoices(choice);

                System.out.println();
                System.out.print("Press enter key to go back.");
                enter = scanner.nextLine();
            }
        }
    } // end of showAverageGrade method

    /**
     * Method to create a new ArrayList with same elements of the list
     * then sorts and prints the sorted array list.
     */
    //TODO: Charles - Add showSortedGrades method algorithm (multi-line comment) after coding the GUI
    public static void showSortedGrades() {
        ArrayList<Course> sortList = new ArrayList<>(list);
        Collections.sort(sortList);

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number",
                "Descriptive Title","Units","Grades");
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
    //TODO: Katelyn - Add showFailedSubs method algorithm (multi-line comment) after coding the GUI
    /*
     * Algorithm:
     * 1. Print the header for the table of failed subjects.
     *      a. The header should contain columns for Year, Term, Course number, Descriptive Title, Units, and Grades.
     *      b. Use printf statements to format the columns to a fixed width.
     * 2. Loop through each course in the list.
     *      a. If the course's grade is less than 75 and not equal to 0 (i.e., failed), print its details in the table.
     *          i. Use printf statements to format the columns to a fixed width.
     *          ii. Print the course's year, term, course number, descriptive title, units, and grade.
     *          iii. Print a new line to move to the next row in the table.
     * 3. End the method.
     */
    public static void showFailedSubs(){
        System.out.println("----------");
        System.out.printf("%-10s%-10s%-20s%-85s%-15s%s%n","Year","Term","Course number",
                "Descriptive Title","Units","Grades");

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
     * Method that sets the font, background, and foreground colors of the button, and adds
     * a mouse listener to change the button's background color based on the user's mouse hovers.
     *
     * @param button the button to be designed
     */
    /*
         Algorithm:
         1. Set the font of the button to "Helvetica" with a bold style and size of 13.
         2. Set the background color of the button to a pink color.
         3. Set the foreground color of the button to a navy color.
         4. Add a mouse listener to the button.
         5. In the mouseEntered method of the mouse listener:
            a. Set the cursor to a hand cursor.
            b. Set the background color of the button to purple to indicate that the
               button can be clicked.
         6. In the mouseExited method of the mouse listener:
            a. Set the background color of the button back to pink.
            b. Set the foreground color of the button back to navy to indicate that
               the button is no longer being hovered over.
     */
    private static void buttonDesign(JButton button) {
        button.setFont(new Font("Helvetica", Font.BOLD, 13));
        button.setBackground(pink);
        button.setForeground(navy);
        button.addMouseListener(new MouseAdapter() {

            /**
             * Method that changes the cursor to a hand cursor and sets the background
             * color of the button to purple to indicate that the button can be clicked.
             *
             * @param e the event to be processed
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button.setBackground(purple); // set a new color when mouse hovers over the button
            } // end of mouseEntered method

            /**
             * Method that sets the background color of the button back to pink and the
             * foreground color back to navy to indicate that the button is no longer being
             * hovered over.
             *
             * @param e the event to be processed
             */
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button.setBackground(pink);
                button.setForeground(navy);// set back the original color when the mouse leaves the button
            } // end of mouseExited method
        });
    } // end of buttonDesign method

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