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
 *  Authors:
 *  @author Ang, Julienne
 *  @author Angobung, Charles Jacob
 *  @author Bacasen, Katelyn Ann
 *  @author Dacanay, Kurt Jonas
 *  @author Nonato, Marius Glenn
 *  @author Santos, Lourdene Eira
 */
package proj2.prog2.samcis.slu;

/**
 * The Citizen class represents a specific citizen with attributes used as the reference
 * class for the MyProgram class to hold and manage information about citizens.
 */
public class Citizen implements Comparable<Citizen>{
    //Declare the instance variables for Citizen.
    /**
     * Holds the string value of the full name of a citizen.
     */
    String fullName;
    /**
     * Holds the string value of the email of a citizen.
     */
    String email;
    /**
     * Holds the string value of the address of a citizen.
     */
    String address;
    /**
     * Holds the int value of the age of a citizen.
     */
    int age;
    /**
     * Holds the boolean value if the citizen is a resident or non-resident.
     */
    boolean resident;
    /**
     * Holds the int value of the district of a citizen.
     */
    int district;
    /**
     * Holds the char value if the citizen is a male or female.
     */
    char gender;

    /**
     * Default Constructor that creates the default values of fullName, email,
     * address, age, resident, district, and gender.
     */
    public Citizen(){
        fullName = "Im Nayeon";
        email = "1222333@gmail.com";
        address = "South Korea";
        age = 28;
        resident = true;
        district = 1;
        gender = 'F';
    } // end of Citizen default constructor

    /**
     * Constructor that creates a Citizen with a specified full name, email, address, age,
     * resident, district, and gender as its initial value. <br>
     *
     * @param fullName receives the full name for the Citizen
     * @param email receives the email for the Citizen
     * @param address receives the address for the Citizen
     * @param age receives the age for the Citizen
     * @param resident receives the resident condition for the Citizen
     * @param district receives the district number for the Citizen
     * @param gender receives the gender type for the Citizen
     */
    public Citizen(String fullName, String email, String address, int age, boolean resident, int district, char gender){
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.resident = resident;
        this.district = district;
        this.gender = gender;
    } // end of Citizen constructor

    //Getter/Accessor methods
    /**
     * Method that returns the full name of the person. <br>
     *
     * @return The full name of the person.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Method that returns address of the person. <br>
     *
     * @return The address of the person.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Method that returns the email address of the person. <br>
     *
     * @return The email address of the person.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Method that returns the age of the person. <br>
     *
     * @return The age of the person.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Method that returns the district of the person. <br>
     *
     * @return The district of the person.
     */
    public int getDistrict() {
        return this.district;
    }

    /**
     * Method that returns the gender of the person. <br>
     *
     * @return The gender of the person.
     */
    public char getGender() {
        return this.gender;
    }

    /**
     * Method that returns the resident status of the person. <br>
     *
     * @return The resident status of the person.
     */
    public boolean getResident() {
        return resident;
    }

    //Setter/Mutator methods
    /**
     * Method that sets the full name of the object. <br>
     *
     * @param fullName the full name to be set
     */
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    /**
     * Method that sets the address of the object.<br>
     *
     * @param address the address to be set
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Method that sets the email address of the object. <br>
     *
     * @param email the email address to be set
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Method that sets the age of the object. <br>
     *
     * @param age the age to be set
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Method that sets whether the object is a resident or not. <br>
     *
     * @param resident true if the object is a resident, false otherwise
     */
    public void setResident(boolean resident) {
        this.resident = resident;
    }

    /**
     * Method that sets the district of the object. <br>
     *
     * @param district the district to be set
     */
    public void setDistrict(int district){
        this.district = district;
    }

    /**
     * Method that sets the gender of the object. <br>
     *
     * @param gender the gender to be set ('M' for male, 'F' for female, or 'O' for other)
     */
    public void setGender(char gender){
        this.gender = gender;
    }

    /**
     * Method which takes in 7 parameters and sets the values of various instance
     * variables to the values passed as parameters, and has a void return type. <br>
     *
     *
     * @param fullName The full name of the person
     * @param email The email address of the person
     * @param address The address of the person
     * @param age The age of the person
     * @param resident The resident status of the person
     * @param district The district of the person
     * @param gender The gender of the person
     */
    /*
        Algorithm:
        1. Begin the setAll() method.
        2. Set the fullName variable to the passed fullName parameter using "this" keyword.
        3. Set the email variable to the passed email parameter using "this" keyword.
        4. Set the address variable to the passed address parameter using "this" keyword.
        5. Set the age variable to the passed age parameter using "this" keyword.
        6. Set the resident variable to the passed resident parameter using "this" keyword.
        7. Set the district variable to the passed district parameter using "this" keyword.
        8. Set the gender variable to the passed gender parameter using "this" keyword.
        9. End the setAll() method.
     */
    public void setAll(String fullName, String email, String address, int age, boolean resident, int district, char gender){
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.resident = resident;
        this.district = district;
        this.gender = gender;
    } // end of setAll method

    /**
     * Method that compares this Citizen object with the specified
     * Citizen object for order based on their full names. <br>
     *
     * @param o The Citizen object to be compared.
     * @return 0 if the full names are equal, a positive integer
     *         if this full name comes after the specified full name
     */
    /*
        Algorithm:
        1. Compare the full names of two Citizen objects.
        2. If the full names are equal, return 0.
        3. If this full name is greater (comes after) the specified full name, return a positive integer.
        4. If this full name is smaller (comes before) the specified full name, return a negative integer.
     */
    @Override
    public int compareTo(Citizen o) {
        if(this.fullName.equals(o.fullName)){
            return 0;
        }else if(this.fullName.compareToIgnoreCase(o.fullName)>0){
            return 1;
        }else{
            return -1;
        }
    } // end of compareTo method

    /**
     * Method that returns a concatenated string of a person's
     * information and has no parameters, with a return type of String. <br>
     *
     * @return A string containing the full name, email, address, age, resident status, district, and gender
    */
    /*
        Algorithm:
        1. Begin the toString() method.
        2. Concatenate the fullName, email, address, age, resident, district,
           and gender variables using the concatenation operator (+).
        3. Separate each variable with a comma (,).
        4. Return the concatenated string as the output of the method.
        5. End the toString() method.
     */
    @Override
    public String toString(){
        return fullName + "," + email + "," + address + "," + age + "," +
                resident + "," + district+ "," +gender;
    } // end of toString method
} // end of Citizen class