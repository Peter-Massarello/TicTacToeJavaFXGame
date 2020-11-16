package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BorderPaneMenus {

    public static HBox topMenu(){
        HBox topMenu = new HBox();
        Label title = new Label();

        title.setText("TIC-TAC-TOE");
        title.setAlignment(Pos.CENTER_LEFT);
        topMenu.getChildren().add(title);

        return topMenu;

    }
    public static VBox leftMenu(){
        VBox leftMenu = new VBox();
        Label player1 = new Label();
        player1.setText("Player 1 Score");
        player1.setAlignment(Pos.CENTER);
        leftMenu.getChildren().add(player1);

        return leftMenu;
    }

    public static VBox rightMenu(){
        VBox rightMenu = new VBox();
        Label player2 = new Label();
        player2.setText("Player 2 Score");
        player2.setAlignment(Pos.CENTER);
        rightMenu.getChildren().add(player2);

        return rightMenu;
    }

    public static GridPane mainGrid(){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                Button btn = new Button("" + i);
                btn.setOnAction(e -> System.out.print("Works"));
                GridPane.setConstraints(btn, i, j);
                grid.getChildren().add(btn);
            }
        }
        return grid;
    }

}
