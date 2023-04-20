package application;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

public class ControllerMainScreen implements Initializable {

    private Stage stage;
    @FXML
    private Label time;

    @FXML
    private Label date;

    @FXML
    private DatePicker datepicker;


    private volatile boolean stop = false;


    public void initialize(URL url, ResourceBundle rb) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        String datenow = sdf.format(new Date());
        date.setText(datenow);
        Timenow();

    }


    private void Timenow() {
        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
            while (!stop) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
                final String timenow = sdf.format(new Date());
                Platform.runLater(() -> {
                    time.setText(timenow);
                });
            }

        });
        thread.start();


    }

    @FXML
    void chooseDate(ActionEvent event) {
        LocalDate myDate = datepicker.getValue();
        String myDate2 = myDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        date.setText(myDate2);
    }

    @FXML
    void goTo(ActionEvent event) {
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
    void insertTask(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreen2.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            Controller controller = loader.getController();
            controller.setStage(stage);
            stage.show();
            this.stage.close();

        } catch (IOException ex) {
            //Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;

    }


}
