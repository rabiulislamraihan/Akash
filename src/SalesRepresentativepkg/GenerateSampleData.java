/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalesRepresentativepkg;

import java.io.*;
public class GenerateSampleData {
    public static void main(String[] args) {
        TableData[] sampleData = new TableData[]{
            new TableData("John Doe", "Project A", "2023-08-01", "4 weeks"),
            new TableData("Jane Smith", "Project B", "2023-09-15", "6 weeks"),
            // Add more data as needed
        };
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("tableData.bin"))) {
            outputStream.writeObject(sampleData);
        } catch (IOException e) {
        }
    }
}
