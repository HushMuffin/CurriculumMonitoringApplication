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
package proj2.prog2.samcis.slu;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/**
 * The MyProgram Class is the main class that is responsible for managing the
 * citizen information and providing the user with options to interact with it.
 */
public class MyProgram{
    //Declare the instance field for MyProgram
    /**
     * ImageIcon object representing the icon used in the program.
     */
    ImageIcon icon = new ImageIcon("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject2/" +
            "res/icon2.png");

    /**
     * Instance of MyProgramUtility class used for program-specific utility functions.
     */
    MyProgramUtility myProgramUtility = new MyProgramUtility();

    /**
     * Citizen object representing a citizen in the program.
     */
    Citizen citizen;

    /**
     * Holds a default table cell renderer for customizing the appearance of table cells.
     */
    DefaultTableCellRenderer renderer;

    /**
     * Holds the header of a table.
     */
    JTableHeader header;

    //Declare the action listener for MyProgram
    /**
     * ActionListener object that handles button actions in the program.
     */
    ButtonAction buttonAction = new ButtonAction();

    //Declare the list for MyProgram
    /**
     * List of Citizen objects representing the data loaded from a CSV file.
     */
    private ArrayList<Citizen> list = myProgramUtility.csvToList();

    //Declare the buttons for MyProgram
    /**
     * Button for showing the list of citizens.
     */
    private RoundButton buttonOne;

    /**
     * Button for showing the sorted list of names of the citizens.
     */
    private RoundButton buttonTwo;

    /**
     * Button for showing the number of male and female citizens.
     */
    private RoundButton buttonThree;

    /**
     * Button for showing the list of male or female citizens only.
     */
    private RoundButton buttonFour;

    /**
     * Button for finding a person in the list.
     */
    private RoundButton buttonFive;

    /**
     * Button for displaying citizens with a certain age group.
     */
    private RoundButton buttonSix;

    /**
     * Button for displaying the population per district.
     */
    private RoundButton buttonSeven;

    /**
     * Button for showing the number of seniors.
     */
    private RoundButton buttonEight;

    /**
     * Button for exiting the program.
     */
    private RoundButton exitButton;

    /**
     * Holds a custom round button used for navigating to next windows.
     */
    private RoundButton nextButton;

    /**
     * Button for going back to the previous menu.
     */
    private RoundButton buttonBack;

    /**
     * Button for going back to the previous population menu.
     */
    private RoundButton buttonBackPopulation;

    /**
     * Button for going back to the previous window.
     */
    private RoundButton buttonBackSort;

    /**
     * Button for going back to the previous male/female menu.
     */
    private RoundButton buttonBackMorF;

    /**
     * Button for going back to the previous age group menu.
     */
    private RoundButton buttonBackAge;

    /**
     * Button for finding a person in the list.
     */
    private RoundButton buttonFind;

    /**
     * Button for selecting male citizens.
     */
    private RoundButton buttonMale;

    /**
     * Button for selecting female citizens.
     */
    private RoundButton buttonFemale;

    /**
     * Button for confirming an action or selection.
     */
    private RoundButton buttonOK;

    //Declare the text fields for MyProgram
    /**
     * Text field for input or display of text.
     */
    private JTextField textField;
    /**
     * Second text field for input or display of text.
     */
    private JTextField textField2;

    /**
     * Holds a text field for searching.
     */
    private JTextField searchField;

    //Declare the Panels
    /**
     * Holds a panel used to display an introduction or welcome message.
     */
    JPanel introPanel;

    /**
     * Holds a panel used to display a description or information.
     */
    JPanel descriptionPanel;

    /**
     * Holds a panel to display the buttons.
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
     * Holds the first panel for layout and component placement.
     */
    JPanel panel;

    /**
     * Holds the second panel for layout and component placement.
     */
    JPanel panel2;

    //Declare ScrollPanels
    /**
     * Scroll pane to provide scrollable view for a component.
     */
    JScrollPane scrollPane;

    //Declare JTables
    /**
     * Table component used for displaying data in tabular form.
     */
    JTable table;

    // Declare the labels for MyProgram
    /**
     * The title label for the program window.
     */
    JLabel title;

    /**
     * Holds a label used for displaying a guide or instructions.
     */
    JLabel guideLabel;

    /**
     * The label for the name field in the program window.
     */
    JLabel nameLabel;

    /**
     * The label for the email field in the program window.
     */
    JLabel email;

    /**
     * The label for the address field in the program window.
     */
    JLabel address;

    /**
     * The label for the age field in the program window.
     */
    JLabel age;

    /**
     * The label for the resident field in the program window.
     */
    JLabel resident;

    /**
     * The label for the district field in the program window.
     */
    JLabel district;

    /**
     * The label for the gender field in the program window.
     */
    JLabel gender;

    /**
     * The label for the first name search field in the program window.
     */
    JLabel findFirstName;

    /**
     * Holds a label used for displaying a description.
     */
    JLabel descriptionLabel;

    /**
     * Holds a label used for displaying a header or title.
     */
    JLabel headerLabel;

    /**
     * Holds a label used for displaying a search label or text.
     */
    JLabel searchLabel;

    /**
     * Holds a label used for displaying a greeting message.
     */
    JLabel greetLabel;

    /**
     * Holds a label used for displaying an exit message or icon.
     */
    JLabel exitLabel;

    /**
     * The label for the last name search field in the program window.
     */
    JLabel findLastName;

    // Declare the dialogs for MyProgram
    /**
     * Holds a dialog box used for displaying an exit prompt.
     */
    JDialog exitDialog;

    /**
     * Holds a dialog box used for displaying an introduction message.
     */
    JDialog introDialog;
    JDialog defaultListDialog = new JDialog();
    JDialog sortedListDialog =  new JDialog();
    JDialog popuByDistrictDialog = new JDialog();
    JDialog numOfMAndFDialog = new JDialog();
    JDialog numOfSenDialog = new JDialog();
    JDialog findPersonDialog = new JDialog();
    JDialog selectMOrFDialog = new JDialog();
    JDialog showMaleDialog = new JDialog();
    JDialog showFemaleDialog = new JDialog();
    JDialog askAgeDialog = new JDialog();
    JDialog showAgeGroupDialog = new JDialog();


    //Declare the Strings for MyProgram
    /**
     * The variable "firstName" is of type String, which represents a sequence of characters in a Java program.
     * It is used to store the first name of a citizen.
     */
    String firstName = "";

    /**
     * The variable "lastName" is also of type String. It is used to store the last name of a citizen.
     */
    String lastName = "";

    //Declare the ints for MyProgram
    /**
     * The variable "ageGroup" is of type int, which represents a numerical
     * value that can hold a range of integers. It is used to store the age
     * group of a citizen, which may be determined by their age or some other
     * relevant criteria.
     */
    int ageGroup;

    /**
     * Holds the colors used in the GUI of the program.
     */
    static Color pink = new Color(255, 175, 204);
    static Color peach = new Color(255, 229, 212);
    static Color darkPurple = new Color(105, 79, 93);
    static Color lightBlue = new Color(184, 193, 236);
    static Color navy = new Color(58, 79, 122);
    static Color purple = new Color(205, 180, 219);
    static Color green = new Color(10,221,8);

    JFrame mainMenuFrame;

    /**
     * Method for creating the main menu.
     *
     * @return null
     */
    public void mainMenu() {
        mainMenuFrame = new JFrame("MAIN MENU");
        //Labels
        JLabel titleLabel = new JLabel("MAIN MENU", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        titleLabel.setOpaque(true);
        titleLabel.setBackground(navy);
        titleLabel.setForeground(pink);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,20,0));

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

        buttonOne = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "1. Show the list of citizens");


        buttonTwo = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "2. Show sorted list of names of the citizens");
        buttonThree = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "3. Show number of male and female citizens");
        buttonFour = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "4. Show list of male or female citizens only");
        buttonFive = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "5. Find a person in the list");
        buttonSix = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "6. Display citizens with a certain age group");
        buttonSeven = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "7. Display population per district");
        buttonEight = new RoundButton("<html><div style='text-align: center; padding: 10px;'>" +
                "8. Show Number of Seniors");

        exitButton = new RoundButton("EXIT");
        //Implement button design to buttons
        buttonDesign(buttonOne);
        buttonDesign(buttonTwo);
        buttonDesign(buttonThree);
        buttonDesign(buttonFour);
        buttonDesign(buttonFive);
        buttonDesign(buttonSix);
        buttonDesign(buttonSeven);
        buttonDesign(buttonEight);
        buttonDesign(exitButton);

        //Add action listeners to buttons
        buttonOne.addActionListener(buttonAction);
        buttonTwo.addActionListener(buttonAction);
        buttonThree.addActionListener(buttonAction);
        buttonFour.addActionListener(buttonAction);
        buttonFive.addActionListener(buttonAction);
        buttonSix.addActionListener(buttonAction);
        buttonSeven.addActionListener(buttonAction);
        buttonEight.addActionListener(buttonAction);
        exitButton.addActionListener(buttonAction);

        //Panel for buttons
        buttonPanel = new JPanel(new GridLayout(4, 2, 20, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(15, 50, 20, 50));
        buttonPanel.setBackground(lightBlue);
        buttonPanel.add(buttonOne);
        buttonPanel.add(buttonTwo);
        buttonPanel.add(buttonThree);
        buttonPanel.add(buttonFour);
        buttonPanel.add(buttonFive);
        buttonPanel.add(buttonSix);
        buttonPanel.add(buttonSeven);
        buttonPanel.add(buttonEight);

        //Panel for instructions and frame content
        guidePanel = new JPanel(new BorderLayout());
        guidePanel.add(guideLabel, BorderLayout.CENTER);
        guidePanel.setBackground(lightBlue);
        guidePanel.setBorder(BorderFactory.createEmptyBorder(15, 100, 0, 100));

        topPanel = new JPanel(new BorderLayout());
        topPanel.add(titleLabel,BorderLayout.NORTH);
        topPanel.add(guidePanel, BorderLayout.CENTER);

        //Panel for exit button
        exitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        exitPanel.add(exitButton);
        exitPanel.setBackground(navy);

        //Frame Properties
        mainMenuFrame.setIconImage(icon.getImage());
        mainMenuFrame.setLayout(new BorderLayout());
        mainMenuFrame.add(topPanel, BorderLayout.NORTH);
        mainMenuFrame.add(buttonPanel, BorderLayout.CENTER);
        mainMenuFrame.add(exitPanel, BorderLayout.SOUTH);

        //Frame operations
        mainMenuFrame.setDefaultCloseOperation(mainMenuFrame.EXIT_ON_CLOSE);
        mainMenuFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                showExit();
                System.exit(0);
            }
        });
        mainMenuFrame.setSize(640,570);
        mainMenuFrame.setLocationRelativeTo(null);
        mainMenuFrame.setVisible(true);
    } // end of mainMenu method

    /**
     * Method to display the default citizen list.
     */
    /*
     * Displays a JTable containing the default list of citizens in the program,
     * with buttons to allow navigation between different sections of the program.
     *
     * Algorithm:
     * 1. Call the defaultList method of the MyProgramUtility object to retrieve the default list of citizens.
     * 2. Create a new 2D String array to store the data retrieved from the defaultList method.
     * 3. Create a new 1D String array to store the column names for the JTable.
     * 4. Create a new JTable with the data and column names, and set it to non-editable.
     * 5. Create a new JScrollPane to contain the JTable.
     * 6. Create a new JPanel to contain the navigation buttons.
     * 7. Add the navigation buttons to the buttonPanel.
     * 8. Add an action listener to the back button.
     * 9. Add the JScrollPane and buttonPanel to the JFrame.
     * 10. Set the properties of the JFrame, including the title, size, background color, and icon.
     * 11. Set the default close operation, make the JFrame non-resizable, and center it on the screen.
     * 12. Make the JFrame visible.
     */
    public void showDefaultList(){
        defaultListDialog = new JDialog();
        String[][] data = myProgramUtility.defaultList(); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table model
        DefaultTableModel tableModel = new DefaultTableModel(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        headerLabel = new JLabel("Default Citizen List", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buttonBack = new RoundButton("BACK");
        buttonDesign(buttonBack);
        buttonBack.addActionListener(buttonAction);

        //table
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 470));

        //Search
        searchLabel = new JLabel("Search: ");
        searchField = new JTextField(20);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            public void removeUpdate(DocumentEvent e) {
                updateTable();
            }
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }

            public void updateTable() {
                String searchText = searchField.getText();
                String[][] filteredData = myProgramUtility.filterDefaultList(searchText);
                updateTableData(table, filteredData);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(3);
        table.getColumnModel().getColumn(6).setPreferredWidth(3);

        //Panels
        scrollPane = new JScrollPane(table);

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

        tablePanel = new JPanel();
        tablePanel.add(searchPanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));
        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBack);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //frame properties
        defaultListDialog.setTitle("Citizen Application");
        defaultListDialog.add(headerLabel, BorderLayout.NORTH);
        defaultListDialog.add(tablePanel, BorderLayout.CENTER);
        defaultListDialog.add(buttonPanel, BorderLayout.SOUTH);
        defaultListDialog.setIconImage(icon.getImage());

        //frame operations
        defaultListDialog.setSize(1280, 700);
        defaultListDialog.setLocationRelativeTo(null);
        defaultListDialog.setResizable(false);
        defaultListDialog.setVisible(true);
        defaultListDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    } // end of showDefaultList method

    /**
     * Method to display the sorted citizen list.
     */
    /*
        Algorithm:
        1. Retrieve the sorted data from myProgramUtility.sortedList().
        2. Create a table with the sorted data and make the cells non-editable.
        3. Set the table's appearance and behavior.
        4. Create a scroll pane and a button panel.
        5. Add a "Back" button to the button panel.
        6. Configure the frame's layout, icon, title, and background color.
        7. Add the scroll pane and button panel to the frame.
        8. Configure frame operations such as close operation, size, and visibility.
     */
    public void showSortedList(){
        sortedListDialog = new JDialog();
        String[][] data = myProgramUtility.sortedList(); //calls method defaultList() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table model
        DefaultTableModel tableModel = new DefaultTableModel(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        headerLabel = new JLabel("Sorted Citizen List", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        buttonBackSort = new RoundButton("Back");
        buttonDesign(buttonBackSort);
        buttonBackSort.addActionListener(buttonAction);

        //table
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 470));

        //Search
        searchLabel = new JLabel("Search: ");
        searchField = new JTextField(20);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            public void removeUpdate(DocumentEvent e) {
                updateTable();
            }
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }

            public void updateTable() {
                String searchText = searchField.getText();
                String[][] filteredData = myProgramUtility.filterDefaultList(searchText);
                updateTableData(table, filteredData);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(3);
        table.getColumnModel().getColumn(6).setPreferredWidth(3);

        //Panels
        scrollPane = new JScrollPane(table);

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

        tablePanel = new JPanel();
        tablePanel.add(searchPanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBackSort);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //frame properties
        sortedListDialog.setTitle("Citizen Application");
        sortedListDialog.add(headerLabel, BorderLayout.NORTH);
        sortedListDialog.add(tablePanel, BorderLayout.CENTER);
        sortedListDialog.add(buttonPanel, BorderLayout.SOUTH);
        sortedListDialog.setIconImage(icon.getImage());

        //frame operations
        sortedListDialog.setSize(1280, 700);
        sortedListDialog.setLocationRelativeTo(null);
        sortedListDialog.setVisible(true);
        sortedListDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } // end of showSortedList method

    /**
     * Method to display the number of males and females.
     */
    /*
        Algorithm: //TODO: Nash - update algo
        1.Create a JLabel for the title of the window, and JLabels for displaying the number of males and females in the citizen data.
        2.Set the text of the JLabels for the number of males and females by calling the numberOfMale() and numberOfFemale() methods of an instance of the myProgramUtility class, respectively, and converting the results to String values using the valueOf() method.
        3.Set the font of the JLabels for the title, number of males, and number of females to a specific font using the setFont() method.
        4.Create a JPanel for the buttons, add the "Back" button to the panel, and set the background color of the panel.
        5.Create a JPanel for the labels, set the layout to a 2x2 GridLayout, and set the background color of the panel.
        6.Add the JLabels for the number of males and females to the panel.
        7.Add action listeners to the "Back" button using an ActionListener object that defines the actionPerformed() method to close the current JFrame and open the main menu JFrame.
        8.Set the properties of the JFrame, including the background color, size, and position.
        9.Add the JLabels and JPanels to the JFrame using the add() method.
        10.Display the JFrame using the setVisible() method.
     */
    public void numOfMaleAndFemale(){
        numOfMAndFDialog = new JDialog();
        //label
        title = new JLabel("Number of Male and Female", SwingConstants.CENTER);
        title.setFont(new Font("Helvetica", Font.BOLD, 25));
        title.setOpaque(true);
        title.setBackground(navy);
        title.setForeground(pink);
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel males = new JLabel("Males:  ", SwingConstants.LEFT);
        males.setFont(new Font("Century Gothic", Font.BOLD, 20));
        males.setOpaque(true);
        males.setBackground(lightBlue);
        males.setForeground(darkPurple);
        males.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 0));

        JLabel females = new JLabel("Females:  ", SwingConstants.LEFT);
        females.setFont(new Font("Century Gothic", Font.BOLD, 20));
        females.setOpaque(true);
        females.setBackground(lightBlue);
        females.setForeground(darkPurple);
        females.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 0));

        JLabel numOfMales = new JLabel(String.valueOf(myProgramUtility.numberOfMale()), SwingConstants.LEFT);
        numOfMales.setFont(new Font("Century Gothic", Font.BOLD, 20));
        numOfMales.setOpaque(true);
        numOfMales.setBackground(lightBlue);
        numOfMales.setForeground(peach);
        numOfMales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));

        JLabel numOfFemales = new JLabel(String.valueOf(myProgramUtility.numberOfFemale()), SwingConstants.LEFT);
        numOfFemales.setFont(new Font("Century Gothic", Font.BOLD, 20));
        numOfFemales.setOpaque(true);
        numOfFemales.setBackground(lightBlue);
        numOfFemales.setForeground(peach);
        numOfFemales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));

        //add action listeners to buttons
        buttonBack = new RoundButton("BACK");
        buttonDesign(buttonBack);
        buttonBack.addActionListener(buttonAction);

        //Panel for buttons
        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBack);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //Panel for labels
        panel = new JPanel(new GridLayout(2,2));
        panel.add(males);
        panel.add(numOfMales);
        panel.add(females);
        panel.add(numOfFemales);

        //dialog
        numOfMAndFDialog.setTitle("Citizen Application");
        numOfMAndFDialog.setIconImage(icon.getImage());
        numOfMAndFDialog.getContentPane().setBackground(lightBlue);
        numOfMAndFDialog.add(title, BorderLayout.NORTH);
        numOfMAndFDialog.add(panel, BorderLayout.CENTER);
        numOfMAndFDialog.add(buttonPanel, BorderLayout.SOUTH);

        //dialog operations
        numOfMAndFDialog.setSize(470, 300);
        numOfMAndFDialog.setLocationRelativeTo(null);
        numOfMAndFDialog.setResizable(false);
        numOfMAndFDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        numOfMAndFDialog.setVisible(true);
    } // end of numOfMaleAndFemale method

    /**
     * Method to open up a choice if user wants to show male or female.
     */
    public void selectMaleOrFemale(){
        selectMOrFDialog = new JDialog();
        //labels
        title = new JLabel("Male or Female?", SwingConstants.CENTER);
        title.setForeground(navy);
        title.setBackground(peach);
        title.setOpaque(true);
        title.setFont(new Font("Century Gothic", Font.PLAIN, 25));
        title.setBorder(BorderFactory.createEmptyBorder(50,20,0,20));
        //Buttons
        buttonBack = new RoundButton("BACK");
        buttonMale = new RoundButton("MALE");
        buttonFemale = new RoundButton("FEMALE");
        buttonDesign(buttonBack);
        buttonDesign(buttonMale);
        buttonDesign(buttonFemale);
        //Panel for buttons
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        buttonPanel.setBackground(peach);
        buttonPanel.add(buttonMale);
        buttonPanel.add(buttonFemale);
        buttonPanel.add(buttonBack);

        buttonMale.addActionListener(buttonAction);
        buttonFemale.addActionListener(buttonAction);
        buttonBack.addActionListener(buttonAction);

        //frame
        selectMOrFDialog.setTitle("Select Male or Female");
        selectMOrFDialog.setLayout(new BorderLayout());
        selectMOrFDialog.add(title, BorderLayout.NORTH);
        selectMOrFDialog.add(buttonPanel, BorderLayout.CENTER);
        selectMOrFDialog.setIconImage(icon.getImage());
        selectMOrFDialog.getContentPane();
        //frame operations
        selectMOrFDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        selectMOrFDialog.setSize(360,260);
        selectMOrFDialog.setResizable(false);
        selectMOrFDialog.setLocationRelativeTo(null);
        selectMOrFDialog.setVisible(true);
    } // end of selectMaleOrFemale

    /**
     * Method display the male list.
     */
    /*
        Algorithm: //TODO: Nash - Update algo
         1.Call the listMaleOnly() method from MyProgramUtility class to get a two-dimensional string array of male citizens' information.
         2.Create a string array called column which contains the column headers for the JTable.
         3.Create a new JTable with the data and column arrays as parameters, and override the isCellEditable method of the table to make the cells non-editable.
         4.Set the preferred size and fill height properties of the table, and disallow the reordering of columns.
         5.Create a new JScrollPane with the table as parameter.
         6.Create a new JPanel called buttonPanel with a FlowLayout, and add the buttonBackMorF button to it.
         7.Set the background color of buttonPanel to a light gray.
         8.Add an action listener to buttonBackMorF button.
         9.Set the layout of frameMorF to FlowLayout.
         10.Set the title of the frameMorF to "Citizen App".
         11.Set the background color of the frameMorF to a light gray.
         12.Add the scrollPane and buttonPanel to the frameMorF.
         13.Set the default close operation of the frameMorF to JFrame.EXIT_ON_CLOSE.
         14.Set the size of the frameMorF to (1100, 675).
         15.Disallow the frame to be resizable.
         16.Set the location of the frameMorF to be in the center of the screen.
         17.Set the visibility of the frameMorF to true.
     */
    public void showMalesOnly(){
        showMaleDialog = new JDialog();

        String[][] data = myProgramUtility.listMaleOnly(); //calls method listMaleOnly() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table model
        DefaultTableModel tableModel = new DefaultTableModel(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        headerLabel = new JLabel("Male Citizen List", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buttonBackMorF = new RoundButton("Back");
        buttonDesign(buttonBackMorF);
        buttonBackMorF.addActionListener(buttonAction);

        //table
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 470));

        //Search
        searchLabel = new JLabel("Search: ");
        searchField = new JTextField(20);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            public void removeUpdate(DocumentEvent e) {
                updateTable();
            }
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }

            public void updateTable() {
                String searchText = searchField.getText();
                String[][] filteredData = myProgramUtility.filterDefaultList(searchText);
                updateTableData(table, filteredData);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(3);
        table.getColumnModel().getColumn(6).setPreferredWidth(3);

        //Panels
        scrollPane = new JScrollPane(table);

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

        tablePanel = new JPanel();
        tablePanel.add(searchPanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBackMorF);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //frame properties
        showMaleDialog.setTitle("Citizen Application");
        showMaleDialog.add(headerLabel, BorderLayout.NORTH);
        showMaleDialog.add(tablePanel, BorderLayout.CENTER);
        showMaleDialog.add(buttonPanel, BorderLayout.SOUTH);
        showMaleDialog.setIconImage(icon.getImage());

        //frame operations
        showMaleDialog.setSize(1280, 700);
        showMaleDialog.setLocationRelativeTo(null);
        showMaleDialog.setResizable(false);
        showMaleDialog.setVisible(true);
        showMaleDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    } // end of showMalesOnly method

    /**
     * Method that updates the data in a given JTable with
     * the provided two-dimensional array of data. <br>
     *
     * @param table The JTable to update
     * @param data  The two-dimensional array of data to populate the table with
     */
    /*
        Algorithm:
        1. Obtain the DefaultTableModel associated with the JTable.
        2. Set the row count of the table model to zero, effectively clearing the table.
        3. Iterate through each row in the data array.
           - Add the current row to the table model, appending it to the existing data.
        4. After iterating through all rows, the table will be updated with the new data.
     */
    private void updateTableData(JTable table, String[][] data) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0); // clear the table

        for (String[] row : data) {
            tableModel.addRow(row); // add rows to the table
        }
    } // end of updateTableData method

    /**
     * Method that  retrieves the female citizens list from the MyProgramUtility
     * and displays the information in a JTable. It also sets up the graphical
     * user interface for the table display.
     */
    public void showFemalesOnly(){
        showFemaleDialog = new JDialog();
        String[][] data = myProgramUtility.listFemaleOnly(); //calls method listMaleOnly() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table model
        DefaultTableModel tableModel = new DefaultTableModel(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        headerLabel = new JLabel("Female Citizen List", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        buttonBackMorF = new RoundButton("Back");
        buttonDesign(buttonBackMorF);
        buttonBackMorF.addActionListener(buttonAction);

        //table
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 470));

        //Search
        searchLabel = new JLabel("Search: ");
        searchField = new JTextField(20);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            public void removeUpdate(DocumentEvent e) {
                updateTable();
            }
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }

            public void updateTable() {
                String searchText = searchField.getText();
                String[][] filteredData = myProgramUtility.filterDefaultList(searchText);
                updateTableData(table, filteredData);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(3);
        table.getColumnModel().getColumn(6).setPreferredWidth(3);

        //Panels
        scrollPane = new JScrollPane(table);

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

        tablePanel = new JPanel();
        tablePanel.add(searchPanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBackMorF);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //frame properties
        showFemaleDialog.setTitle("Citizen Application");
        showFemaleDialog.add(headerLabel, BorderLayout.NORTH);
        showFemaleDialog.add(tablePanel, BorderLayout.CENTER);
        showFemaleDialog.add(buttonPanel, BorderLayout.SOUTH);
        showFemaleDialog.setIconImage(icon.getImage());

        //frame operations
        showFemaleDialog.setSize(1280, 700);
        showFemaleDialog.setLocationRelativeTo(null);
        showFemaleDialog.setResizable(false);
        showFemaleDialog.setVisible(true);
        showFemaleDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    } // end of showFemalesOnly method

    /**
     * Method to let the user enter a name in a text field and find if person exists
     */
    /*
     * Algorithm:
     * 1. Gets the first name and last name of the person to search from the two text fields.
     * 2. Allows the user to search for a person in the list of citizens with matching first and last names.
     *    a. If a matching person is found, display their details (name, email, address, age, residency,
     *       district, gender) in the corresponding label fields.
     *    b. If a matching person is not found, display an error message indicating that the person could not be found.
     * 3. A back button is created to allow the user to return to the main menu.*/
    public void findPerson(){
        findPersonDialog = new JDialog();
        //labels
        title = new JLabel("Find Person", SwingConstants.CENTER);
        title.setFont(new Font("Helvetica", Font.BOLD, 20));
        title.setOpaque(true);
        title.setBackground(navy);
        title.setForeground(pink);
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

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
        panel = new JPanel(new GridLayout(7,0));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,0));
        panel.setBackground(peach);
        panel.add(nameLabel);
        panel.add(email);
        panel.add(address);
        panel.add(age);
        panel.add(resident);
        panel.add(district);
        panel.add(gender);

        textField = new JTextField(5);
        textField2 = new JTextField(5);
        textField.setSize(10,10);
        textField2.setSize(10,10);

        panel2 = new JPanel(new GridLayout(2,2, 5, 5));
        panel2.setBorder(BorderFactory.createEmptyBorder(10,10,15,10));
        panel2.setBackground(peach);
        panel2.add(findFirstName);
        panel2.add(textField);
        panel2.add(findLastName);
        panel2.add(textField2);

        JPanel infoPanel = new JPanel(new BorderLayout());
        infoPanel.setBackground(lightBlue);
        infoPanel.add(panel);
        infoPanel.add(panel2, BorderLayout.SOUTH);
        //Buttons
        buttonFind = new RoundButton("FIND");
        buttonBack = new RoundButton("BACK");
        //add action listeners to buttons
        buttonDesign(buttonBack);
        buttonDesign(buttonFind);

        buttonBack.addActionListener(buttonAction);
        buttonFind.addActionListener(buttonAction);

        //Panel for buttons
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,9,9));
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonFind);
        buttonPanel.add(buttonBack);

        //frame
        findPersonDialog.setTitle("Citizen Application");
        findPersonDialog.setLayout(new BorderLayout());
        findPersonDialog.setIconImage(icon.getImage());
        findPersonDialog.add(title, BorderLayout.NORTH);
        findPersonDialog.add(infoPanel, BorderLayout.CENTER);
        findPersonDialog.add(buttonPanel, BorderLayout.SOUTH);

        //frame operations
        findPersonDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        findPersonDialog.setSize(360,400);
        findPersonDialog.setResizable(false);
        findPersonDialog.setLocationRelativeTo(null);
        findPersonDialog.setVisible(true);
    } // end of findPerson method

    /**
     * Method to open up a text field for user to enter the age
     */
    //TODO: Julienne - update algo
    public void askAge(){
        askAgeDialog = new JDialog();
        //labels
        title = new JLabel("Enter the age", SwingConstants.CENTER);
        title.setBorder(BorderFactory.createEmptyBorder(50,20,20,20));
        title.setForeground(navy);
        title.setBackground(peach);
        title.setOpaque(true);
        title.setFont(new Font("Century Gothic", Font.PLAIN, 25));

        //Buttons
        buttonBack = new RoundButton("BACK");
        buttonOK = new RoundButton("OK");
        buttonDesign(buttonBack);
        buttonDesign(buttonOK);
        //Textfield
        textField = new JTextField(5);
        //Panel for buttons
        JPanel buttonAndFieldPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        buttonAndFieldPanel.setBackground(peach);
        buttonAndFieldPanel.add(textField);
        buttonAndFieldPanel.add(buttonOK).setFocusable(false);
        buttonAndFieldPanel.add(buttonBack);


        //Add action listeners
        buttonOK.addActionListener(buttonAction);
        buttonBack.addActionListener(buttonAction);

        //frame
        askAgeDialog.setTitle("ENTER AGE");
        askAgeDialog.setLayout(new BorderLayout());
        askAgeDialog.add(title, BorderLayout.NORTH);
        askAgeDialog.add(buttonAndFieldPanel, BorderLayout.CENTER);
        askAgeDialog.setIconImage(icon.getImage());
        askAgeDialog.getContentPane();


        //frame operations
        askAgeDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        askAgeDialog.setSize(360,260);
        askAgeDialog.setResizable(false);
        askAgeDialog.setLocationRelativeTo(null);
        askAgeDialog.setVisible(true);
    } // end of askAge method

    /**
     * Method to display the people with the entered age from askAge method
     */
    //TODO: Julienne - update algo
    public void showAgeGroup(){
        showAgeGroupDialog = new JDialog();
        String[][] data = myProgramUtility.listWithAgeGroup(ageGroup); //calls method listWithAgeGroup() from MyProgramUtility
        String[] column = {"Full Name", "Email", "Address", "Age", "Resident", "District", "Gender"};

        //table model
        DefaultTableModel tableModel = new DefaultTableModel(data, column){
            //makes cells from table non-editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        headerLabel = new JLabel("Citizen Age Group List", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buttonBackAge = new RoundButton("Back");
        buttonDesign(buttonBackAge);
        buttonBackAge.addActionListener(buttonAction);

        //table
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 470));

        //Search
        searchLabel = new JLabel("Search: ");
        searchField = new JTextField(20);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateTable();
            }
            public void removeUpdate(DocumentEvent e) {
                updateTable();
            }
            public void insertUpdate(DocumentEvent e) {
                updateTable();
            }

            public void updateTable() {
                String searchText = searchField.getText();
                String[][] filteredData = myProgramUtility.filterDefaultList(searchText);
                updateTableData(table, filteredData);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(90);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(3);
        table.getColumnModel().getColumn(4).setPreferredWidth(3);
        table.getColumnModel().getColumn(5).setPreferredWidth(3);
        table.getColumnModel().getColumn(6).setPreferredWidth(3);

        //Panels
        scrollPane = new JScrollPane(table);

        searchPanel = new JPanel();
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.setBackground(peach);
        searchPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

        tablePanel = new JPanel();
        tablePanel.add(searchPanel);
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));

        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBackAge);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //frame properties
        showAgeGroupDialog.setTitle("Citizen Application");
        showAgeGroupDialog.add(headerLabel, BorderLayout.NORTH);
        showAgeGroupDialog.add(tablePanel, BorderLayout.CENTER);
        showAgeGroupDialog.add(buttonPanel, BorderLayout.SOUTH);
        showAgeGroupDialog.setIconImage(icon.getImage());

        //frame operations
        showAgeGroupDialog.setSize(1280, 700);
        showAgeGroupDialog.setLocationRelativeTo(null);
        showAgeGroupDialog.setResizable(false);
        showAgeGroupDialog.setVisible(true);
        showAgeGroupDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    } // end of showAgeGroup method

    /**
     * Method to display the population per district in a table format.
     */
    //TODO: Nash - update algo
    public void showPopulationByDistrict() {
        popuByDistrictDialog = new JDialog();
        Map<Integer, Long> populationByDistrict = myProgramUtility.countPopulationByDistrict();
        String[] column = {"District", "Population"};
        String[][] data = new String[populationByDistrict.size()][2];

        int index = 0;
        for (Map.Entry<Integer, Long> entry : populationByDistrict.entrySet()) {
            data[index][0] = String.valueOf(entry.getKey());
            data[index][1] = String.valueOf(entry.getValue());
            index++;
        }

        //labels
        title = new JLabel("Population Per District", SwingConstants.CENTER);
        title.setFont(new Font("Helvetica", Font.BOLD, 25));
        title.setOpaque(true);
        title.setBackground(navy);
        title.setForeground(pink);
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buttonBackPopulation = new RoundButton("Back");
        buttonDesign(buttonBackPopulation);
        buttonBackPopulation.addActionListener(buttonAction);

        //table
        table = new JTable(data, column){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);

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

        //Panes/Panels
        scrollPane = new JScrollPane(table);

        JPanel tablePanel = new JPanel();
        tablePanel.add(scrollPane);
        tablePanel.setBackground(peach);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,15));

        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBackPopulation);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //frame
        popuByDistrictDialog.setLayout(new BorderLayout());
        popuByDistrictDialog.setIconImage(icon.getImage());
        popuByDistrictDialog.setTitle("Citizen Application");
        popuByDistrictDialog.getContentPane();
        popuByDistrictDialog.add(title, BorderLayout.NORTH);
        popuByDistrictDialog.add(tablePanel, BorderLayout.CENTER);
        popuByDistrictDialog.add(buttonPanel, BorderLayout.SOUTH);

        //frame operations
        popuByDistrictDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        popuByDistrictDialog.setSize(650, 520);
        popuByDistrictDialog.setLocationRelativeTo(null);
        popuByDistrictDialog.setVisible(true);
    } // end of showPopulationByDistrict method

    //TODO: Javadoc and multi-line comment
    public void numOfSeniors(){
        numOfSenDialog = new JDialog();
        //label
        title = new JLabel("Number of Seniors", SwingConstants.CENTER);
        title.setFont(new Font("Helvetica", Font.BOLD, 25));
        title.setOpaque(true);
        title.setBackground(navy);
        title.setForeground(pink);
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel seniors = new JLabel("Seniors:  ", SwingConstants.LEFT);
        seniors.setFont(new Font("Century Gothic", Font.BOLD, 20));
        seniors.setOpaque(true);
        seniors.setBackground(lightBlue);
        seniors.setForeground(darkPurple);
        seniors.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 0));

        JLabel numOfSeniors = new JLabel(String.valueOf(myProgramUtility.numberOfSenior()), SwingConstants.LEFT);
        numOfSeniors.setFont(new Font("Century Gothic", Font.BOLD, 20));
        numOfSeniors.setOpaque(true);
        numOfSeniors.setBackground(lightBlue);
        numOfSeniors.setForeground(peach);
        numOfSeniors.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));

        //add action listeners to buttons
        buttonBack = new RoundButton("BACK");
        buttonDesign(buttonBack);
        buttonBack.addActionListener(buttonAction);

        //Panel for buttons
        buttonPanel = new JPanel();
        buttonPanel.setBackground(navy);
        buttonPanel.add(buttonBack);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        //Panel for labels
        panel = new JPanel(new GridLayout(1,2));
        panel.add(seniors);
        panel.add(numOfSeniors);

        //dialog
        numOfSenDialog.setTitle("Citizen Application");
        numOfSenDialog.setIconImage(icon.getImage());
        numOfSenDialog.getContentPane().setBackground(lightBlue);
        numOfSenDialog.add(title, BorderLayout.NORTH);
        numOfSenDialog.add(panel, BorderLayout.CENTER);
        numOfSenDialog.add(buttonPanel, BorderLayout.SOUTH);

        //dialog operations
        numOfSenDialog.setSize(450, 250);
        numOfSenDialog.setLocationRelativeTo(null);
        numOfSenDialog.setResizable(false);
        numOfSenDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        numOfSenDialog.setVisible(true);
    } // end of numOfSeniors method

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
     * Method to create a JDialog window with a title "Citizen App" and
     * a message "PERSON NOT FOUND!" in the center of the window.
     */
    /*
     * Algorithm:
     * 1. Create a JDialog with a title "Citizen App" and set it to modal.
     * 2. Create a JLabel with the text "PERSON NOT FOUND!" and center alignment,
     *    and set its font to bold, size 20, and color to pink.
     * 3. Create a JPanel with BorderLayout and set its background color to navy.
     * 4. Add the JLabel to the center of the JPanel.
     * 5. Add the JPanel to the content pane of the JDialog.
     * 6. Set the icon image, size, location, visibility, and default close operation of the JDialog.
     */
    private void showPersonNotFound() {
        exitDialog = new JDialog();
        exitDialog.setTitle("Citizen App");
        exitDialog.setModal(true);

        JLabel exitL = new JLabel("PERSON NOT FOUND!", SwingConstants.CENTER);
        exitL.setFont(new Font("Helvetica", Font.BOLD, 20));
        exitL.setForeground(Color.RED);

        JPanel exitPanel = new JPanel(new BorderLayout()); // use BorderLayout for exitPanel
        exitPanel.setBackground(peach);
        exitPanel.add(exitL, BorderLayout.CENTER); // add exitL to the center of exitPanel

        exitDialog.getContentPane().add(exitPanel); // add exitPanel to the content pane of exitDialog
        exitDialog.setIconImage(icon.getImage());
        exitDialog.setSize(400, 120);
        exitDialog.setLocationRelativeTo(null);
        exitDialog.setVisible(true);
        exitDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    } // end of showPersonNotFound method

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
        exitDialog.setTitle("Citizen Application");
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
    public void showIntroduction() {
        introDialog = new JDialog();
        introDialog.setTitle("Citizen Application");
        introDialog.setModal(true);

        headerLabel = new JLabel("Citizen Application", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(navy);
        headerLabel.setForeground(pink);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        greetLabel = new JLabel("WELCOME!", SwingConstants.CENTER);
        greetLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        greetLabel.setForeground(darkPurple);
        greetLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));

        descriptionLabel = new JLabel("<html><div style='text-align: justify;'>" +
                "The application is designed to monitor and manage data related " +
                "to citizens. It provides a platform to retrieve information " +
                "about individuals, such as their full name, email, address, age, " +
                "resident status, district, and gender. Please proceed to the next window for the Main Menu.</html>",
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
     * Method to run the application program.
     */
    /*
        Algorithm:
        1. Show the introduction of the application.
        2. Display the main menu for managing and monitoring citizen data.
        3. Allow the user to interact with various features such as viewing lists, sorting
           data, counting population, finding individuals, and analyzing demographics.
        4. Continue application execution until the user exits or performs other actions.
        5. Ensure responsiveness and navigation through menus for efficient data management.
        6. Terminate program execution when the user exits or completes tasks.
     */
    public void run() {
        showIntroduction();
        mainMenu();
    } // end of run method

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
        MyProgram program;
        try {
            program = new MyProgram();
            program.run();
        }catch (ArithmeticException exx){
            System.out.println(exx.getMessage());
        }
    } // end of main method

    //---Action Listener class for buttons---
    /**
     * The ButtonAction Class is a ActionListener implementation for handling button actions in the GUI.
     * Handles button clicks and performs corresponding actions, such as opening different GUI screens,
     * finding a person, displaying filtered lists, and showing population statistics.
     * Manages navigation and frame closure.
     */
    public class ButtonAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //------buttonOne--------
            if(e.getSource() == buttonOne){
                showDefaultList(); //opens showDefaultList GUI
                mainMenuFrame.dispose();
                //------buttonTwo--------
            }else if(e.getSource() == buttonTwo){
                showSortedList(); //opens showSortedList GUI
                mainMenuFrame.dispose();
                //------buttonThree--------
            }else if(e.getSource() == buttonThree){
                numOfMaleAndFemale(); //opens numOfMaleAndFemale GUI
                mainMenuFrame.dispose();
                //------buttonFour--------
            }else if(e.getSource() == buttonFour){
                selectMaleOrFemale(); //opens selectMaleOrFemale GUI
                mainMenuFrame.dispose();
                //------buttonFive--------
            }else if(e.getSource() == buttonFive){
                findPerson(); //opens findPerson GUI
                mainMenuFrame.dispose();
                //------buttonSix--------
            }else if(e.getSource() == buttonSix){
                askAge(); //opens askAge GUI
                mainMenuFrame.dispose();
                //-----buttonSeven---------
            }else if(e.getSource() == buttonSeven){
                showPopulationByDistrict(); //opens showPopulationByDistrict GUI
                mainMenuFrame.dispose();
                //-----buttonEight---------
            }else if(e.getSource() == buttonEight) {
                numOfSeniors(); //opens numOfSeniors GUI
                mainMenuFrame.dispose();
                //-----exitButton---------
            }else if(e.getSource() == exitButton) {
                showExit();
                System.exit(0);
            } else if(e.getSource() == nextButton){
                introDialog.dispose();
                //-----buttonBack----------
            }else if(e.getSource() == buttonBack){
                defaultListDialog.dispose(); //closes the current frame
                numOfMAndFDialog.dispose();
                numOfSenDialog.dispose();
                findPersonDialog.dispose();
                askAgeDialog.dispose();
                selectMOrFDialog.dispose();
                mainMenu();
                //------buttonFind--------
            }else if(e.getSource() == buttonFind) {
                firstName = textField.getText().trim().toLowerCase();
                lastName = textField2.getText().trim().toLowerCase();
                String name = firstName +" "+ lastName;
                citizen = myProgramUtility.findName(name);

                // Check if the citizen was found
                if(citizen != null && citizen.getFullName() != null) {
                    title.setText("Person Found!");
                    title.setForeground(green);
                    nameLabel.setText(" Name:    " + citizen.getFullName().toUpperCase());
                    email.setText(" Email:    " + citizen.getEmail());
                    address.setText(" Address:    " + citizen.getAddress());
                    age.setText(" Age:    " + citizen.getAge());
                    district.setText(" District:    " + citizen.getDistrict());
                    gender.setText(" Gender:    " + citizen.getGender());

                    if(citizen.getResident()){
                        resident.setText(" Residency:    Resident");
                    }else{
                        resident.setText(" Residency:    Non-Resident");
                    }
                } else {
                    title.setText("Person Not Found!");
                    title.setForeground(Color.RED);
                    showPersonNotFound();
                }

                //------buttonMale--------
            } else if(e.getSource() == buttonMale){
                selectMOrFDialog.dispose(); //closes the current frame
                showMalesOnly(); //opens showMalesOnly GUI
                //------buttonFemale--------
            } else if(e.getSource() == buttonFemale){
                selectMOrFDialog.dispose(); //closes the current frame
                showFemalesOnly(); //opens showFemalesOnly GUI
                //------buttonOK--------
            } else if(e.getSource() == buttonOK){
                boolean b = false; //boolean for if statements
                //catches Number Format Exception
                try {
                    ageGroup = Integer.parseInt(textField.getText());
                } catch (NumberFormatException exception){
                    b = true;
                }

                String[][] table = myProgramUtility.listWithAgeGroup(ageGroup);
                if(table.length == 0){ //if table has no result, prompt an error
                    title.setText("No result found");
                    title.setForeground(Color.red);
                } else if(!b) { //displays the table if no error occurred
                    showAgeGroup();
                    selectMOrFDialog.dispose();
                }

                if (b){ //if NumberFormatException caught, prompt an error
                    title.setText("Enter a valid age");
                    title.setForeground(Color.red);
                }

                //------buttonBackAge--------
            }else if(e.getSource() == buttonBackAge){
                showAgeGroupDialog.dispose(); //closes the current frame
                askAge(); //opens askAge GUI
                //------buttonBackMorF--------
            }else if(e.getSource() == buttonBackMorF){
                showMaleDialog.dispose(); //closes the current frame
                showFemaleDialog.dispose();
                selectMaleOrFemale(); //opens selectMaleOrFemale GUI
                //-----buttonBackPopulation
            }else if(e.getSource() == buttonBackPopulation){
                popuByDistrictDialog.dispose(); //closes the current frame
                mainMenu();
            } else if(e.getSource() == buttonBackSort) {
                sortedListDialog.dispose(); //closes the current frame
                mainMenu();
            }

        } //end of actionPerformed method
    } //end of ButtonAction class
}//end of MyProgram class