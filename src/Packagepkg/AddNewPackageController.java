/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Packagepkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class AddNewPackageController implements Initializable {

    @FXML
    private TextField titleTextfield;
    @FXML
    private TextField priceTextField;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private ComboBox<Integer> durationComboBox;
    @FXML
    private TextField codeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        durationComboBox.getItems().addAll(1,  3, 6,  12, 24);
        // TODO
    }    

    @FXML
    private void AddPackageButtonOnClick(MouseEvent event) {
        String title = titleTextfield.getText();
        int price = Integer.parseInt(priceTextField.getText());
        String description = descriptionTextArea.getText();
        int duration = durationComboBox.getValue();
        String code = codeTextField.getText();
        Package p = new Package(title, duration, price, description, code);
        if(!Package.checkPackageexistence(p)){
            Package.AddNewPackage(p);
        }
        else {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information Alert");
            a.setHeaderText("Alert");
            a.setContentText("Package already exists !");
            a.showAndWait();
        }
    }
    
}
