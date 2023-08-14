
package SalesRepresentativepkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class SalesRepresentativeHomePageSceneController implements Initializable {

    @FXML
    private BorderPane BorderPane;


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewPersonalInformationOnClick(ActionEvent event) throws IOException {

    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) BorderPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Accounts/LoginScene.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void srManageOrdersOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("srManageOrders.fxml"));
        BorderPane.setCenter(parent);
    }

    @FXML
    private void srProductPresentationOnClick(ActionEvent event) {
    }

    @FXML
    private void srPricingOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("srPricing.fxml"));
        BorderPane.setCenter(parent);
    }

    @FXML
    private void srPaymentManagementOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("srPaymentManagement.fxml"));
        BorderPane.setCenter(parent);
    }

    @FXML
    private void leadinformationonclick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("srLeadInformation.fxml"));
        BorderPane.setCenter(parent);
    }
    
}
