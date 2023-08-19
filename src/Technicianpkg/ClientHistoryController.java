/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Technicianpkg;

import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class ClientHistoryController implements Initializable, Serializable {

    @FXML
    private TextField nameTextfield;
    @FXML
    private TextField idTextfield;
    @FXML
    private DatePicker lastServicingDatePicker;
    @FXML
    private TextArea showAddedTextarea;
    @FXML
    private TextArea showLookupTextarea;
    @FXML
    private TextField phoneTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addClientHistory(ActionEvent event) throws ClassNotFoundException {
        String name = nameTextfield.getText();
        String phone = idTextfield.getText();
        LocalDate lastservicing = lastServicingDatePicker.getValue();
        
        String data = Technician.AddClientHistory(name, phone, lastservicing);
        showAddedTextarea.setText(data);
        
    }

    @FXML
    private void lookupClientHistory(ActionEvent event) {
        String phone = phoneTextfield.getText();
        String data = Technician.LookupClientHistory(phone);
        showLookupTextarea.setText("Date of last visit: "+data);
        
    }
    
}
