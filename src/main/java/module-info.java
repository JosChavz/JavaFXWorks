module org.mavenfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.mavenfx to javafx.fxml;
    exports org.mavenfx;
}