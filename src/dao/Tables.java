/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author nidsp
 */
public class Tables {
    public static void main(String[] args) {
        try {
            String Insurance_AppUser = "DECLARE COUNT_NUM INT:=0; BEGIN SELECT COUNT(TABLE_NAME) INTO COUNT_NUM FROM USER_TABLES WHERE TABLE_NAME='INSURANCE_APPUSER';"
                    + "IF COUNT_NUM <= 0 THEN EXECUTE IMMEDIATE 'CREATE TABLE Insurance_AppUser("
                    + "ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY,"
                    + "Name VARCHAR2(200),"
                    + "MobileNumber VARCHAR2(10),"
                    + "Email VARCHAR2(200),"
                    + "Password VARCHAR2(50),"
                    + "Address VARCHAR2(200),"
                    + "SecurityQuestion VARCHAR2(200),"
                    + "Answer VARCHAR2(200),"
                    + "Status VARCHAR2(200),"
                    + "CONSTRAINT ID_PK PRIMARY KEY (ID),"
                    + "CONSTRAINT Email_UNIQUE UNIQUE (Email))'; "
                    + "END IF;"
                    + "END;";
            String adminDetails = "INSERT INTO Insurance_AppUser("
                    + "Name,"
                    + "MobileNumber,"
                    + "Address,"
                    + "Email,"
                    + "Password,"
                    + "SecurityQuestion,"
                    + "Answer," 
                    + "Status)" 
                    + "VALUES ("
                    + "'Admin',"
                    + "'3336667777',"
                    + "'India',"
                    + "'admin@gmail.com',"
                    + "'admin',"
                    + "'What is your favorite color?',"
                    + "'Blue',"
                    + "'true')";
            String Insurance = "DECLARE COUNT_NUM INT:=0; BEGIN SELECT COUNT(TABLE_NAME) INTO COUNT_NUM FROM USER_TABLES WHERE TABLE_NAME='INSURANCE';"
                    + "IF COUNT_NUM <= 0 THEN EXECUTE IMMEDIATE 'CREATE TABLE Insurance("
                    + "ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY,"
                    + "Name VARCHAR2(200),"
                    + "CONSTRAINT Insurance_Id_PK PRIMARY KEY (ID),"
                    + "CONSTRAINT Insurance_Name_UNIQUE UNIQUE (Name))'; "
                    + "END IF;"
                    + "END;";
            String Insurance_Policy = "DECLARE COUNT_NUM INT:=0; BEGIN SELECT COUNT(TABLE_NAME) INTO COUNT_NUM FROM USER_TABLES WHERE TABLE_NAME='INSURANCE_POLICY';"
                    + "IF COUNT_NUM <= 0 THEN EXECUTE IMMEDIATE 'CREATE TABLE Insurance_Policy("
                    + "ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY,"
                    + "Name VARCHAR2(200),"
                    + "Insurance_ID INT,"
                    + "Sum_Assured VARCHAR2(200),"
                    + "Premium VARCHAR2(200),"
                    + "Tenure VARCHAR2(200),"
                    + "Descriptions VARCHAR2(200),"
                    + "CONSTRAINT Insurance_Policy_ID_PK PRIMARY KEY (ID),"
                    + "CONSTRAINT InsuranceID_FK FOREIGN KEY (Insurance_ID) REFERENCES Insurance(Id),"
                    + "CONSTRAINT Insurance_Policy_Name_UNIQUE UNIQUE (Name))'; "
                    + "END IF;"
                    + "END;";
            String Insurance_Policy_Bill = "DECLARE COUNT_NUM INT:=0; BEGIN SELECT COUNT(TABLE_NAME) INTO COUNT_NUM FROM USER_TABLES WHERE TABLE_NAME='INSURANCE_POLICY_BILL';"
                    + "IF COUNT_NUM <= 0 THEN EXECUTE IMMEDIATE 'CREATE TABLE Insurance_Policy_Bill("
                    + "ID NUMBER,"
                    + "Customer_ID INT,"
                    + "BillDate VARCHAR2(100),"
                    + "TotalAmount VARCHAR2(100),"
                    + "CONSTRAINT Insurance_Policy_Bill_ID_PK PRIMARY KEY (ID),"
                    + "CONSTRAINT Insurance_CustomerID_FK FOREIGN KEY (Customer_ID) REFERENCES Insurance_AppUser(ID))';"
                    + "END IF;"
                    + "END;";
            String Insurance_Policy_Bill_Details = "DECLARE COUNT_NUM INT:=0; BEGIN SELECT COUNT(TABLE_NAME) INTO COUNT_NUM FROM USER_TABLES WHERE TABLE_NAME='INSURANCE_POLICY_BILL_DETAILS';"
                    + "IF COUNT_NUM <= 0 THEN EXECUTE IMMEDIATE 'CREATE TABLE Insurance_Policy_Bill_Details("
                    + "ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY,"
                    + "Bill_ID INT,"
                    + "Policy_ID INT,"
                    + "CONSTRAINT Insurance_Policy_Bill_Details_ID_PK PRIMARY KEY (ID),"
                    + "CONSTRAINT Insurance_Policy_Bill_ID_FK FOREIGN KEY (Bill_ID) REFERENCES Insurance_Policy_Bill(ID),"
                    + "CONSTRAINT Insurance_Policy_ID_FK FOREIGN KEY (Policy_ID) REFERENCES Insurance_Policy(ID))';"
                    + "END IF;"
                    + "END;";

            DbOperations.setDataorDelete(Insurance_AppUser, "Insurance_AppUser Table Created Successfully");
            DbOperations.setDataorDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataorDelete(Insurance, "Insurance Table Created Successfully");
            DbOperations.setDataorDelete(Insurance_Policy, "Insurance_Policy Table Created Successfully");
            DbOperations.setDataorDelete(Insurance_Policy_Bill, "Insurance_Policy_Bill Table Created Successfully");
            DbOperations.setDataorDelete(Insurance_Policy_Bill_Details, "Insurance_Policy_Bill_Details Table Created Successfully");

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
