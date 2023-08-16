/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package customerpkg;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mainpkg.AppendableObjectOutputStream;
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
    int i = 0;
    @FXML
    private Button loadQuestionButton;

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
        
        ObjectInputStream ois = null;
       
        try{
            Survey s;
            ois = new ObjectInputStream(new FileInputStream("Survey.bin"));
            
            while(true){
                s = (Survey) ois.readObject();
                int len = s.getListofquestions().size();
                if(s.getNameofsurvey().equals(surveysCombobox.getValue())){
                    questionsLabel.setText(s.getListofquestions().get(i).toString());
                i++;
                if(len==i ){
                    loadQuestionButton.disableProperty() ;
                }
                return;
                }
                
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
    private void nextQuestionOnClick(ActionEvent event) throws ClassNotFoundException {
       
    }
    
    
    @FXML
    private void submitSurveyOnClick(ActionEvent event) {
        
    }
    
}
