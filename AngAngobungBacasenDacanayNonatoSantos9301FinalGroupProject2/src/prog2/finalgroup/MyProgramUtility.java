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

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Improvements:
//TODO: Katelyn - Add "countPopulationPerDistrict" method description and algorithm
//TODO: Lourdene - Add new "numberOfSenior" whole method code along with;
//TODO: Lourdene - Add "numberOfSenior" method description and algorithm
 */

//TODO: Lourdene - Add class description (javadoc comment)
public class MyProgramUtility {
    /**
     * Method to convert the csv to an Array list.
     *
     * @return list - the list of citizens
     */
    /*
     * Algorithm
     * 1. Declare a File object for the CSV file and a String variable to hold each line of the file. Also, create an empty ArrayList of Citizen objects to hold the parsed data.
     * 2. Create a BufferedReader object to read the CSV file.
     * 3. Use a while loop to read each line of the CSV file using the readLine() method of BufferedReader. This method returns a null when there are no more lines to read in the file.
     * 4. Split each line using the split() method with "," as the separator. This returns an array of strings containing the fields in each line.
     * 5. Extract the necessary information from each line to create a Citizen object. This includes the citizen's full name, email, address, age, residency status, district, and gender.
     * 6. If the address field starts with a quotation mark, concatenate the strings until the end of the address field is found. Remove the quotation marks from the resulting string.
     * 7. If the gender field is "Female", set the gender of the Citizen object to 'F'.
     * 8. If the residency field is "Resident", set the residency status of the Citizen object to true.
     * 9. Add the created Citizen object to the ArrayList.
     * 10. When all lines in the CSV file have been processed, close the BufferedReader and return the ArrayList of Citizen objects.
     */
    public ArrayList<Citizen> csvToList(){
        //variable declarations
        File file = new File("AngAngobungBacasenDacanayNonatoSantos9301FinalGroupProject2/res/data.csv");
        String line;
        ArrayList<Citizen> list = new ArrayList<>();

        //parsing a CSV file into BufferedReader class constructor
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) { //returns a Boolean value
                String[] person = line.split(","); //use comma as separator

                //variables for citizen
                String fullName = person[0].concat(" "+person[1]);
                String email = person[2];
                String address = person[3];
                int age = Integer.parseInt(person[person.length - 4]);
                boolean residency = false;
                int district = Integer.parseInt(person[person.length - 2]);
                char gender = 'M';

                //if index 3 starts with ", concat until string ends with "
                if(person[3].startsWith("\"")){
                    address = ""; //resets the address for concatenation
                    for(int i=3; i<person.length; i++){ //concat the strings and removes "
                        address = address.concat(person[i]).replace("\"","");

                        if (person[i].endsWith("\"")){ //If string ends with ", breaks the loop
                            break;
                        }
                    }
                }

                //If citizen is female, set gender to F
                if(person[person.length - 1].equals("Female")){
                    gender = 'F';
                }

                //If citizen is resident, set residency to true
                if(person[person.length - 3].equals("Resident")){
                    residency = true;
                }

                //add citizen to list
                list.add(new Citizen(fullName, email, address, age, residency, district, gender));
            }//end while
        }catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    } //end of csvToList method

    /**
     * Method to return the default data for the GUI table.
     *
     * @return data - the array string of citizen list
     */
    //TODO: Lourdene - Add defaultList method algorithm
    public String[][] defaultList(){
        ArrayList<Citizen> list = csvToList();
        String[][] data = new String[list.size()][7];

        //populates the data array
        for(int i=0; i< list.size(); i++){
            String name = list.get(i).getFullName();
            String email = list.get(i).getEmail();
            String address = list.get(i).getAddress();
            String age = String.valueOf(list.get(i).getAge());
            String district = String.valueOf(list.get(i).getDistrict());
            String gender = String.valueOf(list.get(i).getGender());
            String resident;

            //if resident is true, resident = "Resident"; else "Non-Resident"
            if(list.get(i).getResident()){
                resident = "Resident";
            }else{
                resident = "Non-Resident";
            }

            //add information to data
            data[i][0] = name;
            data[i][1] = email;
            data[i][2] = address;
            data[i][3] = age;
            data[i][4] = resident;
            data[i][5] = district;
            data[i][6] = gender;
        }

        return data;
    } //end of defaultList method
    //TODO Charles - add javadoc and algorithm comment
    public String[][] filterDefaultList(String searchText) {
        String[][] allData = defaultList(); // Get all default data
        searchText = searchText.toLowerCase(); // Convert search text to lowercase for case-insensitive search

        // Use Java 8 Streams to filter the data
        String finalSearchText = searchText;
        List<String[]> filteredList = Arrays.stream(allData)
                .filter(row -> Arrays.stream(row)
                        .anyMatch(cell -> cell.toLowerCase().contains(finalSearchText)))
                .collect(Collectors.toList());

        // Convert the filtered list back to a 2D array
        String[][] filteredData = new String[filteredList.size()][];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }

    /**
         * Method to return the sorted data for the GUI table.
         *
         * @return data - the array string of citizen list
         */
    //TODO: Julienne - Add sortedList method algorithm (multi-line comment)
    public String[][] sortedList(){
        ArrayList<Citizen> list = csvToList();
        String[][] data = new String[list.size()][7];
        list = (ArrayList<Citizen>) list.stream()
                .sorted()
                .collect(Collectors.toList());

        //populates the data array
        for(int i=0; i< list.size(); i++){
            String name = list.get(i).getFullName();
            String email = list.get(i).getEmail();
            String address = list.get(i).getAddress();
            String age = String.valueOf(list.get(i).getAge());
            String district = String.valueOf(list.get(i).getDistrict());
            String gender = String.valueOf(list.get(i).getGender());
            String resident;

            //if resident is true, resident = "Resident"; else "Non-Resident"
            if(list.get(i).getResident()){
                resident = "Resident";
            }else{
                resident = "Non-Resident";
            }

            //add information to data
            data[i][0] = name;
            data[i][1] = email;
            data[i][2] = address;
            data[i][3] = age;
            data[i][4] = resident;
            data[i][5] = district;
            data[i][6] = gender;
        }

        return data;
    } // end of sortedList method
    //TODO Julienne -  Add Javadoc and algorithm multiline comment
    public String[][] filterMaleOnly(String searchText) {
        String[][] allData = listMaleOnly(); // Get all male-only data
        searchText = searchText.toLowerCase(); // Convert search text to lowercase for case-insensitive search

        // Use Java 8 Streams to filter the data
        String finalSearchText = searchText;
        List<String[]> filteredList = Arrays.stream(allData)
                .filter(row -> Arrays.stream(row)
                        .anyMatch(cell -> cell.toLowerCase().contains(finalSearchText)))
                .collect(Collectors.toList());

        // Convert the filtered list back to a 2D array
        String[][] filteredData = new String[filteredList.size()][];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }


    /**
     * Method to return the list of males for the GUI table.
     *
     * @return data - the array string of citizen list
     *
    Algorithm:
    1.Read the citizen data from a CSV file and store it in an ArrayList of Citizen objects.
    2.Filter the ArrayList to keep only male citizens by using a stream that filters based on the gender field of each Citizen object.
    3.Sort the filtered ArrayList in ascending order based on the natural order of the Citizen objects, which is based on their names.
    4.Convert the filtered and sorted ArrayList to a List using the collect method.
    5.Create a 2D String array with the same number of rows as the size of the filtered and sorted ArrayList, and 7 columns.
    6.Loop through each Citizen object in the filtered and sorted List, and for each Citizen object: a. Retrieve its name, email, address, age, district, gender, and resident status fields. b. Convert the age, district, gender, and resident status fields to String values. c. Set the resident status field to "Resident" if it is true, or "Non-Resident" if it is false. d. Add the Citizen's information to the corresponding row of the 2D String array.
    7.Return the 2D String array as the output of the method.
     */

    public String[][] listMaleOnly(){
        ArrayList<Citizen> list = csvToList();

        //filters the males only
        list = (ArrayList<Citizen>) list.stream()
                .filter(x -> x.getGender() == 'M')
                .sorted()
                .collect(Collectors.toList());

        String[][] data = new String[list.size()][7];

        //populates the data array
        for(int i=0; i< list.size(); i++){
            String name = list.get(i).getFullName();
            String email = list.get(i).getEmail();
            String address = list.get(i).getAddress();
            String age = String.valueOf(list.get(i).getAge());
            String district = String.valueOf(list.get(i).getDistrict());
            String gender = String.valueOf(list.get(i).getGender());
            String resident;

            //if resident is true, resident = "Resident"; else "Non-Resident"
            if(list.get(i).getResident()){
                resident = "Resident";
            }else{
                resident = "Non-Resident";
            }

            //add information to data
            data[i][0] = name;
            data[i][1] = email;
            data[i][2] = address;
            data[i][3] = age;
            data[i][4] = resident;
            data[i][5] = district;
            data[i][6] = gender;
        }

        return data;
    } // end of listMaleOnly method

    /**
     * Method to return the list of females for GUI table.
     *
     * @return data - the array string of citizen list
     */

    /**
     * This method filters and sorts the female citizens from the list of citizens.
     * It then populates a two-dimensional string array with the relevant information
     * of the filtered female citizens and returns the resulting array.
     *
     * @return a two-dimensional string array of the filtered and sorted female citizens' information
     */
    public String[][] listFemaleOnly(){
//retrieve the list of citizens
        ArrayList<Citizen> list = csvToList();

//filters the females only
        list = (ArrayList<Citizen>) list.stream()
                .filter(x -> x.getGender() == 'F')
                .sorted()
                .collect(Collectors.toList());

//initialize a two-dimensional string array to store the filtered female citizens' information
        String[][] data = new String[list.size()][7];

//populates the data array with the filtered female citizens' information
        for(int i=0; i< list.size(); i++){
//get the relevant information of the filtered female citizen
            String name = list.get(i).getFullName();
            String email = list.get(i).getEmail();
            String address = list.get(i).getAddress();
            String age = String.valueOf(list.get(i).getAge());
            String district = String.valueOf(list.get(i).getDistrict());
            String gender = String.valueOf(list.get(i).getGender());
            String resident;

            //if resident is true, resident = "Resident"; else "Non-Resident"
            if(list.get(i).getResident()){
                resident = "Resident";
            }else{
                resident = "Non-Resident";
            }

            //add the relevant information of the filtered female citizen to the data array
            data[i][0] = name;
            data[i][0] = name;
            data[i][1] = email;
            data[i][2] = address;
            data[i][3] = age;
            data[i][4] = resident;
            data[i][5] = district;
            data[i][6] = gender;
        }

        return data;
    } // end of listFemaleOnly method

    /**
     * Method to return the number of males from the list.
     *
     * @return list - number of males from the list
    numberOfMale Algorithm:
    1.Read the citizen data from a CSV file and store it in an ArrayList of Citizen objects.
    2.Use a stream to filter the ArrayList to keep only male citizens by using a lambda expression that checks if the gender field of each Citizen object is equal to 'M'.
    3.Call the count() method on the resulting stream to count the number of male citizens in the filtered stream.
    4.Return the count as the output of the method.
     */

    public long numberOfMale(){
        ArrayList<Citizen> list = csvToList();
        return list.stream()
                .filter(x -> x.getGender() == 'M')
                .count();
    } // end of numberOfMale method

    /**
     * Method to return the number of females from the list.
     *
     * @return list - number of females from the list
     */

    /**
     * This method retrieves the list of citizens and filters the female citizens from the list.
     * It then returns the count of the filtered female citizens.
     *
     * @return the count of the filtered female citizens
     */
    public long numberOfFemale(){
        //retrieve the list of citizens
        ArrayList<Citizen> list = csvToList();

        //filter the female citizens from the list and return the count of the filtered female citizens
        return list.stream()
                .filter(x -> x.getGender() == 'F')
                .count();
    }

    /**
     * Method to return a Citizen object that is equals to the entered name of user.
     *
     * @return foundCitizen - the citizen found by the user
     */
    /*
    * 1. Get the list of citizens from the CSV file using the csvToList method.
    * 2. Create a new Citizen object to store the found citizen's information.
    * 3. Use the stream method on the list of citizens to filter for the citizen with the given full name.
    * 4. Set the foundCitizen object's attributes to the corresponding attributes of the found citizen.
    * 5. Return the foundCitizen object.
    */
    public Citizen findName(String fullName){
        ArrayList<Citizen> list = csvToList();
        Citizen foundCitizen = null;

        for(Citizen c : list) {
            if(c.getFullName().toLowerCase().equals(fullName)) {
                foundCitizen = new Citizen();
                foundCitizen.setAll(c.getFullName(), c.getEmail(), c.getAddress(),
                        c.getAge() , c.getResident() , c.getDistrict(), c.getGender());
                break;
            }
        }
        return foundCitizen;
    } // end of findName method


    /**
     * Method to return a list of citizen that is equals to the entered age of user.
     *
     * @param ageGroup - the entered age of user
     * @return data - the array string of citizen list equivalent to the entered age
     */
    //TODO: Julienne - Add listWithAgeGroup method algorithm
    public String[][] listWithAgeGroup(int ageGroup){
        ArrayList<Citizen> list = csvToList();
        list = (ArrayList<Citizen>) list.stream()
                .filter(x -> x.getAge() == ageGroup)
                .sorted()
                .collect(Collectors.toList());

        String[][] data = new String[list.size()][7];
        //populates the data array
        for(int i=0; i< list.size(); i++){
            String name = list.get(i).getFullName();
            String email = list.get(i).getEmail();
            String address = list.get(i).getAddress();
            String age = String.valueOf(list.get(i).getAge());
            String district = String.valueOf(list.get(i).getDistrict());
            String gender = String.valueOf(list.get(i).getGender());
            String resident;

            //if resident is true, resident = "Resident"; else "Non-Resident"
            if(list.get(i).getResident()){
                resident = "Resident";
            }else{
                resident = "Non-Resident";
            }

            //add information to data
            data[i][0] = name;
            data[i][1] = email;
            data[i][2] = address;
            data[i][3] = age;
            data[i][4] = resident;
            data[i][5] = district;
            data[i][6] = gender;
        }

        return data;
    } // end of listWithAgeGroup method
    //TODO Katelyn - add javadoc and algorithm multiline comment
    public Map<Integer, Long> countPopulationByDistrict() {
        ArrayList<Citizen> list = csvToList();
        return list.stream()
                .collect(Collectors.groupingBy(Citizen::getDistrict, Collectors.counting()));
    }


} //end of MyProgramUtility class