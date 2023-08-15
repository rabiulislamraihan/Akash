
package Administratorpkg;

import employeepkg.Employee;
import employeepkg.Salary;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


public class SeeEmployeeDetailsController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField contactNumberTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker DateOfBirthDatePicker;
    @FXML
    private TextField designationTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField employeeIDTextField;
    @FXML
    private DatePicker DateOfJoiningDatePicker;
    @FXML
    private TableView<Salary> tableView;

    @FXML
    private TableColumn<Salary, LocalDate> DateColumn;
    @FXML
    private TableColumn<Salary, Integer> BaseSalaryColumn;
    @FXML
    private TableColumn<Salary, Integer> BonusColumn;
    @FXML 
    private TableColumn<Salary, Integer> OvertimePayColumn;
    @FXML
    private TableColumn<Salary, Integer> PerformanceBasedPayColumn;
    @FXML
    private TableColumn<Salary, Integer> TotalColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DateColumn.setCellValueFactory(new PropertyValueFactory<Salary, LocalDate>("SalaryDate"));
        BaseSalaryColumn.setCellValueFactory(new PropertyValueFactory<Salary, Integer>("BaseSalary"));
        BonusColumn.setCellValueFactory(new PropertyValueFactory<Salary, Integer>("Bonus"));
        OvertimePayColumn.setCellValueFactory(new PropertyValueFactory<Salary, Integer>("OvertimePay"));
        PerformanceBasedPayColumn.setCellValueFactory(new PropertyValueFactory<Salary, Integer>("PerformanceBasedPay"));
        TotalColumn.setCellValueFactory(new PropertyValueFactory<Salary, Integer>("firstName"));
        // TODO
    }    

    @FXML
    private void SeeInformationOnClick(MouseEvent event) {
        Employee employee = Employee.getInstance(Integer.parseInt(employeeIDTextField.getText()));
            nameTextField.setText(employee.getName());
            addressTextField.setText(employee.getAddress());
            contactNumberTextField.setText(employee.getContactNumber());
            emailTextField.setText(employee.getEmail());
            DateOfBirthDatePicker.setValue(employee.getDateOfBirth());
            designationTextField.setText(employee.getDesignation());
            passwordTextField.setText(employee.getPassword());
            DateOfJoiningDatePicker.setValue(employee.getDateOfJoining());
    }

    @FXML
    private void SeeSalaryDetailsOnClick(MouseEvent event) {
        
    }
    
}
