/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Technicianpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Hp
 */
public class ClientHistory implements Serializable{
    String name;
    String phone;
    LocalDate lastservicing;

    public ClientHistory(String name, String phone, LocalDate lastservicing) {
        this.name = name;
        this.phone = phone;
        this.lastservicing = lastservicing;
    }
    
    
    
}
