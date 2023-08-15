/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analystpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkgfinal.project.Survey;

/**
 *
 * @author Hp
 */
public class Analyst implements Serializable{
    
     
    public static boolean CreateSurvey(String name, ArrayList listofquestions, ArrayList listofanswers){
        
        File s = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            s = new File("Survey.bin");
            if(s.exists()){
                fos = new FileOutputStream(s,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(s);
                oos = new ObjectOutputStream(fos);               
            }
            
            
            Survey survey = new Survey(name, listofquestions, listofanswers);    
           oos.writeObject(survey);
           return true;
//           oos.close();

        } catch (IOException ex) {
            Logger.getLogger(Analyst.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Analyst.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    
    public static Survey ViewSurveyAnswers(String name){
        
        ObjectInputStream ois = null;

        try{
            Survey s;
            ois = new ObjectInputStream(new FileInputStream("Survey.bin"));
            
            while(true){
                s = (Survey) ois.readObject();
                if(s.getNameofsurvey().equals(name)){
                    return s;
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
        return null;
        
        
        
        
    }
        
 
    
}
