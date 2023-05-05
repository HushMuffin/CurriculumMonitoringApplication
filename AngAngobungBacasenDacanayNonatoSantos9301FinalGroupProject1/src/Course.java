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

/**
 * The Course class represents a specific educational course with attributes,
 * used as the reference class for the CurriculumMonitoringApplication class
 * to hold and manage information about courses.
 */
public class Course implements Comparable<Course> {
    //Declare the instance variables for Course.
    /**
     * Holds the string value of the year.
     */
    private String year;
    /**
     * Holds the string value of the term.
     */
    private String term;
    /**
     * Holds the string value of the course number.
     */
    private String courseNumber;
    /**
     * Holds the string value of the course descriptive title.
     */
    private String descTitle;
    /**
     * Holds the double value of the course units.
     */
    private double units;
    /**
     * Holds the int value of the course grades.
     */
    private int grades;

    //TODO: Marius - Add default constructor description and give contents inside
    public Course(){} // end of Course default constructor

    // This constructor contains the year, term, courseNumber, decTitle, units, and grades for the class
    public Course(String year, String term, String courseNumber, String descTitle, double units, int grades) {
        this.year = year;
        this.term = term;
        this.courseNumber = courseNumber;
        this.units = units;
        this.descTitle=descTitle;
        this.grades=grades;
    } // end of Course constructor

    // This constructor contains the courseNumber, descTitle, and units for the class
    public Course(String courseNumber, String descTitle, double units){
        this.courseNumber = courseNumber;
        this.descTitle = descTitle;
        this.units = units;
    } // end of Course constructor

    /**
     * Getter/Accessor Method that returns the year. <br>
     *
     * @return year the year a course was taken
     */
    /*
       Algorithm:
       1. Return the year of the course.
     */
    public String getYear() {
        return year;
    }

    /**
     * Getter/Accessor Method that returns the course term. <br>
     *
     * @return term the course term
     */
    /*
       Algorithm:
       1. Return the term of the course.
     */
    public String getTerm() {
        return term;
    }

    /**
     * Getter/Accessor Method that returns the course number. <br>
     *
     * @return courseNumber the number or code of the course
     */
    /*
       Algorithm:
       1. Return the course number of the course.
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Getter/Accessor Method that returns the descriptive
     * title of the course. <br>
     *
     * @return descTitle the descriptive title of the course
     */
    /*
       Algorithm:
       1. Return the descriptive title of the course.
     */
    public String getDescTitle() {
        return descTitle;
    }

    /**
     * Getter/Accessor Method that returns the course units. <br>
     *
     * @return units the units to take for a course
     */
    /*
       Algorithm:
       1. Return the units of the course.
     */
    public double getUnits() {
        return units;
    }

    /**
     * Getter/Accessor Method that returns the course grades. <br>
     *
     * @return grades the grade of a course
     */
    /*
       Algorithm:
       1. Return the grades of the course.
     */
    public int getGrades() {
        return grades;
    }

    /**
     * Mutator/Setter Method to set the course number value of the course. <br>
     *
     * @param courseNumber sets the value of the courseNumber of this course to courseNumber
     */
    /*
       Algorithm:
       1. Accept the courseNumber as input.
       2. Set the courseNumber of the course to the courseNumber value.
     */
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * Mutator/Setter Method to set the descriptive title value of the course. <br>
     *
     * @param descTitle sets the value of the descTitle of this course to descTitle
     */
    /*
       Algorithm:
       1. Accept the descTitle as input.
       2. Set the descTitle of the course to the descTitle value.
     */
    public void setDescTitle(String descTitle) {
        this.descTitle = descTitle;
    }

    /**
     * Mutator/Setter Method to set the grades value of the course. <br>
     *
     * @param grades sets the value of the grades of this course to grades
     */
    /*
       Algorithm:
       1. Accept the grades as input.
       2. Set the grades of the course to the grades value.
     */
    public void setGrades(int grades) {
        this.grades = grades;
    }

    /**
     * Mutator/Setter Method to set the term value of the course. <br>
     *
     * @param term sets the value of the term of this course to term
     */
    /*
       Algorithm:
       1. Accept the term as input.
       2. Set the term of the course to the term value.
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * Mutator/Setter Method to set the units value of the course. <br>
     *
     * @param units sets the value of the units of this course to units
     */
    /*
       Algorithm:
       1. Accept the units as input.
       2. Set the units of the course to the units value.
     */
    public void setUnits(double units) {
        this.units = units;
    }

    /**
     * Mutator/Setter Method to set the year value of the course. <br>
     *
     * @param year sets the value of the year of this course to year
     */
    /*
       Algorithm:
       1. Accept the year as input.
       2. Set the year of the course to the year value.
     */
    public void setYear(String year) {
        this.year = year;
    }

    /*
     This method checks whether the unit variable is a whole number or not, if it is then the method returns a string
     that concatenates the year, term, courseNumber, descTile, units, and grades instance variables
     */

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

    //TODO: Marius - check "equals" method
   /* public boolean equals(Course another){
        return this.toString().equals(((Course) another).toString());
    }

    */
    public boolean equals(String another){
        return this.toString().equals(another);
    }
} // end of Course class