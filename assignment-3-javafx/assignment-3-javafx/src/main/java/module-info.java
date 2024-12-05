module com.ilac.assignment3javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.ilac.assignment3javafx to javafx.fxml;
    exports com.ilac.assignment3javafx;
}