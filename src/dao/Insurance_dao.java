/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.Insurance;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author nidsp
 */
public class Insurance_dao {
    
    public static void save(Insurance insurance) {
        String query = "INSERT INTO Insurance (name) VALUES ('"+insurance.getName()+"')";
        DbOperations.setDataorDelete(query, "Insurance Added Successfully");
    }
    
    public static ArrayList<Insurance> getAllRecords () {
        ArrayList<Insurance> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * from Insurance");
            while(rs.next()) {
                Insurance insurance = new Insurance();
                insurance.setId(rs.getInt("id"));
                insurance.setName(rs.getString("name"));
                arrayList.add(insurance);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return arrayList;
    }
    
    public static void delete (String id) {
        String query = "DELETE FROM Insurance where id='"+id+"'";
        DbOperations.setDataorDelete(query, "Insurance Deleted Successfully");
    }
    
    public static Insurance getId(String name) {
        Insurance insurance = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance WHERE name = '"+name+"'");
            while (rs.next()) {
                insurance = new Insurance();
                insurance.setId(rs.getInt("Id"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return insurance;
    }
    
    public static Insurance getName(Integer id) {
        Insurance insurance = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance WHERE id = '"+id+"'");
            while (rs.next()) {
                insurance = new Insurance();
                insurance.setName(rs.getString("name"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return insurance;
    }
    
}
