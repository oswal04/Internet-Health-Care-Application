/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class HospitalEnterprise extends Enterprise{
     public HospitalEnterprise(String name) {
        super(name,Enterprise.EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    
    //Space for Enterprise role
        return null; 
    
    }
    
}
