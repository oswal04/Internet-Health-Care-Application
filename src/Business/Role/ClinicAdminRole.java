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
import UI.ClinicAdmin.ClinicAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Loukik
 */
public class ClinicAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        return new ClinicAdminJPanel(userProcessContainer, enterprise);
    }
    
}
