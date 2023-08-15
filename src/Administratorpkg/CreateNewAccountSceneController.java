/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Administratorpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class CreateNewAccountSceneController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CreateNewAccountButtonOnClick(MouseEvent event) {
//        private String Name;
//        private String Address;
//        private String ContactNumber;
//        private String Email;
//        private LocalDate DateOfBirth;
//        private LocalDate DateOfJoining;
//        private String Password;
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String contactNumber = contactNumberTextField.getText();
            String email = emailTextField.getText();
            

    }
    
}
