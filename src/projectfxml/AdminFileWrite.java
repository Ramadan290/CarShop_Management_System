package projectfxml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdminFileWrite {
	
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    
    //CSV file header
    private static final String FILE_HEADER = "UserName,Password";
    
    public static void writeAppendSingle(ArrayList<Admin> alist) {

        System.out.println(alist);
        
        FileWriter fileWriter = null;
	
        try {
            fileWriter = new FileWriter("Admin.csv");

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            int sz = alist.size();
            
            for(int i = 0; i < sz; i++) {
                fileWriter.append(String.valueOf(alist.get(i).getUsername()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(alist.get(i).getPassword()));
                fileWriter.append(COMMA_DELIMITER);
            }
            
            System.out.println("CSV file was created successfully !!!");
			
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
			
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static void writeAppendAll(Admin a) {

        FileWriter fileWriter = null;
				
        try {
            fileWriter = new FileWriter("vehicles.csv", true);

            //Write a new student object list to the CSV file
            fileWriter.append(String.valueOf(a.getUsername()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(a.getPassword()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(NEW_LINE_SEPARATOR);
                        
            System.out.println("CSV file was created successfully !!!");
			
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
			
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}