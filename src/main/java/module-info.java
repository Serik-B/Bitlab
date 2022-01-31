module com.example.bitlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bitlab to javafx.fxml;
    exports com.example.bitlab;
}