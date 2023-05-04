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
 * //TODO: Charles - Add the inputs needed for the program
 * <p>
 * Outputs:
 * //TODO: Charles - Add the outputs needed for the program
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

/* Improvements:
//TODO: Nash - Remove the option 1 and 2 as option 3 contains this feature
             - Add instructions/guide label within a panel to guide the user
 */

/**
 * The CurriculumMonitoringApplication Class is the main class that provides options to be
 * used by a Bachelor of Science of Computer Science (BSCS) student of Saint Louis University
 * in monitoring of the student's progress with respect to the curriculum that they are pursuing.
 */
/*
    Algorithm: //TODO: Katelyn - update algorithm
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

    //TODO: Lourdene - add image icon description
    ImageIcon icon = new ImageIcon("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject1/" +
            "res/icon1.png");
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

    //TODO:Julienne Add run method description (javadoc comment) and algorithm (multi-line comment) after coding the GUI
    public void run() throws IOException {
        String name = null;
        name= showLoginDialog().toUpperCase();
        showIntroduction(name);
        populateArrayList(list); //invokes populateArrayList method
        listOfChoices();
    } // end of run method

    //TODO: Julienne - add method description and algorithm
    private String showLoginDialog() {
        // Create a new JDialog for the login dialog
        JDialog loginDialog = new JDialog();
        loginDialog.setTitle("User Login");
        loginDialog.setModal(true);
        loginDialog.setLayout(new BorderLayout());

        // Create the labels to be used inside the login panel
        JLabel headerLabel = new JLabel("User Login", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel usernameLabel = new JLabel("USERNAME:");
        usernameLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
        usernameLabel.setForeground(Color.darkGray);
        usernameLabel.setBorder(BorderFactory.createEmptyBorder(0,55,0,0));

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
        passwordLabel.setForeground(Color.darkGray);
        passwordLabel.setBorder(BorderFactory.createEmptyBorder(0,55,0,0));

        // Create the input text fields to be used inside the login panel
        JTextField usernameField = new JTextField(20);
        usernameField.setHorizontalAlignment(SwingConstants.CENTER);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*');

        // Create the buttons for the login dialog
        RoundButton okButton = new RoundButton("OK");
        buttonDesign(okButton);
        okButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                // Create a new JDialog for the warning message
                JDialog warningDialog = new JDialog(loginDialog, "Warning", true);
                warningDialog.setLayout(new BorderLayout());
                warningDialog.setBackground(peach);

                // Add the warning message label to the dialog
                JLabel warningLabel = new JLabel("Please enter both username and password!",
                        SwingConstants.CENTER);
                warningLabel.setFont(new Font("Helvetica", Font.BOLD, 17));
                warningLabel.setForeground(darkPurple);
                warningLabel.setBackground(peach);
                warningLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                // Sets the specific formats for the warning dialog
                warningDialog.add(warningLabel, BorderLayout.CENTER);
                warningDialog.pack();
                warningDialog.setLocationRelativeTo(loginDialog);
                warningDialog.setSize(400, 120);;
                warningDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                warningDialog.setVisible(true);
            } else {
                loginDialog.setVisible(false);
            }
        });

        RoundButton cancelButton = new RoundButton("Cancel");
        buttonDesign(cancelButton);
        cancelButton.addActionListener(e -> {
            showExit();
            System.exit(0);
        });

        // Create the panel within the login dialog
        JPanel loginPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.setBackground(lightBlue);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
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
        JDialog exitDialog = new JDialog();
        exitDialog.setTitle("BSCS Monitoring Application");
        exitDialog.setModal(true);

        JLabel exitL = new JLabel("Thank you for using the program!", SwingConstants.CENTER);
        exitL.setFont(new Font("Helvetica", Font.BOLD, 20));
        exitL.setForeground(pink);

        JPanel exitPanel = new JPanel(new BorderLayout()); // use BorderLayout for exitPanel
        exitPanel.setBackground(navy);
        exitPanel.add(exitL, BorderLayout.CENTER); // add exitL to the center of exitPanel

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
        JDialog introDialog = new JDialog();
        introDialog.setTitle("BSCS Curriculum Monitoring Application");
        introDialog.setModal(true);

        JLabel headerLabel = new JLabel("BSCS Curriculum Monitoring Application", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel greetLabel = new JLabel("WELCOME " + name + "!", SwingConstants.CENTER);
        greetLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        greetLabel.setForeground(darkPurple);
        greetLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));

        JLabel descriptionLabel = new JLabel("<html><div style='text-align: justify;'>" +
                "This application is designed to assist a Bachelor of Science of Computer Science " +
                "(BSCS) students at Saint Louis University in monitoring their progress towards " +
                "completing their curriculum. Please proceed to the next window for the Main Menu.</html>",
                SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        descriptionLabel.setForeground(Color.darkGray);
        descriptionLabel.setBorder(BorderFactory.createEmptyBorder(8, 20, 20, 20));

        nextButton = new RoundButton("NEXT");
        buttonDesign(nextButton);
        nextButton.addActionListener((e) -> {
            introDialog.dispose();
        });

        JPanel introPanel = new JPanel(new BorderLayout());

        JPanel descriptionPanel = new JPanel(new BorderLayout());
        descriptionPanel.setBackground(lightBlue);
        descriptionPanel.add(greetLabel);
        descriptionPanel.add(descriptionLabel, BorderLayout.SOUTH);
        descriptionPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
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
    ///TODO: Nash - Add method algorithm
    public void listOfChoices() {
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
            showCoursesForEachTerm();
        });

        JButton showCourseWithGradesButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "2. Show course with grades for each term"); //TODO: Lourdene - remove after since we have Show course with grades and remarks for each term
        buttonDesign(showCourseWithGradesButton);
        showCourseWithGradesButton.addActionListener(e -> {
            showCoursesWithGradesForEachTerm();
        });

        JButton showCourseAndRemarksButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "3. Show course with grades and remarks for each term");
        buttonDesign(showCourseAndRemarksButton);
        showCourseAndRemarksButton.addActionListener(e -> {
            showCoursesWithGradesAndRemarksForEachTerm();
        });

        JButton enterGradeButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "4. Enter grade for course recently finished");
        buttonDesign(enterGradeButton);
        enterGradeButton.addActionListener(e -> {
            enterGrades();
        });

        JButton addFinishedCourseButton = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "5. Add a finished course from another program");
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
            editElectiveCourse();
        });

        JButton button8 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "8. Show student's average grade for all finished courses");
        buttonDesign(button8);
        button8.addActionListener(e -> {
            try {
                showAverageGrade();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton button9 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "9. Show student's sorted grades");
        buttonDesign(button9);
        button9.addActionListener(e -> {
            showSortedGrades();
        });

        JButton button10 = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "10. Show student's failed courses only");
        buttonDesign(button10);
        button10.addActionListener(e -> {
            showFailedCourses();
        });

        JButton button11 = new RoundButton("QUIT");
        buttonDesign(button11);
        button11.addActionListener(e -> {
            showExit();
            choiceFrame.dispose();
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.exit(0);
        });

        JPanel buttonsPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        buttonsPanel.setBackground(lightBlue);
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));
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
        quitPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        JPanel choicePanel = new JPanel(new BorderLayout());
        choicePanel.add(headerLabel, BorderLayout.NORTH);
        choicePanel.add(buttonsPanel, BorderLayout.CENTER);
        choicePanel.add(quitPanel, BorderLayout.SOUTH);

        choiceFrame.getContentPane().add(choicePanel);
        choiceFrame.setIconImage(icon.getImage());
        choiceFrame.pack();
        choiceFrame.setSize(630, 500);
        choiceFrame.setLocationRelativeTo(null);
        choiceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        choiceFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showExit();
                System.exit(0);
            }
        });
        choiceFrame.setVisible(true);
    } // end of listOfChoices method

    /**
     * Method to display the subjects for each term.
     */
    public void showCoursesForEachTerm() {
        JFrame frame = new JFrame("Courses for Each Term");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Courses for Each Term", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ArrayList<Course> unfinishedCourses = new ArrayList<>();
        HashMap<Integer, Integer> originalIndices = new HashMap<>();

        list.stream().map(course -> new Object[]{
                course.getYear(),
                "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                course.getCourseNumber(),
                course.getDescTitle(),
                course.getUnits()
        }).forEach(tableModel::addRow);

        // Search functionality
        JLabel searchLabel = new JLabel("Search: ");
        JTextField searchBar = new JTextField(15);

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

        JTable table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(900, 500));

        JScrollPane scrollPane = new JScrollPane(table);

        // Define a custom header renderer that sets the background color of the column names
        JTableHeader header = table.getTableHeader();
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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(3);
        table.getColumnModel().getColumn(1).setPreferredWidth(5);
        table.getColumnModel().getColumn(2).setPreferredWidth(65);
        table.getColumnModel().getColumn(3).setPreferredWidth(530);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);

        JPanel searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchBar);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(searchPanel, BorderLayout.CENTER);
        frame.add(tablePanel, BorderLayout.SOUTH);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 685);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showCoursesForEachTerm method

    /**
     * Method to display the subjects with grades for each term.
     */
    public void showCoursesWithGradesForEachTerm() {
        JFrame frame = new JFrame("Courses with Grades for Each Term");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Courses with Grades for Each Term", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        list.stream().map(course -> new Object[]{
                course.getYear(),
                "3".equals(course.getTerm()) ? "Short term" : course.getTerm(),
                course.getCourseNumber(),
                course.getDescTitle(),
                course.getUnits(),
                course.getGrades() == 0 ? "Not yet graded" : course.getGrades()
        }).forEach(tableModel::addRow);

        JTable table = new JTable(tableModel);
        table.setEnabled(false);
        table.setPreferredScrollableViewportSize(new Dimension(1080, 510));

        JScrollPane scrollPane = new JScrollPane(table);

        // Define a custom header renderer that sets the background color of the column names
        JTableHeader header = table.getTableHeader();
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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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

        // Set the preferred width of each column
        table.getColumnModel().getColumn(0).setPreferredWidth(3);
        table.getColumnModel().getColumn(1).setPreferredWidth(5);
        table.getColumnModel().getColumn(2).setPreferredWidth(65);
        table.getColumnModel().getColumn(3).setPreferredWidth(540);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(15);

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(tablePanel, BorderLayout.CENTER);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1190, 655);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showCoursesWithGradesForEachTerm method

    /**
     * Method to display the subjects with grades and remarks for each term
     * where it will print "Failed", if grade is less than 75.
     * And, else it will print "Passed".
     */
    //TODO: Nash - add algorithm
    public void showCoursesWithGradesAndRemarksForEachTerm() {
        JFrame frame = new JFrame("Courses with Grades and Remarks for Each Term");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades", "Remarks"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        updateTableModel(list, tableModel);

        JLabel headerLabel = new JLabel("Courses with Grades and Remarks for Each Term", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

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

        JTable table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 510));

        JScrollPane scrollPane = new JScrollPane(table);

        // Search functionality
        JLabel searchLabel = new JLabel("Search: ");
        JTextField searchBar = new JTextField(15);

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
        JTableHeader header = table.getTableHeader();
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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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

        JPanel searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchBar);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(searchPanel, BorderLayout.CENTER);
        frame.add(tablePanel, BorderLayout.SOUTH);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1280, 700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showCoursesWithGradesAndRemarksForEachTerm method

    //TODO: Nash - Add method description and algorithm
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
    //TODO: Katelyn - Add updated method algorithm
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
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Enter Grades", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ArrayList<Course> unfinishedCourses = new ArrayList<>();
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
        JLabel searchLabel = new JLabel("Search: ");
        JTextField searchBar = new JTextField(15);

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

        JTable table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 12));
        table.setPreferredScrollableViewportSize(new Dimension(900, 235));

        JScrollPane scrollPane = new JScrollPane(table);

        JLabel gradeLabel = new JLabel("Enter the grade: ");
        gradeLabel.setFont(new Font("Helvetica", Font.BOLD, 13));
        gradeLabel.setForeground(Color.darkGray);

        JTextField gradeField = new JTextField(10);

        RoundButton submitButton = new RoundButton("Submit");
        buttonDesign(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                            JOptionPane.showMessageDialog(frame, "Enter a grade between 70 and 99.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid grade. Enter a number between " +
                                "70 and 99.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a course from the table.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        RoundButton saveButton = new RoundButton("Save");
        buttonDesign(saveButton);
        saveButton.addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        RoundButton backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            frame.dispose();
        });

        // Define a custom header renderer that sets the background color of the column names
        JTableHeader header = table.getTableHeader();
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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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

        JLabel guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "Please select a row in the table below that corresponds to a specific" +
                " course. Then, enter the grade you have in the chosen course to the " +
                "text field below the table. You can also search your desired course on " +
                "the search bar below. Remember to submit and save what you have edited!</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchBar);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JPanel guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.add(searchPanel, BorderLayout.SOUTH);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 0, 100));

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(gradeLabel);
        inputPanel.add(gradeField);
        inputPanel.add(submitButton);
        inputPanel.add(saveButton);
        inputPanel.setBackground(peach);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 350, 10, 350));

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(guidePanel, BorderLayout.NORTH);
        contentPanel.add(tablePanel, BorderLayout.CENTER);
        contentPanel.add(inputPanel, BorderLayout.SOUTH);
        contentPanel.setBackground(peach);

        JPanel backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(backPanel, BorderLayout.SOUTH);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(980, 645);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//end of enterGrades method

    //TODO: Katelyn - add method description and algorithm
    private void updateCourseTableModel(ArrayList<Course> unfinSubs, ArrayList<Course> courses, DefaultTableModel tableModel, HashMap<Integer, Integer> originalIndices) {
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

    //TODO: Julienne - Add method description and algorithm
    public void addFinishedCourse() {
        JFrame frame = new JFrame("Add Finished Course");
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Add Finished Course", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "For adding a new completed course, click the \"Add Course\" button that " +
                "will direct you to another dialog window for entering inputs of data " +
                "information about the course to be added. Remember to save before closing!" +
                "</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ArrayList<Course> unfinishedCourses = new ArrayList<>();
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

        JTable table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 12));
        table.setPreferredScrollableViewportSize(new Dimension(900, 235));

        JScrollPane scrollPane = new JScrollPane(table);

        RoundButton saveButton = new RoundButton("Save");
        buttonDesign(saveButton);
        saveButton.addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        RoundButton addCourseButton = new RoundButton("Add Course");
        buttonDesign(addCourseButton);
        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                            JOptionPane.showMessageDialog(frame, "Invalid input. Please make sure all " +
                                    "fields are filled correctly.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                RoundButton cancelButton = new RoundButton("Cancel");
                buttonDesign(cancelButton);
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addCourseDialog.dispose();
                    }
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

                JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 5));
                buttonPanel.add(okButton);
                buttonPanel.add(cancelButton);
                buttonPanel.setBackground(peach);
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5,100, 5, 100));

                addCourseDialog.add(addCoursePanel, BorderLayout.NORTH);
                addCourseDialog.add(buttonPanel, BorderLayout.CENTER);
                addCourseDialog.setIconImage(icon.getImage());
                addCourseDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                addCourseDialog.setSize(500, 250);
                addCourseDialog.setVisible(true);
                addCourseDialog.setLocationRelativeTo(null);
            }
        });

        RoundButton backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> {
            frame.dispose();
        });

        // Define a custom header renderer that sets the background color of the column names
        JTableHeader header = table.getTableHeader();
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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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

        JPanel guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10,100,0,100));

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10,0,3,0));

        JPanel inputPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        inputPanel.add(addCourseButton);
        inputPanel.add(saveButton);
        inputPanel.setBackground(peach);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(3,350,10,350));

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(guidePanel, BorderLayout.NORTH);
        contentPanel.add(tablePanel, BorderLayout.CENTER);
        contentPanel.add(inputPanel, BorderLayout.SOUTH);
        contentPanel.setBackground(peach);

        JPanel backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2,0,2,0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(backPanel, BorderLayout.SOUTH);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(980, 545);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } //end of addFinishedCourse method

    //TODO: Nash - Add method description and algorithm
    public void addCreditedCourse() {
        JFrame frame = new JFrame("Add Credited Course");
        String[] columnNames = {"#", "Course number", "Descriptive Title"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Add Credited Course", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "For adding a new completed course, click the \"Add Course\" button that " +
                "will direct you to another dialog window for entering inputs of data " +
                "information0 about the course to be added. Remember to save before closing!" +
                "</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ArrayList<Course> unfinishedCourses = new ArrayList<>();
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

        JTable table = new JTable(tableModel);
        table.setFont(new Font("Helvetica", Font.BOLD, 12));
        table.setPreferredScrollableViewportSize(new Dimension(900, 235));

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        RoundButton saveButton = new RoundButton("Save");
        buttonDesign(saveButton);
        saveButton.addActionListener(e -> {
            try {
                saveFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        RoundButton updateGradeButton = new RoundButton("Update Grade");
        buttonDesign(updateGradeButton);
        updateGradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog updateGradeDialog = new JDialog(frame, "Update Grade", true);
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
                                    JOptionPane.showMessageDialog(frame, "Enter a grade between 70 and 99.",
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

                JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
                inputPanel.add(courseNumberLabel);
                inputPanel.add(courseNumberField);
                inputPanel.add(gradeLabel);
                inputPanel.add(gradeField);
                inputPanel.setBackground(peach);
                inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JPanel buttonPanel = new JPanel();
                buttonPanel.add(okButton);
                buttonPanel.setBackground(navy);
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(3, 30, 3, 30));

                updateGradeDialog.add(inputPanel, BorderLayout.CENTER);
                updateGradeDialog.add(buttonPanel, BorderLayout.SOUTH);
                updateGradeDialog.setSize(400, 210);
                updateGradeDialog.setLocationRelativeTo(frame);
                updateGradeDialog.setVisible(true);
            }
        });

        RoundButton backButton = new RoundButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(e -> frame.dispose());

        // Define a custom header renderer that sets the background color of the column names
        JTableHeader header = table.getTableHeader();
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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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

        JPanel guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10,100,0,100));

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10,0,3,0));

        JPanel inputPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        inputPanel.add(updateGradeButton);
        inputPanel.add(saveButton);
        inputPanel.setBackground(peach);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(3,330,10,330));

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(guidePanel, BorderLayout.NORTH);
        contentPanel.add(tablePanel, BorderLayout.CENTER);
        contentPanel.add(inputPanel, BorderLayout.SOUTH);
        contentPanel.setBackground(peach);

        JPanel backPanel = new JPanel();
        backPanel.setBackground(navy);
        backPanel.add(backButton);
        backPanel.setBorder(BorderFactory.createEmptyBorder(2,0,2,0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(backPanel, BorderLayout.SOUTH);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(980, 545);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of addCreditedCourse method

    /**
     * Method to allow the user to choose an elective course for them to edit.
     */
    //TODO: Charles - Add method algorithm
    public void editElectiveCourse() {
        JFrame electiveframe = new JFrame("Edit Elective Course");
        electiveframe.setLayout(new BorderLayout());

        JLabel headerLabel = new JLabel("Edit Elective Course", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));

        JLabel guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "Please select a row each for the elective and recommended courses table below " +
                "that corresponds to a specific elective course. Then, click the confirm button " +
                "to confirm that you will take the selected recommended course as an elective course." +
                "</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);

        JLabel electiveLabel = new JLabel("Elective Courses Table", SwingConstants.CENTER);
        electiveLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        electiveLabel.setOpaque(true);
        electiveLabel.setBackground(peach);
        electiveLabel.setForeground(Color.darkGray);
        electiveLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        JLabel recommendedLabel = new JLabel("Recommended Courses Table", SwingConstants.CENTER);
        recommendedLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        recommendedLabel.setOpaque(true);
        recommendedLabel.setBackground(peach);
        recommendedLabel.setForeground(Color.darkGray);
        recommendedLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        ArrayList<Course> listRecommended = new ArrayList<>();
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
        DefaultTableModel electivesModel = new DefaultTableModel(new Object[]{"Year", "Term", "Course number", "Descriptive Title", "Units"}, 0);
        JTable electivesTable = new JTable(electivesModel);
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

        DefaultTableModel recommendedModel = new DefaultTableModel(new Object[]{"Course number", "Descriptive Title", "Units"}, 0);
        JTable recommendedTable = new JTable(recommendedModel);
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
        RoundButton confirmButton = new RoundButton("Confirm");
        buttonDesign(confirmButton);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                    JOptionPane.showMessageDialog(electiveframe, "Course edited successfully.");
                    try {
                        saveFile();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(electiveframe, "Please select a course from both tables.");
                }
            }
        });

        RoundButton cancelButton = new RoundButton("Cancel");
        buttonDesign(cancelButton);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                electiveframe.dispose();
            }
        });

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
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
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

        JPanel guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 0, 100));

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(headerLabel, BorderLayout.NORTH);
        topPanel.add(guidePanel, BorderLayout.SOUTH);
        topPanel.setBackground(peach);

        JPanel contentPanel = new JPanel(new FlowLayout());
        contentPanel.add(electiveLabel);
        contentPanel.add(new JScrollPane(electivesTable));
        contentPanel.add(recommendedLabel);
        contentPanel.add(new JScrollPane(recommendedTable));
        contentPanel.setBackground(peach);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirmButton);
        buttonPanel.add(cancelButton);
        buttonPanel.setBackground(navy);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 50, 5, 5));

        electiveframe.add(topPanel, BorderLayout.NORTH);
        electiveframe.add(contentPanel, BorderLayout.CENTER);
        electiveframe.add(buttonPanel, BorderLayout.SOUTH);
        electiveframe.setSize(980, 565);
        electiveframe.setLocationRelativeTo(null);
        electiveframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        electiveframe.setVisible(true);
    } // end of editElectiveCourse method

    /**
     * Method to compute and show the average grade of a student.
     *
     * @throws IOException if an I/O error occurs.
     */
    /*
        Algorithm:
        1. Calculates the average grade of the student and provides the user with an option to edit grades.
        2. If the user chooses to edit grades, it will invoke the method to enter grades.
        3. If the user chooses not to edit grades, it will invoke the method to go back to the main menu.
        4. Shows a warning pop-up window if there are no grades available to calculate the average grade.
        5. Shows a warning pop-up window to confirm the user's choice to edit grades.
        6. Shows a warning pop-up window to confirm the user's choice to go back to the main menu.
     */
    //TODO: Charles - add updated method code and algorithm
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
            // Shows a warning pop-up window if there are no grades available to calculate the average grade.
            JOptionPane.showMessageDialog(null, "No grades available to calculate the average grade.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            average /= count; // calculates the average
            // Shows the average grade in a warning pop-up window.
            JOptionPane.showMessageDialog(null, "Student's Average Grade: " + average, "Average Grade", JOptionPane.WARNING_MESSAGE);
        }

        // Provides the user an option to edit grades
        System.out.print("Would you like to edit grades? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            // Call a method to edit grades
            enterGrades();
        } else {
            // If user chooses not to edit grades, provide option to go back to main menu


            // Invoke the method to go back to the main menu
            int choice=0;
            String enter;

            // Loops until the user inputs 9 to go back to the main menu
            while(choice != 9){
                // Show the list of choices
                listOfChoices();
                System.out.println("-----");

                // Wait for user to press enter before continuing
                System.out.println();
                System.out.print("Press enter key to go back.");
                enter = scanner.nextLine();
            }
        }
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
    //TODO: Julienne - add algorithm
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


        JFrame frame = new JFrame("Student's Sorted Grades");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Student's Sorted Grades", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTable table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1080, 510));

        JScrollPane scrollPane = new JScrollPane(table);

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
        JTableHeader header = table.getTableHeader();
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

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {

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

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(tablePanel, BorderLayout.CENTER);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1190, 650);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showSortedGrades method

    /**
     * Method to display the courses that have grades lower than 75.
     */
    /*
     * Algorithm:     //TODO: Julienne - add updated algorithm
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
    public void showFailedCourses(){
        JFrame frame = new JFrame("Show Failed Courses");
        String[] columnNames = {"Year", "Term", "Course number", "Descriptive Title", "Units", "Grades", "Remarks"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        JLabel headerLabel = new JLabel("Student's Failed Courses", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel guideLabel = new JLabel("<html><div style='text-align: center;'>" +
                "If there appears to be no contents inside the table, then you have NOT " +
                "failed any courses. Congratulations!</html>", SwingConstants.CENTER);
        guideLabel.setFont(new Font("Helvetica", Font.ITALIC, 12));
        guideLabel.setOpaque(true);
        guideLabel.setBackground(purple);
        guideLabel.setForeground(Color.darkGray);
        guideLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTable table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1080, 510));

        JScrollPane scrollPane = new JScrollPane(table);

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
        JTableHeader header = table.getTableHeader();
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

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {

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

        JPanel guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel);
        guidePanel.setBackground(peach);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(10, 200, 0, 200));

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(guidePanel, BorderLayout.CENTER);
        frame.add(tablePanel, BorderLayout.SOUTH);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1190, 700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    } // end of showFailedCourses method

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
    //TODO: Nash - add updated method algorithm (multi-line comment)
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
     * Method to read from the csv file and populates
     * the ArrayList with Course instances.
     */
    //TODO: Julienne - Add populateArrayList method algorithm (multi-line comment)
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
    //TODO: Charles - Add method algorithm (multi-line comment)
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

    //TODO: Marius - add class description
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
    } // end of RoundRectangle class
} // end of CurriculumMonitoringApplication class