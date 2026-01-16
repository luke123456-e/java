import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Convertitore extends Application {

    @Override
    public void start(Stage stage) {

        GridPane g = new GridPane();
        g.setHgap(10);
        g.setVgap(10);

        Label l1 = new Label("Euro");
        Label l2 = new Label("Dollari");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t2.setEditable(false);

        Button b = new Button("Converti");

        b.setOnAction(e -> {
            double euro = Double.parseDouble(t1.getText());
            t2.setText("" + (euro * 1.1));
        });

        g.add(l1, 0, 0);
        g.add(t1, 1, 0);
        g.add(l2, 0, 1);
        g.add(t2, 1, 1);
        g.add(b, 1, 2);

        stage.setScene(new Scene(g, 250, 150));
        stage.setTitle("Convertitore");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
