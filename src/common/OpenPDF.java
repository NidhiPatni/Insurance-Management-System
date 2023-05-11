/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author nidsp
 */
public class OpenPDF {
    public static void openById(String id) {
        try {
            if((new File("C:\\Users\\nidsp\\OneDrive - Illinois Institute of Technology\\Documents\\Project Stuff\\Path for Saving Document\\Bill Number "+id+".pdf")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll, FileProtocolHandler C:\\Users\\nidsp\\OneDrive - Illinois Institute of Technology\\Documents\\Project Stuff\\Path for Saving Document\\Bill Number "+id+".pdf");
                
            }
            else {
                JOptionPane.showMessageDialog(null,"File does not exists");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
