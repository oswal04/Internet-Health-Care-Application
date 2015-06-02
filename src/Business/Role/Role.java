/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Start.Ecosystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Chirag
 */

public abstract class Role {

    
    public enum RoleType {

        HospitalAdmin("Hospital Admin"),
        HospitalDoctor("Hospital Doctor"),
        HospitalNurse("Hospital Nurse"),

        ClinicAdmin("Clinic Admin"),
        ClinicDoctor("Clinic Doctor"),
        ClinicNurse("Clinic Nurse"),
        
        PharmacyAdmin("Pharmacy Admin"),
        PharmacyPharmacist("Pharmacist"),
        
        PharmaceuticalCompanyAdmin("Pharmaceutical Company Admin"),
        PharmaceuticalCompanyManager("Pharmaceutical Co Mgr"),
        
        FDAAdmin("FDA Admin"),
         
       HospitalPatient("Hospital Patient");
        
       
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

         @Override
        public String toString() {
            
            return value;
        }
      
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
