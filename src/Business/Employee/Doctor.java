/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Patient.PatientDirectory;

/**
 *
 * @author Chirag
 */
public class Doctor extends Employee {

    private String reg;
    private PatientDirectory patientDirectory;
    private int regno = (int) (Math.random() * 10000000);

    public Doctor() {
        patientDirectory = new PatientDirectory();
        reg = "RegDr" + (regno);
       // System.out.println(reg);
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

}
