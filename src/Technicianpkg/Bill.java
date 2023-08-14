/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Technicianpkg;
import java.io.Serializable;

/**
 *
 * @author Hp
 */
public class Bill implements Serializable {
    String Client;
    String time;
    float EquipmentCharge;
    float SericeCharge;
    float discount;
    float total;
    float GrandTotal;

    public Bill(String Client, String timeStamp, float EquipmentCharge, float SericeCharge, float discount, float total, float GrandTotal) {
        this.Client = Client;
        this.time = timeStamp;
        this.EquipmentCharge = EquipmentCharge;
        this.SericeCharge = SericeCharge;
        this.discount = discount;
        this.total = total;
        this.GrandTotal = GrandTotal;
    }    
    public static float CalculateTotal(float equipmentCharge,float serviceCharge, float discount){
        return(equipmentCharge + serviceCharge - discount);
    }
    
    
    public static float CalculateGrandTotal(float total, float tax){
        return total+tax;
    }
    
//    public static String PrintBill(String name, String timeStamp, float equipmentCharge,float serviceCharge, float discount,float total,float grandTotal)
//    {
//            
//            
//    
//            
//            
//            
//    }
    
}
