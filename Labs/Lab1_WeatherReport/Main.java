import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String weatherConditions;
        String precipitationChance;
        String windSpeed;
        double highTemp;
        double lowTemp;
        int uvIndex;
 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
        
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index
        System.out.print("Enter today's weather conditions (e.g., Sunny/Cloudy/Rainy): ");
        weatherConditions = input.nextLine();
        System.out.print("Enter chance of precipitation: ");
        precipitationChance = input.nextLine();
        System.out.print("Enter wind speed (km/h): ");
        windSpeed = input.nextLine();
        System.out.print("Enter daily high temperature (°C): ");
        highTemp = input.nextDouble();
        System.out.print("Enter daily low temperature (°C): ");
        lowTemp = input.nextDouble();

        while(lowTemp > highTemp) {
            System.out.println("ERROR: Lower temperature cannot be higher than the high temperature. Please re-enter.");
            System.out.print("Enter daily low temperature (°C): ");
            lowTemp = input.nextDouble();
        }

        System.out.print("Enter UV index (0-10+): ");
        uvIndex = input.nextInt();
        while(uvIndex < 0) {
            System.out.println("ERROR: UV index cannot be negative. Please re-enter.");
            System.out.print("Enter UV index (0-10+): ");
            uvIndex = input.nextInt();
        }
 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary
        int highTempInt = (int)highTemp;
        int lowTempInt = (int)lowTemp;
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
 
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
 
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
