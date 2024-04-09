module org.example.optionalhomeassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.optionalhomeassignment to javafx.fxml;
    exports org.example.optionalhomeassignment;
}