/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Start;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Chirag
 */
public class ConfigureBusiness {
    
    public static Ecosystem configure()
    {
    
    Ecosystem ecosystem= Ecosystem.getInstance();
     Employee employee = ecosystem.getEmployeeDirectory().createEmployee("Chirag","Oswal");
        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        return ecosystem;
    }
    
}
