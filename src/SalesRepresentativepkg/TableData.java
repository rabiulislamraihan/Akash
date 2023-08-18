/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalesRepresentativepkg;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.io.Serializable;

public class TableData implements Serializable {
    private final StringProperty leaderName = new SimpleStringProperty();
    private final StringProperty projectName = new SimpleStringProperty();
    private final StringProperty startDate = new SimpleStringProperty();
    private final StringProperty duration = new SimpleStringProperty();

    public TableData(String leaderName, String projectName, String startDate, String duration) {
        this.leaderName.set(leaderName);
        this.projectName.set(projectName);
        this.startDate.set(startDate);
        this.duration.set(duration);
    }

    public String getLeaderName() {
        return leaderName.get();
    }

    public String getProjectName() {
        return projectName.get();
    }

    public String getStartDate() {
        return startDate.get();
    }

    public String getDuration() {
        return duration.get();
    }

    public StringProperty leaderNameProperty() {
        return leaderName;
    }

    public StringProperty projectNameProperty() {
        return projectName;
    }

    public StringProperty startDateProperty() {
        return startDate;
    }

    public StringProperty durationProperty() {
        return duration;
    }
}
