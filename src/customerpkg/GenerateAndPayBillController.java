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

    /**
     * Initializes the controller class.
     */
    
    public void data(Customer c, Package p) {
        this.p = p;
        this.c = c;
        String text =
                "Customer ID:\t" + c.getCustomerID() +
                "\nCustomer Name:\t" + c.getName() +
                "\nCustomer Address:\t" + c.getAddress() +
                "\nCustomer Contact Number:\t" + c.getContactNumber() +
                "\nCustomer Email:\t" + c.getEmail() +
                "\n" +
                "\nPackage ID:\t" + p.getCode() +
                "\nPackage Title:\t" + p.getTitle() +
                "\nPackage Duration:\t" + p.getDuration() +
                "\nPackage Description:\n" + p.getDescription() +
                "\nPackage Price:\t" + p.getPrice() +
                "\nPackage Purchase Time:\t" + LocalDate.now();
        showBillTextArea.setText(text);
        
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
