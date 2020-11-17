package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BorderPaneMenus {

    public static HBox topMenu(){
        HBox topMenu = new HBox();
        Label title = new Label();
        title.setText("TIC-TAC-TOE");
        title.setAlignment(Pos.CENTER_LEFT);

        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        Region region2 = new Region();
        HBox.setHgrow(region2, Priority.ALWAYS);



        topMenu.getChildren().addAll(region1, title, region2);

        return topMenu;

    }

    public static HBox bottomMenu(){
        HBox bottomMenu = new HBox();
        Label title = new Label();
        title.setText("Current Players turn: ");
        title.setAlignment(Pos.CENTER_LEFT);

        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        Region region2 = new Region();
        HBox.setHgrow(region2, Priority.ALWAYS);



        bottomMenu.getChildren().addAll(region1, title, region2);

        return bottomMenu;

    }

    public static VBox leftMenu(){
        VBox leftMenu = new VBox();
        Label player1 = new Label();
        player1.setText("Player 1 Score");
        player1.minWidthProperty().bind(leftMenu.widthProperty());
        leftMenu.getChildren().add(player1);

        return leftMenu;
    }

    public static VBox rightMenu(){
        VBox rightMenu = new VBox();
        Label player2 = new Label();
        player2.setText("Player 2 Score");
        player2.minWidthProperty().bind(rightMenu.widthProperty());
        rightMenu.getChildren().add(player2);

        return rightMenu;
    }

    public static HBox TitleCard(){
        HBox titlePane = new HBox();
        Label title = new Label("TIC-TAC-TOE");
        title.setPadding(new Insets(100));
        title.setAlignment(Pos.CENTER);
        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        Region region2 = new Region();
        HBox.setHgrow(region2, Priority.ALWAYS);
        titlePane.getChildren().addAll(region1, title, region2);

        return titlePane;
    }

    public static HBox TitleButton(Scene scene,  Stage window){
        HBox titleButtonPane = new HBox();
        titleButtonPane.setPadding(new Insets(100));
        Button btn = new Button("START");
        btn.setOnAction(e -> {
            window.setMaximized(false);
            window.setScene(scene);
            window.setMaximized(true);
        });
        titleButtonPane.getChildren().add(btn);
        titleButtonPane.setAlignment(Pos.CENTER);
        return titleButtonPane;
    }

    public static GridPane mainGrid(BorderPane mainPane){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(100, 100, 100, 100));
        grid.setVgap(8);
        grid.setHgap(10);

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                Button btn = new Button("" + i);
                btn.setOnAction(e -> System.out.print("Works"));
                btn.prefWidthProperty().bind(grid.widthProperty());
                btn.prefHeightProperty().bind(grid.heightProperty());
                /*btn.setMinWidth(mainPane.getMaxWidth()/3);
                btn.setMinHeight(mainPane.getMaxHeight()/3);*/
                GridPane.setConstraints(btn, i, j);
                grid.getChildren().add(btn);
            }
        }
        return grid;
    }

}
