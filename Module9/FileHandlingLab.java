package Module9;

/*Students practice:
 
File writing
File reading
File append operations
JSON serialization
JSON deserialization
Directory operations
Object-oriented programming 
Exception handling
*/
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
 
 
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
 
 
public class FileHandlingLab {
 
 
    // -------------------------------------
    // Student Class
    // -------------------------------------
    static class Student {
 
 
        public int id;
        public String name;
        public String course;
 
 
        // TODO 1:
        // Create a default constructor
 
 
        // TODO 2:
        // Create a parameterized constructor that initializes
        // id, name, and course
 
 
 
 
        // TODO 3:
        // Override toString() to display student info
        // Format example: 101: John - Java
 
 
    }
 
 
    public static void main(String[] args) {
 
 
        try {
 
 
            // -------------------------------------
            // 1. TEXT FILE WRITING
            // -------------------------------------
 
 
            String textFile = "students.txt";
 
 
            // TODO 4:
            // Write the header "Student List" to the file
 
 
            // TODO 5:
            // Append two student records
            // Example:
            // 101 - John - Java
            // 102 - Alice - Python
 
 
 
 
            // -------------------------------------
            // 2. READ TEXT FILE
            // -------------------------------------
 
 
            // TODO 6:
            // Read the entire file content into a String
 
 
            // TODO 7:
            // Print the content to the console
 
 
 
 
            // -------------------------------------
            // 3. CREATE STUDENT OBJECTS
            // -------------------------------------
 
 
            List<Student> students = new ArrayList<>();
 
 
            // TODO 8:
            // Add two Student objects to the list
 
 
 
 
            // -------------------------------------
            // 4. JSON SERIALIZATION
            // -------------------------------------
 
 
            // TODO 9:
            // Create ObjectMapper object
 
 
            // TODO 10:
            // Enable pretty printing (INDENT_OUTPUT)
 
 
            String jsonFile = "students.json";
 
 
            // TODO 11:
            // Convert the students list into JSON
            // and save it into the json file
 
 
 
 
            // -------------------------------------
            // 5. JSON DESERIALIZATION
            // -------------------------------------
 
 
            // TODO 12:
            // Read the JSON file back into a List
 
 
            // TODO 13:
            // Print the loaded students
 
 
 
 
            // -------------------------------------
            // 6. DIRECTORY CREATION
            // -------------------------------------
 
 
            File directory = new File("DataFolder");
 
 
            // TODO 14:
            // If directory does not exist, create it
 
 
            // TODO 15:
            // Print whether directory exists
 
 
 
 
            // -------------------------------------
            // 7. LIST FILES IN DIRECTORY
            // -------------------------------------
 
 
            File currentDirectory = new File(".");
 
 
            // TODO 16:
            // Loop through files and print file names
 
 
 
 
        }
        catch (IOException e) {
 
 
            System.out.println("Error: " + e.getMessage());
 
 
        }
    }
}