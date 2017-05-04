/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Gregorius
 */
public class RplTabel extends Application {
    
    private TableView table = new TableView();
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("WeightLiftingTable");
        stage.setWidth(1100);
        stage.setHeight(560);
 
        final Label label = new Label("SCOREBOARD");
        label.setFont(new Font("Arial", 60));
 
        table.setEditable(false);
        
        //main Table
        TableColumn noCol = new TableColumn("No");
        TableColumn nameCol = new TableColumn("Name");
        TableColumn nationCol = new TableColumn("Nation");
        TableColumn weightCol = new TableColumn("Weight");
        TableColumn snatchCol = new TableColumn("Snatch");
        TableColumn cleanCol = new TableColumn("Clean&Jerk");
        TableColumn totalCol = new TableColumn("Total");
        
        //nested Table
        TableColumn oneCol = new TableColumn("1");
        TableColumn twoCol = new TableColumn("2");
        TableColumn threeCol = new TableColumn("3");
        TableColumn resCol = new TableColumn("Res");
        
        //main
        table.getColumns().addAll(noCol, nameCol, nationCol, weightCol, snatchCol, cleanCol, totalCol);
        
        //nested
        snatchCol.getColumns().addAll(oneCol, twoCol, threeCol, resCol);
        cleanCol.getColumns().addAll(oneCol, twoCol, threeCol, resCol);
        
        //belum dimasukin datanya, bisi ada perubahan.
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
    
}
