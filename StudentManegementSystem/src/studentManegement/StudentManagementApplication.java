package studentManegement;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class StudentManagementApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Management System");

        // Create a root layout
        VBox root = new VBox();

        // Create buttons for various actions
        Button addStudentButton = new Button("Add Student");
        Button updateStudentButton = new Button("Update Student");
        Button viewStudentDetailsButton = new Button("View Student Details");
        Button enrollInCourseButton = new Button("Enroll in Course");
        Button assignGradeButton = new Button("Assign Grade"); 

        // Add buttons to the layout
        root.getChildren().addAll(addStudentButton, updateStudentButton, viewStudentDetailsButton, enrollInCourseButton, assignGradeButton);

        // Create scenes for different actions
        Scene addStudentScene = createAddStudentScene();
        Scene updateStudentScene = createUpdateStudentScene();
        Scene viewStudentDetailsScene = createViewStudentDetailsScene();
        Scene enrollInCourseScene = createEnrollInCourseScene();
        Scene assignGradeScene = createAssignGradeScene(); 

        // Set actions for buttons
        addStudentButton.setOnAction(e -> primaryStage.setScene(addStudentScene));
        updateStudentButton.setOnAction(e -> primaryStage.setScene(updateStudentScene));
        viewStudentDetailsButton.setOnAction(e -> primaryStage.setScene(viewStudentDetailsScene));
        enrollInCourseButton.setOnAction(e -> primaryStage.setScene(enrollInCourseScene));
        assignGradeButton.setOnAction(e -> primaryStage.setScene(assignGradeScene)); 

        // Set the initial scene
        primaryStage.setScene(addStudentScene);

        // Display the primary stage
        primaryStage.show();
    }

    // Create scenes for different actions
    private Scene createAddStudentScene() {
        // Implement the UI for adding a student here
        return new Scene(new VBox(), 400, 300);
    }

    private Scene createUpdateStudentScene() {
        // Implement the UI for updating a student here
        return new Scene(new VBox(), 400, 300);
    }

    private Scene createViewStudentDetailsScene() {
        // Implement the UI for viewing student details here
        return new Scene(new VBox(), 400, 300);
    }

    private Scene createEnrollInCourseScene() {
        // Implement the UI for course enrollment, including the course selection dropdown
        VBox enrollLayout = new VBox();

        ComboBox<String> courseDropdown = new ComboBox<>();
        // Populate the dropdown with available courses (you need to populate it with course names)
        courseDropdown.getItems().addAll("Course A", "Course B", "Course C");

        enrollLayout.getChildren().add(courseDropdown);

        return new Scene(enrollLayout, 400, 300);
    }

    private Scene createAssignGradeScene() {
        // Implement the UI for grade assignment, including student selection, course selection, and grade input
        VBox assignGradeLayout = new VBox();

        ComboBox<String> studentDropdown = new ComboBox<>();
        // Populate the dropdown with available students 
        studentDropdown.getItems().addAll("Student 1", "Student 2", "Student 3");

        ComboBox<String> courseDropdown = new ComboBox<>();
        // Populate the dropdown with available courses 
        courseDropdown.getItems().addAll("Course A", "Course B", "Course C");

        TextField gradeInput = new TextField();
        gradeInput.setPromptText("Enter Grade");

        assignGradeLayout.getChildren().addAll(studentDropdown, courseDropdown, gradeInput);

        return new Scene(assignGradeLayout, 400, 300);
    }
}
