module com.example.eduuuu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eduuuu to javafx.fxml;
    exports com.example.eduuuu;
}