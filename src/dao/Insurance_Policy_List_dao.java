/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Insurance_Policy_List;

/**
 *
 * @author nidsp
 */
public class Insurance_Policy_List_dao {
    
        public static ArrayList<Insurance_Policy_List> getAllRecords () {
        ArrayList<Insurance_Policy_List> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select p.name as name, i.name as insuranceType, p.sum_assured as sumAssured, p.premium as premium, p.tenure as tenure, p.descriptions as descriptions from insurance i inner join insurance_policy p on i.id=p.insurance_id");
            while (rs.next()) {
                Insurance_Policy_List insurance_policy_list = new Insurance_Policy_List();
                insurance_policy_list.setName(rs.getString("name"));
                insurance_policy_list.setInsuranceType(rs.getString("insuranceType"));
                insurance_policy_list.setSumAssured(rs.getString("sumAssured"));
                insurance_policy_list.setPremium(rs.getString("premium"));
                insurance_policy_list.setTenure(rs.getString("tenure"));
                insurance_policy_list.setDescriptions(rs.getString("descriptions"));
                arrayList.add(insurance_policy_list);
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
        
    public static ArrayList<Insurance_Policy_List> getAllRecordsByBillId(Integer BillId) {
        ArrayList<Insurance_Policy_List> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select p.name as name, i.name as insuranceType, p.sum_assured as sumAssured, p.premium as premium, p.tenure as tenure, p.descriptions as descriptions from insurance_policy_bill_details b inner join insurance_policy p on p.id = b.policy_id inner join insurance i on i.id=p.insurance_id where b.bill_id='"+BillId+"'");
            while (rs.next()) {
                Insurance_Policy_List insurance_policy_list = new Insurance_Policy_List();
                insurance_policy_list.setName(rs.getString("name"));
                insurance_policy_list.setInsuranceType(rs.getString("insuranceType"));
                insurance_policy_list.setSumAssured(rs.getString("sumAssured"));
                insurance_policy_list.setPremium(rs.getString("premium"));
                insurance_policy_list.setTenure(rs.getString("tenure"));
                insurance_policy_list.setDescriptions(rs.getString("descriptions"));
                arrayList.add(insurance_policy_list);
            } 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
