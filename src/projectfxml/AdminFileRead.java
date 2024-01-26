package projectfxml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class AdminFileRead {
	
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";

    //Student attributes index
    private static final int Username_IDX = 0;
    private static final int Password_IDX = 1;
    
        
    public static ArrayList<Admin> findAll() {

        BufferedReader fileReader = null;
        ArrayList<Admin> alist = new ArrayList<Admin>();
        
        try {
        	
            //Create a new list of student to be filled by CSV file data 
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader("Admin.csv"));
            
            //Read the CSV file header to skip it
            fileReader.readLine();
            
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    //Create a new student object and fill his  data
                    Admin a = new Admin(Double.parseDouble(tokens[Username_IDX]),Double.parseDouble(tokens[Password_IDX]));
                    alist.add(a);
                }
            }
            System.out.println(alist);
            return (alist);
        } 
        catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return null;
    }}
    