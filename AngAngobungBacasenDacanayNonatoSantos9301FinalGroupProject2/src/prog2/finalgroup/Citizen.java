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
package prog2.finalgroup;

//TODO: Lourdene - Add reference class description (javadoc comment)
public class Citizen implements Comparable<Citizen>{
    //Declare the instance variables for Citizen.
    //TODO: Lourdene - Give javadoc comments for variable descriptions
    String fullName;
    String email;
    String address;
    int age;
    boolean resident;
    int district;
    char gender;

    //TODO: Marius - Add default constructor description (javadoc comment) and give contents inside
    public Citizen(){ } // end of Citizen default constructor

    //TODO: Lourdene - Add constructor description (javadoc comment)
    public Citizen(String fullName, String email, String address, int age, boolean resident, int district, char gender){
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.resident = resident;
        this.district = district;
        this.gender = gender;
    } // end of Citizen constructor

    //TODO: Nash - Add setter descriptions (javadoc comment)
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    public void setDistrict(int district){
        this.district = district;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    //TODO: Nash - Add setAll method description (javadoc comment) and algorithm (multi-line comment)
    public void setAll(String fullName, String email, String address, int age, boolean resident, int district, char gender){
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.resident = resident;
        this.district = district;
        this.gender = gender;
    } // end of setAll method

    //TODO: Julienne - Add getters description (javadoc comment)
    public String getFullName(){
        return this.fullName;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public int getDistrict(){
        return this.district;
    }

    public char getGender(){
        return this.gender;
    }

    public boolean getResident() {
        return resident;
    }

    //TODO: Julienne - Add method description (javadoc comment) and algorithm (multi-line comment)
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

    //TODO: Nash - Add toString method description (javadoc comment) and algorithm (multi-line comment)
    @Override
    public String toString(){
        return fullName + "," + email + "," + address + "," + age + "," +
                resident + "," + district+ "," +gender;
    } // end of toString method
} // end of Citizen class