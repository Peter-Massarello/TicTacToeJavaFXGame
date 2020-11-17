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
    Scene scene, titleScene;

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
        mainPane.setBottom(BorderPaneMenus.bottomMenu());
        mainPane.setCenter(BorderPaneMenus.mainGrid(mainPane));


        scene = new Scene(mainPane, 1300, 800);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        BorderPane titlePane = new BorderPane();
        titlePane.setStyle("-fx-background-color : black;");
        titlePane.setTop(BorderPaneMenus.TitleCard());
        titlePane.setBottom(BorderPaneMenus.TitleButton(scene, window));
        titleScene = new Scene(titlePane, 1300, 800);
        titleScene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        window.setMaximized(true);
        window.setScene(titleScene);
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
