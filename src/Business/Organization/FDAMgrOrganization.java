/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FDAManagerRole;
import Business.Role.HospitalDoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class FDAMgrOrganization extends Organization {

    public FDAMgrOrganization() {
        super(Organization.OrganizationType.FDAManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FDAManagerRole());

        return roles;
    }

}
