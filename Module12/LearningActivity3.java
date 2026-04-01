import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LearningActivity3 extends Application {

    @Override
    public void start(Stage stage) {

        // ===== MENU =====
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("Form");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> stage.close());
        fileMenu.getItems().add(exitItem);
        menuBar.getMenus().add(fileMenu);

        // ===== TITLE =====
        Label title = new Label("Module 12 – JavaFX Controls");

        // ===== TEXT INPUT =====
        TextField nameField = new TextField();
        PasswordField passwordField = new PasswordField();

        // ===== COMBOBOX =====
        ComboBox<String> courseBox = new ComboBox<>();
        // TODO: add course options
        courseBox.getItems().addAll("Java", "Python", "JS");
        courseBox.setValue("Java");

        // ===== RADIO BUTTON =====
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        //To-Do
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);
        HBox genderBox = new HBox(10, male, female);

        // ===== CHECKBOX =====
        CheckBox reading = new CheckBox("Reading");
        CheckBox sports = new CheckBox("Sports");
        CheckBox music = new CheckBox("Music");
        VBox hobbyBox = new VBox(5, reading, sports, music);

        // ===== DATE PICKER =====
        DatePicker dobPicker = new DatePicker();

        // ===== SLIDER =====
        Slider ratingSlider = new Slider(0, 10, 5);
        ratingSlider.setShowTickLabels(true);

        // ===== SPINNER =====
        Spinner<Integer> ageSpinner = new Spinner<>(10, 100, 18);

        // ===== COLOR PICKER =====
        ColorPicker colorPicker = new ColorPicker();

        // ===== PROGRESS BAR =====
        ProgressBar progressBar = new ProgressBar(0.0);

        // ===== OUTPUT =====
        Label output = new Label();

        // ===== BUTTON =====
        Button submitBtn = new Button("Submit");
        submitBtn.setOnAction(e -> {
            // TODO: handle button click
            // Example: read values from fields and display in output
            String name = nameField.getText();
            String course = courseBox.getValue();
            String gender = (male.isSelected()) ? "Male"
                    : (female.isSelected()) ? "Female" : "";

            String hobbies = "";
            if (reading.isSelected()) {
                hobbies += "Reading";
            }
            if (sports.isSelected()) {
                hobbies += "Sports";
            }
            if (music.isSelected()) {
                hobbies += "Music";
            }
            //validation

            if (name.isEmpty()) {
                showError("Name cannot be empty!");
            }

            output.setText("Name: " + name
                    + "\nCourse: " + course
                    + "\nGender: " + gender
                    + "\nHobbies: " + hobbies);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Form Submitted");
            alert.show();

            progressBar.setProgress(1.0);
        });

        // ===== GRID FORM =====
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        // grid.setPadding(new Insets(10));

        // TODO: add all labels and controls to the grid
        grid.add(new Label("Name: "), 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(new Label("Password: "), 0, 1);
        grid.add(passwordField, 1, 1);

        grid.add(new Label("Course: "), 0, 2);
        grid.add(courseBox, 1, 2);

        grid.add(new Label("Gender: "), 0, 3);
        grid.add(genderBox, 1, 3);

        grid.add(new Label("Hobbies: "), 0, 4);
        grid.add(hobbyBox, 1, 4);

        grid.add(new Label("DOB: "), 0, 5);
        grid.add(dobPicker, 1, 5);

        grid.add(new Label("Rating: "), 0, 6);
        grid.add(ratingSlider, 1, 6);

        grid.add(new Label("Age: "), 0, 7);
        grid.add(ageSpinner, 1, 7);

        grid.add(new Label("Favourite Color: "), 0, 8);
        grid.add(colorPicker, 1, 8);

        grid.add(new Label("Progress: "), 0, 9);
        grid.add(progressBar, 1, 9);

        // ===== MAIN LAYOUT =====
        VBox root = new VBox(15);
        root.setPadding(new Insets(15));
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(menuBar, title, grid, submitBtn, output);

        Scene scene = new Scene(root, 450, 600); //(Vbox, width, height)
        stage.setTitle("Module 12 – Student Form");
        stage.setScene(scene);
        stage.show();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Form Submitted");

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}
