/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalDoctorRole;
import Business.Role.HospitalLabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class HospitalLabOrganization extends Organization{

     public HospitalLabOrganization() {
        super(Organization.OrganizationType.HospitalLabAsst.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalLabRole());
       
        return roles;
    }
    }
    

