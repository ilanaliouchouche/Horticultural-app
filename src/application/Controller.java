package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import util.EventSerializer;


public class Controller implements Initializable {

    @FXML
    private Button addEventButton;

    @FXML
    private TextField eventDescriptionTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ListView<LocalEvent> eventListView;

    private Stage stage;

    @FXML
    private void addEventHandler(ActionEvent e) {
        //ajouter des nouvelles taches
        var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText());


        eventListView.getItems().add(newEvent);


        datePicker.setValue(LocalDate.now());


        eventDescriptionTextField.setText("");
    }

    public Object[] getEvents() {
        return eventListView.getItems().toArray();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            var events = EventSerializer.deserialize();
            eventListView.getItems().addAll(events);
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("TodoFX");
            alert.setHeaderText("Events could not be loaded from file system");
        }

    }

    @FXML
    private Button backM;

    @FXML
    void backMenu(ActionEvent event) {
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
            //Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;

    }

}
