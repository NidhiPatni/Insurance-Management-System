/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Insurance_Policy_Bill;

/**
 *
 * @author nidsp
 */
public class Insurance_Policy_Bill_dao {
    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("SELECT MAX(Id) FROM Insurance_Policy_Bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id+1;
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Insurance_Policy_Bill insurance_policy_bill) {
        String query ="INSERT INTO Insurance_Policy_Bill VALUES ('"+insurance_policy_bill.getId()+"',"
                +"'"+insurance_policy_bill.getCustomerId()+"',"
                +"'"+insurance_policy_bill.getBillDate()+"',"
                +"'"+insurance_policy_bill.getTotalAmount()+"')";
        DbOperations.setDataorDelete(query, "Bill Details Added Successfully");
    }
    
}
