/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public abstract class Organization {

    private String name;
    private OrganizationType organizationType;
    private int id;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private static int counter = 0;
    private WorkQueue workQueue;
    

    public enum OrganizationType {
//hospital org
        HospitalAdmin("Hospital Admin"),
        HospitalDoctor("Doctor"),
        HospitalNurse("Nurse"),
        HospitalLabAsst("Hospital Lab Assistant"),
        //clinic org
        ClinicAdmin("Clinic Admin"),
        ClinicNurse("Clinic Nurse"),
        ClinicDoctor("Clinic Doctor"),
        // pharmacy
        PharmacyAdmin("Pharmacy Admin"),
        PharmacyPharmacist("Pharmacist"),
        //pharma co
        PharmaCoAdmin("Pharmaceutical Company Admin"),
        PharmaCoMgr("Pharmaceutical Company Manager"),
        //FDA
        FDAAdmin("FDA Admin"),
        FDAManager("FDA Manager"),
        //Patient
        HPatient("Hospital Patient"),
        CPatient("Clinic Patient");
        
        
        
           
//
        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return  value ;
        }

    }//end of OrganizationType

    //Constructor
    public Organization(String name) {
        this.name = name;
         workQueue= new WorkQueue();
        id = counter;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        counter++;

    }//end of constructor

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    //abstract method
    public abstract ArrayList<Role> getSupportedRole();

    @Override
    public String toString() {
        return name;
    }

}
