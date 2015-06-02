/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.Start.Ecosystem;
import Business.UserAccount.UserAccount;
import UI.Pharmacist.PharmcistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chirag
 */
public class PharmacistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new PharmcistWorkAreaJPanel(userProcessContainer,userAccount,(PharmacistOrganization)organization,ecosystem);
    }
    
}
