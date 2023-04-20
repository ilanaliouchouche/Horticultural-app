package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerPrenom {


    @FXML
    private TextField namechoosen;

    @FXML
    void setName(ActionEvent event) {
        try {
            String prenom = namechoosen.getText();
            File file = new File("../prenom.txt");
            FileWriter W = new FileWriter(file);
            W.write(prenom);
            W.close();


            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerMainScreen controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {

        }
    }

    private Stage stage;

    public void setStage(Stage primaryStage) {
        stage = primaryStage;

    }
}
