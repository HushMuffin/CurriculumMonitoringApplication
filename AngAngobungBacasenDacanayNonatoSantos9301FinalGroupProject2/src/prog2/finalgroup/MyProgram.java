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
 * Date of Programming: April-18-2023
 * Activity Name: Midterm Project 1
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Problem Description:
 * Given data.csv, write a program that processes the data within the file into “useful” pieces of
 * information. The CSV (comma separated values) file contains the following information about citizens living in
 * a certain community (last name, first name, email address, address, age, type of residency, district number, and
 * gender). Processing may involve sorting, filtering, generating a summarized value, etc. The interface of the
 * program to be created has to be graphical (with menu options).
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
package prog2.finalgroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/* Improvements: (refer to the google doc guide)
//TODO: Lourdene & Marius & Nash - Whole Design/Format of the GUI
//TODO: Lourdene & Marius - Windows
//TODO: Julienne - Improve warning message for inputs
//TODO: Julienne - Improve warning message for finding a person option
//TODO: Marius & Lourdene - Improve the show number of male & female citizens option
//TODO: Lourdene - Improve the program by adding menu bar on the windows after the main menu window
 */
/* Others:
//TODO: Lourdene - Stretch the list of citizen list window so that the emails
        are displayed fully or at least make the window stretchable
 */

/**
 * The MyProgram Class is the main class that is responsible for managing the
 * citizen information and providing the user with options to interact with it.
 */
public class MyProgram extends JFrame {
    //Declare the field for MyProgram
    //TODO: Lourdene - Add field descriptions
    ImageIcon icon = new ImageIcon("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject2/res/icon2.png");
    MyProgramUtility myProgramUtility = new MyProgramUtility();
    Citizen citizen;

    //Declare the action listener for MyProgram
    //TODO: Lourdene - Add action listener descriptions
    ButtonAction buttonAction = new ButtonAction();

    //Declare the list for MyProgram
    //TODO: Lourdene - Add list descriptions
    private final ArrayList<Citizen> list = myProgramUtility.csvToList();

    //Declare the buttons for MyProgram
    //TODO: Julienne - Add button descriptions
    private final JButton buttonOne = new JButton("1");
    private final JButton buttonTwo = new JButton("2");
    private final JButton buttonThree = new JButton("3");
    private final JButton buttonFour = new JButton("4");
    private final JButton buttonFive = new JButton("5");
    private final JButton buttonSix= new JButton("6");
    private final JButton buttonBack = new JButton("Back");
    private final JButton buttonBackMorF = new JButton("Back");
    private final JButton buttonBackAge= new JButton("Back");
    private final JButton buttonFind = new JButton("Find");
    private final JButton buttonMale = new JButton("Male");
    private final JButton buttonFemale= new JButton("Female");
    private final JButton buttonOK= new JButton("Ok");

    //Declare the text fields for MyProgram
    //TODO: Julienne - Add text fields descriptions
    private final JTextField textField = new JTextField(5);
    private final JTextField textField2 = new JTextField(5);

    // Declare the labels for MyProgram
    //TODO: Marius - Add labels descriptions
    JLabel title;
    JLabel nameLabel;
    JLabel email;
    JLabel address;
    JLabel age;
    JLabel resident;
    JLabel district;
    JLabel gender;
    JLabel findFirstName;
    JLabel findLastName;

    // Declare the frames for MyProgram
    //TODO: Nash - Add frames descriptions
    JFrame frame2 = new JFrame("Citizen App");
    JFrame frameMorF = new JFrame("Citizen App");
    JFrame chooseFrame = new JFrame("Citizen App");


    //Declare the Strings for MyProgram
    //TODO: Nash - Add Strings descriptions
    String firstName = "";
    String lastName = "";

    //Declare the ints for MyProgram

    /**The variable "ageGroup" is of type int, which represents a numerical value that can hold a range of integers.
    *It is used to store the age group of a citizen, which may be determined by their age or some other relevant criteria.
    */
    int ageGroup;

    /**
     * Constructor for creating the main menu.
     */
    public MyProgram() {
        //Labels
        JLabel title = new JLabel("Welcome to the Citizen App", SwingConstants.CENTER);
        title.setBounds(50,-100,250,250);
        JLabel instructions = new JLabel(" Choose an action", SwingConstants.LEFT);
        JLabel first = new JLabel(" 1. Show the list of citizens", SwingConstants.LEFT);
        JLabel second = new JLabel(" 2. Show sorted list of names of the citizens", SwingConstants.LEFT);
        JLabel third = new JLabel(" 3. Show number of male & female citizens", SwingConstants.LEFT);
        JLabel fourth = new JLabel(" 4. Show list of male/female citizens only", SwingConstants.LEFT);
        JLabel fifth = new JLabel(" 5. Find a person in the list", SwingConstants.LEFT);
        JLabel sixth = new JLabel(" 6. Display citizens with a certain age group", SwingConstants.LEFT);

        //Panel for labels
        JPanel panel = new JPanel(new GridLayout(7,0));
        panel.setBounds(0,50,250,150);
        panel.add(instructions);
        panel.add(first);
        panel.add(second);
        panel.add(third);
        panel.add(fourth);
        panel.add(fifth);
        panel.add(sixth);

        //Add action listeners to buttons
        buttonOne.addActionListener(buttonAction);
        buttonTwo.addActionListener(buttonAction);
        buttonThree.addActionListener(buttonAction);
        buttonFour.addActionListener(buttonAction);
        buttonFive.addActionListener(buttonAction);
        buttonSix.addActionListener(buttonAction);

        //Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,205,300,50);
        buttonPanel.add(buttonOne).setFocusable(false);
        buttonPanel.add(buttonTwo).setFocusable(false);
        buttonPanel.add(buttonThree).setFocusable(false);
        buttonPanel.add(buttonFour).setFocusable(false);
        buttonPanel.add(buttonFive).setFocusable(false);
        buttonPanel.add(buttonSix).setFocusable(false);

        //Frame
        this.setTitle("Citizen App");
        this.setIconImage(icon.getImage());
        this.add(title);
        this.add(panel);
        this.add(buttonPanel);

        //Frame operations
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(360,300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    } // end of MyProgram constructor

    /**
     * Method to display the default citizen list.
     */
    //TODO: Marius - Add showDefaultList method algorithm
    public void showDefaultList(){
        String[][] data = myProgramUtility.defaultList(); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table
        JTable table = new JTable(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(1000,550));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);

        //Panes
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,205,300,50);
        buttonPanel.setBackground(new Color(248,248,255));
        buttonPanel.add(buttonBack).setFocusable(false);

        //add action listeners to buttons
        buttonBack.addActionListener(buttonAction);

        //frame
        frame2.setLayout(new FlowLayout());
        frame2.setIconImage(icon.getImage());
        frame2.setTitle("Citizen App");
        frame2.getContentPane().setBackground(new Color(248,248,255));
        frame2.add(scrollPane);
        frame2.add(buttonPanel);

        //frame operations
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1100,675);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    } // end of showDefaultList method

    /**
     * Method to display the sorted citizen list.
     */
    //TODO: Lourdene - Add showSortedList method algorithm
    public void showSortedList(){
        String[][] data = myProgramUtility.sortedList(); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table
        JTable table = new JTable(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(1000,550));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);

        //Panes
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,205,300,50);
        buttonPanel.setBackground(new Color(248,248,255));
        buttonPanel.add(buttonBack).setFocusable(false);

        //add action listeners to buttons
        buttonBack.addActionListener(buttonAction);

        //frame
        frame2.setLayout(new FlowLayout());
        frame2.setIconImage(icon.getImage());
        frame2.setTitle("Citizen App");
        frame2.getContentPane().setBackground(new Color(248,248,255));
        frame2.add(scrollPane);
        frame2.add(buttonPanel);

        //frame operations
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1100,675);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    } // end of showSortedList method

    /**
     * Method to display the number of males and females.
     */
    //TODO: Nash - Add numOfMaleAndFemale method algorithm
    public void numOfMaleAndFemale(){
        //label
        title = new JLabel("Number of Males and Females", SwingConstants.CENTER);
        JLabel males = new JLabel(" Males:  ", SwingConstants.LEFT);
        JLabel females = new JLabel(" Females:  ", SwingConstants.LEFT);
        JLabel numOfMales = new JLabel(String.valueOf(myProgramUtility.numberOfMale()), SwingConstants.LEFT);
        JLabel numOfFemales = new JLabel(String.valueOf(myProgramUtility.numberOfFemale()), SwingConstants.LEFT);

        title.setBounds(50,-100,250,250);
        title.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        males.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        females.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        numOfMales.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        numOfFemales.setFont(new Font("Century Gothic", Font.PLAIN, 20));

        //Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,110,300,50);
        buttonPanel.add(buttonBack).setFocusable(false);
        buttonPanel.setBackground(new Color(248,248,255));

        //Panel for labels
        JPanel panel = new JPanel(new GridLayout(2,2));
        panel.setBounds(0,50,300,50);
        panel.setBackground(new Color(248,248,255));
        panel.add(males);
        panel.add(numOfMales);
        panel.add(females);
        panel.add(numOfFemales);

        //add action listeners to buttons
        buttonBack.addActionListener(buttonAction);

        //frame
        frame2.setIconImage(icon.getImage());
        frame2.getContentPane().setBackground(new Color(248,248,255));
        frame2.add(title);
        frame2.add(panel);
        frame2.add(buttonPanel);

        //frame operations
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(360,200);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    } // end of numOfMaleAndFemale method

    /** //TODO: Subject for improvements
     * Method to open up a choice if user wants to show male or female.
     */
    public void selectMaleOrFemale(){
        //labels
        title = new JLabel("Male or Female?");
        title.setBounds(70,-80,250,250);
        title.setFont(new Font("Century Gothic", Font.PLAIN, 25));

        //Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(70,75,200,150);
        buttonPanel.setBackground(new Color(248,248,255));
        buttonPanel.add(buttonMale).setFocusable(false);
        buttonPanel.add(buttonFemale).setFocusable(false);
        buttonPanel.add(buttonBack).setFocusable(false);

        buttonMale.addActionListener(buttonAction);
        buttonFemale.addActionListener(buttonAction);
        buttonBack.addActionListener(buttonAction);

        //frame
        chooseFrame.setIconImage(icon.getImage());
        chooseFrame.getContentPane().setBackground(new Color(248,248,255));
        chooseFrame.add(title);
        chooseFrame.add(buttonPanel);

        //frame operations
        chooseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseFrame.setLayout(null);
        chooseFrame.setSize(360,200);
        chooseFrame.setResizable(false);
        chooseFrame.setLocationRelativeTo(null);
        chooseFrame.setVisible(true);
    } // end of selectMaleOrFemale

    /**
     * Method display the male list.
     */
    //TODO: Nash - Add showMalesOnly method algorithm
    public void showMalesOnly(){
        String[][] data = myProgramUtility.listMaleOnly(); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table
        JTable table = new JTable(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(1000,550));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);

        //Panes
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,205,300,50);
        buttonPanel.add(buttonBackMorF).setFocusable(false);
        buttonPanel.setBackground(new Color(248,248,255));

        //add action listeners to buttons
        buttonBackMorF.addActionListener(buttonAction);

        //frame
        frameMorF.setLayout(new FlowLayout());
        frameMorF.setIconImage(icon.getImage());
        frameMorF.getContentPane().setBackground(new Color(248,248,255));
        frameMorF.setTitle("Citizen App");
        frameMorF.add(scrollPane);
        frameMorF.add(buttonPanel);

        //frame operations
        frameMorF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMorF.setSize(1100,675);
        frameMorF.setResizable(false);
        frameMorF.setLocationRelativeTo(null);
        frameMorF.setVisible(true);
    } // end of showMalesOnly method

    /**
     * Method display the female list
     */
    //TODO: Charles - Add showFemalesOnly method algorithm
    public void showFemalesOnly(){
        String[][] data = myProgramUtility.listFemaleOnly(); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table
        JTable table = new JTable(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(1000,550));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);

        //Panes
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,205,300,50);
        buttonPanel.add(buttonBackMorF).setFocusable(false);
        buttonPanel.setBackground(new Color(248,248,255));

        //add action listeners to buttons
        buttonBackMorF.addActionListener(buttonAction);

        //frame
        frameMorF.setLayout(new FlowLayout());
        frameMorF.setIconImage(icon.getImage());
        frameMorF.getContentPane().setBackground(new Color(248,248,255));
        frameMorF.setTitle("Citizen App");
        frameMorF.add(scrollPane);
        frameMorF.add(buttonPanel);

        //frame operations
        frameMorF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMorF.setSize(1100,675);
        frameMorF.setResizable(false);
        frameMorF.setLocationRelativeTo(null);
        frameMorF.setVisible(true);
    } // end of showFemalesOnly method

    /**
     * Method to let the user enter a name in a text field and find if person exists
     */
    //TODO: Katelyn - Add findPerson method algorithm
    /*
    * Algorithm (to be edited):
    * Get the first name and last name of the person to search from the two text fields.
    * Search for a person in the list of citizens with matching first and last names.
    * If a matching person is found, display their details (name, email, address, age, residency, district, gender) in the corresponding label fields.
    * If a matching person is not found, display an error message indicating that the person could not be found.
    * Add a back button to return to the main menu.*/
    public void findPerson(){
        //labels
        title = new JLabel("Enter the person's name", SwingConstants.CENTER);
        title.setBounds(50,-100,250,250);
        nameLabel = new JLabel(" Name:", SwingConstants.LEFT);
        email = new JLabel(" Email:", SwingConstants.LEFT);
        address = new JLabel(" Address:", SwingConstants.LEFT);
        age = new JLabel(" Age:", SwingConstants.LEFT);
        resident = new JLabel(" Residency:", SwingConstants.LEFT);
        district = new JLabel(" District:", SwingConstants.LEFT);
        gender = new JLabel(" Gender:  ", SwingConstants.LEFT);
        findFirstName = new JLabel(" Enter first name: ");
        findLastName = new JLabel(" Enter last name: ");


        //Panel for labels
        JPanel panel = new JPanel(new GridLayout(7,0));
        panel.setBounds(0,50,300,150);
        panel.setBackground(new Color(248,248,255));
        panel.add(nameLabel);
        panel.add(email);
        panel.add(address);
        panel.add(age);
        panel.add(resident);
        panel.add(district);
        panel.add(gender);

        textField.setSize(10,10);
        textField2.setSize(10,10);

        JPanel panel2 = new JPanel(new GridLayout(2,2));
        panel2.setBounds(0,230,300,50);
        panel2.setBackground(new Color(248,248,255));
        panel2.add(findFirstName);
        panel2.add(textField);
        panel2.add(findLastName);
        panel2.add(textField2);

        //add action listeners to buttons
        buttonBack.addActionListener(buttonAction);
        buttonFind.addActionListener(buttonAction);


        //Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,300,300,50);
        buttonPanel.setBackground(new Color(248,248,255));
        buttonPanel.add(buttonFind).setFocusable(false);
        buttonPanel.add(buttonBack).setFocusable(false);

        //frame
        frame2.setTitle("Citizen App");
        frame2.getContentPane().setBackground(new Color(248,248,255));
        frame2.setIconImage(icon.getImage());
        frame2.add(title);
        frame2.add(panel);
        frame2.add(panel2);
        frame2.add(buttonPanel);

        //frame operations
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(360,400);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    } // end of findPerson method

    /**
     * Method to open up a text field for user to enter the age
     */
    //TODO: Julienne - Add askAge method algorithm
    public void askAge(){
        //labels
        title = new JLabel("Enter the age", SwingConstants.CENTER);
        title.setBounds(50,-80,250,250);
        title.setFont(new Font("Century Gothic", Font.PLAIN, 25));

        //Panel for buttons
        JPanel buttonAndField = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonAndField.setBounds(70,75,200,150);
        buttonAndField.setBackground(new Color(248,248,255));
        buttonAndField.add(textField);
        buttonAndField.add(buttonOK).setFocusable(false);
        buttonAndField.add(buttonBack);

        buttonOK.addActionListener(buttonAction);
        buttonBack.addActionListener(buttonAction);

        //frame
        chooseFrame.setIconImage(icon.getImage());
        chooseFrame.getContentPane().setBackground(new Color(248,248,255));
        chooseFrame.add(title);
        chooseFrame.add(buttonAndField);

        //frame operations
        chooseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseFrame.setLayout(null);
        chooseFrame.setSize(360,200);
        chooseFrame.setResizable(false);
        chooseFrame.setLocationRelativeTo(null);
        chooseFrame.setVisible(true);
    } // end of askAge method

    /**
     * Method to display the people with the entered age from askAge method
     */
    //TODO: Julienne - Add showAgeGroup method algorithm
    public void showAgeGroup(){
        String[][] data = myProgramUtility.listWithAgeGroup(ageGroup); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table
        JTable table = new JTable(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(1000,550));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);

        //Panes
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBounds(20,205,300,50);
        buttonPanel.setBackground(new Color(248,248,255));
        buttonPanel.add(buttonBackAge).setFocusable(false);

        //add action listeners to buttons
        buttonBackAge.addActionListener(buttonAction);

        //frame
        frame2.setLayout(new FlowLayout());
        frame2.setIconImage(icon.getImage());
        frame2.setTitle("Citizen App");
        frame2.getContentPane().setBackground(new Color(248,248,255));
        frame2.add(scrollPane);
        frame2.add(buttonPanel);

        //frame operations
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1100,675);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    } // end of showAgeGroup method

    //TODO: Lourdene - Add run method description (javadoc comment) and algorithm (multi-line comment)
    //TODO: Lourdene - Make sure an introduction and exit method is included here
    public static void run(){
        MyProgram program = new MyProgram();
    } // end of run method

    /**
     * Main method for running the main functionality of the application program.
     *
     * @param args
     */
    /*
        Algorithm:
        1. Invoke the "run" method.
    */
    public static void main(String[] args) {
        run();
    } // end of main method

    //TODO: Lourdene - Add ButtonAction class description and algorithm
    //---Action Listener class for buttons---
    public class ButtonAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        //------buttonOne--------
            if(e.getSource() == buttonOne){
                showDefaultList(); //opens showDefaultList GUI
                dispose(); //closes the main menu
        //------buttonTwo--------
            }else if(e.getSource() == buttonTwo){
                showSortedList(); //opens showSortedList GUI
                dispose(); //closes the main menu
        //------buttonThree--------
            }else if(e.getSource() == buttonThree){
                numOfMaleAndFemale(); //opens numOfMaleAndFemale GUI
                dispose(); //closes the main menu
        //------buttonFour--------
            }else if(e.getSource() == buttonFour){
                selectMaleOrFemale(); //opens selectMaleOrFemale GUI
                dispose();//closes the main menu
        //------buttonFive--------
            }else if(e.getSource() == buttonFive){
                findPerson(); //opens findPerson GUI
                dispose();//closes the main menu
        //------buttonSix--------
            }else if(e.getSource() == buttonSix){
                askAge(); //opens askAge GUI
                dispose();//closes the main menu
        //-----buttonBack---------
            }else if(e.getSource() == buttonBack){
                frame2.dispose(); //closes the current frame
                frameMorF.dispose();
                chooseFrame.dispose();
                new MyProgram(); //opens up the main menu again
        //------buttonBack--------
            }else if(e.getSource() == buttonFind) {
                firstName = textField.getText().trim().toLowerCase();
                lastName = textField2.getText().trim().toLowerCase();
                String name = firstName +" "+ lastName;
                citizen = myProgramUtility.findName(name);

                //if full name is not empty, display the person's info, else say "person not found"
                if(citizen.getFullName() != null) {
                    title.setText("Person Found!");
                    title.setForeground(new Color(42,163,42));
                    nameLabel.setText(" Name:  " + citizen.getFullName());
                    email.setText(" Email:  " + citizen.getEmail());
                    address.setText(" Address:  " + citizen.getAddress());
                    age.setText(" Age:  " + citizen.getAge());
                    district.setText(" District:  " + citizen.getDistrict());
                    gender.setText(" Gender:  " + citizen.getGender());

                    if(citizen.getResident()){
                        resident.setText(" Residency:  Resident");
                    }else{
                        resident.setText(" Residency:  Non-Resident");
                    }

                }else{
                    title.setText("Person Not Found!");
                    title.setForeground(Color.RED);
                    nameLabel.setText(" Name:");
                    email.setText(" Email:");
                    address.setText(" Address:");
                    age.setText(" Age:");
                    resident.setText(" Residency:");
                    district.setText(" District:");
                    gender.setText(" Gender:");
                }
        //------buttonMale--------
            }else if(e.getSource() == buttonMale){
                showMalesOnly(); //opens showMalesOnly GUI
                chooseFrame.dispose(); //closes the current frame
                dispose(); //closes the main frame
        //------buttonFemale--------
            }else if(e.getSource() == buttonFemale){
                showFemalesOnly(); //opens showFemalesOnly GUI
                chooseFrame.dispose(); //closes the current frame
                dispose(); //closes the main frame
        //------buttonOK--------
            }else if(e.getSource() == buttonOK){
                boolean b = false; //boolean for if statements
                //catches Number Format Exception
                try {
                    ageGroup = Integer.parseInt(textField.getText());
                }catch (NumberFormatException exception){
                    b = true;
                }

                String[][] table = myProgramUtility.listWithAgeGroup(ageGroup);
                if(table.length == 0){ //if table has no result, prompt an error
                    title.setText("No result found");
                    title.setForeground(Color.red);
                }

                else if(!b){ //displays the table if no error occurred
                    showAgeGroup();
                    chooseFrame.dispose();
                    dispose();
                }

                if (b){ //if NumberFormatException caught, prompt an error
                    title.setText("Enter a valid age");
                    title.setForeground(Color.red);
                }


        //------buttonBackAge--------
            }else if(e.getSource() == buttonBackAge){
                MyProgram p = new MyProgram(); //opens up main menu
                frame2.dispose(); //closes the current frame
                p.dispose(); //closes the main menu
                p.askAge(); //opens askAge GUI
        //------buttonBackMorF--------
            }else if(e.getSource() == buttonBackMorF){
                MyProgram p = new MyProgram(); //opens up main menu
                frameMorF.dispose(); //closes the current frame
                p.dispose(); //closes the main menu
                p.selectMaleOrFemale(); //opens selectMaleOrFemale GUI
            }

        } //end of actionPerformed method
    } //end of ButtonAction class


}//end of MyProgram class