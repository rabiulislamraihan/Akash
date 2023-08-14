
package employeepkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;


public class EmployeeHomePageSceneController implements Initializable {

    @FXML
    private BorderPane BorderPane;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddNewEmployeeButtOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AddNewEmployeeScene.fxml"));
        BorderPane.setCenter(parent);
    }
    
}
