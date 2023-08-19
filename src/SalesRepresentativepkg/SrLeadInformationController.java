package SalesRepresentativepkg;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;

public class SrLeadInformationController implements Initializable {

    @FXML
    private TableView<TableData> tableView;

    @FXML
    private TableColumn<TableData, String> leaderColumn;

    @FXML
    private TableColumn<TableData, String> projectColumn;

    @FXML
    private TableColumn<TableData, String> startDateColumn;

    @FXML
    private TableColumn<TableData, String> durationColumn;
    @FXML
    private TextField liLeadName;
    @FXML
    private TextField liProjectName;
    @FXML
    private TextField liDuration;
    @FXML
    private DatePicker liStartDate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        leaderColumn.setCellValueFactory(cellData -> cellData.getValue().leaderNameProperty());
        projectColumn.setCellValueFactory(cellData -> cellData.getValue().projectNameProperty());
        startDateColumn.setCellValueFactory(cellData -> cellData.getValue().startDateProperty());
        durationColumn.setCellValueFactory(cellData -> cellData.getValue().durationProperty());

        loadTableViewData();
    }

    private void loadTableViewData() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("tableData.bin"))) {
            tableView.getItems().addAll((TableData[]) inputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    @FXML
    private void addLeadClicked(MouseEvent event) {
         File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("tableData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            dos.writeUTF(liLeadName.getText());
            dos.writeUTF(liProjectName.getText());
            String selectedDate = liStartDate.getValue().toString();
            dos.writeUTF(selectedDate);
            dos.writeUTF(liDuration.getText());

        } catch (IOException ex) {
            Logger.getLogger(SrLeadInformationController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(SrLeadInformationController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }

    @FXML
    private void loadButtonClicked(MouseEvent event) {
        loadTableViewData();
        }
}
