package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    private Rectangle rect;
    @FXML
    private TextField fieldX;
    @FXML
    private TextField fieldY;

    public void initialize() {

        rect.setX(0);
        rect.setY(0);
    }

    @FXML
    public void translateRect() {
        if (fieldX.getText().matches("\\d+") && fieldY.getText().matches("\\d+")) {
            rect.setTranslateX(Integer.parseInt(fieldX.getText()));
            rect.setTranslateY(Integer.parseInt(fieldY.getText()));
        }
    }
}
