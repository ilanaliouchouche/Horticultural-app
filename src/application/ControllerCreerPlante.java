package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerCreerPlante {

    @FXML
    void goBackMenu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Fleurs.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerFleurs controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            
        }
    }


    @FXML
    void goToChooseMesures(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChooseMesures.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerChooseMesures controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            //Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void goToChooseTaches(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChooseTaches.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerChooseTaches controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            //Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    void goFleurs(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Fleurs.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerFleurs controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            //Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private Stage stage;

    public void setStage(Stage primaryStage) {
        stage = primaryStage;

    }


}

