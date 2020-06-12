module org.mavenfx {
    requires javafx.controls;
    requires javafx.fxml;

    // Packages created
    opens org.mavenfx to javafx.fxml;
    opens pizzaOrder_noCSS to javafx.fxml;
    opens menuScreen to javafx.fxml;
    opens chartProgram to javafx.fxml;
    // Exports
    exports org.mavenfx;
    exports pizzaOrder_noCSS;
    exports menuScreen;
    exports chartProgram;
}