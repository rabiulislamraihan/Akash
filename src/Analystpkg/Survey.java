/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Survey implements Serializable{
    
    String nameofsurvey;
    ArrayList listofquestions;
    ArrayList listofanswers;

    public Survey(String nameofsurvey, ArrayList listofquestions, ArrayList listofanswers) {
        this.nameofsurvey = nameofsurvey;
        this.listofquestions = listofquestions;
        this.listofanswers = listofanswers;
        
    }

    public String getNameofsurvey() {
        return nameofsurvey;
    }

    public void setNameofsurvey(String nameofsurvey) {
        this.nameofsurvey = nameofsurvey;
    }

    public ArrayList getListofquestions() {
        return listofquestions;
    }

    public void setListofquestions(ArrayList listofquestions) {
        this.listofquestions = listofquestions;
    }

    public ArrayList getListofanswers() {
        return listofanswers;
    }

    public void setListofanswers(ArrayList listofanswers) {
        this.listofanswers = listofanswers;
    }
    
    
}
