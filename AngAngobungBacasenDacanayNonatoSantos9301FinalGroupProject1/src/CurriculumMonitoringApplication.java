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

/**
 * The CurriculumMonitoringApplication Class is the main class that provides options to be
 * used by a Bachelor of Science of Computer Science (BSCS) student of Saint Louis University
 * in monitoring of the student's progress with respect to the curriculum that they are pursuing.
 */
public class CurriculumMonitoringApplication {
    //Declare instances for CurriculumMonitoringApplication
    //Button Action
    /**
     * Holds an action to be performed when a button is clicked.
     */
    ButtonAction buttonAction = new ButtonAction();

    //Panels
    /**
     * Holds a panel used as a background container for other components.
     */
    JPanel backPanel;

    /**
     * Holds a panel used to display an introduction or welcome message.
     */
    JPanel introPanel;

    /**
     * Holds a panel used to display a description or information.
     */
    JPanel descriptionPanel;

    /**
     * Holds a panel used for login functionality or user authentication.
     */
    JPanel loginPanel;

    /**
     * Holds a panel used to contain buttons or button-related components.
     */
    JPanel buttonPanel;

    /**
     * Holds a panel used to display a guide or instructions.
     */
    JPanel guidePanel;

    /**
     * Holds a panel used to display a table or tabular data.
     */
    JPanel tablePanel;

    /**
     * Holds a panel used to handle application exit functionality.
     */
    JPanel exitPanel;

    /**
     * Holds a panel used for search functionality or search-related components.
     */
    JPanel searchPanel;

    /**
     * Holds a panel used as the top section or header of a user interface.
     */
    JPanel topPanel;

    /**
     * Holds a panel used as a content container for other components.
     */
    JPanel contentPanel;

    /**
     * Holds a panel used to display search results or search-related information.
     */
    JPanel resultPanel;

    /**
     * Holds a panel used for user input or input-related components.
     */
    JPanel inputPanel;

    /**
     * Holds a panel used for quitting or application termination functionality.
     */
    JPanel quitPanel;

    /**
     * Holds a panel used for making choices or presenting options to the user.
     */
    JPanel choicePanel;

    //Buttons
    /**
     * Holds a round button used for canceling a login action.
     */
    RoundButton cancelButtonLogin;

    /**
     * Holds a round button used for confirming a login action.
     */
    RoundButton okButtonLogin;

    /**
     * Holds a round button used for canceling an elective action.
     */
    RoundButton cancelButtonElective;

    /**
     * Holds a round button used for confirming an elective action.
     */
    RoundButton confirmButtonElective;

    /**
     * Holds a round button used for saving data or performing a save action.
     */
    RoundButton saveButton;

    /**
     * Holds a round button used for submitting data or performing a submit action.
     */
    RoundButton submitButton;

    /**
     * Holds a round button used for adding a course or performing an add course action.
     */
    RoundButton addCourseButton;

    /**
     * Holds a round button used for updating a grade or performing an update grade action.
     */
    RoundButton updateGradeButton;

    /**
     * Holds a round button used for canceling an action.
     */
    RoundButton cancelButton;

    //Labels
    /**
     * Holds a label used for displaying an exit message or icon.
     */
    JLabel exitLabel;

    /**
     * Holds a label used for displaying a header or title.
     */
    JLabel headerLabel;

    /**
     * Holds a label used for displaying a username.
     */
    JLabel usernameLabel;

    /**
     * Holds a label used for displaying a password.
     */
    JLabel passwordLabel;

    /**
     * Holds a label used for displaying a warning message.
     */
    JLabel warningLabel;

    /**
     * Holds a label used for displaying a description.
     */
    JLabel descriptionLabel;

    /**
     * Holds a label used for displaying a greeting message.
     */
    JLabel greetLabel;

    /**
     * Holds a label used for displaying a guide or instructions.
     */
    JLabel guideLabel;

    /**
     * Holds a label used for displaying an elective label or information.
     */
    JLabel electiveLabel;

    /**
     * Holds a label used for displaying a result or outcome.
     */
    JLabel resultLabel;

    /**
     * Holds a label used for displaying a grade.
     */
    JLabel gradeLabel;

    /**
     * Holds a label used for displaying an error message.
     */
    JLabel errorLabel;

    /**
     * Holds a label used for displaying a recommended option or suggestion.
     */
    JLabel recommendedLabel;

    /**
     * Holds a label used for displaying a search label or text.
     */
    JLabel searchLabel;

    //Tables
    /**
     * Holds a table used for displaying data.
     */
    JTable table;

    /**
     * Holds a table used for displaying electives data.
     */
    JTable electivesTable;

    /**
     * Holds a table used for displaying recommended data.
     */
    JTable recommendedTable;

    /**
     * Holds a scroll pane used for adding scroll functionality to a component.
     */
    JScrollPane scrollPane;

    /**
     * Holds a default table cell renderer for customizing the appearance of table cells.
     */
    DefaultTableCellRenderer renderer;

    /**
     * Holds the header of a table.
     */
    JTableHeader header;

    /**
     * Holds the model for the main table.
     */
    DefaultTableModel tableModel;

    /**
     * Holds the model for the electives table.
     */
    DefaultTableModel electivesModel;

    /**
     * Holds the model for the recommended table.
     */
    DefaultTableModel recommendedModel;

    //Dialogs
    /**
     * Holds a dialog box used for displaying an exit prompt.
     */
    JDialog exitDialog;

    /**
     * Holds a dialog box used for displaying a login form.
     */
    JDialog loginDialog;

    /**
     * Holds a dialog box used for displaying a warning message.
     */
    JDialog warningDialog;

    /**
     * Holds a dialog box used for displaying an introduction message.
     */
    JDialog introDialog;

    /**
     * Holds a dialog box used for displaying an average calculation result.
     */
    JDialog averageDialog;

    //TextFields
    /**
     * Holds a text field for entering a username.
     */
    JTextField usernameField;

    /**
     * Holds a password field for entering a password.
     */
    JPasswordField passwordField;

    /**
     * Holds a text field for searching.
     */
    JTextField searchBar;

    /**
     * Holds a text field for entering a grade.
     */
    JTextField gradeField;

    //Frames
    /**
     * Holds the main frame for displaying choices.
     */
    JFrame choicesFrame;

    /**
     * Holds the frame for displaying failed courses.
     */
    JFrame frameFailedCourses;

    /**
     * Holds the frame for displaying sorted grades.
     */
    JFrame frameSortedGrades;

    /**
     * Holds the frame for elective courses.
     */
    JFrame frameElective;

    /**
     * Holds the frame for entering grades.
     */
    JFrame frameEnterGrades;

    /**
     * Holds the frame for finished courses.
     */
    JFrame frameFinishedCourse;

    /**
     * Holds the frame for credited courses.
     */
    JFrame frameCreditedCourse;

    /**
     * Holds the frame for displaying courses with grades.
     */
    JFrame frameCoursesWithGrades;

    //ArrayLists
    /**
     * Holds a list of unfinished courses.
     */
    ArrayList<Course> unfinishedCourses;

    /**
     * Holds a list of recommended courses.
     */
    ArrayList<Course> listRecommended;

    /**
     * Holds an array of indices.
     */
    int[] index;

    /**
     * Declare an ImageIcon object with the specified image file path.
     */
    ImageIcon icon = new ImageIcon("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/" +
            "res/icon1.png");

    //Declare static variables for CurriculumMonitoringApplication
    /**
     * Holds a custom round button used for navigating to next windows.
     */
    private static RoundButton nextButton;

    /**
     * Holds a custom round button used for navigating to last windows.
     */
    private static RoundButton backButton;

    //Declare the static variables for CurriculumMonitoringApplication
    /**
     * Declare "keyboard" as a static instance of the Scanner class.
     */
    static Scanner keyboard = new Scanner(System.in);

    /**
     * Declare "inputStream" as a static instance of the BufferedReader class.
     */
    static BufferedReader inputStream;

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

    /**
     * Method to run the program by executing the necessary steps in sequence. <br>
     *
     * @throws IOException if an error occurs while reading the input file
     */
    /*
        Algorithm:
        1. Initialize the variable name as null.
        2. Call the showLoginDialog method to display a login dialog and assign
           the entered name to the name variable.
        3. Convert the name to uppercase using the toUpperCase method.
        4. Call the showIntroduction method to display an introduction message, passing the name as an argument.
        5. Invoke the populateArrayList method to populate the list ArrayList by reading data from an input file.
        6. Call the listOfChoices method to display a list of choices for the user.
     */
    public void run() throws IOException {
        String name = null;
        name= showLoginDialog().toUpperCase();
        showIntroduction(name);
        populateArrayList(list); //invokes populateArrayList method
        listOfChoices();
    } // end of run method

    /**
     * Method that shows the showLoginDialog or the login window containing the
     * user interface where the user would be asked to provide input for the username and password. <br>
     *
     * @return the username of the student as a String
     */
        /*
        Algorithm:
        1. Create a login dialog.
        2. Prompt the user to enter a username and password.
        3. If either field is empty, show a warning and ask for both fields again.
        4. If both fields are filled, close the login dialog.
        5. Return the entered username.
     */
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

    /**
     * Method to display the program closing statement.
     */
    /*
       Algorithm:
       1. Display the program closing statement in a new pane.
       2. Dispose the dialog box when closed by the user
       3. Terminate the program.
     */
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

    /**
     * Method to display an introduction window that shows
     * information about the purpose of the program.
     */
    /*
       Algorithm:
       1. Display an introduction statement of the program in a new window.
       2. Dispose the dialog box once the "Next" button is clicked or when closed by the user
     */
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

    /**
     * Method to show the list of actions for the user to choose from.
     */
    /*
        Algorithm:
        1. Create a new JFrame named choicesFrame and set its title.
        2. Create a JLabel named headerLabel with the text "MAIN MENU" and customize its appearance.
        3. Create a JLabel named guideLabel with an instructional message and customize its appearance.
        4. Create several JButton objects for different options and customize their appearance.
        5. Add action listeners to the buttons to perform specific tasks when clicked.
        6. Create panels to organize the labels and buttons.
        7. Configure the layout and add the components to their respective panels.
        8. Configure the main choicesFrame by adding the panels, setting its size and position,
           and defining its close behavior.
        9. Make the choicesFrame visible to the user.
     */
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

    /**
     * Method to display the subjects with grades and remarks for each term
     * where it will print "Failed", if grade is less than 75.
     * And, else it will print "Passed".
     */
    /*
        Algorithm:
         1.	Create a new JFrame with the title "Courses with Grades and Remarks for Each Term".
         2.	Define an array of column names, including "Year", "Term", "Course number", "Descriptive
            Title", "Units", "Grades", and "Remarks".
         3.	Create a new DefaultTableModel with the column names and initial row count of 0.
         4.	Call the updateTableModel method to populate the tableModel with data from a list of Course objects.
         5.	Create a new JLabel with the text "Courses with Grades and Remarks for Each Term",
            centered, and with a font size of 25.
         6.	Set the background of the headerLabel to navy and the foreground to pink, and create
            an empty border with 10 pixels on all sides.
         7.	Use streams to populate the tableModel with data from the list of Course objects.
            For each Course object, create an array of values for the row in the tableModel,
            including the year, term, course number, descriptive title, units, grades, and remarks.
         8.	Create a new JTable with the tableModel.
         9. Set the preferred scrollable viewport size of the table to 1200 pixels wide and 510 pixels tall.
         10. Create a new JScrollPane with the table as its view.
         11. Create a new JLabel with the text "Search: ".
         12. Create a new JTextField with a width of 15 characters.
         13. Add a DocumentListener to the searchBar that calls a filterTable method every time the
             text in the searchBar changes.
         14. In the filterTable method, get the text from the searchBar and convert it to lowercase.
             Create a new ArrayList to hold the filtered Course objects. For each Course object in
             the original list, check if the course number or descriptive title contains the searchText
             (in lowercase). If it does, add the Course object to the filteredList. Finally, call
             the updateTableModel method with the filteredList to update the tableModel.
         15. Create a new JTableHeader from the table, and set its default renderer to a custom
             DefaultTableCellRenderer that sets the background color of the column names to navy
             and the text color to purple with a font size of 15.
         16. Create a custom DefaultTableCellRenderer that sets the background color of the cells in the
             second column to light blue, and use it to set the renderer for all columns in the table.
         17. Set the preferred width of each column in the table.
         18. Create a new JPanel for the searchLabel and searchBar, and set its background color to
             peach with an empty border of 10 pixels on the top, and add the searchLabel and searchBar to it.
         19. Create a new JPanel for the scrollPane, set its background color to peach with an empty
             border of 5 pixels on the top and 10 pixels on the bottom, and add the scrollPane to it.
         20. Add the headerLabel to the north region of the JFrame, the searchPanel to the center region,
             and the tablePanel to the south region.
         21. Set the icon of the JFrame to an ImageIcon object.
         22. Display the JFrame.
     */
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

    /**
     * The updateTableModel method takes in an ArrayList of Course objects and a
     * DefaultTableModel object as parameters. It clears the existing data in the
     * table model and iterates through the Course objects, generating a row of data
     * for each Course with information such as the course year, term, number, title,
     * units, grades and remarks. Finally, it adds the row to the table model. <br>
     *
     * @param courses    the list of Course objects to populate the table with
     * @param tableModel the DefaultTableModel to update with the course data
     */
    /*
        Algorithm:
        1.	Receive an ArrayList of Course objects and a DefaultTableModel object.
        2.	Clear the current data from the table model by setting the row count to 0
            using tableModel.setRowCount(0).
        3.	Loop through each Course object in the ArrayList using a for-each loop:
            a. Get the number of grades for the course using course.getGrades().
            b. Set the remarks variable based on the grades using the following conditions:
                i. If grades is 0, set remarks to "Not yet graded".
                ii. If grades is less than 75, set remarks to "Failed".
                iii. Otherwise, set remarks to "Passed".
            c. Create an Object array called rowData with the following values:
                i. Year of the course using course.getYear().
                ii. Term of the course, mapping "3" to "Short term" using a ternary operator.
                iii. Course number using course.getCourseNumber().
                iv. Course description and title using course.getDescTitle().
                v. Course units using course.getUnits().
                vi. Grades as a String, mapping 0 to "Not yet graded" using a ternary operator.
                vii. Remarks.
            d. Add the rowData array as a new row to the table model using tableModel.addRow(rowData).
        4.	End the loop.
        5.	End the method.
     */
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

    /**
     * Method to lists all the unfinished course and ask
     * user to choose the finished course, then the program
     * will ask to enter the grade for the course.
     */
    /*
        Algorithm:
        1. The enterGrades() method creates a JFrame and adds various Swing components to it,
           including a table, a search bar, and input fields for grades.
        2. The table displays information about each course, including its number and title.
           The table is populated using a DefaultTableModel and updated dynamically based on the user's search terms.
        3. The search bar allows the user to filter the table by course number or title.
           When the user types into the search bar, the table is updated to
           show only the rows that match the search terms.
        4. The user can enter a grade for a selected course by typing the grade into an input field
           and clicking a "Submit" button.
           a. If the grade is valid (between 70 and 99), the grade is saved and the course
              is removed from the table of unfinished courses.
           b. If the grade is invalid, an error message is displayed.
        5. The user can save the grades to a file by clicking a "Save" button. The grades are saved in a CSV format.
        6. The user can exit the interface by clicking a "Back" button.
     */
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
            if (course.getGrades() == 0 || course.getGrades() > 74) {
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

    /**
     * Private method that updates a graphical user interface (GUI) table of courses with
     * information from two ArrayLists of Course objects. The method takes four parameters: an ArrayList of
     * incomplete courses (unfinSubs), an ArrayList of all courses (courses), a DefaultTableModel object (tableModel)
     * that represents the table on the GUI, and a HashMap (originalIndices) that maps the original index of a
     * course in the unfinSubs ArrayList to its new index in the tableModel.<br>
     *
     * @param unfinSubs       the original list of unfinished courses
     * @param courses         the filtered list of courses to populate the table with
     * @param tableModel      the DefaultTableModel to update with the course data
     * @param originalIndices a HashMap to store the mapping between the row indices
     *                        in the table and the original indices
     */
    /*
        Algorithm:
        1. Declare a method named updateCourseTableModel with parameters:
           - unfinSubs: an ArrayList of Course objects representing unfinished courses
           - courses: an ArrayList of Course objects representing all courses
           - tableModel: a DefaultTableModel object representing the table model for the GUI table
           - originalIndices: a HashMap object that maps the original index of a course to its new index in the table model
        2. Clear the table model by calling the setRowCount method with a value of 0.
        3. Initialize a variable named index to 0.
        4. For each Course object course in the courses ArrayList:
           a. Find the original index of the course in the unfinSubs ArrayList by calling the indexOf method on the
              unfinSubs ArrayList and passing in the current course object. Store the result in a variable named originalIndex.
           b. Create an Object array named rowData with the following values:
              - ++index: the current index, incremented by 1
              - course.getCourseNumber(): the course number of the current course object
              - course.getDescTitle(): the description title of the current course object
           c. Add the rowData array to the table model by calling the addRow method on the tableModel object and passing in the rowData array.
           d. Map the original index of the current course object to its new index in the table model by calling the put method on the originalIndices HashMap object and passing in two arguments:
              - index - 1: the current index, decremented by 1 (since the index variable was already incremented)
              - originalIndex: the original index of the current course object in the unfinSubs ArrayList.
       5. End the for loop.
       6. End the method.
   */
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

    /**
     * This method contains the addFinishedCourse that displays interface of the finished courses, and it would ask the
     * user to provide the input such as the number, Course number, and Descriptive Title
     */
    /*
        Algorithm:
        1. The method creates a JFrame object for the dialog window and set the title to "Add Finished Course"
        2. Then it creates an array of column names and a DefaultTableModel object for displaying a table of available
           courses in the dialog window.
        3. Create two ArrayList objects to store the list of available courses and the index of each course in the table
        4. Iterate through the list of courses and add the ones that have not been graded or have a grade higher than
           74 to the ArrayList of available courses.
        5. Add each available course to the table by creating an Object array with its course number, descriptive title,
           and index in the table, and adding the array to the table model.
        6. Create a JTable object with the table model and set its preferred size.
        7. Create a JScrollPane object with the table and add it to the JFrame object.
        8. Create a save button with a round design, add an ActionListener to it that calls a saveFile() method, and
           add the button to the JFrame object.
        9. Create an "Add Course" button with a round design, add an ActionListener to it that creates a JDialog object
           for entering data about a new completed course, and add the button to the JFrame object.
        10. In the ActionListener for the "Add Course" button, create a JDialog object with text fields for entering
            data about a new course, as well as "Ok" and "Cancel" buttons for confirming or canceling the entry.
        11. Add ActionListeners to the "Ok" and "Cancel" buttons that either create a new Course object and add it to
            the list of courses, or cancel the dialog and return to the table of available courses.
        12. Display the dialog window with the table and buttons.
     */
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

    /**
     * Method that creates a graphical user interface (GUI) for adding credited courses to a list.
     * This includes a table that displays the existing unfinished courses, with columns for course
     * number and title, and a button that opens a new dialog for updating the grade of a selected course.
     * It also has buttons for saving the file and returning to the previous screen.
     */
    /*
        Algorithm:
        1. Create a JFrame object called "frame" with the title "Add Credited Course".
        2. Create a String array called "columnNames" with three elements: "#",
           "Course number", and "Descriptive Title".
        3. Create a DefaultTableModel object called "tableModel" with "columnNames" and 0 rows.
        4. Create a JLabel object called "headerLabel" with the text "Add Credited Course"
           centered and a font of "Helvetica", bold, and size 25. Set its background color
           to navy, foreground color to pink, and border to empty.
        5. Create a JLabel object called "guideLabel" with instructions on how to use the program.
           Set its background color to purple, foreground color to dark gray, font to "Helvetica",
           italic, and size 12. Set its border to empty.
        6. Create an ArrayList of Course objects called "unfinishedCourses".
        7. Create an ArrayList of integers called "limit".
        8. Create an int array called "index" with a single element set to 0.
        9. Iterate over each course in "list". If the course grade is 0 or greater than 74,
           add it to the "unfinishedCourses" list.
        10. Iterate over each course in "unfinishedCourses" and create an Object array called
            "rowData" with the course number, descriptive title, and an incrementing index as
            elements. Add the "rowData" to "tableModel".
        11. Create a JTable object called "table" with "tableModel" and set its font to "Helvetica",
            bold, and size 12. Set its preferred size to 900x235.
        12. Create a JScrollPane object called "scrollPane" with "table" and add it to "frame"
            using BorderLayout.CENTER.
        13. Create a RoundButton object called "saveButton" with the text "Save" and add an action
            listener to it that calls the "saveFile()" method. Set its design using a custom "buttonDesign()" method.
        14. Create a RoundButton object called "updateGradeButton" with the text "Update Grade" and
            add an action listener to it that creates a JDialog window called "updateGradeDialog".
            The dialog window should have two JLabels ("courseNumberLabel" and "gradeLabel"), two
            JTextFields ("courseNumberField" and "gradeField"), and a RoundButton called "okButton".
            The okButton should have an action listener that gets the course number entered by the user
            and searches for the corresponding course in "unfinishedCourses".
            If found, it should get the grade entered by the user and set it as the grade for the course.
            It should then remove the course from the "unfinishedCourses" list and "tableModel".
            If the grade entered is not between 70 and 99, an error message should be displayed.
            If the grade entered is not a number, an error message should be displayed.
            If the course number entered is not found, an error message should be displayed.
            The dialog window should close after the user clicks the okButton.
            Set the design of the "updateGradeButton" using a custom "buttonDesign()" method.
        15. Create a RoundButton object called "backButton" with the text "Back" and add an action
            listener to it that disposes of the "frame". Set the design of the "backButton" using a
            custom "buttonDesign()" method.
        16. Add "saveButton", "updateGradeButton", and "backButton" to "frame" using BorderLayout.SOUTH.
        17. Set the frame's icon, close operation, size, visibility, and location.
     */
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

    /**
     * Method to allow the user to choose an elective course for them to edit.
     */
    /*
        Algorithm:
        1. Create a JFrame to display the "Edit Elective Course" interface.
        2. Set up labels for the header, guide, "Elective Courses Table," and "Recommended Courses Table."
        3. Create a list of recommended courses.
        4. Create tables for the elective and recommended courses using DefaultTableModel and JTable.
        5. Populate the elective table with data from the main list.
        6. Populate the recommended table with the recommended courses.
        7. Create "Confirm" and "Cancel" buttons with action listeners.
        8. Customize the appearance of the table headers and cell backgrounds.
        9. Create panels for the guide, top section, content, and button area.
        10. Add components to their respective panels.
        11. Add the panels to the JFrame.
        12. Set the JFrame size, location, close operation, and visibility.
     */
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

    /**
     * The showSortedGrades method displays the list of courses in the list variable
     * in a sorted order based on the grades. The method does the following steps:
     */
    /*
        Algorithm:
        1. Create a new ArrayList called sortList and copy the contents of list into it.
        2. Sort sortList based on the course number using the Collections.sort() method.
        3. Print the table headers for year, term, course number, descriptive title, units, and grades.
        4. Iterate over the sorted sortList and print out the course information in a formatted table.
        5. For each course, print the year, term, course number, descriptive title, units, and grades.
           If the course has no grade, print "Not yet graded" instead of the grade.
     */
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

    /**
     * Method to display the courses that have grades lower than 75.
     */
    /*
        Algorithm:
        1. This method sets a new JFrame with the title "Show Failed Courses"
        2. Define an array of column names for the table
        3. Create a new DefaultTableModel object with the column names
        4. Create a new JLabel with the text "Student's Failed Courses" and set its font,
           background color, foreground color, and border
        5. Create a new JLabel with instructions for the user and set its font,
           background color, foreground color, and border
        6. Create a new JTable with the DefaultTableModel object
        7. Set the preferred scrollable viewport size of the JTable
        8. Create a new JScrollPane with the JTable as its argument
        9. It then has a loop through each Course object in the list, if the course's
           grade is less than 75 and not equal to 0, create a new Object array with the
           course's year, term, course number, descriptive title, units, grade,
           and remarks (which is set to "Failed"), and add it to the DefaultTableModel
        10. Define a custom header renderer for the JTable that sets the background color,
            foreground color, and font of the column names
        11. Define a custom cell renderer for the JTable that sets the background color of
            each cell based on its column index
        12. Set the custom cell renderer to each column of the JTable
        13. Set the preferred width of each column in the JTable
        14. Create a new JPanel for the instructions JLabel and set its layout and border
        15. Create a new JPanel for the JScrollPane and add the JScrollPane to it,
            and set its background color and border.
        16. Set the frame's icon, close operation, size, visibility, and location.
     */
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

    /**
     * Method which takes a JButton object as a parameter and sets its properties such
     * as font, border, and background color. It also adds event listeners for mouse
     * enter and exit events to change the appearance of the button when the mouse hovers over it. <br>
     *
     * @param button the button to be designed
     */
    /*
        Algorithm:
        1. Set the font of the button to "Helvetica", bold, and size 13.
        2. Disable focus painting on the button to prevent an outline from appearing when the button is clicked.
        3. Create a compound border with a line border of color navy, thickness 3, and no roundness,
           and an empty border with 8 pixels of padding on the top, bottom, left, and right sides.
        4. Set the background color of the button to pink and the foreground color to navy.
        5. Add a mouse listener to the button with two methods: mouseEntered and mouseExited.
        6. In the mouseEntered method, set the cursor to a hand cursor, change the border to a
           compound border with a line border of color pink, thickness 3, and no roundness, and an
           empty border with 8 pixels of padding on the top, bottom, left, and right sides. Set the
           background color to navy and the foreground color to pink.
        7. In the mouseExited method, change the border back to the original compound border with a
           line border of color navy, thickness 3, and no roundness, and an empty border with 8 pixels
           of padding on the top, bottom, left, and right sides. Set the background color back to pink
           and the foreground color back to navy.
        8. End of the buttonDesign method.
     */
    private void buttonDesign(JButton button) {
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
     * The populateArrayList method reads data from a file and stores it in an ArrayList of Course objects.
     * It skips the first line of the file, assumes that each subsequent line contains comma-separated values
     * representing a course, and creates a Course object for each line using the data
     * Finally, it adds the Course object to the ArrayList. <br>
     *
     * @param list array of objects
     * @throws IOException throws IOException if exception is encountered while accessing the data.
     */
    /*
        Algorithm:
        1. Create a BufferedReader to read from the file.
        2. Read and discard the first line of the file.
        3. Create a Course object.
        4. Read each line from the file.
        5. Split the line using the comma as a delimiter.
        6. Create a new Course object using the extracted data.
        7. Parse and set the relevant fields of the Course object.
        8. Add the Course object to the ArrayList.
        9. Repeat steps 4-8 until there are no more lines to read.
        10. Close the input stream.
     */
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

    /**
     * Method to update the csv file of the program curriculum.
     *
     * @throws IOException
     */
    /*
        Algorithm:
        1. Create a PrintWriter object to write data to a file.
        2. Open the specified file ("BSCSCurriculumData1.csv") for writing.
        3. Write the column headers to the file.
        4. Iterate through each course in the "list" collection.
        5. Convert each course object to a string representation using the toString() method.
        6. Write the course data to the file.
        7. Close the PrintWriter to ensure all data is written to the file.
        8. Flush the PrintWriter to clear any remaining buffered data.
        9. The file is now saved with the updated course data.
     */
    private void saveFile() throws IOException {
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

    /**
     * ActionListener implementation for button actions in the user interface.
     */
    public class ButtonAction implements ActionListener {
        /**
         * Performs the appropriate action based on the event source. <br>
         *
         * @param e the event to be processed
         */
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

                        if (grade == 0 || grade >= 70 && grade <= 99) {
                            Course selectedCourse = unfinishedCourses.get(selectedRow);
                            selectedCourse.setGrades(grade);
                            tableModel.removeRow(selectedRow);
                            unfinishedCourses.remove(selectedRow);
                            gradeField.setText("");
                        } else {
                            JOptionPane.showMessageDialog(frameEnterGrades, "Enter a grade between 70 and 99.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frameEnterGrades, "Invalid grade. Enter a number between " +
                                "70 and 99.", "Error", JOptionPane.ERROR_MESSAGE);
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
                            if (grade == 0 || grade > 74) {
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
                                if (grade == 0 || grade >= 70 && grade <= 99) {
                                    courseToUpdate.setGrades(grade);
                                    tableModel.removeRow(rowIndex);
                                    unfinishedCourses.remove(rowIndex);

                                    Course selectedCourse = unfinishedCourses.get(rowIndex);
                                    selectedCourse.setGrades(grade);
                                    tableModel.removeRow(rowIndex);
                                    unfinishedCourses.remove(courseToUpdate);
                                    gradeField.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(frameCreditedCourse, "Enter a grade between 70 and 99.",
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