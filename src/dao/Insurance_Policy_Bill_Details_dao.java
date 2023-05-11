/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;
import model.Insurance_Policy_Bill_Details;

/**
 *
 * @author nidsp
 */
public class Insurance_Policy_Bill_Details_dao {

    public static void save(Insurance_Policy_Bill_Details insurance_policy_bill_details) {
        String query = "INSERT INTO Insurance_Policy_Bill_Details (Bill_Id, Policy_ID) VALUES ('" + insurance_policy_bill_details.getBillId() + "',"
                + "'" + insurance_policy_bill_details.getPolicyId() + "')";
        DbOperations.setDataorDelete(query, "");
    }
}
