/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicNurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Loukik
 */
public class ClinicNurseOrganization extends Organization{
   
     public ClinicNurseOrganization() {
        super(Organization.OrganizationType.ClinicNurse.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicNurseRole());
       
        return roles;
    }
}
