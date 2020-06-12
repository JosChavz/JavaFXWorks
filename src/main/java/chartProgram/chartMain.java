package chartProgram;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Arrays;

public class chartMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.observableArrayList(Arrays.asList(
                "John", "Samantha"
        )));
        xAxis.setLabel("Salespeople");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Sales");

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Comparison of Sells Between Two Salespersons");

        // First Month of Sells
        XYChart.Series<String, Number> month1 = new XYChart.Series<>();
        month1.setName("January");
        month1.getData().addAll(
                new XYChart.Data<>("John", 5),
                new XYChart.Data<>("Samantha", 1)
        );
        // Second Month of Sells
        XYChart.Series<String, Number> month2 = new XYChart.Series<>();
        month2.setName("January");
        month2.getData().addAll(
                new XYChart.Data<>("John", 25),
                new XYChart.Data<>("Samantha", 19)
        );
        // Third Month of Sells
        XYChart.Series<String, Number> month3 = new XYChart.Series<>();
        month3.setName("January");
        month3.getData().addAll(
                new XYChart.Data<>("John", 1),
                new XYChart.Data<>("Samantha", 100)
        );

        barChart.getData().addAll(month1, month2, month3);

        Group root = new Group(barChart);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
