/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.FDAMgrOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.Start.Ecosystem;
import Business.UserAccount.UserAccount;
import UI.FDAManager.FDAManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chirag
 */
public class FDAManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        return new FDAManagerWorkAreaJPanel(userProcessContainer,userAccount, (FDAMgrOrganization) organization,enterprise,ecosystem);
    }
    
}
