import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
 
 
public class JavaFXLearningActivity extends Application {
 
 
    @Override
    public void start(Stage stage) {
 
 
        // =====================================================
        // ================= PART 1 ============================
        // GUI vs CLI (Concept to Code)
        // =====================================================
 
 
        // STEP 1:
        // Create a Label with text:
        // "This is a GUI Application"
        Label title = new Label("This is a GUI Application");
        
 
        // STEP 2:
        // Create a Scene with the label
        // Set width = 300, height = 200
        Scene scene1 = new Scene(title, 300,200);
 
        // STEP 3:
        // Set the scene to stage
        // Set title: "GUI vs CLI Demo"
        // Show the stage
        stage.setScene(scene1);
        stage.setTitle("GUI vs CLI Demo");
        stage.show();
 
        // =====================================================
        // ================= PART 2 ============================
        // JavaFX Controls
        // =====================================================
 
 
        // STEP 4:
        // Create the following controls:
        // Label: "Enter Name:"
        // TextField for name input
        // Button: "Submit"
        // Label for output
        
 
 
        // STEP 5:
        // Set button action:
        // When clicked, display:
        // "Hello <name>" in output label
 
 
 
 
 
 
 
 
 
 
        // =====================================================
        // ================= PART 3 ============================
        // Layouts (Containers)
        // =====================================================
 
 
        // STEP 6:
        // Create a VBox layout with spacing 10
        // Add all controls into VBox
 
 
 
 
 
 
 
 
 
 
        // STEP 7:
        // Create an HBox for buttons (if needed)
        // Add button inside HBox
 
 
 
 
 
 
 
 
 
 
        // STEP 8:
        // Create a GridPane for form:
        // Add "Enter Name" label and TextField
 
 
 
 
 
 
 
 
 
 
        // =====================================================
        // ================= PART 4 ============================
        // Event Handling
        // =====================================================
 
 
        // STEP 9:
        // Modify button click:
        // If input is empty → show "Name cannot be empty"
        // Else → show greeting message
 
 
 
 
 
 
 
 
 
 
        // =====================================================
        // ================= PART 5 ============================
        // MVC Concept (Understanding)
        // =====================================================
 
 
        // STEP 10:
        // Identify:
        // View → (Write which components)
        // Controller → (Which part handles click)
        // Model → (Where data is stored)
 
 
 
 
 
 
 
 
 
 
        // =====================================================
        // ================= PART 6 ============================
        // Scene Setup
        // =====================================================
 
 
        // STEP 11:
        // Create a Scene using VBox layout
        // Set size 350 x 250
 
 
 
 
 
 
 
 
 
 
        // STEP 12:
        // Set Scene to Stage and display it
 
 
 
 
 
 
 
 
 
 
    }
 
 
    public static void main(String[] args) {
        launch(args);
    }
}
