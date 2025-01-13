package nl._404hhs.hello;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button loginButton;

    @FXML
    private void handleButtonAction() {
        try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            Stage window = (Stage) loginButton.getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Kan hello-view.fxml niet laden. Controleer het pad.");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("loginButton is niet correct gekoppeld. Controleer de fx:id in het FXML-bestand.");
        }
    }

    @FXML
    public void initialize() {
        // Eventuele initiële setup kun je hier doen
    }
}