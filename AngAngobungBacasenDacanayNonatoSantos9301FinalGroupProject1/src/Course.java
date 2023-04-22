/**
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Team Number: 6
 * Memberfs:
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
 *  Authors:
 *  @author Ang, Julienne
 *  @author Angobung, Charles Jacob
 *  @author Bacasen, Katelyn Ann
 *  @author Dacanay, Kurt Jonas
 *  @author Nonato, Marius Glenn
 *  @author Santos, Lourdene Eira
 */

//TODO: Lourdene - Add reference class description
public class Course implements Comparable<Course> {
    //Declare the instance variables for Course.
    //TODO: Lourdene - Give javadoc comments for variable descriptions
    private String year;
    private String term;
    private String courseNumber;
    private String descTitle;
    private double units;
    private int grades;

    //TODO: Marius - Add default constructor description and give contents inside
    public Course(){} // end of Course default constructor

    //TODO: Julienne - Add constructor description
    public Course(String year, String term, String courseNumber, String descTitle, double units, int grades) {
        this.year = year;
        this.term = term;
        this.courseNumber = courseNumber;
        this.units = units;
        this.descTitle=descTitle;
        this.grades=grades;
    } // end of Course constructor

    //TODO: Julienne - Add constructor description
    public Course(String courseNumber, String descTitle, double units){
        this.courseNumber = courseNumber;
        this.descTitle = descTitle;
        this.units = units;
    } // end of Course constructor

    //TODO: Lourdene - Add getter descriptions
    public String getYear() {
        return year;
    }

    public String getTerm() {
        return term;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getDescTitle() {
        return descTitle;
    }

    public double getUnits() {
        return units;
    }

    public int getGrades() {
        return grades;
    }

    //TODO: Lourdene - Add setters description
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setDescTitle(String descTitle) {
        this.descTitle = descTitle;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public void setYear(String year) {
        this.year = year;
    }

    //TODO: Julienne - Add toString method description
    public String toString(){
        if(units%1 == 0 ){
            return year+","+term+","+courseNumber+","+descTitle+","+ (int)units+","+grades;
        }
        return year+","+term+","+courseNumber+","+descTitle+","+units+","+grades;
    } // end of toString method

    //TODO: Marius - Add “compareTo” method description and algorithm
    @Override
    public int compareTo(Course another) {
        if (grades == another.getGrades())
            return 0;
        else if (grades > another.getGrades())
            return -1;
        else
            return 1;
    } // end of compareTo method
} // end of Course class