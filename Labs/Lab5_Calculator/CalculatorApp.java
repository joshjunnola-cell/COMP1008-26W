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

    private String operator = "";
    private double firstNumber = 0;

    @Override
    public void start(Stage primaryStage) {

        // Step 1: Create TextFields for input
        TextField firstNum = new TextField();
        firstNum.setPromptText("Enter first number");

        TextField secondNum = new TextField();
        secondNum.setPromptText("Enter second number");


        // Step 2: Create Buttons for operations
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");

        //extra buttons
        Button btnEq = new Button("=");
        Button btnClear = new Button("C");

        // Step 3: Create Label for result
        Label resultLabel = new Label("Results");

        // Step 4: HBox for buttons
        HBox buttonRow = new HBox(10);
        buttonRow.getChildren().addAll(btnAdd, btnSub, btnMul, btnDiv, btnEq, btnClear);

        // Step 5: VBox main layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(firstNum, secondNum, resultLabel, buttonRow);

        // Step 6: Event handling for buttons
        btnAdd.setOnAction(e -> operator = "+");
        btnSub.setOnAction(e -> operator = "-");
        btnMul.setOnAction(e -> operator = "*");
        btnDiv.setOnAction(e -> operator = "/");

        // code for "=" button function
        btnEq.setOnAction(e -> {
            try {
                double firstNumber = Double.parseDouble(firstNum.getText());
                double secondNumber = Double.parseDouble(secondNum.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;

                    case "-":
                        result = firstNumber - secondNumber;
                        break;

                    case "*":
                        result = firstNumber * secondNumber;
                        break;

                    case "/":
                        if (secondNumber == 0) {
                            resultLabel.setText("Cannot divide by zero");
                            return;
                        }
                        result = firstNumber / secondNumber;
                        break;

                    default:
                        resultLabel.setText("Select an operator");
                        return;
                }

                resultLabel.setText("Result: " + result);

            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid Input");
            }
        });

        // clear button "C" reset everything
        btnClear.setOnAction(e -> {
            firstNum.clear();
            secondNum.clear();
            operator = "";
            resultLabel.setText("Results");
        });

        // Step 7: Create scene and show stage
        Scene scene = new Scene(layout, 350, 250);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();
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
