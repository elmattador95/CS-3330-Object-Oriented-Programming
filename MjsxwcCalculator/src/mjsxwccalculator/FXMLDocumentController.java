/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwccalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Matthew
 */
public class FXMLDocumentController implements Initializable, RunCalculations {
    private float curNumber;
    private String curOperation;

    
    @FXML
    private TextField display;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    @FXML
    @Override
    public void clearAction(ActionEvent event) {
        display.setText("");
    }
    @FXML
    @Override
    public void numberAction(ActionEvent event) {
        String number = ((Button) event.getSource()).getText();
        String oldText = display.getText();
        String newText = oldText + number;
        display.setText(newText);
    }
    @FXML
    @Override
    public void equalOperation(ActionEvent event) {
        String newText = display.getText();
        float newNumber = Float.parseFloat(newText);
        switch (curOperation) {
            case "+":
                curNumber = curNumber + newNumber;
                break;
            case "-":
                curNumber = curNumber - newNumber;
                break;
            case "*":
                curNumber = curNumber * newNumber;
                break;
            case "/":
                curNumber = curNumber / newNumber;
                break;
            default:
                break;
        }
        display.setText("" + curNumber);
    }

    @FXML
    @Override
    public void Operation(ActionEvent event) {
        String currentText = display.getText();
        curNumber = Float.parseFloat(currentText);
        display.setText("");
        curOperation = ((Button) event.getSource()).getText();
    }

}
