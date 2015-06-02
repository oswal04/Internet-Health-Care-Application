/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalAdminRole;
import Business.Role.HospitalDoctorRole;
import Business.Role.HospitalNurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class HospitalDoctorOrganization extends Organization{

    public HospitalDoctorOrganization() {
        super(Organization.OrganizationType.HospitalDoctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalDoctorRole());
       
        return roles;
    }
    
}
