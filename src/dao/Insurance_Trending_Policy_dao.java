/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author nidsp
 */
public class Insurance_Trending_Policy_dao {

    public static String getTrendingPolicy() {
        String TrendingPolicy = null;
        try {
            ResultSet rs = DbOperations.getData("select names as TrendingPolicy from (select j.name as names,count(i.policy_id) as counts from insurance_policy_bill_details i inner join insurance_policy j on i.policy_id = j.id group by j.name order by counts desc OFFSET 0 ROWS FETCH NEXT 1 ROWS ONLY)");
            while (rs.next()) {
                TrendingPolicy = rs.getString("TrendingPolicy");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return TrendingPolicy;
    }

}
