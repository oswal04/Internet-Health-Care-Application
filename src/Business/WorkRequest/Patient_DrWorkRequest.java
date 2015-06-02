/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Patient.Patient;

/**
 *
 * @author Chirag
 */
public class Patient_DrWorkRequest extends WorkRequest{
    
   private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    String DrReply;

    public String getDrReply() {
        return DrReply;
    }

    public void setDrReply(String DrReply) {
        this.DrReply = DrReply;
    }

    @Override
    public String toString() {
        return  patient.getFname()+" "+patient.getLname() ;
    }
    
    
    
}
