package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerSideMenu implements Initializable {


    @FXML
    private Label prenom;
    @FXML
    private Label date;

    private Stage stage;
    @FXML
    private Button touslestaches;

    public void initialize(URL url, ResourceBundle rb) {

        File file = new File("../prenom.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            st = br.readLine();
            prenom.setText("Bonjour " + st);
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
    
            e.printStackTrace();
        }

    }

    @FXML
    void goToMainScreen(ActionEvent event) {
        try {

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

    @FXML
    void goToMonJardin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Window1.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            Window1Controller controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();

        } catch (IOException ex) {
          
        }
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;

    }

    @FXML
    void goToChooseName(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChooseName.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            ControllerPrenom controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();

        } catch (IOException ex) {
       
        }
    }
}
