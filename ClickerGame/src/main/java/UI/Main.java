/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Logic.AppLogic;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Samuli
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    private AppLogic applogic;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //start
        Button newgame = new Button("New Game");
        Button quitgame = new Button("Quit");

        Label userLabel = new Label("User: ");
        TextField nameField = new TextField("");

        HBox nameBox = new HBox();
        nameBox.setSpacing(10);
        nameBox.getChildren().addAll(userLabel, nameField);

        VBox loginPane = new VBox();
        loginPane.setMinSize(250, 150);

        loginPane.setSpacing(20);
        loginPane.getChildren().addAll(nameBox, newgame, quitgame);
        Scene loginView = new Scene(loginPane);

        primaryStage.setScene(loginView);
        primaryStage.show();

        //game
        Button addPoint = new Button("ADD");
        addPoint.setStyle("-fx-padding: 20 20 20 20;");
        Label Points = new Label("Points");

        VBox laskuriBox = new VBox();
        laskuriBox.getChildren().addAll(Points, addPoint);

        Scene gamePane = new Scene(laskuriBox);

        //button actions
        newgame.setOnAction(action -> {
            primaryStage.setScene(gamePane);
        });
        quitgame.setOnAction(action -> {
            System.exit(0);
        });

        //gamebutton
        addPoint.setOnAction(action -> {
            applogic.lisaa();
          
        });
    }

}
