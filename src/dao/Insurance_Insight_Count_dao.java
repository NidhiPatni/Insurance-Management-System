/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author nidsp
 */
public class Insurance_Insight_Count_dao {
        public static Integer getTotalRegisteredUsers() {
        Integer TotalRegisteredUsers = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT case when (count(id)-1) < 0 then 0 else (count(id)-1) end as TotalRegisteredUsers FROM Insurance_AppUser");
            while (rs.next()) {
                TotalRegisteredUsers = rs.getInt("TotalRegisteredUsers");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return TotalRegisteredUsers;
    }
        
    public static Integer getNonVerifiedUsers() {
        Integer TotalNonVerifiedUsers = null;
        try {
            ResultSet rs = DbOperations.getData("SELECT count(id) as TotalNonVerifiedUsers FROM Insurance_AppUser WHERE status='false'");
            while (rs.next()) {
                TotalNonVerifiedUsers = rs.getInt("TotalNonVerifiedUsers");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return TotalNonVerifiedUsers;
    }

    public static Integer getTotalInsurance() {
        Integer TotalInsurance = null;
        try {
            ResultSet rs = DbOperations.getData("SELECT count(id) as TotalInsurance FROM Insurance");
            while (rs.next()) {
                TotalInsurance = rs.getInt("TotalInsurance");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return TotalInsurance;
    }

    public static Integer getTotalAvailablePolicy() {
        Integer TotalAvailablePolicy = null;
        try {
            ResultSet rs = DbOperations.getData("SELECT count(id) as TotalAvailablePolicy FROM Insurance_Policy");
            while (rs.next()) {
                TotalAvailablePolicy = rs.getInt("TotalAvailablePolicy");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return TotalAvailablePolicy;
    }

    public static Integer getTotalSoldPolicy() {
        Integer TotalSoldPolicy = null;
        try {
            ResultSet rs = DbOperations.getData("SELECT count(id) as TotalSoldPolicy FROM Insurance_Policy_Bill_Details");
            while (rs.next()) {
                TotalSoldPolicy = rs.getInt("TotalSoldPolicy");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return TotalSoldPolicy;
    }

}
