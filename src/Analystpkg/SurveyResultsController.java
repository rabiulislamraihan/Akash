/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pkgfinal.project;

import Analystpkg.Analyst;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class SurveyResultsController implements Initializable, Serializable {

    @FXML
    private ComboBox<String> nameOfSurveyCombobox;
    @FXML
    private TextArea surveyAnswersTextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    ObjectInputStream ois = null;
       
        try{
            Survey s;
            ois = new ObjectInputStream(new FileInputStream("Survey.bin"));
            
            while(true){
                s = (Survey) ois.readObject();
                nameOfSurveyCombobox.getItems().add(s.nameofsurvey );
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
    private void viewSurveyAnswersOnClick(ActionEvent event) {
        
        String name = nameOfSurveyCombobox.getValue();
        Survey sv = Analyst.ViewSurveyAnswers(name);
        
        surveyAnswersTextarea.appendText(name+ "\n");
        
        for(int i =0; i<sv.getListofquestions().size(); i++ ){
            surveyAnswersTextarea.appendText(sv.getListofquestions().get(i)+ "\n" );
            surveyAnswersTextarea.appendText(sv.getListofanswers().get(i)+ "\n" );
            
        }
      
        
    }
    
}
