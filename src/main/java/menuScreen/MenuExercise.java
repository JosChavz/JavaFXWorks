package menuScreen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuExercise extends Application {
    private BorderPane pane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Creating root pane
        pane = new BorderPane();

        // Creating menu bar and items
        MenuBar mb = new MenuBar();
        Menu menu1 = new Menu("Test 1");
        Menu menu2 = new Menu("Test 2");
        Menu menu3 = new Menu("Test 3");

        MenuItem menuItem1 = new MenuItem("_Within");
        MenuItem menuItem2 = new MenuItem("_The");
        MenuItem menuItem3 = new MenuItem("_Menu");
        menu1.getItems().addAll(menuItem1, menuItem2, menuItem3); // Adding menu items to a menu

        mb.getMenus().addAll(menu1, menu2, menu3);

        // Creating sidenav
        VBox buttonsBox = new VBox();
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(15.0);
        Button button1 = new Button("El boton");
        button1.setId("spanish");
        button1.setOnAction(this::action);
        Button button2 = new Button("ボタン");
        button2.setId("japanese");
        button2.setOnAction(this::action);
        Button button3 = new Button("Button");
        button3.setId("english");
        button3.setOnAction(this::action);

        buttonsBox.getChildren().addAll(button1, button2, button3);

        // Adding into pane
        pane.setTop(mb);
        pane.setLeft(buttonsBox);

        // Setting the stage
        Scene root = new Scene(pane, 500, 300);
        primaryStage.setScene(root);
        primaryStage.setTitle("Basic Menu Exercise");
        primaryStage.show();
    }

    public void action(ActionEvent e) {
        Control c = (Control) e.getSource();
        switch (c.getId()) {
            case "spanish":
                pane.setCenter(new Label("Ese boton esta en espanol"));
                break;
            case "japanese":
                pane.setCenter(new Label("そのボタンはにほんごですよ。"));
                break;
            case "english":
                pane.setCenter(new Label("That button is in English."));
                break;
        }
    }
}
