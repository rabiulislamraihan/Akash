
package employeepkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class AddNewEmployeeSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField contactNumberTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker DateOfBirthDatePicker;
    @FXML
    private ComboBox<String> designationComboBox;
    int hi;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designationComboBox.getItems().addAll(
                "Administrator",
                "Account Manager",
                "Analyst",
                "Content Manager",
                "Marketing Executive",
                "Sales Representative",
                "Technician");
        // TODO
    }    

    @FXML
    private void AddNewEmployeeButtonOnClick(MouseEvent event) {
    }
    
}
