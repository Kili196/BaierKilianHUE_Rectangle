package app2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App2 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/layout/RechteckFXML.fxml"));
        primaryStage.setTitle("TextCombiner");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    };

}
