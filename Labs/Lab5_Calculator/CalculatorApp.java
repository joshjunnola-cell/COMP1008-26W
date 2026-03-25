package Labs.Lab5_Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField input = new TextField();
 
        // Step 2: Create Buttons for operations
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");
        Button btnEq  = new Button("=");
        Button btnClear = new Button("C");
 
        // Step 3: Create Label for result
        Label resultLabel = new Label("Results");

        // Step 4: HBox for buttons
        HBox buttonRow = new HBox(10);
        buttonRow.getChildren().addAll(btnAdd, btnSub, btnMul, btnDiv, btnEq, btnClear);

        // Step 5: VBox main layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(input, resultLabel, buttonRow);

        // Step 6: Event handling for buttons
       
        // Step 7: Create scene and show stage
       
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
