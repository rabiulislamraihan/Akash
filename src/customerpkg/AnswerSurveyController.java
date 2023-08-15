/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package customerpkg;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgfinal.project.Survey;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class AnswerSurveyController implements Initializable {

    @FXML
    private ComboBox<String> surveysCombobox;
    @FXML
    private Label questionsLabel;
    @FXML
    private TextField answersTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         ObjectInputStream ois = null;
       
        try{
            Survey s;
            ois = new ObjectInputStream(new FileInputStream("Survey.bin"));
            
            while(true){
                s = (Survey) ois.readObject();
                surveysCombobox.getItems().add(s.getNameofsurvey() );
                }
                
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        catch (Exception ex){
            try {
                if(ois!=null){
                    ois.close();
                }
            }
            catch (IOException ex1){ }
        }
        
        
        
        
        
    }    

    @FXML
    private void loadQuestionsOnClick(ActionEvent event) {
        
        
        
        
        
    }

    @FXML
    private void nextQuestionOnClick(ActionEvent event) {
    }

    @FXML
    private void submitSurveyOnClick(ActionEvent event) {
    }
    
}
