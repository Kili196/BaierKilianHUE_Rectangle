package presentation;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class SampleControllerRectangle implements Initializable {


    @FXML
    private ChoiceBox<Color> choiceColor;

    @FXML
    private Rectangle rectangle;

    @FXML
    private Slider sliderHeight;

    @FXML
    private Slider sliderWidth;

    @FXML
    private Text txtArea;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceColor.getItems().add(Color.valueOf(("#9cce2b")));
        choiceColor.getItems().add(Color.valueOf(("#4d5d56")));
        choiceColor.getItems().add(Color.valueOf(("#8d5d54")));
        choiceColor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                rectangle.setFill((choiceColor.getValue()));
            }
        });

        choiceColor.setValue(Color.valueOf("#9cce2b"));

        rectangle.widthProperty().bind(sliderWidth.valueProperty());
        rectangle.heightProperty().bind(sliderHeight.valueProperty());
        txtArea.textProperty().bind(sliderHeight.valueProperty().multiply(sliderWidth.valueProperty()).asString());

    }
}

