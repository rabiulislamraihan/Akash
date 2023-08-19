/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pkgfinal.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class CreateSurveyController implements Initializable {

    @FXML
    private TextArea questionsTextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void CreateQuestionButtonClick(ActionEvent event) {
        String question = questionsTextarea.getText();
        
    }

    @FXML
    private void CreateQuestionButtonClick(MouseEvent event) {
    }
    
}
