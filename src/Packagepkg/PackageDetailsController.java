/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Packagepkg;

import customerpkg.CustomerHomePageSceneController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class PackageDetailsController implements Initializable {

    @FXML
    private TextField titleTextfield;
    @FXML
    private TextField priceTextField;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextField codeTextField;
    private Package p;
    @FXML
    private TextField durationTextField;
    
    
    public void data(Package p) {
        this.p = p;
        titleTextfield.setText(p.getTitle());
        priceTextField.setText(Integer.toString(p.getPrice()));
        descriptionTextArea.setText(p.getTitle());
        codeTextField.setText(p.getCode());
        durationTextField.setText(Integer.toString(p.getDuration()));
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
}
