/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwcnotifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Matthew
 */
public class MjsxwcNotifier extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button notify = new Button();
        Button clear = new Button();
        TextField text1 = new TextField();
        notify.setText("Notify");
        clear.setText("Clear");
        
        notify.setOnAction((ActionEvent) -> {
            text1.setText("You have been notified!");
        });
        clear.setOnAction((ActionEvent) -> {
            text1.setText("");
        });
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(text1,0,0);
        grid.add(notify,1,0);
        grid.add(clear, 1, 1);
        grid.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(grid, 400, 250);
        
        primaryStage.setTitle("Notifier");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
