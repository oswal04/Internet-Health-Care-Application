/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Patient.Encounter;
import Business.Patient.Prescription;

/**
 *
 * @author Chirag
 */
public class Dr_PharmacyWorkRequest extends WorkRequest{

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    private Prescription prescription;
    private Encounter encounter;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    
}
