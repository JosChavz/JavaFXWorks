module org.mavenfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.mavenfx to javafx.fxml;
    opens pizzaOrder_noCSS to javafx.fxml;
    exports org.mavenfx;
    exports pizzaOrder_noCSS;
}