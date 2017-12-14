/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientcount;

import javax.swing.JOptionPane;

public class PatientCount {

    public static void main(String[] args) {
        String yesNo = "N";
        Patient.count = 0;
        do{
            Patient p = new Patient();
            p.name = JOptionPane.showInputDialog("Name");
            Patient.count = Patient.count +1;
            System.out.println("p.name = " + p.name);
            System.out.println("Patient.count = " + Patient.count);
            yesNo = JOptionPane.showInputDialog("More patient available ?");
        }while(yesNo.equals("y"));

// TODO code application logic here
    }
    
}
