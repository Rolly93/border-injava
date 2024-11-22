module com.track {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.track to javafx.fxml;
    exports com.track;
}
