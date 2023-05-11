/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author nidsp
 */
public class Insurance_AppUser_dao {
    public static void save(User user) {
        String query = "INSERT INTO Insurance_AppUser("
                + "Name,"
                + "MobileNumber,"
                + "Email,"
                + "Password,"
                + "Address,"
                + "SecurityQuestion,"
                + "Answer,"
                + "Status)"
                + "VALUES "
                + "('"+user.getName()+"',"
                + "'"+user.getMobileNumber()+"',"
                + "'"+user.getEmail()+"',"
                + "'"+user.getPassword()+"',"
                + "'"+user.getAddress()+"',"
                + "'"+user.getSecurityQuestion()+"',"
                + "'"+user.getAnswer()+"',"
                + "'false')";
        DbOperations.setDataorDelete(query, "Registered Successfully! Wait for Admin Approval!");

    }
    
    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_AppUser WHERE email = '"+email+"' AND password = '"+password+"'");
            while(rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static User getUserDetails(String email) {
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_AppUser WHERE email = '"+email+"'");
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("Id"));
                user.setName(rs.getString("name"));
                user.setMobileNumber(rs.getString("mobilenumber"));
                user.setEmail(rs.getString("email"));
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static User getSecurityQuestion(String email) {
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_AppUser WHERE email = '"+email+"'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static void update(String email,String newPassword) {
        String query = "UPDATE Insurance_AppUser SET Password='"+newPassword+"' where email='"+email+"'";
        DbOperations.setDataorDelete(query,"Password Changed Successsfully");
    }
    
    public static ArrayList<User> getAllRecords (String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_AppUser where email like '%"+email+"%'");
            while(rs.next()) {
                User insurance_appuser= new User();
                insurance_appuser.setId(rs.getInt("Id"));
                insurance_appuser.setName(rs.getString("Name"));
                insurance_appuser.setEmail(rs.getString("Email"));
                insurance_appuser.setMobileNumber(rs.getString("MobileNumber"));
                insurance_appuser.setAddress(rs.getString("Address"));
                insurance_appuser.setSecurityQuestion(rs.getString("SecurityQuestion"));
                insurance_appuser.setStatus(rs.getString("Status"));
                arrayList.add(insurance_appuser);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    
    public static void changeStatus (String email, String status) {
        String query = "UPDATE Insurance_AppUSer SET status ='"+status+"' WHERE email='"+email+"'";
        DbOperations.setDataorDelete(query, "Status Changed Successfully");
    }
    
    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_AppUser WHERE Password='" + oldPassword + "' AND email='" + email + "'");
            if (rs.next()) {
                update(email,newPassword);
            } else {
                JOptionPane.showMessageDialog(null, "Old Password is Wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public static void updateSecurityQuestion(String email, String securityQuestion, String answer) {
        String query = "UPDATE Insurance_AppUser SET SecurityQuestion='"+securityQuestion+"', Answer='"+answer+"' WHERE email='" + email + "'";
        DbOperations.setDataorDelete(query, "Security Question Changed Successfully");
    }
    
    public static void changeSecurityQuestion(String email, String password, String securityQuestion, String answer) {
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Insurance_AppUser WHERE Password='" + password + "' AND email='" + email + "'");
            if (rs.next()) {
                updateSecurityQuestion(email,securityQuestion,answer);
            }
            else {
                JOptionPane.showMessageDialog(null, "Password is Wrong");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
