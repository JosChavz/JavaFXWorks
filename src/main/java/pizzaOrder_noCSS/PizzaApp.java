/**
 * Pizza Application without functionality and CSS
 * The bare-bones of the Pizza Application
 */
package pizzaOrder_noCSS;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PizzaApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Adding root pane
        GridPane root = new GridPane();
        root.setPadding(new Insets(15, 15, 15, 15));
        root.setHgap(10);
        root.setVgap(10);

        // Adding in the title
        HBox title = new HBox(new Label("Order Your Pizza Now!"));
        title.setAlignment(Pos.CENTER);

        // 3 Labels w/ TextFields
        Label nameL = new Label("Name:");
        Label phoneL = new Label("Phone:");
        Label addressL = new Label("Address:");
        TextField nameField = new TextField();
        TextField phoneField = new TextField();
        TextField addressField = new TextField();

        // Prompt Text to the text area
        nameField.setPromptText("Enter name here");
        phoneField.setPromptText("Enter phone number here");
        addressField.setPromptText("Enter address here");

        // Size Pane w/ Radio Buttons
        VBox sizeBox = new VBox();
        Label sizeL = new Label("Size");
        ToggleGroup sizeG = new ToggleGroup(); // To group radio buttons; NOTE: Var would be class scope
        RadioButton smallChoice = new RadioButton("Small");
        RadioButton medChoice = new RadioButton("Medium");
        RadioButton largeChoice = new RadioButton("Large");
        smallChoice.setToggleGroup(sizeG);
        medChoice.setToggleGroup(sizeG);
        largeChoice.setToggleGroup(sizeG);

        sizeBox.getChildren().addAll(sizeL, smallChoice, medChoice, largeChoice);

        // Crust Pane w/ Radio Buttons
        VBox crustBox = new VBox();
        Label crustL = new Label("Crust");
        ToggleGroup crustG = new ToggleGroup(); // To group radio buttons; NOTE: Var would be class scope
        RadioButton thinChoice = new RadioButton("Thin");
        RadioButton thickChoice = new RadioButton("Thick");
        thinChoice.setToggleGroup(crustG);
        thickChoice.setToggleGroup(crustG);

        crustBox.getChildren().addAll(crustL, thinChoice, thickChoice);

        // Toppings Pane w/ Check Boxes; NOTE: CheckBox var have to be out of scope
        VBox toppingsBox = new VBox();
        Label toppingsL = new Label("Toppings");
        CheckBox chkPepperoni = new CheckBox("Pepperoni");
        CheckBox chkMushrooms = new CheckBox("Mushroom");
        CheckBox chkAnchovies = new CheckBox("Anchovies");

        toppingsBox.getChildren().addAll(toppingsL, chkPepperoni, chkMushrooms, chkAnchovies);

        // Adding Buttons
        HBox buttonsBox = new HBox();
        buttonsBox.setSpacing(10);
        Button submitBtn = new Button("Submit");
        Button resetBtn = new Button("Reset");
        buttonsBox.getChildren().addAll(submitBtn, resetBtn);
        buttonsBox.setAlignment(Pos.CENTER_RIGHT);

        // Adding nodes into root
        root.add(title, 0, 0, 3, 1);
        root.add(nameL, 0, 1);
        root.add(nameField, 1, 1, 2, 1);
        root.add(phoneL, 0, 2);
        root.add(phoneField, 1, 2, 2, 1);
        root.add(addressL, 0, 3);
        root.add(addressField, 1, 3, 2, 1);
        root.add(sizeBox, 0, 5);
        root.add(crustBox, 1, 5);
        root.add(toppingsBox, 2, 5);
        root.add(buttonsBox, 0, 7, 3, 1);

        // Creating a scene and showing
        Scene scene = new Scene(root, 300, 330);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza App w/out CSS");
        primaryStage.show();

    }
}
