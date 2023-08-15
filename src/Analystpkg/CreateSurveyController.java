/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pkgfinal.project;

import Analystpkg.Analyst;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class CreateSurveyController implements Initializable {

    @FXML
    private TextField questionTextfield;
    @FXML
    private TextArea questionsTextarea;
    
    ArrayList<String> listofquestions = new ArrayList<>();
    ArrayList<String> listofanswers = new ArrayList<>();
    @FXML
    private TextField nameOfSurveyTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listofanswers.clear();
        // TODO
    }    

    @FXML
    private void AddQuestionOnClick(ActionEvent event) {
        listofquestions.add(questionTextfield.getText());
         listofanswers.add( "This question is not answered yet");
        questionTextfield.clear();
        
    }

    @FXML
    private void CreateSurveyOnClick(ActionEvent event) {
        questionsTextarea.clear();
        String nameofsurvey = nameOfSurveyTextfield.getText();
        questionsTextarea.setText("\n"+nameofsurvey+ "\n" );
        for(int i=0;i<listofquestions.size();i++){
            questionsTextarea.appendText(i+1+" "+listofquestions.get(i) + "\n");
            
        }
        
        boolean status = Analyst.CreateSurvey(nameofsurvey, listofquestions, listofanswers);
        if(status=true){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Information Alert");
                a.setHeaderText("Alert");
                a.setContentText("Survey Successfully Created");
                a.showAndWait();
                
        }
        else{
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Information Alert");
                a.setHeaderText("Alert");
                a.setContentText("Failed to Create Survey!");
                a.showAndWait();
            
        }
    }
    
}
