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
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Improvements:
//TODO: Lourdene - add showExit method
//TODO: Marius & Nash & Lourdene - Improve display of application program using simple GUI
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
    /**
     * Declare "keyboard" as a static instance of the Scanner class.
     */
    static Scanner keyboard = new Scanner(System.in);

    /**
     * Declare "inputStream" as a static instance of the BufferedReader class.
     */
    static BufferedReader inputStream;

    //TODO: Lourdene - put a appropriate-sized image icon on a new folder and add description
    ImageIcon icon = new ImageIcon("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/res/icon.png");

    /**
     * Declare "list" as a static instance of the ArrayList class,
     * used to store a collection of objects of Course.
     */
    static ArrayList<Course> list = new ArrayList<>();

    /**
     * Declare "file" as a static instance of the File class,
     * representing a file or directory path.
     */
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
     * @param args String array of arguments
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
    } // end of main method

    //TODO: Marius - Add run method description (javadoc comment) and algorithm (multi-line comment) after coding the GUI
    public void run() throws IOException {
        String name = null;
        name= showLoginDialog().toUpperCase();
        showIntroduction(name);
        //int choice=0;
        populateArrayList(list); //invokes populateArrayList method
        listOfChoices();
        //choice = numberReader("");
    } // end of run method

    /**
     * Method to print an introduction statement that displays information about the time,
     * purpose of the program, guidelines for the user, and programmer name.
     */
    /*
       Algorithm:
       1. Display an introduction statement of the program in a new window.
       2. Dispose the dialog box once the "Next" button is clicked or when closed by the user
     */
    public void showIntroduction(String name) {
        JDialog introDialog = new JDialog();
        introDialog.setTitle("BSCS Curriculum Monitoring Application");
        introDialog.setModal(true);

        JLabel headerLabel = new JLabel("BSCS Curriculum Monitoring Application", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel greetLabel = new JLabel("WELCOME " +name +"!", SwingConstants.CENTER);
        greetLabel.setFont(new Font("Helvetica", Font.BOLD, 22));
        greetLabel.setForeground(darkPurple);
        greetLabel.setBorder(BorderFactory.createEmptyBorder(5, 20, 30, 20));

        JLabel descriptionLabel = new JLabel("<html><div style='text-align: justify;'>" +
                "This an application may be used by a BSCS student of Saint Louis University in monitoring his/her\n" +
                "progress with respect to the curriculum that he/she is pursuing. " +
                "Choose the option of your liking</html>",
                SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        descriptionLabel.setForeground(Color.darkGray);
        descriptionLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        nextButton = new RoundButton("NEXT");
        buttonDesign(nextButton);
        nextButton.addActionListener((e) -> {
            introDialog.dispose();
        });

        JPanel introPanel = new JPanel(new BorderLayout());

        JPanel descriptionPanel = new JPanel(new BorderLayout());
        descriptionPanel.setBackground(lightBlue);
        descriptionPanel.add(greetLabel, BorderLayout.NORTH);
        descriptionPanel.add(descriptionLabel, BorderLayout.SOUTH);
        descriptionPanel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        buttonPanel.setBackground(navy);
        buttonPanel.add(nextButton);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2,0,2,0));

        introPanel.add(headerLabel, BorderLayout.NORTH);
        introPanel.add(descriptionPanel, BorderLayout.CENTER);
        introPanel.add(buttonPanel, BorderLayout.SOUTH);


        introDialog.getContentPane().add(introPanel);
        introDialog.setIconImage(icon.getImage());
        introDialog.setSize(657, 378);
        introDialog.setLocationRelativeTo(null);
        introDialog.setVisible(true);
        introDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    } // end of showIntroduction method

    /**
     * Method to reads then returns an integer prompts an error if user entered a String value
     *
     * @param prompt the string message
     * @return choice the choice of the user
     */
    //TODO: Marius - Add numberReader method algorithm (multi-line comment) after coding the GUI
    /*public static int numberReader(String prompt){
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

     */

    /**
     * Method to show the list of actions for the user to choose from.
     */
    //TODO: Lourdene & Marius - Add listOfChoices method code and algorithm
    public void listOfChoices(){
        JFrame choiceFrame = new JFrame("BSCS Curriculum Monitoring Application");

        JLabel headerLabel = new JLabel("MAIN MENU", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton showCourseEachTermButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "1. Show course for each school term");
        buttonDesign(showCourseEachTermButton);
        showCourseEachTermButton.addActionListener(e -> {
            showSubsForEachTerm();
        });

        JButton showCourseWithGradesButton= new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "2. Show course with grades for each term"); //TODO: remove after since we have Show course with grades and remarks for each term
        buttonDesign(showCourseWithGradesButton);
        showCourseWithGradesButton.addActionListener(e -> {
           showSubsWithGradesForEachTerm();
        });

        JButton showCourseAndRemarksButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "3. Show course with grades and remarks for each term");
        buttonDesign(showCourseAndRemarksButton);
        showCourseAndRemarksButton.addActionListener(e -> {
            showSubsWithGradesAndRemarksForEachTerm();
        });

        JButton enterGradeButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "4. Enter grade for course recently finished");
        buttonDesign(enterGradeButton);
        enterGradeButton.addActionListener(e -> {
            enterGrades();
        });

        JButton addFinishedCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "5. Add a finished course from another program"); //TODO: remove after
        buttonDesign(addFinishedCourseButton);
        addFinishedCourseButton.addActionListener(e -> {
            addFinishedCourse();
        });

        JButton addCreditedCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "6. Add a BSCS-credited course finished through another program");
        buttonDesign(addCreditedCourseButton);
        addCreditedCourseButton.addActionListener(e -> {
            addCreditedCourse();
        });

        JButton editElectiveCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "7. Edit an elective course");
        buttonDesign(editElectiveCourseButton);
        editElectiveCourseButton.addActionListener(e -> {
            //TODO:
        });

        JButton button8 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "8. Show student's average grade for all finished courses");
        buttonDesign(button8);
        button8.addActionListener(e -> {
            //TODO:
        });

        JButton button9 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "9. Show student's sorted grades");
        buttonDesign(button9);
        button9.addActionListener(e -> {
            //TODO:
        });

        JButton button10 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "10. Show student's failed courses only");
        buttonDesign(button10);
        button10.addActionListener(e -> {
            //TODO:
        });


        JButton button11 = new RoundButton("QUIT");
        buttonDesign(button11);
        button11.addActionListener(e -> {
            choiceFrame.dispose();
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JPanel buttonsPanel = new JPanel(new GridLayout(5, 2, 10,10));
        buttonsPanel.setBackground(lightBlue);
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(20,15,20,15));
        buttonsPanel.add(showCourseEachTermButton);
        buttonsPanel.add(showCourseWithGradesButton);
        buttonsPanel.add(showCourseAndRemarksButton);
        buttonsPanel.add(enterGradeButton);
        buttonsPanel.add(addFinishedCourseButton);
        buttonsPanel.add(addCreditedCourseButton);
        buttonsPanel.add(editElectiveCourseButton);
        buttonsPanel.add(button8);
        buttonsPanel.add(button9);
        buttonsPanel.add(button10);

        JPanel quitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quitPanel.setBackground(navy);
        quitPanel.add(button11);
        quitPanel.setBorder(BorderFactory.createEmptyBorder(2,0,2,0));

        JPanel choicePanel = new JPanel(new BorderLayout());
        choicePanel.add(headerLabel, BorderLayout.NORTH);
        choicePanel.add(buttonsPanel, BorderLayout.CENTER);
        choicePanel.add(quitPanel, BorderLayout.SOUTH);

        choiceFrame.getContentPane().add(choicePanel);
        choiceFrame.setIconImage(icon.getImage());
        choiceFrame.pack();
        choiceFrame.setSize(630,500);
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
    public void runChoices(int choice) throws IOException {
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
    public void showSubsForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;

        JFrame frame = new JFrame("Courses");
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 600);
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        list.stream().map(course ->
                new Object[]{course.getYear(),
                        "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                        course.getCourseNumber(),
                        course.getDescTitle(),
                        course.getUnits()}).forEach(tableModel::addRow);

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showSubsForEachTerm method

    /**
     * Method to print the subjects with grades for each term.
     */
    //TODO: Julienne - Add showSubsWithGradesForEachTerm method algorithm (multi-line comment) after coding the GUI
    public void showSubsWithGradesForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;
        JFrame frame = new JFrame("Courses with Grades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1100, 600);


        // Prints the list of courses
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        for (Course course : list) {
            Object[] rowData = {
                    course.getYear(),
                    "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits(),
                    course.getGrades() == 0 ? "Not yet graded" : course.getGrades()
            };
            tableModel.addRow(rowData);
        }

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showSubsWithGradesForEachTerm method

    /**
     * Method to print the subjects with grades remarks for each term
     * where it will print "Failed", if grade is less than 75.
     * And, else it will print "Passed".
     */
    //TODO: Julienne - Add showSubsWithGradesAndRemarksForEachTerm method algorithm (multi-line comment) after coding the GUI
    public void showSubsWithGradesAndRemarksForEachTerm(){
        Scanner scan = new Scanner(System.in);
        String enter;
        JFrame frame = new JFrame("Courses with Grades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1100, 600);

        System.out.printf("%-10s%-10s%-20s%-85s%-15s%-15s%s%n","Year","Term","Course number",
                "Descriptive Title","Units","Grades","Remarks");
        // Prints the list of courses
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        for (Course course : list) {
            Object[] rowData = {
                    course.getYear(),
                    "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits(),
                    course.getGrades() == 0 ? "Not yet graded" : course.getGrades()
            };
            tableModel.addRow(rowData);
        }

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
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
    public void enterGrades() {
        JFrame frame = new JFrame("Enter Grades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);

        ArrayList<Course> unfinSubs = new ArrayList<>();
        ArrayList<Integer> limit= new ArrayList<>();
        int index = 0;
        for (Course course : list) {
            if (course.getGrades() == 0 || course.getGrades() >74) {
                unfinSubs.add(course);
            }
        }

        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);


        for (Course course : unfinSubs) {
            Object[] rowData = {
                    ++index,
                    course.getCourseNumber(),
                    course.getDescTitle()
            };
            tableModel.addRow(rowData);
        }

        JTable table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 10));
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        JLabel gradeLabel = new JLabel("Enter the grade: ");
        JTextField gradeField = new JTextField(2);
        RoundButton submitButton = new RoundButton("Submit");
        RoundButton saveButton = new RoundButton("Save");
        RoundButton backButton = new RoundButton("Back");
        buttonDesign(submitButton);
        buttonDesign(saveButton);
        buttonDesign(backButton);
        saveButton.addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        inputPanel.add(gradeLabel);
        inputPanel.add(gradeField);
        inputPanel.add(submitButton);
        inputPanel.add(saveButton);
        inputPanel.add(backButton);
        frame.add(inputPanel, BorderLayout.SOUTH);
        backButton.addActionListener(e -> {
            frame.dispose();
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    try {
                        int grade = Integer.parseInt(gradeField.getText());

                        if (grade == 0 || grade >= 70 && grade <= 99) {
                            Course selectedCourse = unfinSubs.get(selectedRow);
                            selectedCourse.setGrades(grade);
                            tableModel.removeRow(selectedRow);
                            unfinSubs.remove(selectedRow);
                            gradeField.setText("");
                        } else {
                            JOptionPane.showMessageDialog(frame, "Enter a grade between 70 and 99.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid grade. Enter a number between 70 and 99.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a course from the table.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//end of enterGrades method

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
        //choice = numberReader("Enter the number: ");
        // If entered number is not 1-4, error will prompt
        /*while(choice < 1 || choice > 4){
            System.out.println("\nEnter 1-4 only. Try again.");
            choice = numberReader("Enter the number: ");
        }

         */

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
        //courseChoice = numberReader("Enter the number: ");
        // If entered number is not 1-5, error will prompt
        /*while(courseChoice < 1 || courseChoice > 5){
            System.out.println("\nEnter 1-5 only. Try again.");
            courseChoice = numberReader("Enter the number: ");
        }

         */

        // Edits the chosen course based on the chosen elective course
        /*switch(choice){
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

         */

        System.out.println("Course edited successfully.");
    } // end of editACourse method

    /**
     * Method to compute and show the average grade of a student.
     */
    //TODO: Charles - Add showAverageGrade method algorithm (multi-line comment) after coding the GUI
    public void showAverageGrade() throws IOException {
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

            /*
            while(choice != 9){ //loops if user did not input 8
                listOfChoices();
                System.out.println("-----");
                choice = numberReader("Enter your choice: ");
                runChoices(choice);

                System.out.println();
                System.out.print("Press enter key to go back.");
                enter = scanner.nextLine();
            }

             */
        }
    } // end of showAverageGrade method

    //TODO: NASH add Javadoc and Algorithm multiline comments
    public void addCreditedCourse(){
        JFrame frame = new JFrame("Enter Grades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);

        ArrayList<Course> unfinSubs = new ArrayList<>();
        ArrayList<Integer> limit = new ArrayList<>();
        int index = 0;
        for (Course course : list) {
            if (course.getGrades() == 0 || course.getGrades() > 74) {
                unfinSubs.add(course);
            }
        }
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        for (Course course : unfinSubs) {
            Object[] rowData = {
                    ++index,
                    course.getCourseNumber(),
                    course.getDescTitle()
            };
            tableModel.addRow(rowData);
        }
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();

        RoundButton saveButton = new RoundButton("Save");
        RoundButton updateGradeButton = new RoundButton("Update Grade");//TODO: Lourdene figure out a way to fit in the text in the button
        RoundButton backButton = new RoundButton("Back");
        buttonDesign(saveButton);
        buttonDesign(updateGradeButton);
        buttonDesign(backButton);

        backButton.addActionListener(e -> frame.dispose());
        saveButton.addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        inputPanel.add(saveButton);
        inputPanel.add(updateGradeButton);
        inputPanel.add(backButton);
        frame.add(inputPanel, BorderLayout.SOUTH);

        updateGradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseNumber = JOptionPane.showInputDialog(frame, "Enter the course number:", "Update Grade", JOptionPane.PLAIN_MESSAGE);

                if (courseNumber != null) {
                    Course courseToUpdate = null;
                    int rowIndex = -1;
                    for (int i = 0; i < unfinSubs.size(); i++) {
                        if (unfinSubs.get(i).getCourseNumber().equalsIgnoreCase(courseNumber)) {
                            courseToUpdate = unfinSubs.get(i);
                            rowIndex = i;
                            break;
                        }
                    }

                    if (courseToUpdate != null) {
                        try {
                            int grade = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the grade for " + courseNumber + ":", "Update Grade", JOptionPane.PLAIN_MESSAGE));
                            courseToUpdate.setGrades(grade);
                            tableModel.removeRow(rowIndex);
                            unfinSubs.remove(rowIndex);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame, "Invalid grade. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Course not found. Please make sure you entered the correct course number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

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
    //TODO: add method algorithm (multi-line comment)
    private static void buttonDesign(JButton button) {
        button.setFont(new Font("Helvetica", Font.BOLD, 13));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(navy, 3, false), // Set border color, thickness, and roundness
                BorderFactory.createEmptyBorder(8, 18, 8, 18)));
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
                button.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(pink, 3, false), // Set border color, thickness, and roundness
                        BorderFactory.createEmptyBorder(8, 18, 8, 18)));
                button.setBackground(navy); // Set a new color when mouse hovers over the button
                button.setForeground(pink);
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
                button.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(navy, 3, false), // Set border color, thickness, and roundness
                        BorderFactory.createEmptyBorder(8, 18, 8, 18)));
                button.setBackground(pink); // Set back the original color when the mouse leaves the button
                button.setForeground(navy);
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
    //TODO: add method algorithm (multi-line comment)
    private static void saveFile() throws IOException {
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
    //TODO: add method algorithm (multi-line comment)
    private class RoundButton extends JButton {
        // Declare the objects for RoundRectangleButton.
        /**
         * Holds the shadow color of the button.
         */
        private static final Color SHADOW_COLOR = new Color(5, 0, 100, 50);

        /**
         * Holds the corner radius of the button.
         */
        private static final int CORNER_RADIUS = 20;

        /**
         * Holds the tracking of the user's cursor hover.
         */
        private boolean hovering;

        /**
         * Constructor that creates a custom button that is shaped like a round rectangle
         * and detect when the user's mouse cursor is hovering over it while updating its appearance accordingly.
         *
         * @param text the text to be displayed on the button
         */
        private RoundButton(String text) {
            super(text);
            setOpaque(false);
            setFocusPainted(false);
            setBorderPainted(true);

            // Adds a mouse listener to track when the mouse is hovering over the button
            addMouseListener(new MouseAdapter() {

                /**
                 * Method to set the boolean flag 'hovering' to true and triggers a
                 * repaint of the component to update its appearance.
                 *
                 * @param e the event to be processed
                 */
                @Override
                public void mouseEntered(MouseEvent e) {
                    hovering = true;
                    repaint();
                }

                /**
                 * Method to set the boolean flag 'hovering' to false and triggers a
                 * repaint of the component to update its appearance.
                 *
                 * @param e the event to be processed
                 */
                @Override
                public void mouseExited(MouseEvent e) {
                    hovering = false;
                    repaint();
                }
            });
        } // end of RoundRectangleButton

        /**
         * Method that paints the components of the main button shape.
         *
         * @param g the <code>Graphics</code> object to protect
         */
        @Override
        protected void paintComponent(Graphics g) {
            // Paints the main button shape
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (getModel().isPressed()) {
                g2.setColor(Color.gray);
            } else {
                g2.setColor(getBackground());
            }
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS);

            // Paints a semi-transparent rounded rectangle just below the main one to create a shadow effect
            if (hovering && isEnabled()) {
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));
                g2.setColor(SHADOW_COLOR);
                g2.fillRoundRect(0, getHeight() - CORNER_RADIUS / 2, getWidth(),
                        CORNER_RADIUS / 2, CORNER_RADIUS, CORNER_RADIUS);
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
            }

            super.paintComponent(g);
        } // end of paintComponent

        /**
         * Method that paints the border of the button.
         *
         * @param g the <code>Graphics</code> context in which to paint
         */
        @Override
        protected void paintBorder(Graphics g) {
            // Paints the button border
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() -1, CORNER_RADIUS, CORNER_RADIUS);
        } // end of paintBorder

        /**
         * Getter/Accessor Method that returns the button dimension.
         *
         * @return Dimension the preferred size of the button
         */
        @Override
        public Dimension getPreferredSize() {
            // Adjusts the dimension of the button
            return new Dimension(100, 40);
        } // end of getPreferredSize

    } // end of RoundRectangleButton class
    //TODO: ADD JAVADOC AND ALGORITHM MULTILINE COMMENTS
    private String showLoginDialog() {
        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        String username = null;
        boolean validInput = false;

        while (!validInput) {
            int result = JOptionPane.showConfirmDialog(null, loginPanel, "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(result == JOptionPane.CANCEL_OPTION){
                System.exit(0);
            }
            if (result == JOptionPane.OK_OPTION) {
                username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter both username and password.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    validInput = true;
                    // Perform your authentication or other operations with the entered username and password.
                }
            }
        }

        return username;
    }
    //TODO: ADD JAVADOC AND ALGORITHM MULTILINE COMMENTS
    public void addFinishedCourse() {
        JFrame frame = new JFrame("Enter Grades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);

        ArrayList<Course> unfinSubs = new ArrayList<>();
        ArrayList<Integer> limit= new ArrayList<>();
        final int[] index = {0};
        for (Course course : list) {
            if (course.getGrades() == 0 || course.getGrades() >74) {
                unfinSubs.add(course);
            }
        }

        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        for (Course course : unfinSubs) {
            Object[] rowData = {
                    ++index[0],
                    course.getCourseNumber(),
                    course.getDescTitle()
            };
            tableModel.addRow(rowData);
        }

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();

        RoundButton saveButton = new RoundButton("Save");
        RoundButton addCourseButton = new RoundButton("Add Course");//TODO: Lourdene figure out a way to fit in the text in the button
        RoundButton backButton = new RoundButton("Back");
        buttonDesign(saveButton);
        buttonDesign(addCourseButton);
        buttonDesign(backButton);

        backButton.addActionListener(e -> frame.dispose());
        saveButton.addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        inputPanel.add(saveButton);
        inputPanel.add(addCourseButton);
        inputPanel.add(backButton);
        frame.add(inputPanel, BorderLayout.SOUTH);

        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel addCoursePanel = new JPanel(new GridLayout(6, 2));
                JTextField yearField = new JTextField();
                JTextField termField = new JTextField();
                JTextField courseNumberField = new JTextField();
                JTextField descTitleField = new JTextField();
                JTextField unitsField = new JTextField();
                JTextField gradeField = new JTextField();

                addCoursePanel.add(new JLabel("Year:"));
                addCoursePanel.add(yearField);
                addCoursePanel.add(new JLabel("Term:"));
                addCoursePanel.add(termField);
                addCoursePanel.add(new JLabel("Course Number:"));
                addCoursePanel.add(courseNumberField);
                addCoursePanel.add(new JLabel("Descriptive Title:"));
                addCoursePanel.add(descTitleField);
                addCoursePanel.add(new JLabel("Units:"));
                addCoursePanel.add(unitsField);
                addCoursePanel.add(new JLabel("Grade (Leave blank if not graded):"));
                addCoursePanel.add(gradeField);

                int result = JOptionPane.showConfirmDialog(frame, addCoursePanel, "Add Course", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    try {
                        String year = String.valueOf(Integer.parseInt(yearField.getText()));
                        String term = String.valueOf(Integer.parseInt(termField.getText()));
                        String courseNumber = courseNumberField.getText();
                        String descTitle = descTitleField.getText();
                        int units = Integer.parseInt(unitsField.getText());
                        int grade = gradeField.getText().isEmpty() ? 0 : Integer.parseInt(gradeField.getText());

                        Course newCourse = new Course(year, term, courseNumber, descTitle, units, grade);
                        list.add(newCourse);
                        if (grade == 0 || grade > 74) {
                            unfinSubs.add(newCourse);
                            tableModel.addRow(new Object[]{++index[0], newCourse.getCourseNumber(), newCourse.getDescTitle()});
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please make sure all fields are filled correctly.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } //end of enterGrades method

} // end of CurriculumMonitoringApplication class