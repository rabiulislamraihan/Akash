/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SalesRepresentativepkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anika
 */
public class SrPricingController implements Initializable {

    @FXML
    private TextField pmNewPrice;
    @FXML
    private ComboBox<String> pmPackage;
    @FXML
    private TextField pmDiscount;
    @FXML
    private TextArea pmShow;
    @FXML
    private TextField pmOriginalPrice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pmPackage.getItems().addAll("Package 1","Package 2", "Package 3", "Package 4", "Package 5");
    }    

    @FXML
    private void pmSaveChanges(MouseEvent event) {
        String val = pmPackage.getValue();
        int z = Integer.parseInt(pmNewPrice.getText());
        int d = Integer.parseInt(pmDiscount.getText());
        float value = z-(z*(d/100));
        pmShow.setText("Price Updated"+"\n"+val+":  BDT"+value);
    }


    @FXML
    private void pmPackageClicked(ActionEvent event) {
        String x = pmPackage.getValue();
        if ("Package 1".equals(x)){
            pmOriginalPrice.setText("BDT 200");
        }if ("Package 2".equals(x)){
            pmOriginalPrice.setText("BDT 300");
        }if ("Package 3".equals(x)){
            pmOriginalPrice.setText("BDT 400");
        }if ("Package 4".equals(x)){
            pmOriginalPrice.setText("BDT 500");
        }if ("Package 5".equals(x)){
            pmOriginalPrice.setText("BDT 600");
        }    
    }
    }
    

