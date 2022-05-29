package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/layout/TextCombiner.fxml"));
        primaryStage.setTitle("TextCombiner");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}