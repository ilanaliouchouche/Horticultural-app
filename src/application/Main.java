package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChooseName.fxml"));

            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            ControllerPrenom controller = loader.getController();
            controller.setStage(primaryStage);
            primaryStage.show();

        } catch (IOException ex) {

        }

        //primaryStage.setTitle("Exemple FXML");
        //AnchorPane myPane = (AnchorPane)FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        //Scene myScene = new Scene(myPane, 320, 450);
        //primaryStage.setScene(myScene);
        //primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
