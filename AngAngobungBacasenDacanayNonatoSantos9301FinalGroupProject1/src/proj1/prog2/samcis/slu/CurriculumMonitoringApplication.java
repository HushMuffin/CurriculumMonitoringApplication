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
 *     username
 *     password
 *     course grade
 *     course data information
 *     selected elective course
 * <p>
 * Outputs:
 *     list of courses with grades and remarks for each term
 *     average grade for all finished courses
 *     sorted list of courses based on grades
 *     list of failed courses
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * General Algorithm:
 * 1. Display the user login window.
 * 2. After entering the login details, display the introduction window.
 * 3. Display the main menu with the following options:
 *    3.1 Show course with grades and remarks for each term:
 *        - Displays a table list of courses with grades and remarks for each term.
 *    3.2 Enter grade for a recently finished course:
 *        - Displays a window to select a course and enter a grade to be submitted and saved to a file.
 *    3.3 Add a finished course from another program:
 *        - Displays another window that allows the user to add course information and save it to a file.
 *    3.4 Add a BSCS-credited course finished through another program:
 *        - Displays another window that lets the user add a BSCS-credited course,
 *          update its grade, then save it to a file.
 *    3.5 Edit an elective course:
 *        - Displays another window where the user can select their desired elective course
 *          from a recommended course list and saves it to a file.
 *    3.6 Show the student's average grade for all finished courses:
 *        - Displays another window showing the average grade.
 *    3.7 Show the student's sorted grades:
 *        - Displays another window with a table of sorted courses based on grades.
 *    3.8 Show the student's failed courses only:
 *        - Displays another window with a table of failed courses.
 * 4. Terminate the program if the user chooses to quit.
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
package proj1.prog2.samcis.slu;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class CurriculumMonitoringApplication {
    ButtonAction buttonAction = new ButtonAction();
    JPanel backPanel,introPanel,descriptionPanel,loginPanel,buttonPanel,guidePanel,tablePanel,exitPanel,searchPanel,topPanel,contentPanel,resultPanel,inputPanel,quitPanel,choicePanel;
    RoundButton cancelButtonLogin,okButtonLogin,cancelButtonElective,confirmButtonElective,saveButton,submitButton,addCourseButton,updateGradeButton,cancelButton;

    JLabel exitLabel;

    JLabel headerLabel,usernameLabel,passwordLabel,warningLabel,descriptionLabel,greetLabel,guideLabel,electiveLabel,resultLabel,gradeLabel,errorLabel,recommendedLabel,searchLabel;

    //Tables

    JTable table,electivesTable,recommendedTable;
    JScrollPane scrollPane;

    DefaultTableCellRenderer renderer;


    JTableHeader header;

    DefaultTableModel tableModel;


    DefaultTableModel electivesModel;


    DefaultTableModel recommendedModel;

    //Dialogs

    JDialog exitDialog,loginDialog,warningDialog,introDialog,averageDialog;

    //TextFields
    JTextField usernameField, searchBar,gradeField;
    JPasswordField passwordField;

    //Frames
    JFrame choicesFrame,frameFailedCourses,frameSortedGrades,frameEnterGrades,frameFinishedCourse,frameCreditedCourse,frameCoursesWithGrades, frameElective;

    //ArrayLists
    ArrayList<Course> unfinishedCourses;
    ArrayList<Course> listRecommended;

    int[] index;

    ImageIcon icon = new ImageIcon("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/" +
            "res/icon1.png");
    private static RoundButton nextButton, backButton;
    static Scanner keyboard = new Scanner(System.in);
    static BufferedReader inputStream;
    static ArrayList<Course> list = new ArrayList<>();
    static File file = new File("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/" +
            "BSCSCurriculumData1.csv");
    static Color pink = new Color(255, 175, 204);
    static Color peach = new Color(255, 229, 212);
    static Color darkPurple = new Color(105, 79, 93);
    static Color lightBlue = new Color(184, 193, 236);
    static Color navy = new Color(58, 79, 122);
    static Color purple = new Color(205, 180, 219);

    public static void main(String[] args) throws IOException {
        CurriculumMonitoringApplication program;
        try {
            program = new CurriculumMonitoringApplication();
            program.run();
        }catch (ArithmeticException exx){
            System.out.println(exx.getMessage());
        }
    } // end of main method


    public void run() throws IOException {
        String name = null;
        name= showLoginDialog().toUpperCase();
        showIntroduction(name);
        populateArrayList(list); //invokes populateArrayList method
        listOfChoices();
    } // end of run method


    private String showLoginDialog() {
        // Create a new JDialog for the login dialog
        loginDialog = new JDialog();
        loginDialog.setTitle("User Login");
        loginDialog.setModal(true);
        loginDialog.setLayout(new BorderLayout());

        // Create the labels to be used inside the login panel
        headerLabel = new JLabel("User Login", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        usernameLabel = new JLabel("USERNAME:");
        usernameLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
        usernameLabel.setForeground(Color.darkGray);
        usernameLabel.setBorder(BorderFactory.createEmptyBorder(0,55,0,0));

        passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
        passwordLabel.setForeground(Color.darkGray);
        passwordLabel.setBorder(BorderFactory.createEmptyBorder(0,55,0,0));

        // Create the input text fields to be used inside the login panel
        usernameField = new JTextField(20);
        usernameField.setHorizontalAlignment(SwingConstants.CENTER);

        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*');

        // Create the buttons for the login dialog
        okButtonLogin = new RoundButton("OK");
        buttonDesign(okButtonLogin);
        okButtonLogin.addActionListener(buttonAction);
        cancelButtonLogin = new RoundButton("Cancel");
        buttonDesign(cancelButtonLogin);
        cancelButtonLogin.addActionListener(buttonAction);

        // Create the panel within the login dialog
        loginPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.setBackground(lightBlue);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(okButtonLogin);
        buttonPanel.add(cancelButtonLogin);
        buttonPanel.setBackground(navy);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(4,20,4,20));

        loginDialog.add(headerLabel, BorderLayout.NORTH);
        loginDialog.add(loginPanel, BorderLayout.CENTER);
        loginDialog.add(buttonPanel, BorderLayout.SOUTH);
        loginDialog.pack();
        loginDialog.setSize(520, 280);
        loginDialog.setLocationRelativeTo(null);
        loginDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showExit();
                System.exit(0);
            }
        });
        loginDialog.setIconImage(icon.getImage());
        loginDialog.setVisible(true);

        // Returns the username of the student as a String
        return usernameField.getText();
    } // end of showLoginDialog method


    private void showExit() {
        exitDialog = new JDialog();
        exitDialog.setTitle("BSCS Monitoring Application");
        exitDialog.setModal(true);

        exitLabel = new JLabel("Thank you for using the program!", SwingConstants.CENTER);
        exitLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        exitLabel.setForeground(pink);

        // use BorderLayout for exitPanel
        exitPanel = new JPanel(new BorderLayout());
        exitPanel.setBackground(navy);
        exitPanel.add(exitLabel, BorderLayout.CENTER); // add exitLabel to the center of exitPanel

        exitDialog.getContentPane().add(exitPanel); // add exitPanel to the content pane of exitDialog
        exitDialog.setIconImage(icon.getImage());
        exitDialog.setSize(400, 120);
        exitDialog.setLocationRelativeTo(null);
        exitDialog.setVisible(true);
        exitDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    } // end of showExit method

    public void showIntroduction(String name) {
        introDialog = new JDialog();
        introDialog.setTitle("BSCS Curriculum Monitoring Application");
        introDialog.setModal(true);

        headerLabel = new JLabel("BSCS Curriculum Monitoring Application", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        greetLabel = new JLabel("WELCOME " + name + "!", SwingConstants.CENTER);
        greetLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        greetLabel.setForeground(darkPurple);
        greetLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));

        descriptionLabel = new JLabel("<html><div style='text-align: justify;'>" +
                "This application is designed to assist a Bachelor of Science of Computer Science " +
                "(BSCS) students at Saint Louis University in monitoring their progress towards " +
                "completing their curriculum. Please proceed to the next window for the Main Menu.</html>",
                SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        descriptionLabel.setForeground(Color.darkGray);
        descriptionLabel.setBorder(BorderFactory.createEmptyBorder(8, 20, 20, 20));

        nextButton = new RoundButton("NEXT");
        buttonDesign(nextButton);
        nextButton.addActionListener(buttonAction);

        introPanel = new JPanel(new BorderLayout());
        descriptionPanel = new JPanel(new BorderLayout());
        descriptionPanel.setBackground(lightBlue);
        descriptionPanel.add(greetLabel);
        descriptionPanel.add(descriptionLabel, BorderLayout.SOUTH);
        descriptionPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        buttonPanel.setBackground(navy);
        buttonPanel.add(nextButton);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

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

    public void listOfChoices() {
        choicesFrame = new JFrame("BSCS Curriculum Monitoring Application");
        headerLabel = new JLabel("MAIN MENU", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "Please select your desired option provided below and it will direct " +
                "you to another window. To prevent the windows from stacking up, you " +
                "can close the window and select another option from this main menu.</html>",
                SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(peach);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

       RoundButton showCourseAndRemarksButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "1. Show course with grades and remarks for each term");
        buttonDesign(showCourseAndRemarksButton);
        showCourseAndRemarksButton.addActionListener(e -> {
            showCoursesWithGradesAndRemarksForEachTerm();
        });

       RoundButton enterGradeButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "2. Enter grade for course recently finished");
        buttonDesign(enterGradeButton);
        enterGradeButton.addActionListener(e -> {
            enterGrades();
        });

       RoundButton addFinishedCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "3. Add a finished course from another program");
        buttonDesign(addFinishedCourseButton);
        addFinishedCourseButton.addActionListener(e -> {
            addFinishedCourse();
        });

       RoundButton addCreditedCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "4. Add a BSCS-credited course finished through another program");
        buttonDesign(addCreditedCourseButton);
        addCreditedCourseButton.addActionListener(e -> {
            addCreditedCourse();
        });

       RoundButton editElectiveCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "5. Edit an elective course");
        buttonDesign(editElectiveCourseButton);
        editElectiveCourseButton.addActionListener(e -> {
            editElectiveCourse();
        });

       RoundButton button8 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "6. Show student's average grade for all finished courses");
        buttonDesign(button8);
        button8.addActionListener(e -> {
            try {
                showAverageGrade();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

       RoundButton button9 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "7. Show student's sorted grades");
        buttonDesign(button9);
        button9.addActionListener(e -> {
            showSortedGrades();
        });

       RoundButton button10 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "8. Show student's failed courses only");
        buttonDesign(button10);
        button10.addActionListener(e -> {
            showFailedCourses();
        });

       RoundButton button11 = new RoundButton("QUIT");
        buttonDesign(button11);
        button11.addActionListener(e -> {
            showExit();
            choicesFrame.dispose();
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.exit(0);
        });

        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(lightBlue);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(15, 100, 0, 100));

        topPanel = new JPanel(new BorderLayout());
        topPanel.add(headerLabel,BorderLayout.NORTH);
        topPanel.add(guidePanel, BorderLayout.CENTER);

        buttonPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        buttonPanel.add(showCourseAndRemarksButton);
        buttonPanel.add(enterGradeButton);
        buttonPanel.add(addFinishedCourseButton);
        buttonPanel.add(addCreditedCourseButton);
        buttonPanel.add(editElectiveCourseButton);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button10);
        buttonPanel.setBackground(lightBlue);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 15, 20, 15));

        quitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quitPanel.setBackground(navy);
        quitPanel.add(button11);
        quitPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));


        choicePanel = new JPanel(new BorderLayout());
        choicePanel.add(topPanel, BorderLayout.NORTH);
        choicePanel.add(buttonPanel, BorderLayout.CENTER);
        choicePanel.add(quitPanel, BorderLayout.SOUTH);

        choicesFrame.getContentPane().add(choicePanel);
        choicesFrame.setIconImage(icon.getImage());
        choicesFrame.pack();
        choicesFrame.setSize(630, 530);
        choicesFrame.setLocationRelativeTo(null);
        choicesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        choicesFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showExit();
                System.exit(0);
            }
        });
        choicesFrame.setVisible(true);
    } // end of listOfChoices method


    public void showCoursesWithGradesAndRemarksForEachTerm() {
        frameCoursesWithGrades = new JFrame("Courses with Grades and Remarks for Each Term");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades", "Remarks"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        updateTableModel(list, tableModel);
        headerLabel = new JLabel("Courses with Grades and Remarks for Each Term", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            frameCoursesWithGrades.dispose();
        });

        // Populate tableModel using streams
        list.stream().map(course -> {
            String remarks;
            int grades = course.getGrades();

            if (grades == 0) {
                remarks = "Not yet graded";
            } else if (grades < 75) {
                remarks = "Failed";
            } else {
                remarks = "Passed";
            }

            return new Object[]{
                    course.getYear(),
                    "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits(),
                    grades == 0 ? "Not yet graded" : grades,
                    remarks
            };
        }).forEach(tableModel::addRow);
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 470));
        scrollPane = new JScrollPane(table);
        // Search functionality
        searchLabel = new JLabel("Search: ");
        searchBar = new JTextField(15);
        searchBar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }

            private void filterTable() {
                String searchText = searchBar.getText().toLowerCase();
                ArrayList<Course> filteredList = new ArrayList<>();
                for (Course course : list) {
                    if (course.getCourseNumber().toLowerCase().contains(searchText) ||
                            course.getDescTitle().toLowerCase().contains(searchText)) {
                        filteredList.add(course);
                    }
                }
                updateTableModel(filteredList, tableModel);
            }
        });

        // Define a custom header renderer that sets the background color of the column names
        header = table.getTableHeader();
        ((JTableHeader) header).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });

        // Define a custom cell renderer that sets the background color of the cells in the second column
        renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0 -> c.setBackground(lightBlue);
                    case 1 -> c.setBackground(lightBlue);
                    case 2 -> c.setBackground(lightBlue);
                    case 3 -> c.setBackground(lightBlue);
                    case 4 -> c.setBackground(lightBlue);
                    case 5 -> c.setBackground(lightBlue);
                    case 6 -> c.setBackground(lightBlue);
                    default ->
                            c.setBackground(table.getBackground()); // use the default background color for other columns
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(3);
        table.getColumnModel().getColumn(1).setPreferredWidth(5);
        table.getColumnModel().getColumn(2).setPreferredWidth(65);
        table.getColumnModel().getColumn(3).setPreferredWidth(540);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(20);
        table.getColumnModel().getColumn(6).setPreferredWidth(20);

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchBar);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));


        tablePanel = new JPanel();
        tablePanel.add(searchPanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));
        frameCoursesWithGrades.add(headerLabel, BorderLayout.NORTH);
        frameCoursesWithGrades.add(tablePanel, BorderLayout.CENTER);
        frameCoursesWithGrades.add(backPanel, BorderLayout.SOUTH);
        frameCoursesWithGrades.setIconImage(icon.getImage());
        frameCoursesWithGrades.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameCoursesWithGrades.setSize(1280, 700);
        frameCoursesWithGrades.setVisible(true);
        frameCoursesWithGrades.setLocationRelativeTo(null);
    } // end of showCoursesWithGradesAndRemarksForEachTerm method


    private void updateTableModel(ArrayList<Course> courses, DefaultTableModel tableModel) {
        tableModel.setRowCount(0);
        for (Course course : courses) {
            String remarks;
            int grades = course.getGrades();

            if (grades == 0) {
                remarks = "Not yet graded";
            } else if (grades < 75) {
                remarks = "Failed";
            } else {
                remarks = "Passed";
            }

            Object[] rowData = {
                    course.getYear(),
                    "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits(),
                    grades == 0 ? "Not yet graded" : grades,
                    remarks
            };
            tableModel.addRow(rowData);
        }
    } // end of updateTableModel method


    public void enterGrades() {
        frameEnterGrades = new JFrame("Enter Grades");
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        headerLabel = new JLabel("Enter Grades", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        unfinishedCourses = new ArrayList<>();
        AtomicInteger index = new AtomicInteger();
        HashMap<Integer, Integer> originalIndices = new HashMap<>();
        updateCourseTableModel(unfinishedCourses, unfinishedCourses, tableModel, originalIndices);

        for (Course course : list) {
            if (course.getGrades() == 0 || course.getGrades() > 64) {
                unfinishedCourses.add(course);
            }
        }

        list.stream().map(course -> new Object[]{
                index.incrementAndGet(),
                course.getCourseNumber(),
                course.getDescTitle()
        }).forEach(tableModel::addRow);

        // Search functionality
        searchLabel = new JLabel("Search: ");
        searchBar = new JTextField(15);

        searchBar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }

            private void filterTable() {
                String searchText = searchBar.getText().toLowerCase();
                ArrayList<Course> filteredList = new ArrayList<>();
                for (Course course : unfinishedCourses) {
                    if (course.getCourseNumber().toLowerCase().contains(searchText) ||
                            course.getDescTitle().toLowerCase().contains(searchText)) {
                        filteredList.add(course);
                    }
                }
                updateCourseTableModel(unfinishedCourses, filteredList, tableModel, originalIndices);
            }
        });

        table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 12));
        table.setPreferredScrollableViewportSize(new Dimension(900, 235));

        scrollPane = new JScrollPane(table);

        gradeLabel = new JLabel("Enter the grade: ");
        gradeLabel.setFont(new Font("Helvetica", Font.BOLD, 13));
        gradeLabel.setForeground(Color.darkGray);

        gradeField = new JTextField(10);

        submitButton = new RoundButton("Submit");
        buttonDesign(submitButton);
        submitButton.addActionListener(buttonAction);
        saveButton = new RoundButton("Save");
        buttonDesign(saveButton);
        saveButton.addActionListener(buttonAction);

        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            frameEnterGrades.dispose();
        });

        // Define a custom header renderer that sets the background color of the column names
        header = table.getTableHeader();
        ((JTableHeader) header).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });

        // Define a custom cell renderer that sets the background color of the cells in the second column
        renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0 -> c.setBackground(lightBlue);
                    case 1 -> c.setBackground(lightBlue);
                    case 2 -> c.setBackground(lightBlue);
                    default ->
                            c.setBackground(table.getBackground()); // use the default background color for other columns
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(1);
        table.getColumnModel().getColumn(1).setPreferredWidth(1);
        table.getColumnModel().getColumn(2).setPreferredWidth(450);

        guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "Please select a row in the table below that corresponds to a specific" +
                " course. Then, enter the grade you have in the chosen course to the " +
                "text field below the table. You can also search your desired course on " +
                "the search bar below. Remember to submit and save what you have edited!</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchBar);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.add(searchPanel, BorderLayout.SOUTH);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 0, 100));

        tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(gradeLabel);
        inputPanel.add(gradeField);
        inputPanel.add(submitButton);
        inputPanel.add(saveButton);
        inputPanel.setBackground(peach);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 350, 10, 350));

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(guidePanel, BorderLayout.NORTH);
        contentPanel.add(tablePanel, BorderLayout.CENTER);
        contentPanel.add(inputPanel, BorderLayout.SOUTH);
        contentPanel.setBackground(peach);

        backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        frameEnterGrades.add(headerLabel, BorderLayout.NORTH);
        frameEnterGrades.add(contentPanel, BorderLayout.CENTER);
        frameEnterGrades.add(backPanel, BorderLayout.SOUTH);
        frameEnterGrades.setIconImage(icon.getImage());
        frameEnterGrades.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameEnterGrades.setSize(980, 645);
        frameEnterGrades.setVisible(true);
        frameEnterGrades.setLocationRelativeTo(null);
    } //end of enterGrades method

    private void updateCourseTableModel(ArrayList<Course> unfinSubs, ArrayList<Course> courses, DefaultTableModel
            tableModel, HashMap<Integer, Integer> originalIndices) {
        tableModel.setRowCount(0);
        int index = 0;
        for (Course course : courses) {
            int originalIndex = unfinSubs.indexOf(course);
            Object[] rowData = {
                    ++index,
                    course.getCourseNumber(),
                    course.getDescTitle()
            };
            tableModel.addRow(rowData);
            originalIndices.put(index - 1, originalIndex);
        }
    } // end of updateCourseTableModel method


    public void addFinishedCourse() {
        frameFinishedCourse = new JFrame("Add Finished Course");
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        headerLabel = new JLabel("Add Finished Course", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "For adding a new completed course, click the \"Add Course\" button that " +
                "will direct you to another dialog window for entering inputs of data " +
                "information about the course to be added. Remember to save before closing!" +
                "</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        unfinishedCourses = new ArrayList<>();
        ArrayList<Integer> limit= new ArrayList<>();
        index = new int[]{0};

        for (Course course : list) {
            if (course.getGrades() == 0 || course.getGrades() >74) {
                unfinishedCourses.add(course);
            }
        }

        for (Course course : unfinishedCourses) {
            Object[] rowData = {
                    ++index[0],
                    course.getCourseNumber(),
                    course.getDescTitle()
            };
            tableModel.addRow(rowData);
        }

        table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 12));
        table.setPreferredScrollableViewportSize(new Dimension(900, 235));

        scrollPane = new JScrollPane(table);
        saveButton = new RoundButton("Save");
        buttonDesign(saveButton);
        saveButton.addActionListener(buttonAction);

        addCourseButton = new RoundButton("Add Course");
        buttonDesign(addCourseButton);
        addCourseButton.addActionListener(buttonAction);
        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {frameFinishedCourse.dispose();});

        // Define a custom header renderer that sets the background color of the column names
        header = table.getTableHeader();
        ((JTableHeader) header).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });
        // Define a custom cell renderer that sets the background color of the cells in the second column
        renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0:
                        c.setBackground(lightBlue);
                        break;
                    case 1:
                        c.setBackground(lightBlue);
                        break;
                    case 2:
                        c.setBackground(lightBlue);
                        break;
                    default:
                        c.setBackground(table.getBackground()); // use the default background color for other columns
                        break;
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(1);
        table.getColumnModel().getColumn(1).setPreferredWidth(1);
        table.getColumnModel().getColumn(2).setPreferredWidth(450);

        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10,100,0,100));

        tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10,0,3,0));


        inputPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        inputPanel.add(addCourseButton);
        inputPanel.add(saveButton);
        inputPanel.setBackground(peach);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(3,350,10,350));


        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(guidePanel, BorderLayout.NORTH);
        contentPanel.add(tablePanel, BorderLayout.CENTER);
        contentPanel.add(inputPanel, BorderLayout.SOUTH);
        contentPanel.setBackground(peach);


        backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2,0,2,0));
        frameFinishedCourse.add(headerLabel, BorderLayout.NORTH);
        frameFinishedCourse.add(contentPanel, BorderLayout.CENTER);
        frameFinishedCourse.add(backPanel, BorderLayout.SOUTH);
        frameFinishedCourse.setIconImage(icon.getImage());
        frameFinishedCourse.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameFinishedCourse.setSize(980, 545);
        frameFinishedCourse.setVisible(true);
        frameFinishedCourse.setLocationRelativeTo(null);
    } //end of addFinishedCourse method


    public void addCreditedCourse() {
        frameCreditedCourse = new JFrame("Add Credited Course");
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        headerLabel = new JLabel("Add Credited Course", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "For adding a new completed course, click the \"Add Course\" button that " +
                "will direct you to another dialog window for entering inputs of data " +
                "information about the course to be added. Remember to save before closing!" +
                "</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        unfinishedCourses = new ArrayList<>();
        ArrayList<Integer> limit= new ArrayList<>();
        final int[] index = {0};

        for (Course course : list) {
            if (course.getGrades() == 0 || course.getGrades() >74) {
                unfinishedCourses.add(course);
            }
        }

        for (Course course : unfinishedCourses) {
            Object[] rowData = {
                    ++index[0],
                    course.getCourseNumber(),
                    course.getDescTitle()
            };
            tableModel.addRow(rowData);
        }

        table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 12));
        table.setPreferredScrollableViewportSize(new Dimension(900, 235));

        scrollPane = new JScrollPane(table);
        frameCreditedCourse.add(scrollPane, BorderLayout.CENTER);

        saveButton = new RoundButton("Save");
        buttonDesign(saveButton);
        saveButton.addActionListener(buttonAction);

        updateGradeButton = new RoundButton("Update Grade");
        buttonDesign(updateGradeButton);
        updateGradeButton.addActionListener(buttonAction);

        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> frameCreditedCourse.dispose());

        // Define a custom header renderer that sets the background color of the column names
        header = table.getTableHeader();
        ((JTableHeader) header).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });

        // Define a custom cell renderer that sets the background color of the cells in the second column
        renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0:
                        c.setBackground(lightBlue);
                        break;
                    case 1:
                        c.setBackground(lightBlue);
                        break;
                    case 2:
                        c.setBackground(lightBlue);
                        break;
                    default:
                        c.setBackground(table.getBackground()); // use the default background color for other columns
                        break;
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(1);
        table.getColumnModel().getColumn(1).setPreferredWidth(1);
        table.getColumnModel().getColumn(2).setPreferredWidth(450);

        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10,100,0,100));

        tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10,0,3,0));

        inputPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        inputPanel.add(updateGradeButton);
        inputPanel.add(saveButton);
        inputPanel.setBackground(peach);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(3,330,10,330));


        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(guidePanel, BorderLayout.NORTH);
        contentPanel.add(tablePanel, BorderLayout.CENTER);
        contentPanel.add(inputPanel, BorderLayout.SOUTH);
        contentPanel.setBackground(peach);

        backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2,0,2,0));

        frameCreditedCourse.add(headerLabel, BorderLayout.NORTH);
        frameCreditedCourse.add(contentPanel, BorderLayout.CENTER);
        frameCreditedCourse.add(backPanel, BorderLayout.SOUTH);
        frameCreditedCourse.setIconImage(icon.getImage());
        frameCreditedCourse.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameCreditedCourse.setSize(980, 545);
        frameCreditedCourse.setVisible(true);
        frameCreditedCourse.setLocationRelativeTo(null);
    } // end of addCreditedCourse method


    public void editElectiveCourse() {
        frameElective = new JFrame("Edit Elective Course");
        frameElective.setLayout(new BorderLayout());

        headerLabel = new JLabel("Edit Elective Course", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));

        guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "Please select a row each for the elective and recommended courses table below " +
                "that corresponds to a specific elective course. Then, click the confirm button " +
                "to confirm that you will take the selected recommended course as an elective course." +
                "</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);


        electiveLabel = new JLabel("Elective Courses Table", SwingConstants.CENTER);
        electiveLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        electiveLabel.setOpaque(true);
        electiveLabel.setBackground(peach);
        electiveLabel.setForeground(Color.darkGray);
        electiveLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        recommendedLabel = new JLabel("Recommended Courses Table", SwingConstants.CENTER);
        recommendedLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        recommendedLabel.setOpaque(true);
        recommendedLabel.setBackground(peach);
        recommendedLabel.setForeground(Color.darkGray);
        recommendedLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        listRecommended = new ArrayList<>();
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

        // Set up the tables and their models

        electivesModel = new DefaultTableModel(new Object[]{"Year", "Term", "Course number", "Descriptive Title", "Units"}, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        electivesTable = new JTable(electivesModel);
        electivesTable.setFont(new Font("Helvetica", Font.BOLD, 12));
        electivesTable.setFillsViewportHeight(true);
        electivesTable.setRowHeight(25);
        electivesTable.setPreferredScrollableViewportSize(new Dimension(900, 100));

        int[] electiveIndices = {68, 69, 74, 75};
        for (int index : electiveIndices) {
            Course course = list.get(index);
            Object[] rowData = new Object[]{
                    course.getYear(),
                    course.getTerm(),
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits()
            };
            electivesModel.addRow(rowData);
        }

        recommendedModel = new DefaultTableModel(new Object[]{"Course number", "Descriptive Title", "Units"}, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        recommendedTable = new JTable(recommendedModel);
        recommendedTable.setFont(new Font("Helvetica", Font.BOLD, 12));
        recommendedTable.setFillsViewportHeight(true);
        recommendedTable.setRowHeight(20);
        recommendedTable.setPreferredScrollableViewportSize(new Dimension(900, 100));

        for (Course course : listRecommended) {
            Object[] rowData = new Object[]{
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits()
            };
            recommendedModel.addRow(rowData);
        }

        // Set up the buttons
        confirmButtonElective = new RoundButton("Confirm");
        buttonDesign(confirmButtonElective);
        confirmButtonElective.addActionListener(buttonAction);
        cancelButtonElective = new RoundButton("Cancel");
        buttonDesign(cancelButtonElective);
        cancelButtonElective.addActionListener(e -> frameElective.dispose());

        // Define a custom header renderer that sets the background color of the column names
        JTableHeader header1 = electivesTable.getTableHeader();
        ((JTableHeader) header1).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });

        JTableHeader header2 = recommendedTable.getTableHeader();
        ((JTableHeader) header2).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });

        // Define a custom cell renderer that sets the background color of the cells in the second column
        renderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0:
                        c.setBackground(lightBlue);
                        break;
                    case 1:
                        c.setBackground(lightBlue);
                        break;
                    case 2:
                        c.setBackground(lightBlue);
                        break;
                    case 3:
                        c.setBackground(lightBlue);
                        break;
                    case 4:
                        c.setBackground(lightBlue);
                        break;
                    default:
                        c.setBackground(table.getBackground()); // use the default background color for other columns
                        break;
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < electivesTable.getColumnCount(); i++) {
            electivesTable.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        for (int i = 0; i < recommendedTable.getColumnCount(); i++) {
            recommendedTable.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 0, 100));

        topPanel = new JPanel(new BorderLayout());
        topPanel.add(headerLabel, BorderLayout.NORTH);
        topPanel.add(guidePanel, BorderLayout.SOUTH);
        topPanel.setBackground(peach);

        contentPanel = new JPanel(new FlowLayout());
        contentPanel.add(electiveLabel);
        contentPanel.add(new JScrollPane(electivesTable));
        contentPanel.add(recommendedLabel);
        contentPanel.add(new JScrollPane(recommendedTable));
        contentPanel.setBackground(peach);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20));

        buttonPanel = new JPanel();
        buttonPanel.add(confirmButtonElective);
        buttonPanel.add(cancelButtonElective);
        buttonPanel.setBackground(navy);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 50, 5, 5));

        frameElective.add(topPanel, BorderLayout.NORTH);
        frameElective.add(contentPanel, BorderLayout.CENTER);
        frameElective.add(buttonPanel, BorderLayout.SOUTH);
        frameElective.setSize(980, 565);
        frameElective.setLocationRelativeTo(null);
        frameElective.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameElective.setVisible(true);
    } // end of editElectiveCourse method

    /**
     * Method to compute and show the average grade of a student.
     *
     * @throws IOException if an I/O error occurs.
     */
    /*
        Algorithm:
        1. Compute the average grade by iterating through the list of courses and adding up the marked grades.
        2. Create a JDialog to display the "Average Grade" interface.
        3. Set up labels for the header, result, grade, and error messages.
        4. Create a "Back" button with an action listener.
        5. Create panels for the average calculation, result, and back button.
        6. Check if there are grades available to calculate the average.
        7. If there are no grades, display an error message.
        8. If there are grades, display the average grade result.
        9. Add components to their respective panels.
        10. Add the panels to the JDialog.
        11. Set the JDialog size, location, close operation, and visibility.
     */
    public void showAverageGrade() throws IOException {
        // Computation of the average grade
        // Declare variables
        int average = 0, count = 0;
        double finalAverage = 0;

        // Adds all the marked grades to variable average and increments count
        for (Course course : list) {
            if (course.getGrades() != 0) {
                average += course.getGrades();
                count++;
            }
        }
        finalAverage = (double) average / count;

        averageDialog = new JDialog();
        averageDialog.setTitle("Average Grade");
        averageDialog.setModal(true);

        headerLabel = new JLabel("Average Grade", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        resultLabel = new JLabel("Results: ");
        resultLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        resultLabel.setOpaque(true);
        resultLabel.setBackground(lightBlue);
        resultLabel.setForeground(darkPurple);
        resultLabel.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 0));

        gradeLabel = new JLabel(String.format("%.2f", finalAverage));
        gradeLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
        gradeLabel.setOpaque(true);
        gradeLabel.setBackground(lightBlue);
        gradeLabel.setForeground(peach);
        gradeLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        errorLabel = new JLabel("<html><div style='text-align: center; padding: 5px;'> " +
                "No grades available to calculate the average grade.");
        errorLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        errorLabel.setOpaque(true);
        errorLabel.setBackground(lightBlue);
        errorLabel.setForeground(darkPurple);
        errorLabel.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));

        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            averageDialog.dispose();
        });
        JPanel averagePanel = new JPanel(new BorderLayout());
        resultPanel = new JPanel(new GridLayout(1, 1, 5, 5));
        resultPanel.add(resultLabel);
        resultPanel.add(gradeLabel);
        resultPanel.setBackground(lightBlue);
        resultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        backPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        if (count == 0) { // Shows a message statement
            averagePanel.add(headerLabel, BorderLayout.NORTH);
            averagePanel.add(errorLabel, BorderLayout.CENTER);
            averagePanel.add(backPanel, BorderLayout.SOUTH);
        } else { // Shows the average grade result
            // Calculates the average
            averagePanel.add(headerLabel, BorderLayout.NORTH);
            averagePanel.add(resultPanel, BorderLayout.CENTER);
            averagePanel.add(backPanel, BorderLayout.SOUTH);
        }

        averageDialog.getContentPane().add(averagePanel);
        averageDialog.setSize(455, 300);
        averageDialog.setLocationRelativeTo(null);
        averageDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        averageDialog.setVisible(true);
    } // end of showAverageGrade method


    public void showSortedGrades() {
        ArrayList<Course> sortList = new ArrayList<>(list);
        Collections.sort(sortList, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                if (c1.getGrades() < c2.getGrades()) {
                    return 1;
                } else if (c1.getGrades() > c2.getGrades()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        frameSortedGrades = new JFrame("Student's Sorted Grades");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        headerLabel = new JLabel("Student's Sorted Grades", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            frameSortedGrades.dispose();
        });

        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1080, 460));

        scrollPane = new JScrollPane(table);

        // Populate tableModel using streams
        sortList.stream().map(course -> {
            String remarks;
            int grades = course.getGrades();

            if (grades == 0) {
                remarks = "Not yet graded";
            } else if (grades < 75) {
                remarks = "Failed";
            } else {
                remarks = "Passed";
            }

            return new Object[]{
                    course.getYear(),
                    "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                    course.getCourseNumber(),
                    course.getDescTitle(),
                    course.getUnits(),
                    grades == 0 ? "Not yet graded" : grades,
                    remarks
            };
        }).forEach(tableModel::addRow);

        // Define a custom header renderer that sets the background color of the column names
        header = table.getTableHeader();
        ((JTableHeader) header).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });

        renderer = new DefaultTableCellRenderer() {

            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0:
                        c.setBackground(lightBlue);
                        break;
                    case 1:
                        c.setBackground(lightBlue);
                        break;
                    case 2:
                        c.setBackground(lightBlue);
                        break;
                    case 3:
                        c.setBackground(lightBlue);
                        break;
                    case 4:
                        c.setBackground(lightBlue);
                        break;
                    case 5:
                        c.setBackground(lightBlue);
                        break;
                    default:
                        c.setBackground(table.getBackground()); // use the default background color for other columns
                        break;
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        table.getColumnModel().getColumn(0).setPreferredWidth(3);
        table.getColumnModel().getColumn(1).setPreferredWidth(5);
        table.getColumnModel().getColumn(2).setPreferredWidth(65);
        table.getColumnModel().getColumn(3).setPreferredWidth(540);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(15);

        tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        frameSortedGrades.add(headerLabel, BorderLayout.NORTH);
        frameSortedGrades.add(tablePanel, BorderLayout.CENTER);
        frameSortedGrades.add(backPanel, BorderLayout.SOUTH);
        frameSortedGrades.setIconImage(icon.getImage());
        frameSortedGrades.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameSortedGrades.setSize(1190, 650);
        frameSortedGrades.setVisible(true);
        frameSortedGrades.setLocationRelativeTo(null);
    } // end of showSortedGrades method


    public void showFailedCourses(){
        frameFailedCourses = new JFrame("Show Failed Courses");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades", "Remarks"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        headerLabel = new JLabel("Student's Failed Courses", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "If there appears to be no contents inside the table, then you have NOT " +
                "failed any courses. Congratulations!</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            frameFailedCourses.dispose();
        });


        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1080, 460));

        scrollPane = new JScrollPane(table);

        for (Course course : list) {
            if (course.getGrades() < 75 && course.getGrades() != 0) {
                String remarks = "Failed";

                Object[] rowData = {
                        course.getYear(),
                        "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                        course.getCourseNumber(),
                        course.getDescTitle(),
                        course.getUnits(),
                        course.getGrades(),
                        remarks
                };
                tableModel.addRow(rowData);
            }
        }

        // Define a custom header renderer that sets the background color of the column names

        header = table.getTableHeader();
        ((JTableHeader) header).setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                c.setBackground(navy);
                c.setForeground(purple); // set the text color of the column names to purple
                c.setFont(new Font("Helvetica", Font.BOLD, 15));
                return c;
            }
        });
        renderer = new DefaultTableCellRenderer() {

            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);

                switch (column) {
                    case 0:
                        c.setBackground(lightBlue);
                        break;
                    case 1:
                        c.setBackground(lightBlue);
                        break;
                    case 2:
                        c.setBackground(lightBlue);
                        break;
                    case 3:
                        c.setBackground(lightBlue);
                        break;
                    case 4:
                        c.setBackground(lightBlue);
                        break;
                    case 5:
                        c.setBackground(lightBlue);
                        break;
                    case 6:
                        c.setBackground(lightBlue);
                        break;
                    default:
                        c.setBackground(table.getBackground()); // use the default background color for other columns
                        break;
                }

                return c;
            }
        };

        // Set the custom cell renderer to all columns of the table
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(3);
        table.getColumnModel().getColumn(1).setPreferredWidth(5);
        table.getColumnModel().getColumn(2).setPreferredWidth(65);
        table.getColumnModel().getColumn(3).setPreferredWidth(540);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(20);
        table.getColumnModel().getColumn(6).setPreferredWidth(20);
        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(5, 200, 5, 200));


        tablePanel = new JPanel();
        tablePanel.add(guidePanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        frameFailedCourses.add(headerLabel, BorderLayout.NORTH);
        frameFailedCourses.add(tablePanel, BorderLayout.CENTER);
        frameFailedCourses.add(backPanel, BorderLayout.SOUTH);
        frameFailedCourses.setIconImage(icon.getImage());
        frameFailedCourses.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameFailedCourses.setSize(1190, 700);
        frameFailedCourses.setVisible(true);
        frameFailedCourses.setLocationRelativeTo(null);
    } // end of showFailedCourses method

    private void buttonDesign(RoundButton button) {
        button.setFont(new Font("Helvetica", Font.BOLD, 13));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(navy, 3, false), // Set border color, thickness, and roundness
                BorderFactory.createEmptyBorder(8, 18, 8, 18)));
        button.setBackground(pink);
        button.setForeground(navy);
        button.addMouseListener(new MouseAdapter() {

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


    public void populateArrayList(ArrayList<Course> list) throws IOException {
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


    private void saveFile() throws IOException {
        PrintWriter pW = new PrintWriter(new FileOutputStream("" +
                "AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/BSCSCurriculumData1.csv"));


        pW.println("year,\"term(1=first term, 2=second term, 3=short term)\",course number,descriptive title,units,Grades");
        for(Course course : list){
            pW.println(course.toString());
        }

        pW.close();
        pW.flush();
    } // end of saveFile method
    public class ButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //---------okButtonLogin------------
            if (e.getSource() == okButtonLogin) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    // Create a new JDialog for the warning message
                    warningDialog = new JDialog(loginDialog, "Warning", true);
                    warningDialog.setLayout(new BorderLayout());
                    warningDialog.setBackground(peach);

                    // Add the warning message label to the dialog
                    warningLabel = new JLabel("Please enter both username and password!",
                            SwingConstants.CENTER);
                    warningLabel.setFont(new Font("Helvetica", Font.BOLD, 17));
                    warningLabel.setForeground(darkPurple);
                    warningLabel.setBackground(peach);
                    warningLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                    // Sets the specific formats for the warning dialog
                    warningDialog.add(warningLabel, BorderLayout.CENTER);
                    warningDialog.pack();
                    warningDialog.setLocationRelativeTo(loginDialog);
                    warningDialog.setSize(400, 120);
                    ;
                    warningDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    warningDialog.setVisible(true);
                } else {
                    loginDialog.setVisible(false);
                }
                //----------cancelButtonLogin------------
            } else if (e.getSource() == cancelButtonLogin) {
                showExit();
                System.exit(0);
                //----------nextButton------------
            } else if (e.getSource() == nextButton) {
                introDialog.dispose();
                //----------submitButton------------
            } else if (e.getSource() == submitButton) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    try {
                        int grade = Integer.parseInt(gradeField.getText());

                        if (grade == 0 || grade >= 65 && grade <= 99) {
                            Course selectedCourse = unfinishedCourses.get(selectedRow);
                            selectedCourse.setGrades(grade);
                            tableModel.removeRow(selectedRow);
                            unfinishedCourses.remove(selectedRow);
                            gradeField.setText("");
                        } else {
                            JOptionPane.showMessageDialog(frameEnterGrades, "Enter a grade from 65 to 99.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frameEnterGrades, "Invalid grade. Enter a number from " +
                                "65 to 99.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frameEnterGrades, "Please select a course from the table.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                //---------saveButton------------
            } else if (e.getSource() == saveButton) {
                try {
                    saveFile();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                //----------addCourseButton------------
            } else if (e.getSource() == addCourseButton) {
                JDialog addCourseDialog = new JDialog();
                addCourseDialog.setTitle("Add Course");

                JTextField yearField = new JTextField(20);
                JTextField termField = new JTextField(20);
                JTextField courseNumberField = new JTextField(20);
                JTextField descTitleField = new JTextField(20);
                JTextField unitsField = new JTextField(20);
                JTextField gradeField = new JTextField(20);

               RoundButton okButton = new RoundButton("Ok");
                buttonDesign(okButton);
                okButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String year = String.valueOf(Integer.parseInt(yearField.getText()));
                            String term = String.valueOf(Integer.parseInt(termField.getText()));
                            String courseNumber = courseNumberField.getText();
                            String descTitle = descTitleField.getText();
                            int units = Integer.parseInt(unitsField.getText());
                            int grade = gradeField.getText().isEmpty() ? 0 : Integer.parseInt(gradeField.getText());

                            Course newCourse = new Course(year, term, courseNumber, descTitle, units, grade);
                            list.add(newCourse);
                            if (grade == 0 || grade > 64) {
                                unfinishedCourses.add(newCourse);
                                tableModel.addRow(new Object[]{++index[0], newCourse.getCourseNumber(),
                                        newCourse.getDescTitle()});
                            }
                            addCourseDialog.dispose();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frameFinishedCourse, "Invalid input. Please make sure all " +
                                    "fields are filled correctly.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                cancelButton = new RoundButton("Cancel");
                buttonDesign(cancelButton);
                cancelButton.addActionListener(f -> {
                    addCourseDialog.dispose();
                });

                JPanel addCoursePanel = new JPanel(new GridLayout(6, 2, 5, 5));
                addCoursePanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
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
                addCoursePanel.setBackground(peach);

                buttonPanel = new JPanel(new GridLayout(1, 2, 5, 5));
                buttonPanel.add(okButton);
                buttonPanel.add(cancelButton);
                buttonPanel.setBackground(peach);
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 100));

                addCourseDialog.add(addCoursePanel, BorderLayout.NORTH);
                addCourseDialog.add(buttonPanel, BorderLayout.CENTER);
                addCourseDialog.setIconImage(icon.getImage());
                addCourseDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                addCourseDialog.setSize(500, 250);
                addCourseDialog.setVisible(true);
                addCourseDialog.setLocationRelativeTo(null);
                //----------updateGradeButton------------
            } else if (e.getSource() == updateGradeButton) {
                JDialog updateGradeDialog = new JDialog(frameCreditedCourse, "Update Grade", true);
                updateGradeDialog.setLayout(new BorderLayout());

                JLabel courseNumberLabel = new JLabel("Enter the course number:");
                JTextField courseNumberField = new JTextField();
                JLabel gradeLabel = new JLabel("Enter the grade:");
                JTextField gradeField = new JTextField();

                RoundButton okButton = new RoundButton("OK");
                buttonDesign(okButton);
                okButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String courseNumber = courseNumberField.getText();
                        Course courseToUpdate = null;
                        int rowIndex = -1;
                        for (int i = 0; i < unfinishedCourses.size(); i++) {
                            if (unfinishedCourses.get(i).getCourseNumber().equalsIgnoreCase(courseNumber)) {
                                courseToUpdate = unfinishedCourses.get(i);
                                rowIndex = i;
                                break;
                            }
                        }
                        if (courseToUpdate != null) {
                            try {
                                int grade = Integer.parseInt(gradeField.getText());
                                if (grade == 0 || grade >= 65 && grade <= 99) {
                                    courseToUpdate.setGrades(grade);
                                    tableModel.removeRow(rowIndex);
                                    unfinishedCourses.remove(rowIndex);

                                    Course selectedCourse = unfinishedCourses.get(rowIndex);
                                    selectedCourse.setGrades(grade);
                                    tableModel.removeRow(rowIndex);
                                    unfinishedCourses.remove(courseToUpdate);
                                    gradeField.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(frameCreditedCourse, "Enter a grade from 65 to 99.",
                                            "Error", JOptionPane.ERROR_MESSAGE);
                                    return; // Don't close the main updateGradeDialog
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(updateGradeDialog, "Invalid grade. Please enter a number.",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                return; // Don't close the updateGradeDialog
                            }
                        } else {
                            JOptionPane.showMessageDialog(updateGradeDialog, "Course not found. Please make" +
                                            " sure you entered the correct course number.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            return; // Don't close the updateGradeDialog
                        }
                        updateGradeDialog.dispose(); // Close the updateGradeDialog
                    }
                });

                inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
                inputPanel.add(courseNumberLabel);
                inputPanel.add(courseNumberField);
                inputPanel.add(gradeLabel);
                inputPanel.add(gradeField);
                inputPanel.setBackground(peach);
                inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                buttonPanel = new JPanel();
                buttonPanel.add(okButton);
                buttonPanel.setBackground(navy);
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(3, 30, 3, 30));

                updateGradeDialog.add(inputPanel, BorderLayout.CENTER);
                updateGradeDialog.add(buttonPanel, BorderLayout.SOUTH);
                updateGradeDialog.setSize(400, 210);
                updateGradeDialog.setLocationRelativeTo(frameCreditedCourse);
                updateGradeDialog.setVisible(true);
                //----------confirmButtonElective------------
            }else if(e.getSource()== confirmButtonElective){
                int electiveRow = electivesTable.getSelectedRow();
                int recommendedRow = recommendedTable.getSelectedRow();

                if (electiveRow != -1 && recommendedRow != -1) {
                    Course selectedElective = list.get(68 + electiveRow); // Assuming the index starts from 68 as in your previous code
                    Course selectedRecommended = listRecommended.get(recommendedRow);

                    // Update the selected elective course with the recommended elective course
                    selectedElective.setCourseNumber(selectedRecommended.getCourseNumber());
                    selectedElective.setDescTitle(selectedRecommended.getDescTitle());
                    selectedElective.setUnits(selectedRecommended.getUnits());
                    selectedElective.setGrades(0);

                    JOptionPane.showMessageDialog(frameElective, "Course edited successfully.");
                    try {
                        saveFile();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(frameElective, "Please select a course from both tables.");
                }
            }

        }
    } // end of ButtonAction class
} // end of CurriculumMonitoringApplication class