package application;

import java.io.IOException;
import java.lang.System.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerFleurs {

    @FXML
    private Button lbl7;
    
    @FXML
    private Button lbl8;
    
    @FXML
    private Button lbl9;
    
    @FXML
    private Button lbl10;

    @FXML
    private Button plus;

    @FXML
    protected void goToRoses(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Roses.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerInfoFleurs controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {

        }
    }
    
    @FXML
    protected void goToCam(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Camelia.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerInfoFleurs controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            
        }
    }
    
    @FXML
    protected void goToVio(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Violette.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerInfoFleurs controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {

        }
    }
    
    @FXML
    protected void goToTul(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Tulipes.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerInfoFleurs controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {

        }
    }

    @FXML
    private Button threepoints;

    @FXML
    void backMenu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SideMenu.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerSideMenu controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            //Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void createNewPlant(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreerPlante.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerCreerPlante controller = loader.getController();
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

