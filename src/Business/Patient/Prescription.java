/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class Prescription {

    private String timeOfIssue;
    private ArrayList<Medication> medicationList;
    private String doctor;
    private String patient;

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Prescription() {
        medicationList = new ArrayList<>();
    }

    public String getTimeOfIssue() {
        return timeOfIssue;
    }

    public void setTimeOfIssue(String timeOfIssue) {
        this.timeOfIssue = timeOfIssue;
    }

    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(ArrayList<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    private String signedBy;

    private String getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }

    @Override
    public String toString() {
        return  timeOfIssue ;
    }

}
