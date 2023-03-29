module com.example.mydesktopplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mydesktopplanner to javafx.fxml;
    exports com.example.mydesktopplanner;
}