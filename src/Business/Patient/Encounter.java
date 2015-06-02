/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Enterprise.Enterprise;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Chirag
 */
public class Encounter {
    
   private String timeStamp;
   private String complaint;
   private String treatment;
   private String medication;
   private String symptoms;
   private String diagnosis;
   private String treatedby;
   private String digitalsign;
   private String labreport;
   private String labasst;
   private Enterprise hospital;
   private Prescription prescription;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }
   private String nurse;

    public String getLabasst() {
        return labasst;
    }

    public void setLabasst(String labasst) {
        this.labasst = labasst;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getLabreport() {
        return labreport;
    }

    public void setLabreport(String labreport) {
        this.labreport = labreport;
    }
   private VitalSigns vitalSigns;

    public String getTreatedby() {
        return treatedby;
    }

    public void setTreatedby(String treatedby) {
        this.treatedby = treatedby;
    }

    public String getDigitalsign() {
        return digitalsign;
    }

    public void setDigitalsign(String digitalsign) {
        this.digitalsign = digitalsign;
    }
   
   
   public Encounter()
   {
        Date date= new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss  MMM/dd/yyyy");
        timeStamp=(dateFormat.format(date));
        vitalSigns= new VitalSigns();
        prescription=new Prescription();
        
   }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return timeStamp ;
    }
   
    
    
   
    
}
