package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        Label label = new Label();
        label.setStyle("-fx-text-fill : white;");
        label.setText(message);

        Button yesBtn = new Button("Yes");
        yesBtn.setStyle("-fx-font: 22 arial; -fx-base: white;");
        yesBtn.setOnAction(e -> {
            answer = true;
            window.close();
        });
        Button noBtn = new Button("No");
        noBtn.setStyle("-fx-font: 22 arial; -fx-base: white;");
        noBtn.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color : black;");
        layout.getChildren().addAll(label, yesBtn, noBtn);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 200, 150);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
