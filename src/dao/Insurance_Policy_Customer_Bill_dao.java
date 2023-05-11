/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Insurance_Policy_Customer_Bill;

/**
 *
 * @author nidsp
 */
public class Insurance_Policy_Customer_Bill_dao {
        public static ArrayList<Insurance_Policy_Customer_Bill> getAllRecordsByInc (String date, String email) {
        ArrayList<Insurance_Policy_Customer_Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT b.Id as ID ,c.Name as Name,c.MobileNumber as MobileNumber, c.Email as Email, b.BillDate as BillDate, b.TotalAmount as TotalAmount FROM Insurance_Policy_Bill b INNER JOIN Insurance_AppUser c ON b.Customer_ID=c.ID WHERE b.BillDate LIKE '%" + date + "%' AND c.email = '"+email+"'");
            while (rs.next()) {
                Insurance_Policy_Customer_Bill insurance_policy_customer_bill = new Insurance_Policy_Customer_Bill();
                insurance_policy_customer_bill.setId(rs.getInt("ID"));
                insurance_policy_customer_bill.setName(rs.getString("Name"));
                insurance_policy_customer_bill.setMobileNumber(rs.getString("MobileNumber"));
                insurance_policy_customer_bill.setEmail(rs.getString("Email"));
                insurance_policy_customer_bill.setBillDate(rs.getString("BillDate"));
                insurance_policy_customer_bill.setTotalAmount(rs.getString("TotalAmount"));
                arrayList.add(insurance_policy_customer_bill);
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    
    public static ArrayList<Insurance_Policy_Customer_Bill> getAllRecordsByDesc(String date, String email) {
        ArrayList<Insurance_Policy_Customer_Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT b.Id as ID ,c.Name as Name,c.MobileNumber as MobileNumber, c.Email as Email, b.BillDate as BillDate, b.TotalAmount as TotalAmount FROM Insurance_Policy_Bill b INNER JOIN Insurance_AppUser c ON b.Customer_ID=c.ID WHERE b.BillDate LIKE '%" + date + "%' AND c.Email = '"+email+"' ORDER BY b.Id DESC");
            while (rs.next()) {
                Insurance_Policy_Customer_Bill insurance_policy_customer_bill = new Insurance_Policy_Customer_Bill();
                insurance_policy_customer_bill.setId(rs.getInt("ID"));
                insurance_policy_customer_bill.setName(rs.getString("Name"));
                insurance_policy_customer_bill.setMobileNumber(rs.getString("MobileNumber"));
                insurance_policy_customer_bill.setEmail(rs.getString("Email"));
                insurance_policy_customer_bill.setBillDate(rs.getString("BillDate"));
                insurance_policy_customer_bill.setTotalAmount(rs.getString("TotalAmount"));
                arrayList.add(insurance_policy_customer_bill);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
        public static ArrayList<Insurance_Policy_Customer_Bill> getAllRecordsByIncForAdmin (String date) {
        ArrayList<Insurance_Policy_Customer_Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT b.Id as ID ,c.Name as Name,c.MobileNumber as MobileNumber, c.Email as Email, b.BillDate as BillDate, b.TotalAmount as TotalAmount FROM Insurance_Policy_Bill b INNER JOIN Insurance_AppUser c ON b.Customer_ID=c.ID WHERE b.BillDate LIKE '%" + date + "%'");
            while (rs.next()) {
                Insurance_Policy_Customer_Bill insurance_policy_customer_bill = new Insurance_Policy_Customer_Bill();
                insurance_policy_customer_bill.setId(rs.getInt("ID"));
                insurance_policy_customer_bill.setName(rs.getString("Name"));
                insurance_policy_customer_bill.setMobileNumber(rs.getString("MobileNumber"));
                insurance_policy_customer_bill.setEmail(rs.getString("Email"));
                insurance_policy_customer_bill.setBillDate(rs.getString("BillDate"));
                insurance_policy_customer_bill.setTotalAmount(rs.getString("TotalAmount"));
                arrayList.add(insurance_policy_customer_bill);
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    
    public static ArrayList<Insurance_Policy_Customer_Bill> getAllRecordsByDescForAdmin (String date) {
        ArrayList<Insurance_Policy_Customer_Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT b.Id as ID ,c.Name as Name,c.MobileNumber as MobileNumber, c.Email as Email, b.BillDate as BillDate, b.TotalAmount as TotalAmount FROM Insurance_Policy_Bill b INNER JOIN Insurance_AppUser c ON b.Customer_ID=c.ID WHERE b.BillDate LIKE '%" + date + "%' ORDER BY b.Id DESC");
            while (rs.next()) {
                Insurance_Policy_Customer_Bill insurance_policy_customer_bill = new Insurance_Policy_Customer_Bill();
                insurance_policy_customer_bill.setId(rs.getInt("ID"));
                insurance_policy_customer_bill.setName(rs.getString("Name"));
                insurance_policy_customer_bill.setMobileNumber(rs.getString("MobileNumber"));
                insurance_policy_customer_bill.setEmail(rs.getString("Email"));
                insurance_policy_customer_bill.setBillDate(rs.getString("BillDate"));
                insurance_policy_customer_bill.setTotalAmount(rs.getString("TotalAmount"));
                arrayList.add(insurance_policy_customer_bill);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
