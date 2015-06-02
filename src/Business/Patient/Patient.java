/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Doctor;
import Business.Employee.Employee;

/**
 *
 * @author Chirag
 */
public class Patient extends Employee {

    private int pid;
    private EncounterHistory encounterHistory;
    private Demographics demographics;
    private String dob;
    private String SSN;
    private String Insurance_company;
    private String Insurance_no;
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
   
    public String getInsurance_company() {
        return Insurance_company;
    }

    public void setInsurance_company(String Insurance_company) {
        this.Insurance_company = Insurance_company;
    }

    public String getInsurance_no() {
        return Insurance_no;
    }

    public void setInsurance_no(String Insurance_no) {
        this.Insurance_no = Insurance_no;
    }
    private AllergyList allergyList;

    public AllergyList getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(AllergyList allergyList) {
        this.allergyList = allergyList;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    private String bloodGroup;

    public Patient() {
        pid = (int) (Math.random() * 1000000);
        encounterHistory = new EncounterHistory();
        demographics = new Demographics();
        allergyList = new AllergyList();

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Demographics getDemographics() {
        return demographics;
    }

    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

}
