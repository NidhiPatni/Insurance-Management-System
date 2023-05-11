/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Insurance_Policy;
import java.sql.*;
import model.Insurance;


/**
 *
 * @author nidsp
 */
public class Insurance_Policy_dao {
    
    public static void save(Insurance_Policy insurance_policy) {
        String query = "INSERT INTO Insurance_Policy("
                + "Name,"
                + "Insurance_ID,"
                + "Sum_Assured,"
                + "Premium,"
                + "Tenure,"
                + "Descriptions)"
                + " VALUES "
                + "('"+insurance_policy.getName()+"',"
                + "'"+insurance_policy.getInsuranceId()+"',"
                + "'"+insurance_policy.getSumAssured()+"',"
                + "'"+insurance_policy.getPremium()+"',"
                + "'"+insurance_policy.getTenure()+"',"
                + "'"+insurance_policy.getDescriptions()+"')";
        DbOperations.setDataorDelete(query, "Policy Added Successfully");
    }
    
    public static ArrayList<Insurance_Policy> getAllRecords(){
        ArrayList<Insurance_Policy> arrayList = new ArrayList();
        
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_Policy");
            while(rs.next()) {
                Insurance_Policy insurance_policy = new Insurance_Policy();
                insurance_policy.setId(rs.getInt("Id"));
                insurance_policy.setName(rs.getString("Name"));
                insurance_policy.setInsuranceId(rs.getInt("Insurance_ID"));
                insurance_policy.setSumAssured(rs.getString("Sum_Assured"));
                insurance_policy.setPremium(rs.getString("Premium"));
                insurance_policy.setTenure(rs.getString("Tenure"));
                insurance_policy.setDescriptions(rs.getString("Descriptions")); 
                arrayList.add(insurance_policy);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    
    public static Integer getId(String name) {
        Integer id = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_Policy WHERE name = '"+name+"'");
            while (rs.next()) {
                id = rs.getInt("Id");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }
    
    public static void update(Integer PolicyId,String Policyname, Integer insuranceId,String sumAssured, String premium, String tenure, String descriptions) {
        String query = "UPDATE Insurance_Policy SET Name='"+Policyname+"',Insurance_Id='"+insuranceId+"',Sum_Assured='"+sumAssured+"',Premium='"+premium+"',Tenure='"+tenure+"',Descriptions='"+descriptions+"' WHERE id='"+PolicyId+"'";
        DbOperations.setDataorDelete(query, "Policy Updated Successfully");
    }
    
    public static void delete(Integer PolicyId) {
        String query = "DELETE FROM Insurance_Policy WHERE Id='"+PolicyId+"'";
        DbOperations.setDataorDelete(query, "Policy Deleted Successfully");
    }
    
    public static ArrayList<Insurance_Policy> getAllRecordsByInsurance (String insuranceName) {
        Insurance insurance = Insurance_dao.getId(insuranceName);
        ArrayList<Insurance_Policy> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_Policy WHERE Insurance_Id='"+insurance.getId()+"'");
            while(rs.next()) {
                Insurance_Policy insurance_policy = new Insurance_Policy();
                insurance_policy.setName(rs.getString("name"));
                arrayList.add(insurance_policy);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    
    public static ArrayList<Insurance_Policy> filterInsurancePolicyByName (String name,String insuranceName) {
        Insurance insurance = Insurance_dao.getId(insuranceName);
        ArrayList<Insurance_Policy> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_Policy WHERE Name like '%"+name+"%' and Insurance_Id = '"+insurance.getId()+"'");
            while(rs.next()) {
                Insurance_Policy insurance_policy = new Insurance_Policy();
                insurance_policy.setName(rs.getString("name"));
                arrayList.add(insurance_policy);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    
    public static Insurance_Policy getInsurancePolicyByName (String name) {
        Insurance_Policy insurance_policy = new Insurance_Policy();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_Policy WHERE Name='"+name+"'");
            while(rs.next()) {
                insurance_policy.setName(rs.getString("Name"));
                insurance_policy.setInsuranceId(rs.getInt("Insurance_Id"));
                insurance_policy.setSumAssured(rs.getString("Sum_Assured"));
                insurance_policy.setPremium(rs.getString("Premium"));
                insurance_policy.setTenure(rs.getString("Tenure"));
                insurance_policy.setDescriptions(rs.getString("Descriptions")); 
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
            return insurance_policy;
    }       
    

}
