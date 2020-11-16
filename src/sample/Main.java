package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.scene.control.Button;



public class Main extends Application {

    Stage window;
    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        BorderPane mainPane = new BorderPane();
        mainPane.setStyle("-fx-background-color : black;");
        mainPane.setLeft(BorderPaneMenus.leftMenu());
        mainPane.setRight(BorderPaneMenus.rightMenu());
        mainPane.setTop(BorderPaneMenus.topMenu());
        mainPane.setCenter(BorderPaneMenus.mainGrid());


        scene = new Scene(mainPane, 800, 600);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        window.setScene(scene);
        window.setTitle("Tic-Tac-Toe In Progress");
        window.show();

    }

    private void closeProgram(){
        boolean answer = ConfirmBox.display("Alert", "Do you want to exit");
        if(answer)
            window.close();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
