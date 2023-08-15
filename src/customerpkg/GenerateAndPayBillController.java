/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package customerpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import Packagepkg.Package;

/**
 * FXML Controller class
 *
 * @author raiha
 */
public class GenerateAndPayBillController implements Initializable {

    @FXML
    private TextArea showBillTextArea;
    private Customer c;
    private Package p;
    private String bill = null; 

    /**
     * Initializes the controller class.
     */
    
    public void data(Customer c, Package p) {
        this.p = p;
        this.c = c;
        bill =
                "Customer ID:\t\t\t\t" + c.getCustomerID() +
                "\nCustomer Name:\t\t\t" + c.getName() +
                "\nCustomer Address:\t\t\t" + c.getAddress() +
                "\nCustomer Contact Number:\t" + c.getContactNumber() +
                "\nCustomer Email:\t\t\t" + c.getEmail() +
                "\n" +
                "\nPackage ID:\t\t\t\t" + p.getCode() +
                "\nPackage Title:\t\t\t\t" + p.getTitle() +
                "\nPackage Duration:\t\t\t" + p.getDuration() + " months" + 
                "\nPackage Description:\n" + p.getDescription() + "\n\n" +
                "\nPackage Price:\t\t\t\t" + p.getPrice() + " BDT" +
                "\nPackage Purchase Time:\t\t" + LocalDate.now();
        showBillTextArea.setText(bill);
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PayBillButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void DownloadBillButtonOnClick(MouseEvent event) {
    }
    
}
