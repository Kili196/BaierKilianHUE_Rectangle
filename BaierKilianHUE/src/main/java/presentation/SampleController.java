package presentation;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SampleController implements Initializable {
    @FXML
    private RadioButton rbOrderAs12;

    @FXML
    private RadioButton rbOrderAs21;

    @FXML
    private Button btnClear;

    @FXML
    private TextField tfResult;

    @FXML
    private TextField tfText1;

    @FXML
    private TextField tfText2;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            tfResult.setText("Both Textfields MUST be filled");

            tfText1.textProperty().addListener((observableValue, oldV, newV) -> {
                if (rbOrderAs12.isSelected() && !tfText1.getText().isEmpty() && !tfText2.getText().isEmpty()) {
                    tfResult.textProperty().bind(Bindings.concat(tfText1.textProperty(), tfText2.textProperty()));
                } else if (rbOrderAs21.isSelected() && !tfText1.getText().isEmpty() && !tfText2.getText().isEmpty()) {
                    tfResult.setText("Result: " + tfText2.getText() + tfText1.getText());
                } else {
                    tfResult.setText("Both Textfields MUST be filled");
                }
            });
        rbOrderAs21.setOnAction(actionEvent -> {
            if(!tfText1.getText().isEmpty() && !tfText2.getText().isEmpty()) {
                tfResult.setText("Result: " + tfText2.getText() + tfText1.getText());
            }
            else {
                tfResult.setText("Both Textfields MUST be filled");
            }
        });
            rbOrderAs12.setOnAction(actionEvent -> {
                if(rbOrderAs12.isSelected()){
                    if(!tfText1.getText().isEmpty() && !tfText2.getText().isEmpty()) {
                        tfResult.setText("Result: " + tfText1.getText() + tfText2.getText());
                    }
                    else {
                        tfResult.setText("Both Textfields MUST be filled");
                    }
                }
            });

            tfText2.textProperty().addListener((observableValue, oldV, newV) -> {
                if (rbOrderAs12.isSelected() && !tfText1.getText().isEmpty() && !tfText2.getText().isEmpty()) {
                    tfResult.setText("Result: " +tfText1.getText() + tfText2.getText());
                } else if (rbOrderAs21.isSelected() && !tfText1.getText().isEmpty() && !tfText2.getText().isEmpty()) {
                    tfResult.setText("Result: " + tfText2.getText() + tfText1.getText());
                } else {
                    tfResult.setText("Both Textfields MUST be filled");
                }

            });

            btnClear.setOnAction(actionEvent -> {
                tfText1.clear();
                tfText2.clear();
            });
        }
}
