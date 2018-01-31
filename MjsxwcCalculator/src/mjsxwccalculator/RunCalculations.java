/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwccalculator;

import javafx.event.ActionEvent;

/**
 *
 * @author Matthew
 */
public interface RunCalculations {
    void clearAction(ActionEvent event);
    void numberAction(ActionEvent event);
    void equalOperation(ActionEvent event);
    void Operation(ActionEvent event);
}
